package ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(25);
        arrayList.add(15);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        arrayList.add(30);
        System.out.println("Element at Index 5: " + arrayList.get(5));
        System.out.println("List size: " + arrayList.size());
        System.out.println("Removing element at index 2: " + arrayList.remove(2));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        //Exception check for ArrayIndexOutOfBoundsException
        System.out.println("\nException check for ArrayIndexOutOfBoundsException");
        arrayList.get(100);
    }
}
