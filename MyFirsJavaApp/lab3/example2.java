package lab3;


import java.util.Scanner;
public class example2 {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите название дня недели");
        String day = id.nextLine();

        WeekDay.IfMethod(day);
        WeekDay.SwitchMethod(day);
    }

    static class WeekDay {

        static void IfMethod(String d) {
            String day = d;
            System.out.println();
            int dayN = 0;
            if (day.equals("понедельник")) {
                dayN = 1;
            } else if (day.equals("вторник")) {
                dayN = 2;
            } else if (day.equals("среда")) {
                dayN = 3;
            } else if (day.equals("четверг")) {
                dayN = 4;
            } else if (day.equals("пятница")) {
                dayN = 5;
            } else if (day.equals("суббота")) {
                dayN = 6;
            } else if (day.equals("воскресенье")) {
                dayN = 7;
            } else {
                System.out.println(day + " некорректное значение дня недели");
            }
            if (dayN != 0) {
                System.out.printf("%s - %s день недели\n", day, dayN);
            }
            return;
        }

        public static void SwitchMethod(String day) {
        }
    }
}