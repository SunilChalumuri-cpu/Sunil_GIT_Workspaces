from bs4 import BeautifulSoup

sample_data = """<html><head><title> This is is my sample html page</title></head>
<body><h1>this is my first heading></h1><p>my name is sunil</p></body></html>"""
data_parse = BeautifulSoup(sample_data,'html.parser')
