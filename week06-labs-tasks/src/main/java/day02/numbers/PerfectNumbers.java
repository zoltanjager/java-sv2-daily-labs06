package day02.numbers;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number) {
        int sum = 0;
        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        return (sum == number);
    }
}
