import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Procesare {
    
	Set<Comanda> comenzi;
	
    public Procesare(Set<Comanda>comenzi) {
    	this.comenzi=comenzi;
    }
    
    public void SumaTotala() {
    	
    	double suma=0;  	
        for(Comanda comanda:comenzi)
        	suma+=comanda.getPret()*comanda.getCantitate();
        
        System.out.println("1.Suma totala este: "+suma);
        System.out.println();
    }
    
    public void ValMaxima() {
    	
    	 Comanda comanda=comenzi.stream()
                                .max(Comparator.comparing(Comanda::Valoare))
                                .orElseThrow(NoSuchElementException::new);
    	 
    	 System.out.println("2.ID ul maxim este : "+comanda.getID());
         System.out.println();
    }
    
    public void ValMinima() {
    	
         Comanda comanda=comenzi.stream()
    	                        .min(Comparator.comparing(Comanda::getPret))
                                .orElseThrow(NoSuchElementException::new);
         
         System.out.println("3.ID ul minim este : "+comanda.getID());
         System.out.println();
    }
}