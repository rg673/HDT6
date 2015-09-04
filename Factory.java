import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
/**
 * 
Jonathan Aguirre 14349
Samuel Diaz 14083
Laboratorio No. 6
03/09/2015
Algoritmos y estructuras de Datos
 */

public class Factory {
	 public Set<String> getterStack (int op){
	        
	        if (op==1){ // opcion 1 uso de Hashset
	            return new HashSet<String>();
	        }
	        
	        if (op==2){ // opcion 2 uso de Arboles
	            return new TreeSet<String>();
	        }
	        if (op==3){ // opcion 3 uso de Hashset ensda
	            return new LinkedHashSet<String>();
	        }        
	        return null;       // condición de error 
	    }
	 public Set<String> getterOrden(){
			return new TreeSet<String>(); // factory para utilizar un Treeset que ordene la lista
	 }
	}

