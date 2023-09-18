# Num = [34,-76,44,-2,58,4,95,30]
# Semana = ["lunes", "martes", "miercoles", "jueves", "viernes"]
# x = 0
# for x in (Num):
#     print (x)
# for x in range(len(Semana)):
#     print (f"En el item {z} esta el elemento: {(Semana[x])}")
# while x < len(Semana):
#     print (f"En el item {x} esta el elemento: {(Semana[x])}")
#     x += 1
# Semana.sort()
# Num.sort(reverse = True)
# print (Semana)
# print (Num)
#[]

#EJERCICIO 1
Nota = int(input("Digite cuantas notas: "))
x = 1
NotaSuma = 0
Notas = []
while x <= Nota:
    Not = float(input("Digite la nota: "))
    if Not > 5:
        print ("Digito la nota erronea")
        break
    Notas.append(Not)
    NotaSuma = NotaSuma + Not
    x += 1
Prom = NotaSuma / Nota
if Prom >= 4.5:
    print (f"Sus notas digitadas fueron {Notas}")
    print (f"Usted a sido aprobado con una nota de {Prom}")
else:
    print (f"Sus notas digitadas fueron {Notas}")
    print (f"Usted a sido desaprobado con una nota de {Prom}")

#EJERCICIO 2
Dinero = int (input("Digite la cantidad a invertir: "))
Iva = float(input("Cual va hacer el porcentaje?: "))
Años = int(input("Cuantos Años?: "))
Conve = Iva / 100
for e in range(Años):
    Inter = (Dinero * Conve) + Dinero
    Inter2 = Años * Inter
    Total = Inter2 - Dinero
    Inversion = []
    Inversion.append(Total)
    print(f"Capital tras {Años} años: {Inter2}")
    e += 1
    Años += 1
print (Inversion)