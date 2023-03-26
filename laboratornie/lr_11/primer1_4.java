package lr_11;

public class primer1_4 {
    public static void main(String[] args) {
        System.out.println(fact(n:5));
    }

    public static int fact(int n) {
        int result;
        if (n==1)return 1;
        else {
            result = fact(n:n-1)*n;
            return result;
        }
    }
}
