/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arohigh
 */
public class main {

    public static void main(String[] args) {
        abc a = new abc();
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> listSV = new ArrayList<ThiSinh>();
        System.out.print("Nhap so luong thi sinh: n = ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin thi sinh thu " + (i + 1));
            System.out.print("Ban muon nhap thi sinh khoi A hay C: ");
            String s = sc.nextLine();
            if (s.equals("A") || s.equals("a")) {
                //nhap vao thi sinh khoi A
                ThiSinh tsa = new ThiSinhKhoiA();
                tsa.Nhap();
                listSV.add(tsa);

            } else if (s.equals("C") || s.equals("c")) {
                //nhap vao thi sinh khoi C
                ThiSinh tsc = new ThiSinhKhoiC();
                tsc.Nhap();
                listSV.add(tsc);
            } else {
                System.out.println("Ban nhap sai");
            }
            System.out.println("-------------------------------");
        }

        System.out.println("DANH SACH THI SINH TRUNG TUYEN");
        for (ThiSinh ts : listSV) {
            if (ts.check()) {
                ts.HienThi();
            }
        }
    }
}
