
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble listaejemplo = new ListaDoble();
        listaejemplo.add(1);
        listaejemplo.add(2);
        listaejemplo.add(3);
        listaejemplo.add(4);
        System.out.print("Contiene al 2: "+listaejemplo.contains(2)+"\n");
        System.out.print("Está vacia: "+listaejemplo.isEmpty()+"\n");
        listaejemplo.clear();
        System.out.print("Después del clear(), está vacia: "+listaejemplo.isEmpty()+"\n");
        listaejemplo.add(1);
        listaejemplo.add(2);
        listaejemplo.add(3);
        listaejemplo.add(4);
        listaejemplo.add(5);
        listaejemplo.insertHead(0);
        listaejemplo.insertTail(10);
        System.out.print("Tamaño de la lista: "+listaejemplo.getSize()+"\n");
        System.out.print("Objetos de la lista: "+Arrays.toString(listaejemplo.toArray())+"\n"); 
        ListNode prueba = listaejemplo.search(2);
        ListNode prueba2 = listaejemplo.search(4);
        ListNode prueba3 = listaejemplo.search(5);
        ListaDoble sublista = listaejemplo.subList(prueba,prueba2);
        System.out.print("Sublista desde 2 hasta 4: "+Arrays.toString(sublista.toArray())+"\n"); 
        listaejemplo.remove(3);
        listaejemplo.remove(prueba3);
        System.out.print("Lista sin el 3 y el 5: "+Arrays.toString(listaejemplo.toArray())+"\n"); 
        listaejemplo.insert(prueba, 23);
        listaejemplo.insert(23, 32);
        System.out.print("Lista usando los dos insert(): "+Arrays.toString(listaejemplo.toArray())+"\n"); 
        ListNode pruebafinal = listaejemplo.search(23);
        ListNode head1 = listaejemplo.search(0);
        ListNode tail1 = listaejemplo.search(10);
        System.out.print("Anterior a 23: "+listaejemplo.getBeforeTo(pruebafinal)+"\n");
        System.out.print("Siguiente a 23: "+listaejemplo.getNextTo(pruebafinal)+"\n");
        System.out.print("Cabeza: "+listaejemplo.getHead()+"\n");
        System.out.print("Cola: "+listaejemplo.getTail()+"\n");
        System.out.print("String "+listaejemplo.toString()+"\n");
        System.out.print("Anterior a head: "+listaejemplo.getBeforeTo(head1)+"\n");
        System.out.print("Siguiente a tail: "+listaejemplo.getNextTo(tail1)+"\n");
        
    }
    
}
