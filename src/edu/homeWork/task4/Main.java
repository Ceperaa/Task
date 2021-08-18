package edu.homeWork.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt(); // nextInt может выбрасывать исключение. По условию должна быть проверка блоком try-catch. В реальной программе тоже.
        if (number >= 2 && number <= 100000) {
            for (int j = 2; j <= number; j++) {
                if (number % j == 0) {
                    if (number == j) {
                        System.out.print(number);
                        break;
                    } else if (number % j == 0) {
                        number = number / j;
                        System.out.print(j + " ");
                        j = 1;
                    }
                }
            }
        }
    }
}
