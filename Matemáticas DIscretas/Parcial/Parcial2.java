import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

import javax.swing.text.StyledEditorKit;

public class test {

	static final int INF = 50000000;
	static ArrayList<Triple>[] adjList;
	static int N;
	
/*
4
portugues frances
ingles espanhol red
espanhol portugues amigo
frances ingles date
espanhol ingles actual
0
*/

	static int dijkstra(int S, int T)
	{
		int[][] dist = new int[N][26];
		/*
		S es el lenguaje de inicio, entra como el int que lo define en el map
		T es el lenguaje de fin, entra como el int que lo define en el map
		N = 4
		*/
		PriorityQueue<Triple> q = new PriorityQueue<Triple>();
		
		for(int i = 0; i < N; i++){
			Arrays.fill(dist[i], INF);//Arreglo de 106 elementos "50000000"; 106 = 26*4
		}
		/* para ver el arreglo
		for(int x = 0; x < dist.length; x++) { 
			for (int y = 0; y < dist[x].length; y++) { 
				System.out.println(dist[x][y]); 
			} 
		}
		*/
		for(int i = 0; i < 26; i++)
		{
			dist[S][i] = 0;
			q.add(new Triple(S,0,i)); //S=lang; 0=length; i=c
		}
		
		while(!q.isEmpty())
		{
			Triple cur = q.remove();//Retorna la cabeza, el eliminar de la cola que vimos en ED
			/*
			System.out.println("Cur: "+cur.toString());
			System.out.println("Dist: " + dist[cur.lang][cur.c]);
			*/
			if(cur.length > dist[cur.lang][cur.c]){//En el caso que trabajamos no hace ningún continue, de pronto es para los "imposivel"
				continue;
			}
			//Ocurre Dijkstra
			for(int i = 0; i < adjList[cur.lang].size(); i++)
			{
				Triple next = adjList[cur.lang].get(i);
				if(next.c != cur.c && cur.length + next.length < dist[next.lang][next.c])
				/*
				next.c != cur.c para comprobar que los caracteres sean distintos
				cur.length + next.length < dist[next.lang][next.c] para comprobar 
				que el camino sea mas corto que el que se tiene
				*/
				{
					dist[next.lang][next.c] = cur.length + next.length; //Se actualiza el camino mas corto
					q.add(new Triple(next.lang,dist[next.lang][next.c],next.c));
					/*
					Triple con, el lenguaje al que se movió, la distancia que se lleva, y el caracter inicial
					*/
				}
			}
		}
		int min = INF;
		for(int i = 0; i < 26; i++)
			min = Math.min(min, dist[T][i]);
		return min;
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true)
		{
			int m = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
			if(m==0)
				break;
			adjList = new ArrayList[5000];
			adjList[0] = new ArrayList<Triple>();
			adjList[1] = new ArrayList<Triple>();
			
			TreeMap<String, Integer> map = new TreeMap<String, Integer>();
            
			N = 2;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), 0);
			map.put(st.nextToken(), 1);
			
			while(m-->0)
			{
				st = new StringTokenizer(br.readLine());
				String one = st.nextToken(), two = st.nextToken(), word = st.nextToken();
				if(!map.containsKey(one))
				{
					adjList[N] = new ArrayList<Triple>();
					map.put(one,N++);
				}
				
				if(!map.containsKey(two))
				{
					adjList[N] = new ArrayList<Triple>();
					map.put(two,N++);
				}
				int u = map.get(one), v = map.get(two);
				
				adjList[u].add(new Triple(v,word.length(),word.charAt(0) - 'a'));
				adjList[v].add(new Triple(u,word.length(),word.charAt(0) - 'a'));
                /*
                System.out.println("one: "+one);
                System.out.println("two: "+two);
                //System.out.println("test::::::::: " + (word.charAt(0) - 'a'));
                
                //System.out.println("u: "+u);
                //System.out.println("v: "+v);
                System.out.println("map: " + map);
				*/
                /*
                for(int i =0; i<adjList.length; i++){
                    System.out.print(Arrays.toString( adjList[i]) );
                }*/
			}
		
			int sol = dijkstra(0,1);
			if(sol==INF)
				sb.append("impossivel\n");
			else
				sb.append(sol+"\n");
			
			
		}
		System.out.print(sb);
	}
}

class Triple implements Comparable<Triple>
{
	int lang, length, c;

	Triple(int x, int y, int z) {
		lang = x; 
		length = y; 
		c = z;
	}

	public String toString(){
		return ("Lang =" + lang +";Length =" + length + ";C =" + c);
	}

	public int compareTo(Triple o) {//Metodo compare para poder implementar la cola con prioridad
		return length - o.length;
	}

}

