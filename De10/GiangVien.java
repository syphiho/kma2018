/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De10;

/**
 *
 * @author arohigh
 */
public class GiangVien {
    private String HoTen;
    private String ID;
    private String DiaChi;
    private String GioiTinh;
    private String Khoa;

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public GiangVien(String HoTen, String ID, String DiaChi, String GioiTinh, String Khoa) {
        this.HoTen = HoTen;
        this.ID = ID;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.Khoa = Khoa;
    }
    
}
