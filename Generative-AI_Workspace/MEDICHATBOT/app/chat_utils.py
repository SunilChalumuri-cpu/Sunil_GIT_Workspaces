import os
from euriai.langchain import create_chat_model

EURI_API_KEY = os.getenv("EURI_API_KEY", "")

def get_chat_model(model_name: str = "gpt-3.5-turbo", temperature: float = 0.7, api_key: str = EURI_API_KEY):
    # Create and return a chat model instance
    return create_chat_model(api_key=api_key, model_name=model_name, temperature=temperature)

def ask_chat_model(chat_model, prompt: str):
    # Send a prompt to the chat model and return the response
    response = chat_model.invoke(prompt)
    return response.content