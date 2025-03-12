import javax.swing.JOptionPane;

public class KILAT_ACT4 {
    public static void main(String[] args) {
 
        double balance = 1000;
        checkBalance(balance);
        
        String input = JOptionPane.showInputDialog("Enter amount to withdraw: ");
        double withdrawAmount = Double.parseDouble(input);
        double newBalance = withdraw(balance, withdrawAmount);

        if (newBalance != balance) { 
            balance = newBalance;
        } else {
            withdrawAmount = 0;
        }
        
        JOptionPane.showMessageDialog(null, "Account Info:\n" +
                                      "Last Withdrawn Amount: $" + withdrawAmount + "\n" +
                                      "Remaining Balance: $" + balance);
            
        
    }

    public static void checkBalance(double balance) {
        JOptionPane.showMessageDialog(null, "Your current balance is: $" + balance);
    }

    public static double withdraw(double balance, double withdrawAmount) {
        if (withdrawAmount > balance) {
            JOptionPane.showMessageDialog(null, "Insufficient balance. Your balance is $" + balance);
            return balance;
        } else {
            balance -= withdrawAmount;
            JOptionPane.showMessageDialog(null, "Withdrawal successful! You withdrew $" + withdrawAmount);
            return balance;
        }
    }
}
