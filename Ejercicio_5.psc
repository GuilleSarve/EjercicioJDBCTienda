Algoritmo Ejercicio_5
	///Escribir un programa que calcule cuántos litros de combustible consumió un automóvil.
	///El usuario ingresase una cantidad de litros de combustible cargados en la estación y
	///una cantidad de kilómetros recorridos, después, el programa calculará el consumo
	///(km/lt) y se lo mostrará al usuario.
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
