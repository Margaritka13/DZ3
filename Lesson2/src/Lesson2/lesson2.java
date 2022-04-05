/**
 * Java 1. HomeWork 2
 *
 * @author Margarita
 * @version 5.04.2021
 */
package Lesson2;

public class lesson2 {

    public static void main(String[] args) {
        System.out.println(summ(5, 8));
        System.out.println(summ(1, 8));
        System.out.println(summ(10, 15));

        isPositiveOrNegative(3);
        isPositiveOrNegative(-1);
        isPositiveOrNegative(0);

        System.out.println(isNegative(3));
        System.out.println(isNegative(-3));
        System.out.println(isNegative(0));

        printString(" Hello", 3);
    }

    static boolean summ(int a, int b) {
        return a + b < 10 || a + b > 20;
    }

    static void isPositiveOrNegative(int a) {

        System.out.print(a >= 0 ? "    Число положительное " : "   Число отрицательное ");
    }

    static boolean isNegative(int a) {
        return a > 0;
    }

    static void printString(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }

    }
}
