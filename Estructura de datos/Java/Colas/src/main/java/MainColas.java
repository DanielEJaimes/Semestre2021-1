
public class MainColas {
    
    public static void main(String[] args) {
        /*
        System.out.print("ArrayQueue \n \n");
        ArrayQueue array = new ArrayQueue(5);
        System.out.print("Está vacía al crearse: "+array.isEmpty()+"\n");
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        System.out.print("Está vacía después de agregar datos: "+array.isEmpty()+"\n");
        System.out.print("Extract: "+array.extract()+"\n");
        array.clear();
        System.out.print("Después de clear, está vacía: "+array.isEmpty()+"\n");
        array.insert(7);
        array.insert(6);
        array.insert(9);
        array.insert(8);
        array.insert(0);
        System.out.print("Después de agregar 5 datos, el tamaño: "+array.size()+"\n");
        System.out.print("Está el 8: "+array.search(8)+"\n");
        System.out.print("Está el 3: "+array.search(3)+"\n");
        System.out.print("Extract arreglo normal: "+array.extract()+"\n");
        array.reverse();
        System.out.print("Extract arreglo al revés: "+array.extract()+"\n");
        System.out.print(array.toString());
        */
        
        System.out.print("\n \n ListQueue \n \n");
        ListQueue lista = new ListQueue();
        System.out.print("Está vacía al crearse: "+lista.isEmpty()+"\n");
        lista.insert(1);
        lista.insert(2);
        lista.insert(3);
        lista.insert(4);
        lista.insert(5);
        System.out.print("Está vacía después de agregar datos: "+lista.isEmpty()+"\n");
        System.out.print(lista.toString()+"\n");
        System.out.print("Extract: "+lista.extract()+"\n");
        System.out.print(lista.toString()+"\n");
        lista.clear();
        System.out.print("Después de clear, está vacía: "+lista.isEmpty()+"\n");
        lista.insert(6);
        lista.insert(7);
        lista.insert(8);
        lista.insert(9);
        lista.insert(0);
        System.out.print("Después de agregar 5 datos, el tamaño: "+lista.size()+"\n");
        System.out.print("Está el 8: "+lista.search(8)+"\n");
        System.out.print("Está el 3: "+lista.search(3)+"\n");
        System.out.print(lista.toString()+"\n");
        lista.reverse();
        System.out.print(lista.toString()+"\n");
        System.out.print("Después del reverse, el tamaño: "+lista.size()+"\n");
    }
}