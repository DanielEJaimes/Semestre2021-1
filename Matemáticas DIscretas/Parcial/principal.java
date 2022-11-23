import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {
        
    public static void main (String[] args)
    {
        Scanner lectornu = new Scanner(System.in);
        List<Usuario> u = new ArrayList<>();
        ArrayList<String> r = new ArrayList<String>();
        Usuario usu;
        int x=0;
        int a;
        String b;
        while(x==0){
            System.out.println("Digite que accion desea realizar: \n1.Añadir un numero \n2.Ver los numero ingresados\n3.Salir");
            a=lectornu.nextInt();
            int cont =0;
            switch(a){
                case 1:
                    System.out.println("Digite el numero a ingresar <3");
                    b=lectornu.next();
                    usu = new Usuario (b);
                    if(!u.isEmpty()){
                        r.clear();
                        for(Usuario y: u){
                        r.add(y.mostrarNumero());
                    }
                        for(int i = 0; i<u.size();i++){
                            if(r.get(i).equals(b)){
                            cont= cont+1;
                            }
                        }  
                        if(cont==0){
                            u.add(usu);
                            }
                    }else{
                        u.add(usu);
                    }
                    
                    
                    break;
                case 2:
                    r.clear();
                    if(!u.isEmpty()){
                        for(Usuario y: u){
                        r.add(y.mostrarNumero());
                    }
                    u.clear();
                    int primero, segundo;
                    int sice = r.size()-1;
                    for(int ab =0; ab<r.size();ab++){
                    for(int i = 0; i < sice; i++){
                        primero = Integer.parseInt(r.get(i));
                        segundo = Integer.parseInt(r.get(i+1));
                        if(primero > segundo){
                              int tmp = segundo;
                              segundo = primero;
                              primero = tmp;
                              r.set(i, primero+"");
                              r.set(i+1, segundo+"");
                        }
                        
        }}
                        for(int i=0; i< r.size();i++){
                            System.out.println(r.get(i));
                        }
                        }else{
                        System.out.println("No hay numeros");
                    }
                    break;
                case 3:
                    x=1;
                    }
            }
            sc.close();
        }
        
    }

    public class Usuario {
   
        private String numero;
    
        public String mostrarNumero() {
            return numero;
        }
    
        public void addNumero(String numero) {
            this.numero = numero;
        }
    
        public Usuario(String numero) {
            this.numero = numero;
        }
        
    }