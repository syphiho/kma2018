/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De1;

/**
 *
 * @author arohigh
 */
public class Student extends Person {

    private String MaSV;
    private String Email;
    private Float DTK;

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Float getDTK() {
        return DTK;
    }

    public void setDTK(Float DTK) {
        this.DTK = DTK;
    }

    public Student(String HoTen, String NgaySinh, String DiaChi, String GioiTinh, String MaSV, String Email, Float DTK) {
        super(HoTen, NgaySinh, DiaChi, GioiTinh);
        this.setMaSV(MaSV);
        this.setEmail(Email);
        this.setDTK(DTK);
    }
    
    public void HienThi(){
        super.HienThi();
        System.out.println("Ma SV: "+this.getMaSV());
        System.out.println("Email: "+this.getEmail());
        System.out.println("DTK: "+this.getDTK());
    }

}
