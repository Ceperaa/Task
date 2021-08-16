package edu.homeWork.task1;

public class Main {

    public static void main(String[] args) {
        String str = "33333333333";
        System.out.print(intMetod(str));
    }

    public static int intMetod(String str) {
        int abc = 0;
        for (int i = 0; i <= str.length(); i++) {
            if (i + 3 > str.length()) {
                break;
            }
            if (str.charAt(i) == str.charAt(i + 1)) {
                if (str.charAt(i + 1) == str.charAt(i + 2)) {
                    abc++;
                    i = i + 2;
                }
            }
        }
        return abc;
    }
}