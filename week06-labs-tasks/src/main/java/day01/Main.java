package day01;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot");
        boolean positiveNumber= true;
        while (positiveNumber){
            Double inputNumber = scanner.nextDouble();
            if (inputNumber < 0 ) {
                positiveNumber = false;
            } else {
                positiveNumberContainer.addNumber(inputNumber);
            }
        }
        for (Double actual: positiveNumberContainer.getNumbers()) {
            System.out.println(actual);
        }
    }
}
