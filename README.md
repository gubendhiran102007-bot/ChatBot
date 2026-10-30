# CodeAlpha Task 3 — Artificial Intelligence Chatbot

## Project overview
A beginner-friendly, console-based chatbot written in Java. It uses simple keyword/rule-based matching to respond to common messages about greetings, Java, Spring Boot, internships, and help.

**Important:** This is a rule-based chatbot using basic text matching. It does not use a trained machine-learning model or a dedicated NLP library.

## Requirements
- Java JDK 8 or later
- IntelliJ IDEA, Eclipse, or another Java IDE (optional)

## Run in IntelliJ IDEA
1. Create a Java project.
2. Add `Chatbot.java` inside the `src` folder.
3. Open `Chatbot.java`.
4. Click the green Run button next to `main`, or right-click the file and choose **Run 'Chatbot.main()'**.
5. Type messages in the Run/Console window. Type `bye` to exit.

## Run from a terminal
Open a terminal in the folder containing `Chatbot.java`, then run:

```bash
javac Chatbot.java
java Chatbot
```

## Sample conversation
```text
Welcome to CodeAlphaBot
Type 'bye' to end the chat.

You: hi
sasi: Hello! Welcome. How can I help you today?

You: what is Java?
sasi: Java is an object-oriented programming language. Spring Boot helps you build Java applications and REST APIs.

You: bye
sasi: Goodbye! Keep learning and have a great day.
Chat ended.
```

## Features
- Interactive console chat
- Case-insensitive keyword matching
- Rule-based responses
- Simple method to add more keywords and answers
- Graceful exit command

## Possible improvements
- Add more FAQ rules
- Save conversations to a text file
- Build a Swing GUI or web interface
- Add a real NLP or machine-learning model as a separate enhancement

## Internship submission checklist
- Run and test the project yourself.
- Add screenshots of the program running to your project documentation if requested.
- Create a GitHub repository named `CodeAlpha_ArtificialIntelligenceChatbot`.
- Upload the source code and README.
- Follow the submission form and instructions shared by your internship coordinator.
- If a video explanation is required, explain the rules, `getResponse()` method, and how you tested the chatbot.
