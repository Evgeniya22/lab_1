package lab8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("C:\\evgenia\\1.txt"));
        sc = new Scanner(sc.nextLine()).useDelimiter(" ");
        List<Double> dlist = new ArrayList<>();
        sc.forEachRemaining(x -> listPositiveDouble(dlist, Double.parseDouble(x)));

        int indexMax = dlist.indexOf(Collections.max(dlist));
        FileWriter outFile = new FileWriter("C:\\evgenia\\2.txt", true);

        for (int i = 0; i < dlist.size(); i++) {
            if (i != indexMax) outFile.write(dlist.get(i) + " ");
        }
        outFile.write(String.valueOf(dlist.get(indexMax)));
        outFile.close();
    }

    static void listPositiveDouble(List<Double> list, double val) {
        if (val > 0.0) list.add(val);
    }
}