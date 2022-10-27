package java_learning;
import java.util.Scanner;

public class Accept_password {
	
	public static void main(String[]args) {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your password");
		a = sc.nextInt();
		System.out.println("confirm your password");
		b = sc.nextInt();
		
		if(a != b)
			System.out.println("password missmatch");
		else
			System.out.println("password created ");
		
		
		
	}

}
