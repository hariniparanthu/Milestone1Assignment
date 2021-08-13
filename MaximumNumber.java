import java.io.*;
import java.util.Scanner;
public class MaximumNumber {
public static void main(String[] args) {
int i,n=25;
Scanner sc=new Scanner(System.in);
int Array[];   
Array = new int[n];
System.out.println("Enter 25 elements:");
for(i=0;i<n;i++)
{
Array[i]=sc.nextInt();	
}
int maximum = Array[0];
for (i = 1; i < n; i++){
if (Array[i] > maximum)
maximum = Array[i];
}
System.out.println("The maximum number is "+maximum);
}
}