


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.io.PrintWriter;
/**
 *
 * @author Daniel
 */
public class MainDobleCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDobleCircular Lista = new ListaDobleCircular();
        Scanner sc = new Scanner (System.in);  //Leer valores
        PrintWriter outputs = new PrintWriter (System.out); //Leer valores  
        System.out.print("Ingrese el tamaño de la matriz N*M: \n");
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.print("Ingrese la matriz N*M: \n");
        while (M > 0){
            String fila = sc.nextLine();
            Lista.add(fila);
            M--;
        }
        
        System.out.print(Lista.toString());
        System.out.print(Lista.getSize());
        
        
        sc.close();
        outputs.flush();
    }
}
/*
         0 1 2 3 4 5 6 7 8 9 10
          
0        1 1 1 1 1 1 1 1 1 1 1
1        1 0 0 0 0 0 1 0 0 0 1
2        1 0 1 0 0 0 1 0 1 0 1
3        e 0 1 0 0 0 0 0 1 0 1
4        1 0 1 1 1 1 1 0 1 0 1
5        1 0 1 0 1 0 0 0 1 0 1
6        1 0 0 0 1 0 1 0 0 0 1
7        1 1 1 1 1 0 1 0 0 0 1
8        1 0 1 m 1 0 1 0 0 0 1
9        1 0 0 0 0 0 1 0 0 0 1
10       1 1 1 1 1 1 1 1 1 1 1

Posible rta = [8,3] [9,3] [9,4] [9,5] [8,5] [7,5] [6,5] [5,5] [5,6] [5,7] [4,7] [3,7] [3,6] [3,5] [3,4] [3,3] [2,3] [1,3] [1,2] [1,1] [2,1] [3,1] [3,0]
*/