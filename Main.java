import java.util.*;
/**
 * 
Jonathan Aguirre 14349
Samuel Diaz 14083
Laboratorio No. 6
03/09/2015
Algoritmos y estructuras de Datos
 */
public class Main {
	public static void main(String[] args) {
		Scanner scan;
        int op = 0;
        int sel= 0;
        scan = new Scanner (System.in); // scaner para leer los enteros
        System.out.println("Jonthan Aguirre \nSamuel Diaz\nHoja de Trabajo No.6\nElija la implementacion SET: "); // println de los encabezados del menu
        while (op==0){               
                System.out.println(" 1. HashSet; 2. TreeSet o 3. LinkedHashSet");
                System.out.print(" Ingrese el número: ");            
                try{sel=scan.nextInt();}    // lectura de caracter ingresado
                catch(Exception e){System.out.println();} 
                op = sel;  
                if (sel>3||sel<1){ // condición de error en el ingreso de un caracter
                    System.out.print("Ingrese una opccion valida");  
                }
            }
      System.out.println("__________________________________________________________________________________");
      boolean est = true; // estado del ciclo de ingreso de usuarios
      boolean est2; // segundo estado dentro del ciclo
      Hashtable c1 = new Hashtable(op); // Conjunto de java
      Hashtable c2 = new Hashtable(op); // conjunto de web
      Hashtable c3 = new Hashtable(op); // conjunto de moviles
      Hashtable o1 = new Hashtable(2); // Conjunto ordenado de java
      Hashtable o2 = new Hashtable(2); // conjunto ordenado de web
      Hashtable o3 = new Hashtable(2); // conjunto ordenado de moviles
      String cont = "";  
      String name = ""; // nombre del programador
      while(est == true){ // ciclo
          System.out.println("Ingrese el nombre: ");
          name = scan.next(); // lee el ingreso del nombre
          System.out.println("__________________________________Primera condición________________________________________________");
          System.out.println("Responda ingresando s y n, o utilize Si o No");
          System.out.println("¿El programador es un desarrollador de Java?"); 
          est2 = true;
          while(est2 == true){
           cont = scan.next(); // lectura de ingreso
           if((cont.toLowerCase().equals("si")) || (cont.toLowerCase().equals("s"))){ // condición de ingreso correcto con si
              c1.setterop(name);
              o1.setterop(name);
              est2 = false;
             } 
           else{
                if((cont.toLowerCase().equals("no")) || (cont.toLowerCase().equals("n"))){ // condicion correcta con no
                    est2 = false;
                }     
           else{ // ingreso incorrecto
                    System.out.println("Ingreso incorrecto; solo responda ingresando s y n, o utilize Si o No");
                }
           } 
          }
          System.out.println("______________________________________Segunda condición__________________________________________");
          System.out.println("¿El programador es un desarrollador web?");
          est2 = true; // segundo estado activo
          while(est2 == true){
           cont = scan.next();    
           if((cont.toLowerCase().equals("si")) || (cont.toLowerCase().equals("s"))){// condición de ingreso correcto con si
              c2.setterop(name);
              o2.setterop(name);
              est2 = false;    
             } 
           else{
        	   if((cont.toLowerCase().equals("no")) || (cont.toLowerCase().equals("n"))){ // condicion correcta con no
              est2 = false;
                }          
           else{ // ingreso incorrecto
                    System.out.println("Ingreso incorrecto; solo responda ingresando s y n, o utilize Si o No");
             }           
            }
          }      
          System.out.println("_________________________________________Tercera condición_________________________________________");
          System.out.println("¿El programador es un desarrollador de celulares?");
          est2 = true;    
          while(est2 == true){
           cont = scan.next();  
           if((cont.toLowerCase().equals("si")) || (cont.toLowerCase().equals("s"))){// condición de ingreso correcto con si   
              c3.setterop(name);
              o3.setterop(name);
              est2 = false;    
             }    
           else{
        	  if((cont.toLowerCase().equals("no")) || (cont.toLowerCase().equals("n"))){ // condicion correcta con no
                    est2 = false;
                }
           else{ // ingreso incorrecto
                  System.out.println("Ingreso incorrecto; solo responda ingresando s y n, o utilize Si o No");
           	  } 
            }
          }    
          System.out.println("__________________________________________________________________________________");
          System.out.println("¿Desea Ingresar otro Desarrollador?"); // condición de ingresar otro 
          est2=true;     
          while( est2 == true){
           cont = scan.next();    
           if((cont.toLowerCase().equals("si")) || (cont.toLowerCase().equals("s"))){// condición de ingreso correcto con si     
              est2= false;
             } 
           else{
        	   if((cont.toLowerCase().equals("no")) || (cont.toLowerCase().equals("n"))){ // condicion correcta con no
                    est2 = false;
                     est = false; // para salir del ciclo se cambia el estado
                }
           else{ // ingreso incorrecto
                   System.out.println("Ingreso incorrecto; solo responda ingresando s y n, o utilize Si o No");
            	  }
           }
          }
        }  
         System.out.println("__________________________________________________________________________________");
              Set co1=c1.getterc(); // Los co contienen los conjuntos alamacenados en los c
              Set co2=c2.getterc();
              Set co3=c3.getterc();
              Set oo1=o1.getterc(); // los oo contienen a los conjuntos ordenados dentro de o
              Set oo2=o2.getterc();
              Set oo3=o3.getterc();
              System.out.println("Lista de programadores de Java: "+ co1);
              System.out.println("Lista de programadores de Web: "+co2);
              System.out.println("Lista de programadores de Celulrares: "+co3);
              System.out.println("__________________________________________________________________________________");
              System.out.println("1.Los desarrolladores con experiencia en Java, web y celulares son: "+ c1.retain(co1,co2,co3)); // se utiliza la función retain entre los tres conjuntos
              System.out.println("__________________________________________________________________________________");
              System.out.println("2.Los desarrolladores con experiencia en Java pero que no tengan experiencia en web son: "+c1.inclusion(co1,co2)); // se utiliza la inclucion entre los conjuntos 1 y 2
              System.out.println("__________________________________________________________________________________");
              System.out.println("3.Los desarrolladores de Web o Celuares, sin experiencia en java son: "+c1.inclusion(c2.retain2(co2,co3), co1));// se utiliza la inclucion entre lo retenido en dos conjuntos(2 y 3) y otro
              System.out.println("__________________________________________________________________________________");
              System.out.println("4.Los desarroladores de Web y Celuares, sin experiencia en java son: "+c1.inclusion(c2.add(co2, co3),co1));//se utiliza la inclucion entre la suma del conjunto 2 y 3 y el conjunto 1
              System.out.println("__________________________________________________________________________________");
              if (c1.sub(co1, co3)==true){ // condición de subconjunto del 1 en el 3
                  System.out.println("5. Java es subconjunto del conjunto de desarrolladores Web.");
              }
             else{
                  System.out.println("5. Java no es subconjunto del conjunto de desarrolladores Web.");
              }
              System.out.println("__________________________________________________________________________________");
              System.out.println("6. El conjunto de mayor tamaño es: "+ c1.cm(co1, co2, co3)+ "Con nombre "+c1.gettercm()); // se muestra  el conjunto mayor y sus integrantes
              System.out.println("__________________________________________________________________________________");
              System.out.println("7. Lista de nombres en orden son "+o1.cm(oo1, oo2, oo3)+" del grupo: "+c1.gettercm()); // se despliegan los nombre del conjunto con mayor cantidad de integrantes
    }
}
