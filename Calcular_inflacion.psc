Algoritmo Calcular_inflacion
	///Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio
	///del a�o, y el precio del mismo producto al finalizar el a�o. El programa debe calcular cu�l
	///fue el porcentaje de aumento que tuvo ese producto en el a�o y mostrarlo por pantalla.
	Definir precio_ini, precio_fin ,porcentaje Como Real
	Escribir "Ingrese precio inicial:"
	Leer precio_ini
	Escribir "Ingrese precio final:"
	Leer precio_fin
	porcentaje = (precio_fin - precio_ini)/ precio_ini * 100
	Escribir "Porcentaje: ", porcentaje ,"%"
FinAlgoritmo
