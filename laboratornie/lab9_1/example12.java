package lab9_1;

public class example12 {
    public static class Main {
        public static void m(String str, double chislo) {
            if (str == null) {
                throw new IllegalArgumentException("Строка введена неверно");
            }
            if (chislo > 0.001) {
                throw new IllegalArgumentException("Неверное число");
            }
        }

        public static void main(String[] args) {
            m(null, 0.000001);
        }
    }

}
