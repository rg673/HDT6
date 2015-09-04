/**
 * 
Jonathan Aguirre 14349
Samuel Diaz 14083

 */
/**
 * 
 *
 */
import java.util.*;
public class Hashtable {
	public class Factory { // classe factory
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
	        return null;       // condici�n de error 
	    }
	}
   Factory operador = new Factory();  // operador de tipo factory
   private Set<String> c; // variable para almacenar un conjunto
   private Set<String> sc; // variable para almacenar un conjunto
   private String cm; // variable para almacenar el conjunto mayor
   
   public Hashtable(int op){// constructor
        c=operador.getterStack(op);  // conjunto base
        sc=operador.getterStack(op); // segundo conjunto
   }
   public void setterop(String elemento){ // setter del cojunto
       c.add(elemento);       
   }
   public Set<String> getterc(){ // setter del conjunto 
       return c;
   }
   
   public Set<String> retain(Set<String> c1,Set<String> c2,Set<String> c3){ // intersecci�n de los 3 subconjuntos
       sc.clear();
       sc.addAll(c1);
       sc.retainAll(c2);
       sc.retainAll(c3);
       return sc;
   }
      
   public Set<String> inclusion(Set<String> c1,Set<String> c2){ // alamacena en un subconjunto los elementos iguales de dos conjuntos
       sc.clear();
       sc.addAll(c1);
       sc.removeAll(c2);
       return sc;
   }
   
   public Set<String> retain2(Set<String> c1,Set<String> c2){// interseccion de dos conjuntos
       sc.clear();
       sc.addAll(c1);
       sc.retainAll(c2);
       return sc;
   }
   public Set<String> add(Set<String> c1,Set<String> c2){// suma de dos conjuntos
       sc.clear();
       sc.addAll(c1);
       return sc;
   }
   public boolean sub(Set<String> c1,Set<String> c2){ // condici�n de subconunto de otro conjunto
       sc.clear();
       sc.addAll(c1);
       sc.retainAll(c2);
       if (sc.size()==c1.size()){
           return true;
       }
       else{
           return false;
       }
   }
   public Set<String> cm(Set<String> c1,Set<String> c2,Set<String> c3){// devuleve el nombre conjunto con mayor tama�o
       sc.clear();
       if (c1.size()>=c2.size()){
           sc.addAll(c1);
           cm="desarrolladores de Java";
       }
       else{
           sc.addAll(c2);
           cm="desarrolladores Web";
       }
       if (sc.size()>=c3.size()){
           return sc;
       }
       else{
          cm="desarrolladores de Celulares";
          return c3; 
       }

   }
   public String gettercm() { // getter del conjunto m�s grande
        return cm;
    }
   public String getterc(Set<String> c1){  
       String s= c1.toString();
       s=s.replace("{", "");
       s=s.replace("}", " ");
       s=s.replace(";", "\n");
       return s;
       
   }
   
}
