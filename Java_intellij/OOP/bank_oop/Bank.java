public class Bank {

  private String accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phoneNumber;

  //Constructor: allows you to prodive initial values for class fields when creating an object.
  // Don't call setters within constructors or other methods 
  public Bank() {
    //can call a constructor within a constructor using this, e.g:
    this("1234", 0.00, "defaultName", "defaultEmail", "defaultNumber"); //calling constructor below. Has to be very first line executed.
    System.out.println("Empty Constructor called");
  }

  public Bank(String accountNumber, double balance, String customerName, String email, String phoneNumber){
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  // Challenge to create methods that enable money to be deposited and withdrawn from the account.

  public void deposit(double depositAmount) {
    this.balance += depositAmount;
    System.out.println("Deposit of " + depositAmount + " has been made. Your new balance is " + this.balance);
  }

  public void withdrawFunds(double withdrawalAmount){
    if (this.balance - withdrawalAmount <= 0) {
      System.out.println("only " + this.balance + " available. Get some money and try again later");
    } else {
      balance -= withdrawalAmount;
      System.out.println("You have taken out " + withdrawalAmount + ". Your new balance is " + this.balance);
    }
  }

  public String getCustomerName(){
    return this.customerName;
  }

  public double getBalance(){
    return this.balance;
}


}
