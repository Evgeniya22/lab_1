package lr11_zadanie3;
class Node2{
    public int value;
    public Node2 next;

    Node2(int value, Node2 next){
        this.value = value;
        this.next = next;
    }
}
public class example5_2 {
    public static void main(String[] args) {
        Node2 head = null;
        for (int i = 9; i >= 0; i--){
            head = new Node2(i, head);
        }
        Node2 newtail = new Node2(123, null);

        Node2 ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
            ref.next = newtail;
        }
    }
}