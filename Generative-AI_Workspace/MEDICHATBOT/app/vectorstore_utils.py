import os
import certifi

from langchain_community.vectorstores import FAISS

try:
    from langchain_huggingface import HuggingFaceEmbeddings
except ImportError:
    from langchain_community.embeddings import HuggingFaceEmbeddings

# Ensure SSL verification uses a valid CA bundle on Windows/local cert stores
os.environ.setdefault("SSL_CERT_FILE", certifi.where())

def create_faiss_index(text):
    embeddings = HuggingFaceEmbeddings(
        model_name="sentence-transformers/all-mpnet-base-v2"
    )

    # Create a FAISS index from the texts and embeddings
    return FAISS.from_texts(texts=text, embeddings=embeddings)

def retrieve_similar_documents(faiss_index, query, top_k=4):
    # Retrieve relevant documents from the FAISS index based on the query
    return faiss_index.similarity_search(query, k=top_k)