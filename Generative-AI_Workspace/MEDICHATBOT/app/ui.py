import streamlit as st
# function to upload PDF files
def pdf_uploader():
    st.title("PDF Uploader")
    uploaded_file = st.file_uploader("Upload a PDF file", type=["pdf"],accept_multiple_files=True)
    if uploaded_file is not None:
        st.success("File uploaded successfully!")
        # You can add code here to process the PDF file as needed
    return uploaded_file