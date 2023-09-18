#Ejercicio 1
Genero = input ("Digite F para mujer o M para hombre: ")
Edad = int (input ("Digite su edad: "))
if Genero == "F" and Edad >=57 or Genero == "M" and Edad >=62:
    print ("Usted cumple con las condiciones para jubilarse.")
else:
    print ("Usted no cumple con las condiciones para jubilarse.")

#Ejercicio 2
N1 = float (input ("Digite Nota 1: "))
N2 = float (input ("Digite Nota 2: "))
N3 = float (input ("Digite Nota 3: "))
N4 = float (input ("Digite Nota 4: "))
N5 = float (input ("Digite Nota 5: "))
Prom = (N1+N2+N3+N4+N5) / 5
if Prom >= 4.0:
    print ("Usted a sido aprobado")
else:
    print ("Usted a sido desaprobado")

#Ejercicio 3
N = int (input ("Numero de camisas que va a comprar: "))
Total = 75000 * N
if N >= 1 and N <= 4:
    Descuento = (Total/100)*12.5
    Final = Total - Descuento
elif N >= 5 and N <= 8:
    Descuento = (Total/100)*20
    Final = Total - Descuento
else:
    Descuento = (Total/100)*31.5
    Final = Total - Descuento
print (f"El total de tu compra es {Total} pero por la cantidad de camisas te queda un total de {Final} con el descuento.")

#Ejercicio 4
Pago = int (input ("Digite su salario sin puntos ni comas: "))
if Pago <= 2000000:
    print ("Usted recibe auxilio de transporte")
else:
    print ("Usted no recibe auxilio de transporte")

#Ejercicio 5
Cop = int (input ("Digite los pesos a convertir: "))
Opc = int (input ("Digite 1 = US, 2 = EU y 3 = BR: "))
if Opc == 1:
    Final = Cop * 3810
    print (f"{Cop}COP convertidos en US son {Final}")
elif Opc == 2:
    Final = Cop * 4140
    print (f"{Cop}COP convertidos en EU son {Final}")
elif Opc == 3:
    Final = Cop * 747
    print (f"{Cop}COP convertidos en BR son {Final}")
else:
    print ("No digito una opcion valida")

#Ejercicio 6
Dia = input ("Digite el dia de la semana: ")
if Dia == "Lunes":
    print ("Feliz Inicio de SEMANA")
elif Dia == "Martes" or Dia == "Miercoles" or Dia == "Jueves":
    print ("Trabajando Fuertemente")
elif Dia == "Viernes":
    print ("Iniciando el Fin de SEMANA")
elif Dia == "Sabado" or Dia == "Domingo":
    print ("Feliz Fin de SEMANA")
else:
    print ("No digito un dia de la semana")

#Ejercicio 7
A = "Partido Rojo"
B = "Partido Verde"
C = "Partido Azul"
Candidato = input ("Que candidato escoge, A para rojo, B para Verde y C para azul?" )
if Candidato == A or Candidato == B or Candidato == C:
    print (f"Usted a escogido al candidato de {Candidato}")
else:
    print ("Opción errónea")

#Ejercicio 8
Fig = input ("Digite una figura entre Cuadrado, Triangulo, Circulo y Rectangulo: ")
if Fig == "Cuadrado":
    Lado = float (input ("Digite el lado: "))
    Area = Lado * 4
    print (f"Usted escogio el cuadrado y el area es: {Area}")
elif Fig == "Rectangulo":
    Base = float (input ("Digite la base: "))
    Altura = float (input ("Digite la altura: "))
    Area = Base * Altura
    print (f"Usted escogio el Rectangulo y el area es: {Area}")
elif Fig == "Triangulo":
    Base = float (input ("Digite la base: "))
    Altura = float (input ("Digite la altura: "))
    Area = (Base * Altura) / 2
    print (f"Usted escogio el triangulo y el area es: {Area}")
elif Fig == "Circulo":
    Radio = float (input ("Digite el radio: "))
    Area = (Radio**2)*3.1416
    print (f"Usted escogio el circulo y el area es: {Area}")
else:
    print ("No digito una opcion valida. ")