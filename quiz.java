
 import java.util.*;
public class quiz {

    private static Scanner scanner = new Scanner(System.in);
    private static int score = 0;

    public static void main(String[] args) {
        // Define quiz questions
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest mammal?",
        };

        // Define options for each question
        String[][] options = {
            {"A) Berlin", "B) Paris", "C) Madrid", "D) Rome"},
            {"A) Venus", "B) Mars", "C) Jupiter", "D) Saturn"},
            {"A) Elephant", "B) Blue Whale", "C) Giraffe", "D) Gorilla"},
        };

        // Define correct answers for each question
        int[] correctAnswers = {1, 2, 2};

        // Display and process each question
        for (int i = 0; i < questions.length; i++) {
            displayQuestion(questions[i], options[i]);
            int userAnswer = getUserAnswer();
            checkAnswer(userAnswer, correctAnswers[i]);
        }

        // Display final score
        System.out.println("Quiz completed! Your final score: " + score + "/" + questions.length);
    }

    private static void displayQuestion(String question, String[] options) {
        System.out.println(question);
        for (String option : options) {
            System.out.println(option);
        }
    }

    private static int getUserAnswer() {
        System.out.print("Enter your choice (1-4): ");
        return scanner.nextInt();
    }

    private static void checkAnswer(int userAnswer, int correctAnswer) {
        if (userAnswer == correctAnswer) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is: " + correctAnswer + "\n");
        }
    }
}

