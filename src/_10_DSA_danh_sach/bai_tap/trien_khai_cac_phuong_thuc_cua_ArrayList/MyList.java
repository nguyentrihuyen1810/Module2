package _10_DSA_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_ArrayList;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {

        }
    }

    public void add (int index, E element) {

    }
}
