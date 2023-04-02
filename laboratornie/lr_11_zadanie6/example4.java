package lr_11_zadanie6;
import java.util.*;

class example4 {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> treeset = new TreeSet<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();

        System.out.println("Время выполнения операции добавления arrayDeque = " + getRunningTime1(arrayDeque));
        //System.out.println("Время выполнения операции добавления TreeSet = " + getRunningTime3(treeset));
        //System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime2(arrayList));

    }

    private static long getRunningTime1(ArrayDeque<Integer> list) {

        for (int i = 0; i < 9000000; i++) {
            list.addLast(i);
        }

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        for (int i = 0; i < 9000000; i++) {
            list.removeFirst();
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTime2(List<Integer> list) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        for (int i = 0; i < 9000000; i++) {
            list.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTime3(Set<Integer> list) {
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция
        for (int i = 0; i < 9000000; i++) {
            list.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}
