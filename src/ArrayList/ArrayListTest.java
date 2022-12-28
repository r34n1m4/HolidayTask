package ArrayList;

public class ArrayListTest {
    public static void main(String a[]) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(23);
        arrayList.add(14);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        arrayList.add(29);
        System.out.println("Element at Index 5: " + arrayList.get(5));
        System.out.println("List size: " + arrayList.size());
        System.out.println("Removing element at index 2: " + arrayList.remove(2));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
