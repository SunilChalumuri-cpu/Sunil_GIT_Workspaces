from flask import Flask, request

app = Flask(__name__)

@app.route('/search', methods=['GET'])
def search():
    query = request.args.get('query', '')
    return {"results": f"You searched for '{query}'"}, 200

if __name__ == '__main__':
    app.run(debug=True)
