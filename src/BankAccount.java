public class BankAccount {
    public static void main(String[] args) {
        //Bob's starting balance
        float balance = 2175.37f;
        // withdrew $302.50
        balance -= 302.50;
        //deposited $50.03
        balance += 50.03;
        //withdrew half, then deposited $20
        balance /= 2;
        balance += 20;
        //withdrew $1
        balance -= 1;
        //deposited paycheck, which doubled current balance
        balance *= 2;
        //deposited $1
        balance += 1;
        //output Bob's new balance
        System.out.println("Bob's new balance after the transactions is $" + String.format("%.2f", balance));
    }
}
