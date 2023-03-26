package lr_11;

public class primer1_5 {
    public static void main(String[] args) {
        System.out.println(fact(n:5));
    }

    public static void int fact(int n) {
        if (n==0) {
            return  0;
        } else  if (n==1){
            return 0;
        } else {
            return fact(n:n-2) + fact(n:n-1);
        }

    }
}
