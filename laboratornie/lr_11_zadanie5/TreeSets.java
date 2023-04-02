package lr_11_zadanie5;

import java.util.*;

public class TreeSets {
    public static void main(String[] args)
    {

        Set<Integer> ts1 = new TreeSet<>();

        //Добавление
        for (int i = 1; i <= 9000000; i++){
            ts1.add(i);
        }

        //Проверка на нахождение элемента в дереве
        int chek = 7;
        System.out.println("Содекржит " + chek + " = " + ts1.contains(chek));

        //Поиск первого элемента
        System.out.println("Первый элемент " + ts1.stream().findFirst());

        //Удаление
        ts1.remove(1);
        ts1.remove(9000000);
        System.out.println("Array(после удаления): " + ts1);

        //Итерация
        for (Integer value : ts1) {
            System.out.print(value + ", ");
        }

        System.out.println("\nArray: " + ts1);
    }
}
