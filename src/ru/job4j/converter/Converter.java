package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70; // формула перевода рублей в евро
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static int dollarToRuble(int value) {
        int rsl = value * 60; /* формула долларов в рубли. */
        return rsl;
    }

    public static int euroToRuble(int value) {
        int rsl = value * 70; /* формула евро в рубли. */
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int expected2 = 8400;
        int expected3 = 9800;
        int euro = Converter.rubleToEuro(140);
        boolean passed = euro == expected;
        System.out.println("140 rubles are " + euro + " euro. Test result:" + passed);
        int dollar = Converter.rubleToDollar(140);
        passed = dollar == expected;
        System.out.println("140 rubles are " + dollar + " dollar. Test result:" + passed);
        int ruble = Converter.dollarToRuble(140);
        passed = ruble == expected2;
        System.out.println("140 dollars are " + ruble + " ruble. Test result:" + passed);
        ruble = Converter.euroToRuble(140);
        passed = ruble == expected3;
        System.out.println("140 euro are " + ruble + " ruble. Test result:" + passed);
    }
}
