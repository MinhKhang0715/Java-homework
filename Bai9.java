/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author Dell
 */
public class Bai9 {
    public void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String strInput = input.nextLine();
        System.out.println("Cau a: " + cau_a(strInput));
        System.out.println("Cau b: " + removeSpace(strInput));
        System.out.println("Cau c: ");
        System.out.println(countWords(strInput));
        cau_e(strInput);
    }
    //cau a xuat do dai chuoi vua nhap
    static int cau_a(String s){
        return s.length();
    }
    
    static String removeSpace(String s){
        s = s.trim();//xoa khoang cach dau va cuoi chuoi
        //xoa khong cach thua trong chuoi
        while(s.lastIndexOf("  ") != -1){
            s = s.replaceAll("  ", " ");
        }
        return s;
    }
    
    static int countWords(String s){
        int counted = 0;
        char character;
        s = removeSpace(s);
        for(int i = 0; i < s.length(); i++){
            character = s.charAt(i);
            if(Character.isSpaceChar(character)){
                System.out.println();
                counted++;
            }
            else{
                System.out.print(character);
            }
        }
        System.out.print("\nSo tu trong chuoi la: ");
        return ++counted;
    }
    //Cau e: Nhap 2 so k, n
    //Xuat n ki tu ke tu vi tri k
    static void cau_e(String s){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so k: ");
        int k = input.nextInt();
        System.out.print("Nhap so n: ");
        int n = input.nextInt();
        int charNum = 0;
        char character;
        for(int i = k; i < s.length(); i++){
            character = s.charAt(i);
            System.out.print(character);
            charNum++;
            if(charNum == n){
                break;
            }
        }
    }
}
