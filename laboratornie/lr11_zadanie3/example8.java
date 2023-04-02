package lr11_zadanie3;

public class example8 {

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public class SinglyLinkedList {
        private Node head;

        public SinglyLinkedList() {
            head = null;
        }

        // Ввод с головы
        public void createHead(int value) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }

        // Ввод с хвоста
        public void createTail(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Вывод списка
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node current = head;
            while (current != null) {
                sb.append(current.value);
                if (current.next != null) {
                    sb.append(" -> ");
                }
                current = current.next;
            }
            return sb.toString();
        }

        // Добавление элемента в начало списка
        public void addFirst(int value) {
            createHead(value);
        }

        // Добавление элемента в конец списка
        public void addLast(int value) {
            createTail(value);
        }

        // Вставка элемента в список с указанным номером
        public void insert(int index, int value) {
            if (index == 0) {
                addFirst(value);
            } else {
                Node newNode = new Node(value);
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    if (current == null) {
                        throw new IndexOutOfBoundsException("Invalid index");
                    }
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
        }

        // Удаление элемента с головы списка
        public void removeFirst() {
            if (head == null) {
                throw new IllegalStateException("Empty list");
            }
            head = head.next;
        }

        // Удаление последнего элемента списка
        public void removeLast() {
            if (head == null) {
                throw new IllegalStateException("Empty list");
            }
            if (head.next == null) {
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        }

        // Удаление из списка элемента с указанным номером
        public void remove(int index) {
            if (head == null) {
                throw new IllegalStateException("Empty list");
            }
            if (index == 0) {
                removeFirst();
            } else {
                Node current = head;
                for (int i = 0; i < index - 1; i++) {
                    if (current == null) {
                        throw new IndexOutOfBoundsException("Invalid index");
                    }
                    current = current.next;
                }
                if (current.next == null) {
                    throw new IndexOutOfBoundsException("Invalid index");
                }
                current.next = current.next.next;
            }

        }
    }
}
