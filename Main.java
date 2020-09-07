package main;

public class Main {

	public static void main(String[] args) {
		
		
		Comanda comanda1=new ComandaMagazin (1,2,3,"Topoloveni");
		comanda1.PlasareComanda();
		System.out.println();
		Plata pay1=new Card(34,12,342,"4564654654654654", "Razvan");
		pay1.FinalizarePlata();
		
	}
	
}