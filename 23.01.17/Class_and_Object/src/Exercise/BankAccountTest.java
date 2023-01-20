
package Exercise;

import java.util.*;

class BankAccount{
	int balance;
	
	void draw(int amount){
		balance += amount;
	}
	void deposit(int amount){
		balance -= amount;
	}
	int getBalance(){
		return balance;
	}
	void print() {
		System.out.println("현재 잔액은 " + balance + "입니다");
	}
}
public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.balance = 100;
		b.getBalance();
		b.print();
	}
}
