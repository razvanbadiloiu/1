import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Problema2 {

	public static void main(String[] args) throws Exception {
	   
        Set<Comanda> comenzi=new LinkedHashSet<Comanda>();
		try ( Scanner scaner=new Scanner(new FileReader("C:\\Users\\Razvan\\eclipse-workspace\\Tema2\\src\\Untitled 2"))){	   	
			
			while(scaner.hasNextLine()) {   
			 String line=scaner.nextLine();
		     String[] arrayParameters=line.split(" ");
			 int ID=Integer.parseInt(arrayParameters[0]);
			 double pret=Double.parseDouble(arrayParameters[1]);
			 int cantitate=Integer.parseInt(arrayParameters[2]);
			 
			 Comanda comanda=new Comanda(ID,pret,cantitate);
			 comenzi.add(comanda); 
			 

		   }
		   
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Comenzile sunt: ");
		comenzi.forEach(System.out::println);
		System.out.println();
		
		Procesare procesare=new Procesare(comenzi);
		procesare.SumaTotala();
		procesare.ValMaxima();
		procesare.ValMinima();
		
		
	}

}