package edu.homeWork.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String str = "y2er4yeyeyety";
        List<Integer> x = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) { // Неполная проверка. Символы цифр бывают в кружочках, римские и т.д., это не значит, что это цифра.
                int y = Character.getNumericValue(c); // getNumericValue вернёт int на любой символ, можно ошибиться. Поэтому рекомендую использовать
                // try-catch и парсить каждый символ, если уж на то пошло: Int.parseInt(...). 
                x.add(y);
            }
        }
        int sum = 0;
        for (int i = 0; i < x.size(); i++) {
            sum += x.get(i);
        }
        System.out.print(sum);
        
        // Улучшенное решение
        List<Integer> x = new ArrayList<Integer>();
        x = findAllDigits(str)
        int sum = x.stream()
            .mapToInt(Integer::intValue)
            .sum(); // Java 8 Streams
        System.out.print(sum);
    }
    
    private static List<Integer> findAllDigits(String s) {
        String str = s.replaceAll("[^-?0-9]+", " "); // Java Regular Expressions
        return Arrays.asList(str.trim().split(" "));
    }
}
