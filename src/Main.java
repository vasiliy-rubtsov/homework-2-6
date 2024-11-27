import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Исходные данные
        List<Integer> nums = new ArrayList<>(List.of(6, 7, 1, 1, 2, 3, 4, 5, 5, 4));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        // Задание 1. Напечатать в консоль только нечетные числа из последовательности
        System.out.println("Задание 1. Простой вывод нечетных чисел");

        // Проходим по всем элементам исходного списка
        for (Integer num : nums) {
            if (num % 2 > 0) {
                System.out.println(num); // Если это нечетные элемент, то выводим его в консоль
            }
        }
        System.out.println("--------------------------");

        // Задание 2. Напечатать в консоль только четные числа из последовательности без повторений, в порядке возрастания
        System.out.println("Задание 2. Вывод четных чисел без повторений в порядке возрастания");
        List<Integer> numsOut = new ArrayList<>(); // Пустой список для формирования результата

        // Проходим по всем элементам исходного списка
        for (Integer num : nums) {
            // сразу пропускаем нечетные числа
            if (num % 2 > 0) {
                continue;
            }

            // Добавляем четное число в результирующий список, если его там еще нет
            if (!numsOut.contains(num)) {
                numsOut.add(num);
            }
        }

        // Упорядочиваем элементы результирующего списка по возрастанию
        Collections.sort(numsOut);

        // Выводим в консоль элементы результирующего списка
        for (Integer num : numsOut) {
            System.out.println(num);
        }

        System.out.println("--------------------------");

        // Задание 3. Напечатать в консоль все уникальные слова из списка слов
        System.out.println("Задание 3. Простой вывод уникальных слов из списка");

        Map<String, Integer> strMap = new HashMap<>(); // Мап для подсчета числа повторений

        // Проходим по всем элементам исходного списка
        for (String str: strings) {
            // Фиксируем факт повторения этого слова в мапе
            strMap.put(str, strMap.getOrDefault(str, 0) + 1);
        }

        // Ищем в мапе те слова, у к-рых кол-во повторений равно единице, и выводим их в консоль
        for (Map.Entry<String, Integer> entry : strMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("--------------------------");


        // Задание 4. Напечатать в консоль  количество дублей для каждого уникального слова
        System.out.println("Задание 4. Вывод количества дублей для слов из списка");

        strMap.clear();

        // Проходим по всем элементам исходного списка
        for (String str: strings) {
            // Фиксируем факт повторения этого слова в мапе
            strMap.put(str, strMap.getOrDefault(str, 0) + 1);
        }

        // Выводим из мапа значения
        for (Integer n : strMap.values()) {
            System.out.println(n);
        }

        System.out.println("--------------------------");

    }
}