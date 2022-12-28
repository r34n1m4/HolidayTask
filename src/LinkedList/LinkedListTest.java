package LinkedList;
/**
 * @author Crunchify.com
 * version: 1.2
 * last updated: 11/10/2015
 */
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
        /*
         * Please note that primitive values can not be added into LinkedList directly. They must be converted to their
         * corresponding wrapper class.
         */
        System.out.println("Print: linkedList: \t\t" + linkedList);
        System.out.println(".size(): \t\t\t\t" + linkedList.size());
        System.out.println(".get(3): \t\t\t\t" + linkedList.get(3) + " (get element at index:3 - list starts from 0)");
        System.out.println(".remove(2): \t\t\t\t" + linkedList.remove(2) + " (element removed)");
        System.out.println(".get(3): \t\t\t\t" + linkedList.get(3) + " (get element at index:3 - list starts from 0)");
        System.out.println(".size(): \t\t\t\t" + linkedList.size());
        System.out.println("Print again: linkedList: \t" + linkedList);
    }
}
class LinkedList {
    private static int counter;
    private Node head;
    // Default constructor
    public LinkedList() {
    }
    // appends the specified element to the end of this list.
    public void add(Object data) {
        // Initialize Node only incase of 1st element
        if (head == null) {
            head = new Node(data);
        }
        Node node = new Node(data);
        Node head = this.head;
        // Let's check for NPE before iterate over head
        if (head != null) {
            // starting at the head node, crawl to the end of the list and then add element after last node
            while (head.getNext() != null) {
                head = head.getNext();
            }
            // the last node's "next" reference set to our new node
            head.setNext(node);
        }
        // increment the number of elements variable
        incrementCounter();
    }
    private static int getCounter() {
        return counter;
    }
    private static void incrementCounter() {
        counter++;
    }
    private void decrementCounter() {
        counter--;
    }
    // inserts the specified element at the specified position in this list
    public void add(Object data, int index) {
        Node node = new Node(data);
        Node head = this.head;
        // Let's check for NPE before iterate over head
        if (head != null) {
            // crawl to the requested index or the last element in the list, whichever comes first
            for (int i = 0; i < index && head.getNext() != null; i++) {
                head = head.getNext();
            }
        }
        // set the new node's next-node reference to this node's next-node reference
        node.setNext(head.getNext());
        // now set this node's next-node reference to the new node
        head.setNext(node);
        // increment the number of elements variable
        incrementCounter();
    }
    public Object get(int index)
    // returns the element at the specified position in this list.
    {
        // index must be 1 or higher
        if (index < 0)
            return null;
        Node head = null;
        if (this.head != null) {
            head = this.head.getNext();
            for (int i = 0; i < index; i++) {
                if (head.getNext() == null)
                    return null;
                head = head.getNext();
            }
            return head.getData();
        }
        return head;
    }
    // removes the element at the specified position in this list.
    public boolean remove(int index) {
        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;
        Node head = this.head;
        if (this.head != null) {
            for (int i = 0; i < index; i++) {
                if (head.getNext() == null)
                    return false;
                head = head.getNext();
            }
            head.setNext(head.getNext().getNext());
            // decrement the number of elements variable
            decrementCounter();
            return true;
        }
        return false;
    }
    // returns the number of elements in this list.
    public int size() {
        return getCounter();
    }
    public String toString() {
        String output = "";
        if (head != null) {
            Node head = this.head.getNext();
            while (head != null) {
                output += "[" + head.getData().toString() + "]";
                head = head.getNext();
            }
        }
        return output;
    }

}