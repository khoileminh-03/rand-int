package mypackage;

import java.lang.*;
import java.util.*;
import java.io.*;

public class Randomkintegers {
	public static void main(String args[]) {
		int k,i,sum;
		sum = 0;
		int[] num = new int[100];
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong so nguyen k: ");
		k = sc.nextInt();
		if(k<=0) System.out.println("Error...");
		else { 
			for(i=0;i<k;i++) {
				num[i] = (int)(Math.random() * (100 - (-100) + 1) + (-100));
				sum = sum + num[i];
			}
			for(i=0;i<k;i++) {
				System.out.print(num[i]+" ");
			}
			float avg;
			avg = ((float)sum/k);
			System.out.println("\nSo trung binh: "+avg);
			int min, max;
			min = num[0];
			max = num[0];
			for(i=0;i<k;i++) {
				if(min>num[i]) min = num[i];
				if(max<num[i]) max = num[i];
			}
			System.out.println("So nho nhat la: "+min);
			System.out.println("So lon nhat la: "+max);
			int sumeven = 0, sumodd = 0;
			System.out.print("Cac so chan la: ");
			for(i=0;i<k;i++) {
				if(num[i]%2==0) {
					System.out.print(num[i]+" ");
				}
			}
			System.out.print("\nCac so le la: ");
			for(i=0;i<k;i++) {
				if(num[i]%2!=0) {
					System.out.print(num[i]+" ");
				}
			}
			for(i=0;i<k;i++) {
				if(num[i]%2==0) {
					sumeven=sumeven+num[i];
				}
				else sumodd=sumodd+num[i];
			}
			System.out.println("\nTong cac so chan la: "+sumeven);
			System.out.println("Tong cac so le la: "+sumodd);
		}
	}
}
