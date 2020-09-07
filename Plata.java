package main;

public class Plata {

	int balance;
	int pay;
	
	public Plata(int sold,int pay) {
		this.balance=sold;
		this.pay=pay;
	}
	
	public void FinalizarePlata()
	{
		int checkSold=this.balance- this.pay;
		
		if(checkSold<= 0) {
			System.out.println("Sold insuficient. Increcati alta modalitate de plata.");
		}
		else {
			System.out.println("Plata a fost finalizata cu succes.Va multumim.");
		}
			
	}
	
	public void loadBalance(int loadBalance) {
    	this.balance += loadBalance;
    }
	
	
}