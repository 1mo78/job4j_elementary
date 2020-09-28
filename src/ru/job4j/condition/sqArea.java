package ru.job4j.condition;

public class sqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        int p = 6;
        int k = 2;
        double result1 = sqArea.square(p, k);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result1);

    }
}
