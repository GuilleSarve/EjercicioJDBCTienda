Algoritmo Ejercicio_3
	///Escribir un programa que calcule el precio promedio de un producto. El precio promedio
	///se debe calcular a partir del precio del mismo producto en tres establecimientos
	///distintos
	Definir otro_producto Como Cadena
	Definir costo Como Real
	Definir suma Como Real
	Definir cantidad Como Entero
	Definir promedio Como Real
	cantidad=0
	suma = 0
	Escribir "¿Desea ingresar otro producto?"
	Leer otro_producto
	Mientras otro_producto == "Si" O otro_producto == "si" Hacer
		Escribir "¿Cuanto cuesta el producto?"
		Leer costo
		suma = suma + costo 
		cantidad = cantidad + 1
		Escribir "¿Desea ingresar otro producto?"
		Leer otro_producto
	Fin Mientras
	Si cantidad == 0 Entonces
		Escribir "No se ingresaron productos"
	SiNo
		promedio = suma / cantidad
		Escribir "El promedio es: ", promedio
	FinSi
	
FinAlgoritmo
