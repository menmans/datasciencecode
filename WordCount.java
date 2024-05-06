import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the paragraph:");
        String paragraph = scanner.nextLine();
        int wordCount = countWords(paragraph);
        System.out.println("Word count: " + wordCount);
        scanner.close();
    }

    public static int countWords(String paragraph) {
        if (paragraph == null || paragraph.isEmpty()) {
            return 0;
        }
        String[] words = paragraph.split("\\s+");
        return words.length;
    }
}
