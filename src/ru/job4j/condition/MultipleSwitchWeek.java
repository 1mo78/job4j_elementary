package ru.job4j.condition;

public class MultipleSwitchWeek {
    public int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Vtornik" -> 1;
            case "Среда", "Sreda" -> 1;
            case "Четверг", "Chetverg" -> 1;
            case "Пятница", "Pyatnica" -> 1;
            case "Суббота", "Subbota" -> 1;
            case "Воскресенье", "Voskresenye" -> 1;
            default -> -1;
        };
    }

}
