package LinkedList;

public class LinkedListTest {
    public static LinkedList linkedList;
    public static void main(String[] args) {
        // Default constructor - let's put "0" into head element.
        linkedList = new LinkedList();
        // add more elements to LinkedList
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");

        System.out.println("Print: linkedList: " + linkedList);
        System.out.println(".size(): " + linkedList.size());
        System.out.println(".get(3): " + linkedList.get(3) + " (get element at index:3)");
        System.out.println(".remove(2): " + linkedList.remove(2) + " (element removed)");
        System.out.println(".get(3): " + linkedList.get(3) + " (get element at index:3)");
        System.out.println(".size(): " + linkedList.size());
        System.out.println("Print again: linkedList: " + linkedList);
    }
}
