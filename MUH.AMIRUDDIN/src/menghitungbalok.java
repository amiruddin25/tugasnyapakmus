/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sony vaio
 */import java.util.Scanner;
public class menghitungbalok {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        double p,l,t, luaspt,luas,volume;
        System.out.print("masukkan nilai p; ");
        p=input.nextDouble();
        System.out.print("masukkan nilai l; ");
        l=input.nextDouble();
        System.out.print("masukkan nilai luaspt; ");
        luaspt=input.nextDouble();
        t=luaspt/1;
        luas=(2*p*t) + (2*p*t) + (2*p*t);
        volume=p*l*t;
        System.out.println("masukkan nilai volume; "+volume);
         System.out.println("masukkan nilai volume; "+luas);
        
    }
}
