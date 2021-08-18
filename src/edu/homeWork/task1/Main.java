package edu.homeWork.task1;

public class Main {

    public static void main(String[] args) {
        String str = "33333333333";
        System.out.print(intMetod(str));
        
        // Простое решение:
        int answer = str.length() / 3; // Т.к. int отсекает дробную часть, мы получим целое количество троек.
        System.out.print(answer);
    }

    private static int intMetod(String str) { // private, так как больше нигде не используется.
        int abc = 0;
        for (int i = 0; i < str.length(); i++) { // i начинается с нуля => i < str.length()
            if (i + 3 > str.length()) {
                break;
            }
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) { // Если есть возможность - используй один блок.
                abc++;
                i += 2; // Есть оператор.
            }
        }
        return abc;
    }
}
