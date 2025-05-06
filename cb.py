#python3 -m venv venv
#source venv/bin/activate  # For Linux/macOS
#pip install chatterbot chatterbot_corpus
#pip install spacy
#python -m spacy download en_core_web_sm
#pip install numpy==1.24.4
#pip install gensim contourpy numba --force-reinstall
#python3 chatbot.py






from chatterbot import ChatBot
from chatterbot.trainers import ChatterBotCorpusTrainer

# Step 1: Create chatbot
chatbot = ChatBot('CustomerBot')

# Step 2: Train chatbot with built-in English corpus
trainer = ChatterBotCorpusTrainer(chatbot)
trainer.train("chatterbot.corpus.english")

# Step 3: Start chat loop
print("CustomerBot is ready! Type something (type 'exit' to stop)")

while True:
    user_input = input("You: ")
    if user_input.lower() == 'exit':
        print("CustomerBot: Goodbye!")
        break
    response = chatbot.get_response(user_input)
    print(f"CustomerBot: {response}")
