package lr_11;

public class primer1_3 {
    public static int step = 0;

    public static void m(int x) {
        space();
        System.out.println(""+x+"->");

        step ++;
        if((2*x+1)<20);
        m(x:2*x+1);
    }
        step --;
        space();
        System.out.println(""+x+"<-");
    }

    public static void space( ) {
         for (int i = 0;i < step;i++) {
            System.out.println("");
    }
}
    public static void main(String[] args) { m(x:1);}
            }