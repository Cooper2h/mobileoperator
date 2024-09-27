public class Main {
    public static void main(String[] args) {

        // переменные для входных данных и
        // параметров программы
        int InitialBalance = 100; //начальный счет
        int Amount = 1100; // сумма пополнения

        // бонус
        int bonus = 0;
        if (Amount > 1000) {
        bonus = (Amount - 1000) / 10;

    }

    //Итоговый баланс
    int balance = InitialBalance + Amount + bonus;

//Результат
    System.out.println("Итоговый баланс: "+ balance +" рублей");
    System.out.println("Бонус: "+bonus +" рублей");
}
}