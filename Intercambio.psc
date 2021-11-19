Algoritmo Intercambio
	///Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas
	///de tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas
	///variables y mostrar el resultado final por pantalla.
	///Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del
	///programa deberá mostrar: num1 = 3 y num2 = 9
	Definir numero1 Como Entero
	Definir numero2 Como Entero
	Definir temp Como Entero
	Escribir "Ingrese el primero numero:"
	Leer numero1
	Escribir "Ingrese el segundo numero:"
	Leer numero2
	temp = numero1
	numero1=numero2
	numero2=temp
	Escribir "Numero 1: ", numero1
	Escribir "Numero 2: ", numero2
FinAlgoritmo
