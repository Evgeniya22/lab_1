package lr_11;

import groovy.util.Node;

public class razdel2_1 { //главный класс
    public static void main(String[] args) {
        // создание несвязанных узлов с помощью конструктора
       Node node0 = new  Node (0, null);
       Node node1 = new  Node (1, null);
       Node node2 = new  Node (2, null);
       Node node3 = new  Node (3, null);

       //
       node0.next = node1;
       node1.next = node2;
       node2.next = node3;

        //
        //
        Node ref = node0;
        while (ref != null) {
            System.out.println(" "+ ref.value);
            ref = ref.next;
        }
    }
}
