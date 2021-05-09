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
public class ThiSinhKhoiC extends ThiSinh {

    private float Van;
    private float Su;
    private float Dia;

    public ThiSinhKhoiC() {

    }

    public ThiSinhKhoiC(String HoTen, String NgaySinh, String DiaChi, float van, float su, float dia) {
        super(HoTen, NgaySinh, DiaChi);
        this.Van = van;
        this.Su = su;
        this.Dia = dia;
    }

    public float getVan() {
        return Van;
    }

    public void setVan(float Van) {
        this.Van = Van;
    }

    public float getSu() {
        return Su;
    }

    public void setSu(float Su) {
        this.Su = Su;
    }

    public float getDia() {
        return Dia;
    }

    public void setDia(float Dia) {
        this.Dia = Dia;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ho ten: ");
        this.HoTen = sc.nextLine();
        System.out.print("Nhap Ngay sinh: ");
        this.NgaySinh = sc.nextLine();
        System.out.print("Nhap Dia chi: ");
        this.DiaChi = sc.nextLine();
        System.out.print("Nhap diem Van: ");
        this.Van = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap diem Su: ");
        this.Su = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap diem Dia: ");
        this.Dia = Float.parseFloat(sc.nextLine());
    }

    public void HienThi() {
        System.out.println("Ho ten: " + this.HoTen);
        System.out.println("Ngay sinh: " + this.NgaySinh);
        System.out.println("Dia chi: " + this.DiaChi);
        System.out.println("Diem Van: " + this.Van);
        System.out.println("Diem Su: " + this.Su);
        System.out.println("Diem Dia: " + this.Dia);
        System.out.println("------------------------------------");
    }

    public boolean check() {
        if ((this.Van + this.Su + this.Dia) >= 20) {
            return true;
        } else {
            return false;
        }
    }
}
