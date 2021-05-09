/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De7;

/**
 *
 * @author arohigh
 */
public abstract class ThiSinh {

    protected String HoTen;
    protected String NgaySinh;
    protected String DiaChi;
//    protected boolean kiemtra;

    public ThiSinh() {

    }

    public ThiSinh(String HoTen, String NgaySinh, String DiaChi) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
    }

    public abstract void Nhap();

    public abstract void HienThi();

    public abstract boolean check();       //abstract method => khi goi thi se goi den phuong thuc trong subclass
}
