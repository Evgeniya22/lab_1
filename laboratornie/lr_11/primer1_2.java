package lr_11;

public class primer1_2 {

    public static void m(int x) {
        if ((2 * x + 1) < 20) {
            m(x:2*x+1);
        }
        System.out.println("x=" + x);
    }

    public static void main(String[] args) {
        m(x:1);
    }
}
