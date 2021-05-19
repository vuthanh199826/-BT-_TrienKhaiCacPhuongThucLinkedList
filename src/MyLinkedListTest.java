public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<Integer>(0);
        linkedList.addFirst(5);
        linkedList.addLast(10);
        linkedList.remove(2);
        linkedList.add(0,0);
        linkedList.printData();
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.indexOf(0));
        System.out.println(linkedList.get(2));
        linkedList.clear();
        linkedList.printData();
    }
}
