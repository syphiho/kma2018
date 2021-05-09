/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De8;

import java.util.Scanner;

/**
 *
 * @author arohigh
 */
public class Number {
    private int Min;
    private int Max;
    private int Value;

    public int getMin() {
        return Min;
    }

    public void setMin(int Min) {
        this.Min = Min;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int Max) {
        this.Max = Max;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int Value) {
        this.Value = Value;
    }

    public Number(int Min, int Max, int Value) {
        this.Min = Min;
        this.Max = Max;
        this.Value = Value;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap Min = ");
        this.setMin(sc.nextInt());
        System.out.println("nhap Max = ");
        this.setMax(sc.nextInt());
        System.out.println("nhap Value = ");
        this.setValue(sc.nextInt());
    }
    
    public boolean KiemTraNgTo(){
        if(this.getValue()<2){
            return false;
        }
        if(this.getValue()==2){
            return true;
        }
        for (int i = 2; i < this.getValue(); i++) {
            if(this.getValue()%i==0){
                return false;
            }
        }
        return true;
    }
}
