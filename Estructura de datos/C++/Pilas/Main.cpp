#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;
typedef int Dato;
#include "Nodo.h"
#include "Pilas.h"

int main()
{
	Nodo* prueba;
	int a,b,c,d;
	Stack pila;
	cout<<"Digite un dato a: ";
	cin>>a;
	pila.push(a);
	cout<<"Digite un dato b: ";
	cin>>b;
	pila.push(b);
	cout<<"Digite un dato c: ";
	cin>>c;
	pila.push(c);
	cout<<"Digite un dato d: ";
	cin>>d;
	pila.push(d);
	pila.visualizar();
	cout<<"Esta vacia: "<<pila.isEmpty()<<endl;
	cout<<"Pop: "<<pila.pop()<<endl;
	cout<<"Peek: "<<pila.peek()<<endl;
	cout<<"Size: "<<pila.size()<<endl;
	cout<<"Contains: "<<pila.searchStack(3)<<endl;
	pila.visualizar();
	pila.clear();
	cout<<"\nEsta vacia: "<<pila.isEmpty()<<endl;
	cout<<"Fin"<<endl;
	getch();
	return 0;
}

