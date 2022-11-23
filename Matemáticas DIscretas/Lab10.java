import java.io.PrintWriter;
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter outputs = new PrintWriter(System.out);
        int casos = sc.nextInt();
        String input, red, blue, outP;
        char[] arr;
        boolean pComa;
        int lastVert = 0;

        while (casos-- > 0) {
            input = sc.next();
            arr = input.toCharArray();
            red = "";
            blue = "";
            outP = "";
            pComa = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ':') {
                    lastVert = i-1;
                    pComa = true;
                    if (blue.contains(arr[lastVert] + "") || (red.contains(arr[lastVert] + "")) ) {
                        continue;
                    } 
                    blue += arr[i-1];
                } 
                else if (arr[i] == ';' || i + 1 == arr.length) {
                    pComa = false;
                } 
                else if (pComa) {
                    if ((blue.contains(arr[lastVert] + "")) && !(red.contains(arr[i] + ""))) {
                        
                        red += arr[i];
                    } 
                    else if ((red.contains(arr[lastVert] + "")) && !(blue.contains(arr[i] + ""))) {
                        blue += arr[i];
                    }
                }
                if ((red.contains(arr[i] + "")) && (blue.contains(arr[i] + ""))) {
                    outP = "0\n";
                    break;
                }
            }
            if (outP == "") {
                outP = "1\n";
            }
            outputs.append(outP);
        }
        outputs.flush();
        sc.close();
    }
}
