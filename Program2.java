package java_learning;
import java.util.Scanner;

public class Program2 {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 4 digit number");
		int num = sc.nextInt();
		sc.close();
		float l= (((num+8)/3)%5)*5;
		System.out.println("final result is "+ l);
	}

}
