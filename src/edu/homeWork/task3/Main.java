package edu.homeWork.task3;

public class Main {

    public static void main(String[] args) {

        int x11 = 3;
        int y11 = 3;
        int x12 = 6;
        int y12 = 5;

        int x21 = 6;
        int y21 = 5;
        int x22 = 4;
        int y22 = -1;

        int scalar = 2;

        int x1 = x12 - x11;
        int y1 = y12 - y11;
        int x2 = x22 - x21;
        int y2 = y22 - y21;

        int product = x1 * x2 + y1 * y2;

        int x3 = scalar * x1;
        int y3 = scalar * y1;

        int x4 = scalar * x2;
        int y4 = scalar * y2;

        System.out.println("Вектор 1 * вектор 2 = " + product); // Старайся не использовать в принте русский текст. Это же касается комментирования кода, названия переменных и т.д.
        System.out.println("Вектор 1 * скаляр = {" + x3 + ", " + y3 + '}');
        System.out.println("Вектор 2 * скаляр = {" + x4 + ", " + y4 + '}');
        System.out.println("Длинна вектора 1 - " + vectorLength(x1, y1));
        System.out.println("Длинна вектора 2 - " + vectorLength(x2, y2));
        // По задаче: т.к. у нас на входе x, y координаты, а z отсутствует => в ответе мы получаем (x: 0, y: 0, z: значение). Т.е. нулевой 2d вектор, либо 3d вектор с z координатой, отличной, либо равной нулю.
    }

    private static double vectorLength(int x, int y) {
        double solution = Math.pow(x, 2) + Math.pow(y, 2);
        return Math.sqrt(solution);
    }
}
