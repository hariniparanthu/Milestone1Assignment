public class Time {
public static void main(String[] args) {
int ravi=32,kumar=40,h1=6,h2=5;
float ra=ravi/(float)h1;
float ka=kumar/(float)h2;
float c=(ra+ka);
float timetaken=110/c;
int hr=(int)timetaken;
int mins = (int)((timetaken-hr)*100);
int min = (mins*60/100);
System.out.println("The time taken by both to complete 110 pages is : "+hr+" hours "+min+" minutes");
}
}