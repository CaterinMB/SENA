#Ejercicio 1
Num = int (input ("Digite el numero: "))
Fac = 1
for x in range (Num):
    Fac *= Num
    Num -= 1
print (f"El resultado es {Fac}")

#Ejercicio 2
Num1 = int (input ("Digite el numero 1: "))
Num2 = int (input ("Digite el numero 2: "))
for i in range (Num1, Num2):
    if i & 1 == 0:
        continue
    print (i)

#Ejercicio 3
for a in range (1, 31):
    print (a)
    if a % 7 == 0:
        print ("\n")

#Ejercicio 4
Cant = float(input("Cual es la cantidad invertir?: "))
Iva = float(input("Cual va hacer el porcentaje?: "))
Años = int(input("Cuantos Años?: "))
for e in range(Años):
    Cant *= 1 + Iva / 100 
    print("Capital tras " + str(e+1) + " años: " + str(round(Cant, 2)))

#Ejercicio 5
Porc  = 0
NFin = 0
while Porc < 100:
    PorParcial = float (input("Ingrese el porcentaje: "))
    NParcial = float (input("Ingrese la nota: "))
    if NParcial > 5:
        print ("Digito mal la nota")
        break
    Porc = Porc + PorParcial
    NFin = NFin + (NParcial * (PorParcial/100))
if NFin >= 4.5:
    print("Aprobo la materia con una nota de " + str(NFin))
else:
    print("No aprobo la materia con la nota = " + str(NFin))

#Ejercicio 6
while True:
    Res = input("Digite (Si) para empezar la conversion: ").lower()
    if Res == "si":
        Usa = int(input("Digite la cantidad de Dolares que tiene: "))
        Conv = Usa * 3934
        print (f"Usted tiene {Conv} pesos colombianos")
        continue
    elif Res == "no":
        print ("Esperamos que le gustara el programa")
        break
    else:
        print ("Digito una opcion invalida")

#Ejercicio 7
Cand = int(input("Digite la cantida de productos: "))
o = 0
sub = 0
while o < Cand:
    Val = int(input("Producto ",o+1,", valor: "))
    Candad=int(input("Digite la cantidad: "))
    SubPro = Val * Cand
    sub = sub + SubPro
    o += 1
iva=sub*0.19
Total=sub+iva
print("Se vendieron: ",Cand," Productos")
print("Subtotal: ",sub)
print("El iva de la compra es: ",iva)
print("Total de la compra: ",Total)

#Ejercicio 8
Vend = int(input("Vendedores: "))
u = 0
Com = 0
while u < Vend:
    val=int(input("Vendedor ", u + 1 ,", digite la cantidad ventas: "))
    if val>100000:
        Com=val*0.15
        print("Su comicion es del 15% y es: ", Com)
    elif val>5000 and val<100000:
        Com=val*0.05
        print("Su comicion es del 5% y es:", Com) 
    else:
        print("No tiene comicion")
    u += 1

#Ejercicio 9
print ("Opción 0. Para Salir \nOpción 1. Para Sumar \nOpción 2. Para Restar \nOpción 3. Para Multiplicar \nOpción 4. Para Dividir")
while True:
    Opc = int (input("Digite la opcion: "))
    Num1 = int (input("Digite numero 1: "))
    Num2 = int (input("Digite numero 2: "))
    if Opc == 0:
        print ("Espero le funcionara el programa como esperaba")
        break
    elif Opc == 1:
        print ("A escogido la opcion de suma")
        Suma = Num1 + Num2
        print (f"El resultado es: {Suma}")
    elif Opc == 2:
        print ("A escogido la opcion de resta")
        Resta = Num1 - Num2
        print (f"El resultado es: {Resta}")
    elif Opc == 3:
        print ("A escogido la opcion de multiplicacion")
        Mult = Num1 * Num2
        print (f"El resultado es: {Mult}")
    elif Opc == 4:
        print ("A escogido la opcion de dividir")
        Div = Num1 / Num2
        print (f"El resultado es: {Div}")
    else:
        print ("Digito una opcion no valida")