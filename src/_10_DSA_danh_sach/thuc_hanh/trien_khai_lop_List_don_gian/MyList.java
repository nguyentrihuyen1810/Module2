package _10_DSA_danh_sach.thuc_hanh.trien_khai_lop_List_don_gian;

import java.util.Arrays;

//Tạo lớp MyList
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //Phương thức ensureCapa(): Tăng gấp đôi kích thước mảng chứa các phần tử
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //Phương thức add(): thêm phần tử vào cuối danh sách
    //add(int index, E elements)
    private void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    //Phương thức get(): trả về phần tử ở vị trí thứ i
    //get(int index)
    private E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size" + i);
        }
        return (E) elements[i];
    }

    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("Element 4: " + listInteger.get(4));
        System.out.println("Element 1: " + listInteger.get(1));
        System.out.println("Element 2: " + listInteger.get(2));

        listInteger.get(-1);
        System.out.println("Element -1: " + listInteger.get(-1));
    }
}
