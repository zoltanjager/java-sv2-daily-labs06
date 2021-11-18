package day04.hangman;

import java.util.Scanner;
public class HangmanMain {

    private String wordToFind = "alma";
    private String wordFound = "_".repeat(wordToFind.length());
    private int chances = 8;


    public static void main(String[] args) {
            new HangmanMain().run();
        }

        private void run() {
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Itt tartunk: " + wordFound);
                System.out.println("Ennyi tipped van még: " + chances);
                System.out.println("Mi a tipped?");

                String guess = scanner.nextLine();

                if (wordToFind.contains(guess)) {
                    System.out.println("Helyes!");
                    wordFound = updateWordFound(wordToFind, wordFound, guess);
                } else {
                    System.out.println("Rossz!");
                    chances--;
                }
            } while (!wordToFind.equals(wordFound) && chances > 0) ;

            if (wordFound.equals(wordToFind)) {
                System.out.println("Nyertél!");
            } else {
                System.out.println("Vesztettél!");
            }
        }

        private String updateWordFound(String wordToFind, String status, String guess) {
            char[] chars = status.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (wordToFind.charAt(i) == guess.charAt(0)) {
                    chars[i] = guess.charAt(0);
                }
            }
            return new String(chars);
        }

    }



