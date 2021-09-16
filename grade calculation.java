package com.company;
import java.util.Scanner;
public class MyCaptianPractice {
    public static void main(String[] args) {
        System.out.println("Enter your marks here out of 100");
        Scanner marks = new Scanner(System.in);
        System.out.println("marks");
        int a = marks.nextInt();
        if ( a >=91) {
            System.out.println("Your grade is O");
        }else if(a >=81){
            System.out.println("Your grade is E");
        }else if(a >=71){
            System.out.println("Your grade is A");
        }else if(a >=61){
            System.out.println("Your grade is B");
        }else if(a >=51){
            System.out.println("Your grade is C");
        }else if(a >=41){
            System.out.println("Your grade is D");
        }else if(a <33){
            System.out.println("Your grade is F");
        }else{
            System.out.println("Wrong Choice!!!  Try Again");
        }
    }
}
