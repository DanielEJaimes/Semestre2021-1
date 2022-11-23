
typedef int Dato;
#include <iostream>
using namespace std;
#include "Nodo.h"
class ColaPrioridad{
	protected:
		Nodo* inicio;
	public:
		ColaPrioridad();
		bool isEmpty();
		void insertConPrioridad(Dato object);
		void clear();
};

void ColaPrioridad::clear(){
	Nodo* ite;
	while (inicio){
		ite = inicio;
		inicio = inicio->siguiente();
		ite->enlazar(NULL)
		delete ite;
	}
}

void ColaPrioridad::insertConPrioridad(Dato object){
	
}

ColaPrioridad::ColaPrioridad(){
	inicio = NULL;
}
