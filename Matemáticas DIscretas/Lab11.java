import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Lab11 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] pos = new int[4];
        double distTot;


        PrintWriter outputs = new PrintWriter(System.out);

        int casos = sc.nextInt()+1, cont = 0, x1, y1, x2, y2;
        boolean frLine = true, tst;

        String input, outp ="", minTime;

        while(casos -->-1){
            input = sc.nextLine();
            distTot = 0;
            while (input.length()!=0){
                inpInt(input, pos);

                distTot += distancia(pos[0],pos[1],pos[2],pos[3]);

                input = sc.nextLine();

                outp += input + "\n";
            }
            minTime = tiempo(distTot);
            minTime = ((minTime.equals("00:00") ) ? "": minTime + "\n");

            outputs.append(minTime);
            outp = "";
            frLine = true;

        }
        outputs.flush();
        sc.close();
    }
    public static void inpInt(String input, int[] pos){
        int cont = 0, lastInd = input.indexOf(' ');
        String temp = "";
        while(lastInd != -1){
            temp = input.substring(0, lastInd);
            pos[cont ++] = Integer.parseInt(temp);
            input = input.substring(lastInd+1, input.length());
            lastInd = input.indexOf(' ');
        }
        pos[cont ++] = Integer.parseInt(input);

    }
    public static double distancia(double x1,double y1,double x2,double y2){
        double distx = Math.pow(x2-x1,2) ,

                disty = Math.pow(y2-y1,2), //Math.pow(y2-y1,2)
                distT= Math.sqrt((distx + disty));
        return distT;
    }

    public static String tiempo (double dist){
        double distF = dist / 1000 ,
                horasT = distF * 2 /20;
        long minutosT = Math.round(horasT*60);
        String minutos = String.format("%02d",minutosT%60) ,
                horas = String.format("%02d",minutosT/60) ,
                tiempo = horas + ":" + minutos;
        return tiempo;
    }
}
