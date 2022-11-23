#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;
typedef int Dato;
#include "Nodo.h"
#include "List.h"

int main()
{
	Nodo* prueba;
	int a,b,c,d;
	Lista lista;
	cout<<"Digite un dato a: ";
	cin>>a;
	lista.insertHead(a);
	cout<<"Digite un dato b: ";
	cin>>b;
	lista.insertTail(b);
	cout<<"Digite un dato c: ";
	cin>>c;
	lista.add(c);
	prueba = lista.search(3);
	cout<<"Digite un dato d: ";
	cin>>d;
	lista.add(d);
	lista.visualizar();
	cout<<"Size: "<<lista.getSize()<<endl;
	cout<<"Esta vacia: "<<lista.isEmpty()<<endl;
	cout<<"Contiene el 10: "<<lista.contains(10)<<endl;
	cout<<"Contiene el 2: "<<lista.contains(2)<<endl;
	lista.remove(prueba);
	lista.visualizar();
	lista.clear();
	cout<<"Esta vacia: "<<lista.isEmpty()<<endl;
	cout<<"Fin"<<endl;
	getch();
	return 0;
}
