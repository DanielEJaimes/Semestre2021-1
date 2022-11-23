import java.util.Scanner;
import java.io.PrintWriter;

public class Lab4 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        PrintWriter outputs = new PrintWriter (System.out);
        int casos = sc.nextInt();
        while(casos --> 0)
        {
            long x1 = sc.nextInt();
            long y1 = sc.nextInt();
            long x2 = sc.nextInt();
            long y2 = sc.nextInt();
            
            long resultado = (x2 - x1) * (y2 - y1) + 1; 

            outputs.append(resultado + "\n");
        }
        outputs.flush();
        sc.close();
    }
}
