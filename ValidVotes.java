import java.util.Scanner;
public class ValidVotes {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the total no of votes : ");
int N=sc.nextInt();
int othervotes = (N*80*45)/(100*100);
System.out.print("The number of valid votes for other candidate are : "+othervotes);
}
}
