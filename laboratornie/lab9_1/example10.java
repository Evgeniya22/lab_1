package lab9_1;

public class example10 {
    public static class Main {
        public static int m() {
            try {
                System.out.println("0");
                return 15;
            } finally {
                System.out.println("1");
                return 20;
            }
        }

        public static void main(String[] args) {
            System.out.println(m());
        }
    }
}
