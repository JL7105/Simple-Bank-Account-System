public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
  

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String customerEmail) {
        if (!customerEmail.contains("@gmail.com")) {
            System.out.println("Please use a valid email address.");
        } else {
            this.customerEmail = customerEmail;
        }

    }

    public void customerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("You have deposited: $" + depositAmount + " into your account.\n Your new total balance: $" + balance);
    }

    public void widthdrawFunds(double widthdrawlAmount) {

        if (balance - widthdrawlAmount < 0) {
            System.out.println("Your account does not have enough money to widthdraw that fund amount. \nYour current balance is: $" + balance);
        } else {
            balance -= widthdrawlAmount;
            System.out.println("You widthdrew: $" + widthdrawlAmount + " from your account.\n Your new total balance: $" + balance);
        }
    }

}