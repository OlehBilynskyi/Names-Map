package app;

public class Main {

    public static void main(String[] args) {
        //Створюємо об'єкт класу DataHandler, який відповідає за обробку даних
        DataHandler handler = new DataHandler();
        //Створюємо об'єкт класу UIOperator, який відповідає за виведення в консоль
        UIOperator uiOperator = new UIOperator();
//Виклик методу getAll у handler.; виводить всіх користувачів
        uiOperator.getOutput(handler.getAll());
        //Виклик методу getById у handler. з аргументом 172, Виводить користувача з ID 172
        uiOperator.getOutput(handler.getById(172));
    }
}