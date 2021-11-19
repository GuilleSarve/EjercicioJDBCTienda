Algoritmo Centimetros_milimetros_pulgadas
	///A partir de una conocida cantidad de metros que el usuario ingresa a través del teclado
	///se debe obtener su equivalente en centímetros, en milímetros y en pulgadas.
	///Ayuda: 1 pulgada equivale a 2.54 centímetros.
	Definir metros Como Real
	Definir cent Como Real
	Definir mili Como Real
	Definir pulg Como Real
	
	Escribir "Ingrese los metros a convertir:"
	Leer metros
	cent = metros * 100
	mili = metros * 1000
	pulg = metros * 39.3701
	Escribir "Centrimetros: ", cent
	Escribir "Milimetros: ", mili
	Escribir "Pulgadas: ", pulg
FinAlgoritmo
