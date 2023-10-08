package interfaceArea;

public interface bankInterface {
    void setBank(String bankName, long bankAccountNumber, int bankPin, double bankMoney);
    void getBank();
    void checkBank();
    void loginBank(int bankPin);


}
