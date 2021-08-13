import java.util.Scanner;
public class Pyramid {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the level of pyramid : ");
int N=sc.nextInt();
int position=1,space=N-1,num=1;
while(position<=N){
for(int i=1;i<=space;i++)
System.out.print(" ");
for(int i=1;i<=position;i++){
if(num>9){
num=num%9-1;
}
System.out.print(num);num++;
}
int rev=num-2;
for(int i=1;i<position;i++){
if(rev<0){
rev=9;
}
System.out.print(rev);rev--;
}
position++;
System.out.print("\n");
space--;
}
}
}