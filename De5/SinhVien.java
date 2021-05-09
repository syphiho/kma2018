/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De5;

/**
 *
 * @author arohigh
 */
public class SinhVien {

    protected String MaSV;
    protected String HoTen;
    protected String NgaySinh;
    protected String GioiTinh;
    protected Float DiemTB;

    public SinhVien(String MaSV, String HoTen, String NgaySinh, String GioiTinh, Float DiemTB) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiemTB = DiemTB;
    }

    public void HienThi() {
        System.out.println("Ma SV: " + this.MaSV);
        System.out.println("Ho ten: " + this.HoTen);
        System.out.println("Ngay sinh: " + this.NgaySinh);
        System.out.println("Gioi tinh: " + this.GioiTinh);
        System.out.println("DiemTB: " + this.DiemTB);
    }

}
