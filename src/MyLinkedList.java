import javax.xml.soap.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node current = head;
        for (int i = 1; i < numNodes; i++) {
            current = current.next;
        }
        Node tail = current;
        tail.next = new Node(element);
        tail = tail.next;
        numNodes++;
    }

    public void add(int index, E element) {
        if (index == 0) addFirst(element);
        else if (index >= numNodes) addLast(element);
        else {
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node temp = current.next;
            current.next = new Node(element);
            current.next.next = temp;
            numNodes++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            return null;
        } else if (index == 0) {
            head = head.next;
            numNodes--;
        } else {
            Node previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            Node current = previous.next;
            previous.next = current.next;
            numNodes--;
        }
        return null;
    }


    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data == element) {
                return i;
            } else {
                temp = temp.next;
            }
        }
        return -1;
    }

    public E get(int i) {
        if (i < 0 || i >= numNodes) {
            return null;
        } else {
            Node current = head;
            for (int j = 0; j < i; j++) {
                current = current.next;
            }
            return (E) current.data;
        }
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        Node tail = head;
        for (int i = 0; i < numNodes - 1; i++) {
            tail = tail.next;
        }
        return (E) tail.data;
    }

    public void clear() {
        Node current = head;
        for (int i = 0; i < numNodes; i++) {
            current.data = null;
            current = current.next;
        }
        numNodes = 0;
    }

    public void printData() {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
