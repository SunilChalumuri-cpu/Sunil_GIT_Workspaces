from fastapi import FastAPI
from oracledb import DatabaseError
import oracledb
import psycopg2
from psycopg2.extras import RealDictCursor
from dotenv import load_dotenv
import os

myapp = FastAPI()

@myapp.get("/simpleAPI")
def add(a: int, b: int):
    return {"Sum ": a + b}
print("Console Output--> Hello...Sum of numbers are", add(1, 2))

students = {1: {"name": "Zungwa", "age": 21},
            2: {"name": "Jaffa", "age": 28},
            3: {"name": "Daizy", "age": 30}}

# Endpoint to get the list of all students
@myapp.get("/students")
def get_students():
    return students

# Endpoint to get details of a specific student by ID
@myapp.get("/students/{student_id}")
def get_student(student_id: int):
    return students.get(student_id, {"error": "Student not found"})

# creating a new student entity to resolve POST request of "422 Unprocessable Entity error"
from pydantic import BaseModel
class StudentEntity(BaseModel):
    student_id: int
    name: str
    age: int
    
# Endpoint to add a new student
@myapp.post("/add_student")
def addStudent(newStudent: StudentEntity):
    students[newStudent.student_id] = {"name": newStudent.name, "age": newStudent.age}
    save_data_to_file(students)
    save_data_to_db(students)
    return {"message": "Student added successfully"}

# Function to save student data to a text file
def save_data_to_file(students):
    with open("students_data.txt", "w") as file:
        for student_id, details in students.items():
            file.write(f"ID: {student_id}, Name: {details['name']}, Age: {details['age']}\n")
    print("Student data saved to students_data.txt")

# Load environment variables from .env file
load_dotenv()
# neonDB connection string
neonDB_connection_url = os.getenv("NEON_DB_URL")

# Function to connect to neonDB
def connect_to_neonDB():
    try:
        print("Connecting to neonDB...")
        print(f"neonDB connection URL: {neonDB_connection_url}")
        connection = psycopg2.connect(neonDB_connection_url,cursor_factory=RealDictCursor)
        print("neonDB connection successful")
        return connection
    except psycopg2.DatabaseError as e:
        print(f"neonDB connection error: {e}")
        return None

# Oracle DB connection string
orcl_db_connection_url = os.getenv("ORCL_DB_URL")

# Function to connect to Oracle DB
def connect_to_oracleDB():
    try:
        connection = oracledb.connect(orcl_db_connection_url)
        print("Oracle database connection successful")
        return connection
    except oracledb.DatabaseError as e:
        print(f"Oracle database connection error: {e}")
        return None

# Function to save student data to Oracle DB
def save_data_to_db(students):
    # For Oracle DB
    #connection = connect_to_oracleDB()
    # For neonDB
    connection = connect_to_neonDB()
    if connection:
        cursor = connection.cursor()
        for student_id, details in students.items():
            try:
                cursor.execute(
                    "INSERT INTO students (student_id, name, age) VALUES (:id, :name, :age)",
                    id=student_id, name=details['name'], age=details['age']
                )
            except DatabaseError:
                print(f"Student with ID {student_id} already exists in the database.")
        connection.commit()
        cursor.close()
        connection.close()
        print("Student data saved to DB")
  
# Function to fetch student data from DB
def fetch_data_from_db():
    connection = connect_to_neonDB()
    if connection:
        cursor = connection.cursor()
        cursor.execute("SELECT student_id, name, age FROM students")
        rows = cursor.fetchall()
        db_students = {}
        for row in rows:
            db_students[row[0]] = {"name": row[1], "age": row[2]}
        cursor.close()
        connection.close()
        return db_students
    return {}

# Fetch and print student data from Oracle DB at startup
@myapp.get("/fetch_db_students")
def get_db_students():
    return fetch_data_from_db() 
#------------------------------------------------------    
# instructions to run the app
# install FastAPI and Uvicorn if not already installed:
# pip install fastapi uvicorn pydantic oracledb  
# To run the FastAPI app, use the command:
# python -m uvicorn testAPI:myapp --reload 
# To test the API endpoints, you can use a web browser or tools like Postman or curl. 
# The app will be accessible at http://127.0.0.1:8000/simpleAPI?a=1&b=2
# For the student endpoints, use:
# GET http://127.0.0.1:8000/students/2 to get details of student with ID 2
# Use the swagger UI at http://127.0.0.1:8000/docs to interact with the API.
#------------------------------------------------------
