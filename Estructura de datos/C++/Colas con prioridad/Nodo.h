typedef int Dato;

#ifndef _NODO_H
#define _NODO_H
class Nodo
{
	protected:
		Dato object;
		Nodo* next;
	public:
		Nodo (Dato t){
			object = t;
			next = NULL;
		}
		Dato getObject() const
		{
			return object;
		}
		
		void setObject(Dato t){
			object = t;
		}
		
		void enlazar(Nodo* sgte){
			next = sgte;
		}
		Nodo* siguiente() const{
		return next;
		}
};
#endif

typedef struct
{
int prioridad;
char nombre[51];
}Tarea;
