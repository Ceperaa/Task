package edu.homeWork.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Character> calendars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int s = 0; s < str.length(); s++) {
            calendars.add(str.charAt(s));
        }
        int y = 0;
        String[][] multiplyTab = new String[10][100];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                multiplyTab[i][j] = " ";
                for (int u = 0; u < calendars.size(); u++) {
                    int calendarsCurrent = Character.getNumericValue(calendars.get(u));
                    Draw.one(y, calendarsCurrent, multiplyTab, u);
                }
                System.out.print(multiplyTab[i][j] + "");

            }
            System.out.println();
        }
    }
}
