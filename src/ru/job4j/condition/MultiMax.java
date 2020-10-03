package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int result = first >= second ? first : second;
        result = result >= third ? result : third;
        return result;
    }

    public static void main(String[] args) {

        System.out.println(max(1, 2, 3));
        System.out.println(max(4, 3, 2));
        System.out.println(max(3, 5, 4));
        System.out.println(max(6, 6, 6));
    }
}
