/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De3;

import De2.*;

/**
 *
 * @author arohigh
 */
public class NhanVien extends Person {

    private String PhongBan;
    private Float HeSoLuong;
    private int ThamNien;
    private Float LuongCB;

    public String getPhongBan() {
        return PhongBan;
    }

    public void setPhongBan(String PhongBan) {
        this.PhongBan = PhongBan;
    }

    public Float getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(Float HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public int getThamNien() {
        return ThamNien;
    }

    public void setThamNien(int ThamNien) {
        this.ThamNien = ThamNien;
    }

    public Float getLuongCB() {
        return LuongCB;
    }

    public void setLuongCB(Float LuongCB) {
        this.LuongCB = LuongCB;
    }

    public NhanVien(String HoTen, String NgaySinh, String DiaChi, String GioiTinh, String PhongBan, Float HeSoLuong, int ThamNien, Float LuongCoBan) {
        super(HoTen, NgaySinh, DiaChi, GioiTinh);
        this.setPhongBan(PhongBan);
        this.setHeSoLuong(HeSoLuong);
        this.setThamNien(ThamNien);
        this.setLuongCB(LuongCoBan);
    }

    public void HienThi() {
        super.HienThi();
        System.out.println("Phong ban: " + this.getPhongBan());
        System.out.println("He so luong: " + this.getHeSoLuong());
        System.out.println("Tham nien: " + this.getThamNien());
        System.out.println("Luong CB: " + this.getLuongCB());
    }

    public Float LuongThucLinh() {
        return this.getLuongCB() * this.getHeSoLuong() * (1 + this.getThamNien() / 100);
    }
}
