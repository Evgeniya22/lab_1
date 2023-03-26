package lr_11;

public class primer1_1 {
    public static void m(int x) {
        System.out.println("x="+x);
        if ((2*x+1)<20) {
            m(x:2*x+1);
        }
    }

    public static void main(String[] args) {
        m(x:1);
    }
}
