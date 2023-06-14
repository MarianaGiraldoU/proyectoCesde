#Funciones ahorrar lineas de codigo reutilizar codigo, dividir el programa ne pequeñas tareas, declarar una funcion

""" Def nombre funcion ( parametros1, parametros 2....)
conjunto de instrucciones
nombreFuncion(argumento1,argumento2)
"""

#funcion sin parametros

def DerechosHumanos():
    print("Derechp a la vida\nderecho a la salud\nderecho a la educacion\n derecho a la libre exprecipon\n derecho al libre desarrollo de la personalidad")
DerechosHumanos()
def DerechosMayoresEdad():
    print("Derecho a morir dignamente\nDerecho a el trabajo\n derecho a la vejez digna\n derecho a votar")

    #Funcion con parametros:
    #declarar una funcion que muestre los derechos humanos y los derechos mayores de edad si la edad es mayor o igual que

def Derechos(nombre,edad):
    print(f"{nombre} tus derechos son: ")
    if edad >= 18:
        DerechosHumanos()
        DerechosMayoresEdad()
    else:
        DerechosHumanos()
    #Edad = int(input("ingrese la edad: "))
Derechos("Carlos", 18)

    #Funcion Divisor : divisor es 0 debe arrojar un mensaje de error, DE lo ocntrario que muestre el resultado

def Division(Dividendo, Divisor):
    if Divisor == 0:
         print("No existe la division por cero")
    else:
        print(f"el cociente es: , {Dividendo // Divisor}")
    Division(20, Divisor)
    print(Divisor)
        