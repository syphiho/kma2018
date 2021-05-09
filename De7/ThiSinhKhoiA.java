/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De7;

import java.util.Scanner;

/**
 *
 * @author arohigh
 */
public class ThiSinhKhoiA extends ThiSinh {

    private float Toan;
    private float Ly;
    private float Hoa;

    public ThiSinhKhoiA() {

    }

    public ThiSinhKhoiA(String HoTen, String NgaySinh, String DiaChi, float toan, float ly, float hoa) {
        super(HoTen, NgaySinh, DiaChi);
        this.Toan = toan;
        this.Ly = ly;
        this.Hoa = hoa;
    }

    public float getToan() {
        return Toan;
    }

    public void setToan(float Toan) {
        this.Toan = Toan;
    }

    public float getLy() {
        return Ly;
    }

    public void setLy(float Ly) {
        this.Ly = Ly;
    }

    public float getHoa() {
        return Hoa;
    }

    public void setHoa(float Hoa) {
        this.Hoa = Hoa;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ho ten: ");
        this.HoTen = sc.nextLine();
        System.out.print("Nhap Ngay sinh: ");
        this.NgaySinh = sc.nextLine();
        System.out.print("Nhap Dia chi: ");
        this.DiaChi = sc.nextLine();
        System.out.print("Nhap diem Toan: ");
        this.Toan = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap diem Ly: ");
        this.Ly = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap diem Hoa: ");
        this.Hoa = Float.parseFloat(sc.nextLine());
    }

    public void HienThi() {
        System.out.println("Ho ten: " + this.HoTen);
        System.out.println("Ngay sinh: " + this.NgaySinh);
        System.out.println("Dia chi: " + this.DiaChi);
        System.out.println("Diem Toan: " + this.Toan);
        System.out.println("Diem Ly: " + this.Ly);
        System.out.println("Diem Hoa: " + this.Hoa);
        System.out.println("------------------------------------");
    }

    public boolean check() {
        if ((this.Toan + this.Ly + this.Hoa) >= 20) {
            return true;
        } else {
            return false;
        }
    }
}
