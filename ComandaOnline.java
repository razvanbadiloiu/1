package main;


public class ComandaOnline extends Comanda {

String adresa;


	public ComandaOnline(int id, int pret, int cantitate,String adresa) {
		super(id, pret, cantitate);		
		this.adresa=adresa;
		
	}

	@Override
	public void PlasareComanda() {
		System.out.println("Comanda cu id-ul "+this.id+" a fost plasata,avand costul total: "+ValoareComanda()+" lei.");
	}
	
	
	public String getAdresa() {
	    return adresa;
    }

    public void setAdresa(String adresa) {
	    this.adresa = adresa;
    }

}