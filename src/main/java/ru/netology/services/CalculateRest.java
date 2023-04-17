package ru.netology.services;

public class CalculateRest {
    public int calcMonthsRest(int income, int expenses, int threshold) {
        int money = 0; // количество денег на счету
        int count = 0; // счётчик месяцев отдыха

        for (int month = 0; month < 12; month++) {

            if (money >= threshold) { // можем ли отдыхать?
                //отдых
                money = money - expenses;
                money = money / 3;
                count++; // увеличиваем счётчик месяцев отдыха
            } else {
                //работа
                money = money + income - expenses;
            }
        }

        return count;
    }
}
