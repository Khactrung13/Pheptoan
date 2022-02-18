/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.baitap1.donglenh.chuong1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Pheptoan2 {
      public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
		Byte a = sc.nextByte();
		Byte b = sc.nextByte();
		System.out.println("a + b = " + (a+b));
                System.out.println("a - b = " + (a-b));
                System.out.println("a * b = " + (a*b));
                System.out.println("a / b = " + (a/b));
                System.out.println("a % b = " + (a%b));
                System.out.println("a ^ b = " + (a^b));
	}
}


