Algoritmo Ejercicio_5
	///Escribir un programa que calcule cu�ntos litros de combustible consumi� un autom�vil.
	///El usuario ingresase una cantidad de litros de combustible cargados en la estaci�n y
	///una cantidad de kil�metros recorridos, despu�s, el programa calcular� el consumo
	///(km/lt) y se lo mostrar� al usuario.
	Definir litros Como Real
	Definir kilometros Como Real
	Definir recorrido Como Real
	
	Escribir "Ingrese cantidad de litros de combustible:"
	Leer litros
	Escribir "Ingrese cantidad de kilometros recorridos:"
	Leer kilometros
	Si litros == 0 Entonces
		Escribir "Error: Litros = 0"
	SiNo
		recorrido = kilometros / litros
		Escribir "Consumo: ", recorrido ," km/lt"
	FinSi
FinAlgoritmo
