import java.io.*;
import java.lang.Math;
import java.util.Scanner;
public class GreatestNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a=43,b=91,c=183;
int p=Math.abs(a-b);
int q=Math.abs(c-b);
int w=Math.abs(c-a);
int gcdNumbers = GreatestNumber.findGCD(p, q, w);
System.out.println("The greatest Number that will divide 43,91,183 to leave the same remainder in each case is:");
System.out.println(gcdNumbers);
sc.close();
}
 public static int findGCD(int a, int b) 
 {
if(b== 0)
{
return a;
}
else
{
return findGCD(b, a % b);
}
}
public static int findGCD(int a, int b, int c) 
{
return findGCD(findGCD(a, b), c);
}
}
