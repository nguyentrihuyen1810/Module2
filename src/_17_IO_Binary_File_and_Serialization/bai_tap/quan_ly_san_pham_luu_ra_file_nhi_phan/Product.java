package _17_IO_Binary_File_and_Serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable {
    private int maSP;
    private String tenSP;
    private String hangSX;
    private double gia;
    private String motakhac;

    public Product() {

    }

    public Product(int maSP, String tenSP, String hangSX, double gia, String motakhac) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.hangSX = hangSX;
        this.gia = gia;
        this.motakhac = motakhac;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMotakhac() {
        return motakhac;
    }

    public void setMotakhac(String motakhac) {
        this.motakhac = motakhac;
    }

    @Override
    public String toString() {
        return "Product { " +
                "maSP = " + maSP +
                ", tenSP = '" + tenSP + '\'' +
                ", hangSX = '" + hangSX + '\'' +
                ", gia = " + gia +
                ", motakhac = '" + motakhac + '\'' +
                '}';
    }
}
