/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpbo;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import tpbo.guru.Balok;
import tpbo.guru.Tabung;

public class Tpbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
               
        System.out.println(" Nama : WINDY FEBRIANTI ODE "); 
        System.out.println(" NIM  : 123200036 ");
        
           int pil = 0;
           int pilih,a;
        do{
        double panjang,lebar,tinggiBalok,jari,tinggiTabung;
        Scanner input = new Scanner(System.in); 
        
        System.out.println("~~~~~~~~MENU UTAMA~~~~~~~~");
        System.out.println("1. HITUNGLAH BALOK");
        System.out.println("2. HITUNGLAH TABUNG");
        System.out.println("3. EXIT");
        System.out.print("pilih : "); pilih = input.nextInt();
        
        switch(pilih){
        
            case 1: 
                System.out.print("INPUT PANJANG   : "); panjang = input.nextInt();
                System.out.print("INPUT LEBAR     : "); lebar = input.nextInt();
                System.out.print("INPUT TINGGI    : "); tinggiBalok = input.nextInt();
                
                Balok balok = new Balok(tinggiBalok,panjang,lebar);
                
                System.out.println("~~~~~~~~~~~OUTPUT~~~~~~~~~~");
                System.out.println("LUAS PERSEGI PANJANG            : " + balok.luas());
                System.out.println("KELILING PERSEGI PANJANG        : " + balok.keliling());
                System.out.println("VOLUME BALOK                    : " + balok.volume());
                System.out.println("LUAS PERMUKAAN BALOK            : " + balok.luaspermukaan());
                
                
                break;
            case 2 :
                System.out.print("INPUT TINGGI    : "); tinggiTabung = input.nextInt();
                System.out.print("INPUT JARI-JARI : "); jari = input.nextInt();
                
                
                Tabung tabung = new Tabung(tinggiTabung,jari);
                
                System.out.println("~~~~~~~~~~OUTPUT~~~~~~~~~~");
                System.out.println("LUAS LINGKARAN          : " + tabung.luas());
                System.out.println("KELILING LINGKARAN      : " + tabung.keliling());
                System.out.println("VOLUME TABUNG           : " + tabung.volume());
                System.out.println("LUAS PERMUKAAN TABUNG   : " + tabung.luaspermukaan());
                
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Input Salah");
                
                break;
            } 
            System.out.print("INPUT ULANG YA :) ? (Ya=1)(No=2) : ");
            a = input.nextInt();
        }while(a==1);
    }
}
   
    
