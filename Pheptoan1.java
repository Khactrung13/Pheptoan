/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.baitap1.donglenh.chuong1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Pheptoan1 {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a + b = " + (a+b));
                System.out.println("a - b = " + (a-b));
                System.out.println("a * b = " + (a*b));
                System.out.println("a / b = " + (a/b));
                System.out.println("a % b = " + (a%b));
                System.out.println("a ^ b = " + (a^b));
	}
}

