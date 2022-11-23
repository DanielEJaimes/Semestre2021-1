#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;
typedef int Dato;
#include "Nodo.h"
#include "ArbolBinario.h"

int main()
{
	Nodo* prueba;
	ArbolBinario abb;
	abb.insert(abb.raizArbol(),5);
	abb.insert(abb.raizArbol(),2);
	abb.insert(abb.raizArbol(),4);
	abb.insert(abb.raizArbol(),7);
	cout<<"Esta vacio: "<<abb.isEmpty()<<endl;
	prueba = abb.search(7);
	abb.remove(5);
	abb.remove(prueba->getObject());
	abb.remove(2);
	abb.remove(4);
	cout<<"Esta vacio: "<<abb.isEmpty()<<endl;
	getch();
	return 0;
}
