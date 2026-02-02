from flask import Flask

app = Flask(__name__)


@app.route('/hello',methods=['GET', 'POST'])
def hello_world():
    print ("Hello World")
    return "say hello to yourself as sudhanshu "

@app.route('/sudhanshu',methods=['GET', 'POST'])
def printing_msg():
    return "print someting about me "

if __name__ == '__main__':
    app.run(debug=True,port=5001)
   