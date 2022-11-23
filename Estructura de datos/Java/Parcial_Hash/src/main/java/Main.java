
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //PrintWriter outputs = new PrintWriter(System.out);

        Hashtable<String, Integer> vertex = new Hashtable<>();
        ArrayList<Edges>[] listAdj = new ArrayList[2000];

        int totalN, casesN, index = 0;
        String fLang, sLang, word;
        boolean k = false;
        while (!k) {
            totalN = sc.nextInt();

            if (totalN == 0) {
                k = true;
                continue;
            }
            casesN = totalN;

            listAdj[index] = new ArrayList<Edges>();
            vertex.put(sc.next(), index++);
            listAdj[index] = new ArrayList<Edges>();
            vertex.put(sc.next(), index++);

            while (casesN-- > 0) {

                fLang = sc.next();
                sLang = sc.next();
                word = sc.next();
                if (!vertex.containsKey(fLang)) {
                    vertex.put(fLang, index);
                    listAdj[index++] = new ArrayList<Edges>();
                }

                if (!vertex.containsKey(sLang)) {
                    vertex.put(sLang, index);
                    listAdj[index++] = new ArrayList<Edges>();
                }

                listAdj[vertex.get(fLang)].add(new Edges(vertex.get(sLang), word.length(), word.charAt(0)));
                listAdj[vertex.get(sLang)].add(new Edges(vertex.get(fLang), word.length(), word.charAt(0)));
            }
        }
        System.out.println(vertex.toString());
        for (int i = 0; i < listAdj.length; i++) {
            if (listAdj[i] == null) {
                break;
            } else {
                System.out.println(listAdj[i]);
            }
        }
    }

    public static int dijkstra(ArrayList<Edges>[] x) {
        ArrayList<Edges>[] listAdj = x;

        ArrayList<Edges> finishLang = listAdj[1],
                nextLang = listAdj[0],
                currentLang = listAdj[0];

        Edges currentE = currentLang.get(0),
                nextE = currentLang.get(0);

        int dist = 0;

        while (currentLang != finishLang) {
            for (int i = 0; i < listAdj.length; i++) {
                if (listAdj != null) {
                    if (nextLang.size() == 1) {
                        dist += currentLang.get(0).length;
                        currentE = currentLang.get(0);
                        nextE = currentLang.get(currentLang.get(0).lang);
                        currentLang = nextLang;
                        break;
                    } else {
                        if (nextE.length + dist < currentE.length && nextE.init != currentE.init) {
                            currentE = currentLang.get(i);
                        }
                    }
                }else {
                    break;
                }
            }//Fin for
        }//Fin while
        return -1;
    }
}

class Edges implements Comparable<Edges> {

    int lang, length;
    char init;

    Edges(int lang, int length, char init) {
        this.lang = lang;
        this.length = length;
        this.init = init;
    }

    @Override
    public String toString() {
        return ("Lang: " + lang + "| Length: " + length + "|  Init: " + init);
    }

    @Override
    public int compareTo(Edges o) {
        return length - o.length;
    }
}

/*
4
portugues frances
ingles espanhol red
espanhol portugues amigo
frances ingles date
espanhol ingles actual
0
 */

/*

        ArrayList<Edges>[] listAdj = x;
        ArrayList<Edges> eLang = listAdj[1];
        ArrayList<Edges> tempLang = listAdj[0];
        Edges actLang = tempLang.get(0);
        int lengthbase;
        char tempChar;
        int dist = 0;

        while (tempLang != eLang) { // Se recorren todos los lang
            lengthbase = tempLang.get(0).length;
            System.out.println("TempLang " + tempLang);

            if (tempLang.size() == 1) { // Caso en el que solo haya una palabra posible
                dist += tempLang.get(0).length;
                tempChar = tempLang.get(0).init;
                
                tempLang = listAdj[tempLang.get(0).lang];
                System.out.println("Lang: " + tempLang.get(0).lang);
            } else {
                for (int j = 0; j < tempLang.size(); j++) { // Se recorren todas las palabras de cada lang
                    System.out.println(tempLang.get(j));
                    System.out.println("dist: "+ dist);
                    System.out.println("templen: "+actLang.length);
                    System.out.println("lengthbase: "+lengthbase);
                    System.out.println("lengthbase + dist: "+ (lengthbase + dist));
                    System.out.println("dist + templen: "+ (dist + actLang.length));
                    System.out.println(tempLang.get(j).init);
                    System.out.println(actLang.init);
                    if (((dist + actLang.length) <= (dist + lengthbase)) && (actLang.init != tempLang.get(j).init)) {
                        dist += actLang.length;
                        System.out.println("ENTRA \n \n" + dist);
                        lengthbase = tempLang.get(j).length;
                        actLang = tempLang.get(j);
                        tempLang = listAdj[tempLang.get(j).lang];
                    }
                }
            }
        }
        System.out.println(dist);
        return -1;
    
*/
