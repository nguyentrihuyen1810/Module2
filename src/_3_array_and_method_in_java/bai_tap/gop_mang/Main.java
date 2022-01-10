package _3_array_and_method_in_java.bai_tap.gop_mang;

public class Main {
    //Sử dụng vòng lặp để duyệt các phần tử trong các mảng.
    //Lấy từng phần tử trong các mảng gán vào từng phần tử trong mảng trống được tạo, tính từ phần tử đầu tiên.
    public static void mergeArray(int a[],int b[],int array[]){
        for (int i = 0; i < a.length; i++){
            array[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
            array[a.length + i] = b[i];
        }
    }
    public static void main(String[] args) {
        int arr1[] = {5, 10, 52, 58};
        int arr2[] = {6, 65, 120, 36};
        int arr[] = new int[arr1.length + arr2.length];
        mergeArray(arr1, arr2, arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
