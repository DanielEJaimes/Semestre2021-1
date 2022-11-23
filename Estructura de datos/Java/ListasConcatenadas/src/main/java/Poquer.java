
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class Poquer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List jugador1 = new List();
        List jugador2 = new List();
        int fin = 0;
        while (fin == 0){
            String jugada = sc.nextLine();
            jugada = jugada.replaceAll(" ","");
            for (int i = 0 ; i<jugada.length() ; i+=2){
                if (i<10){
                    jugador1.add(jugada.charAt(i));
                }else{
                    jugador2.add(jugada.charAt(i));
                }
            }
            if (par(jugador1)){
                System.out.print("Hay par");
            }else{
                System.out.print("Error :(");
            }
            fin = 1;
        }
    }
    public boolean escaleracolor(List mano){
        return true;
    }
    public boolean poquer(List mano){
        return true;
    }
    public boolean fullhouse(List mano){
        return true;
    }
    public boolean flush(List mano){
        return true;
    }
    public boolean escalera(List mano){
        return true;
    }
    public boolean trio(List mano){
        return true;
    }
    public boolean doblepar(List mano){
        return true;
    }
    public static boolean par(List mano){
        ListNode carta=mano.head;
        ListNode par = mano.search(carta);
        if (mano.contains(par)){
            return true;
        }
        return false;
    }
}

/*
2C 3D 5E 9T KD 2T 3C 4E 8T AC 
2C 4E 4T 2D 4C 2E 8E AE QE 3E
2C 3D 5E 9T KD 2T 3C 4E 8T KC 
2C 3D 5E 9T KD 2D 3C 5T 9E KC
*/