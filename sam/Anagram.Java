str 1 : meeras   str 2: sameer







import java.util.Scanner;
public class checkAnagram
{



public static void main(String[]args)
{
String str1="";
String str2="";
System.out.println("Enter the String 1: ");
Scanner sc = new scanner(System.in);
String str1=sc.nextLine();
System.out.println("Enter the String 2: ");
String str2=sc.nextLine();

str1=str1.replaceAll("//s" "").tolowerCase();
str2=str2.replaceAll("//s" "").tolowerCase();

if(isAnagram(str1,str2))
{
System.out.println("String: "+ str1 + "And String: " + str2 + "is Anagram");
else
{
System.out.println("String: "+ str1 + "And String: " + str2 + "is not Anagram");

