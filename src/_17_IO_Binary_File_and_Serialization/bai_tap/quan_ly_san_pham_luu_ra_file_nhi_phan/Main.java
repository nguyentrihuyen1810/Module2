package _17_IO_Binary_File_and_Serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import _17_IO_Binary_File_and_Serialization.thuc_hanh.doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "iphone 13", "Apple", 30000000, ""));
        products.add(new Product(2, "Samsung Galaxy", "Samsung", 30000000, ""));
        products.add(new Product(3, "Oppo Reno", "Oppo", 9000000, ""));
        products.add(new Product(4, "Vivo", "Vivo", 8000000, ""));
        products.add(new Product(5, "Nokia C20", "Nokia", 3000000, ""));
        writeToFile("Product.csv", products);
        List<Product> productDataFromFile = readDataFromFile("Product.csv");
        for (Product product : productDataFromFile) {
            System.out.println(product);
        }
    }


    private static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
}
