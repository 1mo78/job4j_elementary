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
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        int ruble = Converter.dollarToRuble(140);
        System.out.println("140 dollars are " + ruble + " ruble.");
        ruble = Converter.euroToRuble(140);
        System.out.println("140 euro are " + ruble + " ruble.");
    }
}
