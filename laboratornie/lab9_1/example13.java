package lab9_1;

public class example13 {
    public static class Main {
        public static void main(String[] args) {
            try {
                int l = args.length;
                System.out.println("размер массива= " + l);

                int h = 10 / l;
                args[l + 1] = "10";
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс не существует");
            }
        }
    }

}
