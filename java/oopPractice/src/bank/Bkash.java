package bank;

import java.util.Scanner;

public class Bkash extends Bank {
    Scanner input = new Scanner(System.in);
    public void  getBkash(){
        if(this.bankPin==0){
            System.out.println("Enter Bank Name: ");
            String bankName=input.next();
            System.out.println("Enter Bank number:");
            long bankNumber=input.nextLong();
            System.out.println("Enter bank pin:");
              int bankPin=input.nextInt();
            System.out.println("Enter Bank total money to deposit:");
            double bankMoney=input.nextDouble();
            setBank(bankName,bankNumber,bankPin,bankMoney);
            loginBank(this.bankPin);
        }
        else {
            loginBank(this.bankPin);
        }
    }

}
