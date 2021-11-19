Algoritmo Calculadora
	///Escriba un programa que lea dos números enteros y realice el cálculo de la suma, resta,
	///multiplicación y división entre ambos valores. Los resultados deben mostrarse por
	///pantalla.
	Definir numero1 Como Entero
	Definir numero2 Como Entero
	Definir resultado Como Real
	
	Escribir "Ingrese el primero numero:"
	Leer numero1
	Escribir "Ingrese el segundo numero:"
	Leer numero2
	resultado = numero1 + numero2
	Escribir numero1,"+",numero2,"=",resultado
	resultado = numero1 - numero2
	Escribir numero1,"-",numero2,"=",resultado
	resultado = numero1 * numero2
	Escribir numero1,"*",numero2,"=",resultado
	Si numero2 == 0 Entonces
		Escribir "Error: Division por 0"
	SiNo
		resultado = numero1/numero2
		Escribir numero1,"*",numero2,"=",resultado
	Fin Si
FinAlgoritmo
