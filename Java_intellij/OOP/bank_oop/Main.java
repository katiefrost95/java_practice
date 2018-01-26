public class Main {

  public static void main(String[] args) {
    // called constructor within constructor in Bank.java so that's why code below is commented out
    Bank one = new Bank(); //("1234", 0.00, "edgar", "edgar@edgar.com", "0239273929");

    System.out.println(one.getBalance());
    System.out.println(one.getCustomerName());

//Need getters and setters written for these in bank.java file
// Set these in constructor so now not needed
    // one.setaccountNumber("1234");
    // one.setBalance(0.00);
    // one.setCustomerName("edgar");
    // one.setEmail("edgar@edgar.com");
    // one.setPhoneNumber("0239273929");


    one.withdrawFunds(100.00);

    one.deposit(50.0);
    one.withdrawFunds(100.00);

    one.deposit(51.0);
    one.withdrawFunds(100.00);
  }
}
