class bankingaccount {

   private double balance;
  private int pin;

  public bankingaccount(int pin) {
     this.pin = pin;
    this.balance = 0.0;
        }

    public boolean checkPin(int inputPin) {
    return this.pin == inputPin;
        }

 public void deposit(double amount) {
   if (amount > 0) {
    balance += amount;
         } else {
     System.out.println("Amount can NOT be negative");
          }
        }

 public void withdraw(double amount) {
     if (amount > balance) {
                System.out.println("Insufficient funds");
    } else if (amount < 0) {
                System.out.println("Amount can NOT be negative");
     } else {
         balance -= amount;
     }
        }

 public double getBalance() {
            return balance;
        }
}

