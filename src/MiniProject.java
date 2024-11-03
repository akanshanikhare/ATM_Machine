// ATM Machine
import java.util.Scanner;

class ATM{

    float Balance;
    int PIN = 108;

    public void checkPin() {
        System.out.println("Enter Your Pin: ");
        Scanner sc = new Scanner(System.in);

        int EnteredPin = sc.nextInt();

        if (EnteredPin == PIN) {
            menu();
        }

        else {
            System.out.println("Enter a valid pin: ");
            menu();
        }
    }

    public void menu() {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance. ");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Deposit Money ");
        System.out.println("4. EXIT ");


        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            CheckBalance();
        }

        else if (opt == 2) {
            withdrawMoney();
        }

        else if (opt == 3) {
            depositMoney();
        }

        else if (opt == 4) {
            System.out.println("Thank you visit again!!");
            return;
        }

        else {
            System.out.println("Enter a valid choice: ");
        }
    }

    public void CheckBalance(){
        System.out.println("Balance: " +Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);

        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        }

        else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawal Successfully");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter The Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposit Successfully");
        menu();

    }
}

public class MiniProject {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();

    }
}