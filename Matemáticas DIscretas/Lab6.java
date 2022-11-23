import java.util.Scanner;
import java.io.PrintWriter;
public class Lab6{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);  //Leer valores
        PrintWriter outputs = new PrintWriter (System.out); //Leer valores
        int casos = sc.nextInt();
        String input = "",  //Guardar formulas
        clause = "";   //Guardar clausulas
        int nextClause = 0; //Indicar donde inician las clausulas
        while(casos --> 0){
            input = sc.next();
            if(input.length()==3 || input.length()==4){ //Evalua los casos.Ej: (a), (~a)
                outputs.append("YES\n");
                continue;
            }
            for(int i = 0; i<input.length();i++) 
            {   
                if(input.charAt(i)== ')' && i+1 == input.length()){ //Evalua los casos.Ej: (a&b&c), o recibe las clausulas que estan al final
                    clause = input.substring(nextClause, i+1);
                    if(validateClause(clause)){
                        outputs.append("YES\n");
                        nextClause = 0;
                        break;
                    }
                    else{
                        outputs.append("NO\n");
                        nextClause = 0;
                        break;
                    }
                }
                else if(input.charAt(i)== ')' && input.charAt(i+1) == '|'  ){//Evalua las clausulas del inicio y mitad
                    clause = input.substring(nextClause, i+1);
                    if(validateClause(clause)){
                        outputs.append("YES\n");
                        nextClause = 0;
                        break;
                    }
                    nextClause = i + 2;
                }
            }
        }
        sc.close();
        outputs.flush();
        
    }
    public static boolean validateClause(String input){
        
        int repetIdx;
        for(int c = 0; c<input.length(); c++){
            if(input.charAt(c)>='a' && input.charAt(c)<='z'){
                repetIdx = c;
                
                while(input.indexOf(input.charAt(repetIdx), repetIdx+1) != -1){
                    repetIdx = input.indexOf(input.charAt(repetIdx), repetIdx+1);
                    if(input.charAt(repetIdx-1)=='~' && input.charAt(c-1)!='~' || input.charAt(repetIdx-1)!='~' && input.charAt(c-1)=='~'){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
