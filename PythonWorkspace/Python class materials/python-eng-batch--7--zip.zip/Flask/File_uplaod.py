from flask import Flask, request

app = Flask(__name__)

@app.route('/upload', methods=['POST'])
def upload_file():
    if 'file' not in request.files:
        return {"error": "No file part"}, 400
    file = request.files['file']
    if file.filename == '':
        return {"error": "No selected file"}, 400
    file.save(f"C:/Users/scl/OneDrive/Documents/python_eng_batch/Flask/uploads/{file.filename}")
    return {"message": f"File {file.filename} uploaded successfully"}, 201

if __name__ == '__main__':
    app.run(debug=True)
