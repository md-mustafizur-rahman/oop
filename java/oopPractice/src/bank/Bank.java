package bank;

import interfaceArea.bankInterface;

import java.util.Scanner;


public class Bank implements bankInterface {

    Scanner input = new Scanner(System.in);

    protected  long bankAccountNumber;
    protected  int bankPin=0;
    protected  String bankName;
    protected  double bankMoney;
    @Override
    public void setBank(String bankName, long bankAccountNumber, int bankPin, double bankMoney) {

        this.bankName=bankName;
        this.bankAccountNumber=bankAccountNumber;
        this.bankPin=bankPin;
        this.bankMoney=bankMoney;
    }

    @Override
    public void getBank() {
        System.out.println("Bank Name :"+this.bankName);
        System.out.println("Bank Account Number :"+this.bankAccountNumber);
        System.out.println("Bank Pin :"+this.bankPin);
        System.out.println("Bank Money Amount :"+this.bankMoney);
    }

    @Override
    public void checkBank() {
        System.out.println("Bank Name :"+this.bankName);
        System.out.println("Bank Account Number :"+this.bankAccountNumber);
//        System.out.println("Bank Pin :"+this.bankPin);
        System.out.println("Bank Money Amount :"+this.bankMoney);
    }

    @Override
    public void loginBank(int bankPin) {
         if(this.bankPin !=0){
           while (bankPin!=this.bankPin){
               System.out.println(" wrong Pin: ");
           }
           bankPin=input.nextInt();
             System.out.println("Login Successfull:");
             checkBank();
         }
         else {
             System.out.println("you Have no account");
         }
    }
}
