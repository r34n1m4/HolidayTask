package LinkedList;

public class LinkedList {
    private static int counter;
    private Node head;

    // Default constructor
    public LinkedList() {
    }

    // appends the specified element to the end of this list.
    public void add(Object data) {
        // Initialize Node only in case of 1st element
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
