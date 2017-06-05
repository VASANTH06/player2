import java.io.*;
import java.util.*;
public class Number
{
 public static void main(String args[])
 {
  int a;
  Scanner scan=new Scanner(System.in);
  int a=scan.nextInt();
  if(a==0)
  { 
  System.out.println("zero");
  }
  else if(a>0)
  {
  System.out.println("positive");
  }
  else
  {
  System.out.println("negative");
  }
 }
} 
