package _14_Thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

public class InsertionSort {
    static int[] list = {1, 3, 5, 9, 45, 21, 36, 45, 10, 98, -5, -2, 0, -25};

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i - 1;
            while (pos >= 0 && list[pos] > x) {
                list[pos + 1] = list[pos];
                pos--;
            }
            list[pos + 1] = x;
            }
        }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
