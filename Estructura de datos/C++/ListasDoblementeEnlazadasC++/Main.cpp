#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;
typedef int Dato;
#include "Nodo.h"
#include "ListaDoble.h"

int main()
{
	
	
	Nodo* prueba;
	ListaDoble lista;
	lista.insertHead(1);
	lista.insertTail(2);
	lista.add(3);
	prueba = lista.search(3);
	lista.insert(prueba,4);
	lista.insert(4 , 5);
	lista.visualizar();
	cout<<"\nEsta vacia: "<<lista.isEmpty()<<endl;
	cout<<"Size: "<<lista.getSize()<<endl;
	cout<<"Contiene el 10: "<<lista.contains(10)<<endl;
	cout<<"Contiene el 2: "<<lista.contains(2)<<endl;
	lista.remove(prueba);
	lista.remove(5);
	lista.visualizar();
	lista.clear();
	cout<<"Esta vacia: "<<lista.isEmpty()<<endl;
	cout<<"Fin"<<endl;
	getch();
	
	return 0;
}
