# Number
import java.io.*;
import java.util.*;
public class Digit
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputSreamReader(System.in));
int i,n=0;
System.out.println("Enter the Number");
n=Integer.parseInt(br.readLine());
while(n>0)
{
n=n/10;
i++;
}
System.out.println("Number of Digit present : "+i);
}
}
