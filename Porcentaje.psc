Algoritmo Porcentaje
	///Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el
	///curso actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el
	///porcentaje puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que
	///ingrese la cantidad total de niños, y la cantidad total de niñas que hay en el curso.
	Definir ninos, ninas Como Entero
	Definir porc_ninos, porc_ninas Como Real
	Escribir  "Ingrese cantidad de niños:"
	Leer ninos
	Escribir  "Ingrese cantidad de niñas:"
	Leer ninas
	Si ninos == 0 Y ninas == 0 Entonces
		Escribir "Error: Valores igual a 0"
	SiNo
		porc_ninos = ninos * 100 / (ninos + ninas)
		porc_ninas = ninas * 100 / (ninos + ninas)
		Escribir "Porcentaje de niños: ", porc_ninos ," %"
		Escribir "Porcentaje de niñas: ", porc_ninas ," %"
	FinSi
FinAlgoritmo
