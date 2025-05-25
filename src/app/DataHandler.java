package app;
//Імпортуємо інтерфейс Map

import java.util.Map;
// Імпортуємо клас для лічильника, який можна змінювати у лямбді
import java.util.concurrent.atomic.AtomicInteger;


public class DataHandler {
    // Створюємо мапу: отримуємо її з методу getData класу DataRepository
    Map<Integer, String> map = new DataRepository().getData();

    //Метод повертає рядок, який містить усіх користувачів
    public String getAll() {
        //Створюємо об'єкт для формування рядка та додаємо заголовок до результату
        StringBuilder sb = new StringBuilder();
        sb.append("\nALL NAMES:\n");
//Створюємо лічильник який починається з 1
        AtomicInteger count = new AtomicInteger(1);
//Проходимо по кожному елементу мапи (id, name), і для кожного додаємо рядок у StringBuilder у форматі:
// "номер) id, name", де номер - порядковий номер елемента (який збільшується на кожному кроці), id- ключ з мапи,
        //name- відповідне ім'я; кожен рядок закінчується переходом на новий рядок
        map.forEach((id, name) ->
                sb.append(String.format("%d) %d, %s%n", count.getAndIncrement(), id, name)));

        //Повертаємо зібраний рядок
        return sb.toString();
    }

    //Метод повертає користувача з певним ID
    public String getById(int id) {
        if (map.containsKey(id)) {  //Якщо в мапі є такий ключ (id)
            return "\nNAME: id " + id + ", " + map.get(id); //Повертаємо рядок з ID та ім'ям
        } else {
            return "No data!"; //Якщо такого ID немає, повертаємо повідомлення
        }
    }
}