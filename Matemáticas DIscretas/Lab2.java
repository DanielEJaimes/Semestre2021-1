import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class Lab2
{
    

    // en main se definió la entrada de los números con el scanner, y se definió la salida con la librería printwriter
    // el entero m hace referencia al mismo que la teoría, es decir ese define la cantidad de casos a ser analizados
    // los enteros n y k hacen referencia a la cantidad de números que se van a ingresar y a el numero a evaluar respectivamente
    // se implementa el while para asegurar la lectura de todos los m casos
    public static void main(String[] args) 
    { 
        Scanner fReader = new Scanner(System.in);
        PrintWriter outputs = new PrintWriter(System.out);

        int m = fReader.nextInt();

        int n,k;

        List<Integer> list = new ArrayList<>();

        while(m-- > 0)
        {
            n = fReader.nextInt();
            k = fReader.nextInt();
            
            for(int x = 0; x< n; x++)
            {
                list.add(fReader.nextInt()); // Se agregan los números de la secuencia n
            }

            boolean esDivisible = Divisible(list, k);

            if(esDivisible)
            {
                outputs.append("Divisible\n");
            }
            else
            {
                outputs.append("Not divisible\n");
            }
            list.clear(); // Se vacía la lista para tenerla preparada para la siguiente iteración 
        }



        outputs.flush(); // Se usa el metodo flush para imprimir los resultados
        fReader.close(); // Se cierra el Scanner para indicar cuando dejar de pedir datos
    }     


    static int total(List<Integer> list)
    {
        int acum = 0;
        for (Integer i : list) 
        {
            acum += i;
        }
        
        return acum;
    }
 

    static boolean Divisible(List<Integer> list, int divisor)
    {
        boolean divisible = false;
        List<Integer> listNegative = new ArrayList<>(list); 

        for (Integer integer : listNegative) 
        {
            if(integer != listNegative.get(0))
            {
                int n = integer * -1;
                listNegative.set(listNegative.indexOf(integer), n);
            }
        }

        List<Integer> listBP = new ArrayList<>(list);
        List<Integer> listNegBP = new ArrayList<>(listNegative);

        int totalPos = total(list);
        int totalNeg = total(listNegative);

        for (int i=0; i<list.size(); i++)
        {
            if(i==0 && (totalPos%divisor==0 || totalNeg%divisor==0))
            {
                divisible = true;
                break;
            }
            else
            {
                int n = list.get(i);
                int n1 = listNegative.get(i);

                n = n * -1;
                n1 = n1 * -1;

                list.set(i, n);
                listNegative.set(i, n1);

                totalPos = total(list);
                totalNeg = total(listNegative);

                Collections.copy(list, listBP);
                Collections.copy(listNegative, listNegBP);

                if(totalPos%divisor==0 || totalNeg%divisor==0)
                {
                    divisible = true;
                    break;
                }
            }
        }

        return divisible;
    }
}

