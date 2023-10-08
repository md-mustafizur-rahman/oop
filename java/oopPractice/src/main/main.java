package main;

import bank.Bkash;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Bkash bkash=new Bkash();
        Scanner input=new Scanner(System.in);
        boolean check=true;
        while (check==true) {
            bkash.getBkash();
            System.out.println("Have any more transaction true/false: ");
            check=input.nextBoolean();

        }
    }
}
