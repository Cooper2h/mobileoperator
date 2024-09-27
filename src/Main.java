public class Main {
    public static void main(String[] args) {

        // переменные для входных данных и
        // параметров программы
        int initialBalance = 100; //начальный счет
        int amount = 1100; // сумма пополнения

        // бонус
        int bonus = 0;
        if (amount > 1000) {
            bonus = (amount - 1000) / 10;

        }

        //Итоговый баланс
        int balance = initialBalance + amount + bonus;

//Результат
        System.out.println("Итоговый баланс: " + balance + " рублей");
        System.out.println("Бонус: " + bonus + " рублей");
    }
}