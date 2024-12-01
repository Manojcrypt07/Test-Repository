package JavaPackager;

import java.util.Scanner;

public class UserinputGettingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number =");
		int a = sc.nextInt();
		if (a>0)
		 {
		System.out.println("The given is Positive");
			 }
			 			 
			 else if (a<0) {
				 System.out.println("The given number is negative");
			 }
			 else {
				 System.out.println("The given number is zero");
			 }

	}

}
