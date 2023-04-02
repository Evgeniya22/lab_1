package lr11_zadanie3;


class Node1{
    public int value;
    public Node1 next;

    Node1(int value, Node1 next){
        this.value = value;
        this.next = next;
    }
}

class eaxmple5_1 {

    public static void main(String[] args) {
        Node1 head = null;
        for (int i = 9; i >= 0; i--){
            head = new Node1(i, head);
        }

        Node1 ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}