# Vowel2
import java.io.*;
import java.util.*;
public class Vowel
{
  public static void main(String args[]) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a alphabet");
    char ch=sc.next().charAt(0);
    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
      System.out.println("It is a vowel");
    }
    else
    {
      System.out.println("It is a consonant");
    }
  }
}
