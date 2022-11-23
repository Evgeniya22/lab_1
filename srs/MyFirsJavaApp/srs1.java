package MyFirsJavaApp;

import java.util.Scanner;

public class srs1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.println("Input surname: ");
        String surname = in.nextLine();
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input MiddleName: ");
        String MiddleName = in.nextLine();
        System.out.println("surname: " + surname);
        System.out.println("name: " + name);
        System.out.println("MiddleName: " + MiddleName);
        System.out.println("Hello" + " " + surname + " " + name + " " + surname);
        in.close();
    }
}
