from flask import Flask, request

app = Flask(__name__)

API_KEY = "my-secret-api-key"

@app.route('/secure-data', methods=['GET'])
def secure_data():
    api_key = request.headers.get('X-API-Key')
    if api_key == API_KEY:
        return {"data": "This is secured data"}, 200
    return {"error": "Unauthorized"}, 401

if __name__ == '__main__':
    app.run(debug=True)
