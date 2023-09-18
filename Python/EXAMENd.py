Tiempos = [30.50, 29.89, 27.45, 33.56, 20.78, 45.73]
Suma = 30.50+29.89+27.45+33.56+20.78+45.73
for x in range (10):
    y = float(input("Digite un tiempo: "))
    Tiempos.append(y)
    Suma += y
Prom = Suma/16
Tiempos.sort()
print ("El promedio es ", Prom)
print ("El tiempo minimo es: ", Tiempos[0])
print ("El tiempo maximo es: ", Tiempos[-1])
tiemposNadadores = {
    "Promedio" : Prom,
    "ValMenor" : Tiempos[0],
    "Valmaximo" : Tiempos[-1],
    "Sumatoria" : Suma
}
for y in (tiemposNadadores):
    print (y)
if Prom <= 25.00 and Prom >= 0:
    print ("Vamos bien - Posibilidades de medalla de Oro")
elif Prom <= 30.00 and Prom >= 25.01:
    print ("Continuemos trabajando - Posibilidades de medalla de Plata")
elif Prom <= 40.00 and Prom >= 30.01:
    print ("Debemos mejorar más - Posibilidades de medalla de Bronce")
else:
    print ("Alerta máxima - No realizaremos una buena representación")
