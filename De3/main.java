/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author arohigh
 */
public class main {

    public static void main(String[] args) {
        ArrayList listNV = new ArrayList();

        try {
            FileReader fr = new FileReader("nhanvien.dat");
            BufferedReader br = new BufferedReader(fr);
            String s = "";
            while ((s = br.readLine()) != null) {
                String[] array = s.split("\\$");
                NhanVien nv = new NhanVien(array[0], array[1], array[2], array[3], array[4], Float.parseFloat(array[5]), Integer.parseInt(array[6]), Float.parseFloat(array[7]));
                listNV.add(nv);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        
        for (int i = 0; i < listNV.size(); i++) {
            NhanVien nv = (NhanVien) listNV.get(i);
            nv.HienThi();
            System.out.println("-----------------------------");
        }
    }
}
