package com.github.arsengir;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getInstance();
        log.log("Запускаем программу");
        log.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int max = scanner.nextInt();
        log.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++){
            list.add(random.nextInt(max));
        }
        System.out.println("Вот случайный список " + list);
        log.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int filterValue = scanner.nextInt();
        scanner.close();
        log.log("Запускаем фильтрацию");
        Filter filter = new Filter(filterValue);
        List<Integer> listFilter = filter.filterOut(list);
        System.out.println("Отфильтрованный список " + listFilter);
        log.log("Завершаем программу");
    }
}
