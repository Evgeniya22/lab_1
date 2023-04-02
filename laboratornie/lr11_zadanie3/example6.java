package lr11_zadanie3;
import java.util.*;
public class example6 {
    public static void gKMF(HashMap<Integer, String> hm){
        for (int i = 1; i <= hm.size(); i++){
            if (i > 5){
                System.out.print(hm.get(i) + " ");
            }
        }
    }

    public static void pSM5(HashMap<Integer, String> hm){
        for (int i = 1; i <= hm.size(); i++){
            if (i % 5 == 0){
                if (i < hm.size()) {
                    System.out.print(hm.get(i) + ", ");
                } else if (i == hm.size()) {
                    System.out.print(hm.get(i));
                }
            }
        }
    }

    public static void multi(HashMap<Integer, String> hm){
        System.out.println(hm.entrySet().stream().filter(e -> e.getValue().length() > 5).mapToInt(Map.Entry::getKey).reduce(1, (x, y) -> x * y));
    }

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Ram");
        hm.put(2, "Shyam");
        hm.put(3, "Sita");
        hm.put(4, "Rin");
        hm.put(5, "Akiko");
        hm.put(6, "Hikeru");
        hm.put(7, "Mezemi");
        hm.put(8, "Yuka");
        hm.put(9, "Yoko");
        hm.put(10, "Rioko");

        System.out.println("HashMap: " + hm + "\n");

        System.out.println("HashMap, где ключ > 5: ");
        gKMF(hm);

        System.out.println("\n\nHashMap, где ключ % 5 = 0: ");
        pSM5(hm);

        System.out.println("\n\nHashMap, перемножение ключей, где длина строки > 5: ");
        multi(hm);
    }
}
