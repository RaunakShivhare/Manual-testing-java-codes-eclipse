
package com.inheritance;

class BankAccountt {
    String accNo; double balance;
    BankAccountt(String a,double b){ accNo=a; balance=b; }
    void show(){ System.out.println("Account "+accNo+" Balance:"+balance); }
}
class SavingsAccount extends BankAccountt {
    SavingsAccount(String a,double b){ super(a,b); }
    void addInterest(){ balance+=balance*0.05; }
}
        public class BankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("A123",1000);
        sa.addInterest(); sa.show();
    }
}

