package arraylist;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        for (int element = 0; element < 8; element++) {
            listInteger.add(element);
        }
        listInteger.printArray();
        System.out.println();
        listInteger.remove(4);
        System.out.println(listInteger.contains(7));
        System.out.println(listInteger.contains(4));
        listInteger.printArray();
        listInteger.clear();
        if (listInteger.getElement() == null) {
            System.out.println("List is cleared!!");
        }
    }
}
