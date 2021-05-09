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
public class SVATTT extends SinhVien {

    private Float HocPhi;

    public Float getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(Float HocPhi) {
        this.HocPhi = HocPhi;
    }

    public SVATTT(String MaSV, String HoTen, String NgaySinh, String GioiTinh, Float DiemTB, Float HocPhi) {
        super(MaSV, HoTen, NgaySinh, GioiTinh, DiemTB);
        this.setHocPhi(HocPhi);
    }

    public void HienThi() {
        super.HienThi();
        System.out.println("Hoc phi: " + this.getHocPhi());
    }

}
