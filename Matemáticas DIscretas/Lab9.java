import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter outputs = new PrintWriter(System.out);

        Hashtable<Character, Integer> info = new Hashtable<Character, Integer>();
        ArrayList<Character> vertices = new ArrayList<Character>();

        String acum = "",input;
        boolean pc, secnd ;
        char[] arr;
        char vertx;
        int cont = 0,casos = sc.nextInt(), resul;

        
        while (casos-- > 0) {
            input = sc.next();
            input = (input.charAt(input.length()-1)==':') ? input + " ": input;
            arr = input.toCharArray();
            pc = false;
            secnd = false;
            for (int i = 0; i < arr.length; i++) {
                if (!secnd) {
                    if (arr[i] == ':') {
                        cont = i - 1;
                        info.put(arr[i - 1], 0); //Crear llaves
                        vertices.add(arr[i - 1]);
                        pc = true;
                    } else if (arr[i] == ';' || i + 1 == arr.length) {
                        pc = false;
                        if (i + 1 == arr.length) {
                            acum += arr[i];
                            i = 0;
                            secnd = true;
                        }
                        info.replace(arr[cont], acum.length()); //Asigna valor de aristas de salida
                        acum = "";
                    } else if (pc) {
                        acum += arr[i];
                    }
                } else {
                    for (int x = 0; x < vertices.size(); x++) {
                        vertx = vertices.get(x);
                        if (input.indexOf(vertx + "") != -1) {
                            info.replace(vertx, info.get(vertx) + 1);
                            input = input.replaceFirst(vertx + "", "");
                            x--;
                        }
                    }
                }
            }
            for (int x = 0; x < vertices.size(); x++) {
                vertx = vertices.get(x);
                if(input.charAt(input.length()-1)==' ' && x+1==vertices.size()){
                    resul = info.get(vertx) - 2;
                }
                else if(info.get(vertx) - 1 != -1 ){
                    resul = info.get(vertx) - 1;
                }
                else{
                    resul = info.get(vertx);
                }
                outputs.append(vertx + "=" + resul  + ((x+1!=vertices.size())?", ":"\n"));//((info.get(vertx) - 1 != -1 )?(info.get(vertx) - 1):info.get(vertx))
                
            }
            
            info.clear();
            vertices.clear();
        }
        sc.close(); 
        outputs.flush();
        
    }

}