package edu.homeWork.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String str = "y2er4yeyeyety";
        List<Integer> x = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int y = Character.getNumericValue(c);
                x.add(y);
            }
        }
        int sum = 0;
        for (int i = 0; i < x.size(); i++) {
            sum += x.get(i);
        }
        System.out.print(sum);
    }
}
