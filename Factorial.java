import java.io.*;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int N,factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		N=sc.nextInt();
		for(int i=1;i<=N;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("The Factorial of "+N+"is"+" "+factorial);

	}

}
