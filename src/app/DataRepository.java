package app;
//Імпортуємо клас HashMap для створення мапи

import java.util.HashMap;
//Імпортуємо інтерфейс Map - основа для HashMap
import java.util.Map;


public class DataRepository {

    //Створюємо метод, який повертає Map з ключами типу Integer і значеннями типу String
    public Map<Integer, String> getData() {
        //Створюємо новий об'єкт HashMap, який зберігає пари id -> ім'я
        Map<Integer, String> map = new HashMap<>();
//Додаємо до мапи пари: ключ та значення
        map.put(387, "Lucy");
        map.put(231, "Alice");
        map.put(394, "Bob");
        map.put(172, "Tom");
//Повертаємо готову мапу
        return map;
    }
}