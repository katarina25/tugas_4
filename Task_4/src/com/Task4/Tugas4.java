package com.Task4;

import java.util.Scanner;

public class Tugas4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tugas4 tugas = new Tugas4();
		tugas.kotak();
		
	}
	
	public void kotak() {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean play=true;
		int jlh = 10;
		int posX =1;
		int posY= 1;
		
		while (play) {
			if (posX==8 && posY==8) {
				System.out.println("Anda Menang");
				play=false;
			}
			for (int i=0;i< 10; i++) {
				
				for (int j =0; j<10; j++) {
					if (i==0|| i== 10-1 || j==0 ||j==10-1) {
						System.out.print("*");
					}else if (i== posX && j==posY) {
						System.out.print("x");
					} else {
						System.out.print(" ");
					}
					
				}
					System.out.println(" ");
			}
			if (play==true) {
				System.out.print("arah : ");
			}
			
			String input = scanner.nextLine();
			
			if (input.charAt(0)=='d') {
				posY++;
			}
			else if (input.charAt(0)=='a') {
				posY--;
			}
			else if (input.charAt(0)=='w') {
				posX--;
			}
			else if (input.charAt(0)=='s') {
				posX++;
			}
			posX= posX<1?1:posX;
			posY= posY<1?1:posY;
			
			posX= posX>8?8:posX;
			posY= posY>8?8:posY;	
			
	 }	
		
	}
	
}


