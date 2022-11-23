#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;
typedef int Dato;
#include "Nodo.h"
#include "ListaCircularDoble.h"

int main(){
	ListaCircularDoble lista;
	lista.insert(1);
	lista.insert(2);
	lista.insert(3);
	lista.insert(4);
	lista.insert(5);
	lista.visualizar();
	cout<<"\nSize: "<<lista.getSize()<<endl;
	cout<<"Inicio: "<<lista.getHead()<<endl;
	cout<<"Fin: "<<lista.getTail()<<endl;
	lista.remove(3);
	lista.visualizar();
	cout<<"\nContiene el 2:"<<lista.contains(2)<<endl;
	lista.clear();
	lista.visualizar();
	cout<<"\nFin"<<endl;
	getch();
	return 0;
}
