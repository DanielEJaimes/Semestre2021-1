#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;
typedef int Dato;
#include "Nodo.h"
#include "Cola.h"

int main()
{
	Nodo* prueba;
	int a,b,c,d;
	Cola cola;
	cout<<"Digite un dato a: ";
	cin>>a;
	cola.insert(a);
	cout<<"Digite un dato b: ";
	cin>>b;
	cola.insert(b);
	cout<<"Digite un dato c: ";
	cin>>c;
	cola.insert(c);
	cout<<"Digite un dato d: ";
	cin>>d;
	cola.insert(d);
	cola.visualizar();
	cout<<"\nEsta vacia(NO)): "<<cola.isEmpty()<<endl;
	cout<<"Size(4)): "<<cola.getSize()<<endl;
	cout<<"Contains(SI): "<<cola.search(2)<<endl;
	cola.extract();
	cola.visualizar();
	cola.clear();
	cout<<"\nEsta vacia(SI)): "<<cola.isEmpty()<<endl;
	cout<<"Fin"<<endl;
	getch();
	return 0;
}

