package edu.homeWork.task3;

public class Main {

    public static void main(String[] args) {

        int x1 = 3;
        int y1 = 3;

        int x2 = 6;
        int y2 = 5;

        int scalar = x1 * x2 + y1 * y2;

        int x3 = scalar * x1;
        int y3 = scalar * y1;

        int x4 = scalar * x2;
        int y4 = scalar * y2;

        System.out.println("Начало вектора (" + x3 + " " + y3 + "),  конец(" + x4 + " " + y4 + ")");
        System.out.println("Длинна вектора 1 - " + vectorLength(x1, y1, x2, y2));
        System.out.println("Длинна вектора 2 - " + vectorLength(x3, y3, x4, y4));
    }

    public static double vectorLength(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        double solution = Math.pow(x, 2) + Math.pow(y, 2);
        double result = Math.sqrt(solution);
        return result;
    }
}
