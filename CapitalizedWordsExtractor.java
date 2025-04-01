package week4_assignment5;

import java.util.regex.*;
import java.util.Scanner;

public class CapitalizedWordsExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String text = sc.nextLine();

        extractCapitalizedWords(text);

        sc.close();
    }

    public static void extractCapitalizedWords(String text) {
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            found = true;
        }

        if (!found) {
            System.out.println("No capitalized words found.");
        }
    }
}
