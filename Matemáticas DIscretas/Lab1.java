import java.math.BigInteger;
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;
import java.io.BufferedReader; 

public class Lab1
{
    public static void main(String[] args) throws IOException 
    { 
        FastReader Fr = new FastReader();

        while(true)
        {
            int num = Fr.nextInt();
            if(num == -1)
                break;
            else
            {
                System.out.println("Numero ingresado: "+num + "|| Resultado: "+ calculate(num));
            }
        }
    }            


    
    static BigInteger calculate(int num)
    {
        
    BigInteger nFibo = new BigInteger("0");
    long nPenta;
    BigInteger totalFibo = new BigInteger("0");
    BigInteger totalPenta = new BigInteger("0");
    BigInteger a = new BigInteger("0");
    BigInteger b = new BigInteger("1");


        
    for(int i=0;i<num-1;i++){
        nFibo = a.add(b);      
        b = a;
        a = nFibo;
        totalFibo = totalFibo.add(nFibo);
    }
    
    for(int i=0;i<num+1;i++){
        nPenta = (3*i*i - i)/2;

        totalPenta = totalPenta.add(BigInteger.valueOf(nPenta));
        }

        return totalFibo.multiply(totalPenta);
    }

    
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 

        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 

        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 

        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 

        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 

        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 

        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
}