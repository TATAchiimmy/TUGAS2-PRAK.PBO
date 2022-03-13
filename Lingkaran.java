/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpbo.Murid;

/**
 *
 * @author ASUS
 */
public class Lingkaran implements MenghitungBidang{
    private double jarijari;
    public Lingkaran(double jari) {
        this.jarijari = jari;
    }
    public double getJari() {
        return jarijari;
    }

    public void setJari(double jari) {
        this.jarijari = jari;
    }
    
    @Override
    public double luas() {
         if((jarijari % 7) == 0)            //untuk fungsi jika jari jari bisa di bagi 7
        {
         return (22*jarijari*jarijari)/7;
        }
        else                                //untuk fungsi jika jari jari tidak habis di bagi 7
        {
                
         return 3.14*jarijari*jarijari;    
        }
    }
    
    @Override
    public double keliling() {
      if((jarijari % 7) == 0)              // fungsi jika jari jari bisa di bagi 7
        {
         return (22*2*jarijari)/7;
        }
          else                             // fungsi jika jari jari bisa di bagi 7
         {
         return 3.14*2*jarijari;          
         }
    }
}

