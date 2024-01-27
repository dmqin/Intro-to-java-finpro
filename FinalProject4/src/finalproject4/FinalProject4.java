/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalproject4;
import java.util.Scanner;
/**
 *
 * @author 62878
 */
public class FinalProject4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int jumlah1;
        
        System.out.println("Selamat datang dalam sistem sederhana");
        
        System.out.println("Contoh If Else Situation");
        System.out.println("Masukkan 3 angka untuk membandingkan inputen user yang paling besar");
        
        System.out.print("Enter first number :");
        int n1 = scan.nextInt();
        System.out.print("Enter second number :");
        int n2 = scan.nextInt();
        System.out.print("Enter third number :");
        int n3 = scan.nextInt();
        
        if(n1>n2)
            if(n1>n3)
                System.out.println("the largest number is " +n1);
        if(n2>n1)
            if(n2>n3)
                System.out.println("the largest number is " +n2);
        if(n3>n1)
            if(n3>n2)
                System.out.println("the largest number is " +n3);   
        
        
        System.out.println("\n\nContoh Switch Case Situation");
        System.out.println("Berapa hasil penjumlahan dari 13-10=");
        System.out.println("A. 4");
        System.out.println("B. 5");
        System.out.println("C. 3");
        System.out.print("Mana jawaban yang benar: ");
        char huruf = scan.next().charAt(0);
        switch (Character.toUpperCase(huruf)) {
            case 'A':
                System.out.println("Jawaban anda salah");
                break;
            case 'B':
                System.out.println("Jawaban anda salah");
                break;
            case 'C':
                System.out.println("Jawaban anda benar");
                break;
            default:
                System.out.println("Jawaban anda tidak valid");
            break;
        } 
        
    }
    
}
