/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasusperulangan2;

import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class StudiKasusPerulangan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Menghitung Huruf 'i' Pada Suatu Nama");
        System.out.println("____________________________________");
        
        Scanner n = new Scanner(System.in);
        
        System.out.println("Masukkan Nama Anda :");
        
        //Deklarasi variable
        String nama = n.nextLine();;
        char huruf = 'i';
        int jumlah=0;
       
        //looping ke setiap huruf di variabel nama
        for(int i = 0; i<nama.length(); i++){
           
        //memastikan huruf ke-i = huruf yang dicari
        if(nama.charAt(i)== huruf){
               
        //jika iya maka bertambah 1
        jumlah++;
               
           }
       }
       
       //hasil perhitungan
        System.out.println("Jumlah huruf '"+huruf+"' pada nama "+nama+ " adalah " + jumlah);
                }
            }
        
        
    
