import java.util.Scanner;
import java.io.PrintWriter;

public class Lab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter outputs = new PrintWriter(System.out);
        int casos = sc.nextInt();
        String input;

        
        while (casos-- > 0) {
            input = sc.next();
            if (isPalindrome(input)) {
                outputs.append(periodString(input) + "\n");
            } else{
                outputs.append("-1 \n");
            }
            
        }
        sc.close();
        outputs.flush();
    }

    static int periodString(String input) {
        int strLength = input.length();
        String subStr,
        temp;
        for (int i = 1; i < strLength; i++) {
            subStr = input.substring(0, i);
            temp = input.replaceAll(subStr, "");
            if (temp.length() == 0){
                return i;
            }
        }
        
        return 1;
    }

    public static boolean isPalindrome(String input) {
        int inc = 0;
        int des = input.length() - 1;
        boolean bError = false;
        while ((inc < des) && (!bError)) {
            if (input.charAt(inc) == input.charAt(des)) {
                inc++;
                des--;
            } else {
                bError = true;
            }
        }
        return !bError;
    }
}