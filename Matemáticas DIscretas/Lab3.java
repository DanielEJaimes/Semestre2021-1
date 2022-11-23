import java.util.Scanner;
import java.io.PrintWriter;
public class Lab3{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter outputs = new PrintWriter(System.out);
        int casos = sc.nextInt();
        for(int i=1; i<casos+1;i++){
            long decimal = sc.nextLong();
            outputs.append("Case #"+i+": "+decimalToNegBase(decimal)+ "\n");
        }
        outputs.flush();
        sc.close();
    }
    public static String decimalToNegBase(long decimal) 
    { 
    // Se crea un string en el cuál luego se agregarán los residuos y el cociente final del resultado
    String binMinus2 = "";
    if(decimal==0)
    {
        binMinus2 = "0";
    }
    // Se hace una excepción para el número 0
    else{
        while (decimal != 0) // Se define un while que rectificará que el número puede seguir dividiendose
            { 
                long residuo = decimal % -2; // Se calcula el residuo
                decimal /= -2; // El decimal pasa a ser el cociente de la operación
                if (residuo < 0) 
                { 
                    residuo += Math.abs(-2); 
                    decimal++; // Esta suma se hace solo si el residuo dió negativo siguiendo la fórmula explicada
                } 
                binMinus2 = residuo + binMinus2; 
            } 
    } 
    return binMinus2; 
    }   
}
