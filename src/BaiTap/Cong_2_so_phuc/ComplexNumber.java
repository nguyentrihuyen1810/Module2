package BaiTap.Cong_2_so_phuc;

import java.util.Scanner;

public class ComplexNumber {
    double real, img;

    ComplexNumber(double r, double i){
        this.real = r;
        this.img = i;
    }

    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
    {
        //tạo một số phức tạm thời để giữ tổng của hai số
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;

        //trả về số phức đầu ra
        return temp;
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5.0,6.5);
        ComplexNumber c2 = new ComplexNumber(2.9,8.1);
        ComplexNumber temp = sum(c1,c2);

        System.out.println("The sum of 2 complex numbers is: " + temp.real + " + "+ temp.img + "i");

    }
}
