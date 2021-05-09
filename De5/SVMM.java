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
public class SVMM extends SinhVien {

    private String DonVi;

    public String getDonVi() {
        return DonVi;
    }

    public void setDonVi(String DonVi) {
        this.DonVi = DonVi;
    }

    public Float getLuong() {
        return Luong;
    }

    public void setLuong(Float Luong) {
        this.Luong = Luong;
    }
    private Float Luong;

    public SVMM(String MaSV, String HoTen, String NgaySinh, String GioiTinh, Float DiemTB, String DonVi, Float Luong) {
        super(MaSV, HoTen, NgaySinh, GioiTinh, DiemTB);
        this.setDonVi(DonVi);
        this.setLuong(Luong);
    }

    public void HienThi() {
        super.HienThi();
        System.out.println("Don vi: " + this.getDonVi());
        System.out.println("Luong: " + this.getLuong());
    }

}
