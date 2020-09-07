package main;


public class Card extends Plata{

	int cvc;
	String nr;
	String numeTitular;
	
	public Card(int balance, int pay,int cvc,String nr, String numeTitular) {
		super(balance, pay);
		this.cvc=cvc;
		this.nr=nr;
		this.numeTitular=numeTitular;
	}
		

}