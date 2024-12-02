let currentbalance = 5000.00;

function updatebalancedisplay() {
    document.getElementById('Balance').textContent = currentbalance.toFixed(2);
}
function withdraw() {
   let withdrawalamount = parseFloat(prompt("Enter amount to withdraw:")) ;
   if( isNaN (withdrawalamount) || withdrawalamount <=0) {
    window.alert("Invalid amount. Please enter a valid amount.");
   }
   else if (withdrawalamount > currentbalance) {
    window.alert(`Insufficient balance. Your current balance is ₱${currentbalance}.`);
   }
   else {
    currentbalance -= withdrawalamount;
    window.alert(`Withdrawal successful. Your new balance is ₱${currentbalance}.`);
   }
   updatebalancedisplay();
}
function deposit() {
    let depositamount = parseFloat(prompt("Enter amount to deposit."));
    if(isNaN (depositamount) || depositamount <= 0){
        window.alert("Invalid amount. Please enter a valid amount.");
    }
    else {
        currentbalance += depositamount;
        window.alert(`Deposit successful. Your new balance is ₱${currentbalance}.`);
    }
    updatebalancedisplay();
}
function checkbalance(){
    document.getElementById('currentbalancedisplay').style.display = 'block';
    updatebalancedisplay();
    window.alert(`Your current balance is ₱${currentbalance}`);
}
function exit() {
    window.alert("Thank you for using this ATM. See you again!!");
    document.getElementById('currentbalancedisplay').style.display = 'none';
}
