package lr_11_zadanie5;

import java.util.*;

public class ArrayL {
    public static void main(String[] args) {
        int n = 9000000;
        int index = 0;
        ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

        //Добавление
        for (int i = 1; i <= n; i++) {
            arr1.add(index, i);
            index++;
        }

        //Добавление по индексу
        arr1.add(143513, 777);
        arr1.add(123515, 666);
        System.out.println("Array:" + arr1);

        //Удаление по индексу
        arr1.remove(27);
        System.out.println("Array: " + arr1);

        //Поиск
        Integer s = arr1.get(2111);
        System.out.println("Поиск по индексу:" + s);

        //Сортировка
        Collections.sort(arr1);
        System.out.println("Array(после сортировки):" + arr1);

        //Размер
        Integer r = arr1.size();
        System.out.println("Размер:" + r);

        System.out.println("Array:" + arr1);

    }
}