import javax.swing.*;

public class KILAT_ACT4 {
   public static void main (String [] args) {
   
   double currentbalance= 1000;
   String money = JOptionPane.showInputDialog("Enter amount to withdraw: ");
   double withdrawamount = Double.parseDouble(money);
   double withdrawal = withdraw(withdrawamount, currentbalance);
  }
  
  public static double withdraw (double withdrawamount, double currentbalance) {
   
   if(withdrawamount > currentbalance) {
   JOptionPane.showMessageDialog(null, "Insufficient balance. Your current balance is $ " + currentbalance);
   }
   else {
   currentbalance -= withdrawamount;
   JOptionPane.showMessageDialog(null, "Withdrawal successful. Your new balance is  $ " + currentbalance);
   }
   return withdrawamount;
}
}
   