// Java program to find whether the number is Even or Odd.

import java.util.*;
public class EvenOdd {
static void Num(){
Scanner s = new Scanner (System.in);
int num = s.nextInt();
if (num%2 == 0){
System.out.println ("Even number "); }
else{
System.out.println ("Odd number "); }
} 

public static void main (String a[]){
System.out.println ("Enter any number: ");
Num();
}}
