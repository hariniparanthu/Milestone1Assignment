import java.util.*;    
import java.util.Scanner;
public class RemoveSameCharacters
{
static void removeDuplicateCharacters(char str[], int length)   
{   
int index = 0;   
for (int i = 0; i < length; i++)   
{      
int j;   
for (j = 0; j < i; j++)    
{   
if (str[i] == str[j])   
{   
break;   
}   
}  
if (j == i)    
{   
str[index++] = str[i];   
}   
}   
System.out.println("The String after removing Duplicate Characters is: ");
System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
}   
public static void main(String[] args)   
{ 
System.out.print("Enter the String:");
Scanner sc= new Scanner(System.in);
String a= sc.nextLine();
char str[] = a.toCharArray();  
int len = str.length;   
removeDuplicateCharacters(str, len);   
}   
}
