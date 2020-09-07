package main;

public class ComandaTelefonica extends Comanda {
	
	String nrTelefon;
	String adresa;
	
	
	public ComandaTelefonica(int id, int pret, int cantitate,String nrTelefon, String adresa) {
		super(id, pret, cantitate);
        this.nrTelefon=nrTelefon;
        this.adresa=adresa;
        
	}

	
	 @Override
	 public void PlasareComanda() {
	   System.out.println("Comanda cu id-ul "+this.id+" a fost plasata pentru adresa: "+this.adresa+", avand costul total: "+ValoareComanda()+" lei. Numarul de telefon de contact pentru curier este "+this.nrTelefon+". Va multumim.");
	}

	public String getAdresa() {
	    return adresa;
    }

    public void setAdresa(String adresa) {
	    this.adresa = adresa;
    }

    public String getnrTelefon() {
    	return nrTelefon;
    }
    
    public void setnrTelefon(String nrTelefon) {
    	this.nrTelefon = nrTelefon;
    }
    
    
	public int ValoareComanda() {
		 return this.pret * this.cantitate;
	}

	
	
}
