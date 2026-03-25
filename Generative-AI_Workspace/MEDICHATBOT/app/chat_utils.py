from euriai.langchain import create_chat_model

API_KEY = None
MODEL = "gpt-4.1-nano"
TEMPERATURE = 0.7

def get_chat_model(api_key: str = None):
    # Create and return a chat model instance
    return create_chat_model(
        api_key=api_key or API_KEY,
        model_name=MODEL,
        temperature=TEMPERATURE)

def ask_chat_model(chat_model, prompt: str):
    # Send a prompt to the chat model and return the response
    response = chat_model.invoke(prompt)
    return response.content