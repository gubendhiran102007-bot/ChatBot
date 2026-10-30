import java.util.Locale;
import java.util.Scanner;

public class Chatbot {

    public static String getResponse(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "Please type something so I can help.";
        }

        String message = input.toLowerCase(Locale.ROOT).trim();

        if (containsAny(message, "hello", "hi", "hey", "vanakkam")) {
            return "Hello! Welcome. How can I help you today?";
        } else if (containsAny(message, "your name", "who are you")) {
            return "I'm CodeAlphaBot, a simple Java rule-based chatbot.";
        } else if (containsAny(message, "how are you", "how are u")) {
            return "I'm doing well, thanks for asking! How can I help?";
        } else if (containsAny(message, "java", "spring boot")) {
            return "Java is an object-oriented programming language. "
                    + "Spring Boot helps you build Java applications and REST APIs.";
        } else if (containsAny(message, "internship", "codealpha")) {
            return "For your CodeAlpha internship, read each task carefully, "
                    + "test your code, and follow the official submission instructions.";
        } else if (containsAny(message, "thank", "thanks")) {
            return "You're welcome! Happy to help.";
        } else if (containsAny(message, "help", "what can you do")) {
            return "I can answer simple questions about greetings, Java, Spring Boot, "
                    + "and internships. Try asking: 'What is Java?'";
        } else if (containsAny(message, "bye", "goodbye", "see you")) {
            return "Goodbye! Keep learning and have a great day.";
        } else {
            return "Sorry, I don't know that yet. Try asking about Java, Spring Boot, "
                    + "greetings, or internships.";
        }
    }

    private static boolean containsAny(String message, String... keywords) {
        for (String keyword : keywords) {
            if (message.contains(keyword)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("       Welcome to CodeAlphaBot    ");
        System.out.println("==================================");
        System.out.println("Type 'bye' to end the chat.");

        while (true) {
            System.out.print("\nyou: ");
            String input = scanner.nextLine();
            String response = getResponse(input);
            System.out.println("sasi: " + response);

            String normalized = input.trim().toLowerCase(Locale.ROOT);
            if (normalized.equals("bye") || normalized.equals("goodbye")
                    || normalized.equals("see you")) {
                break;
            }
        }
        
        scanner.close();
        System.out.println("Chat ended.");
        System.out.println("Bye the chat ended !!!!... ");  

    }
}
