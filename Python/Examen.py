# 2.1. Teniendo en cuenta el siguiente Pseudocodigo para una aplicación universitaria, realice su implementación mediante el desarrollo de un script de Python:
# Proceso MatriculaU
# Definir programa como cadena
# Definir creditos, valor como enteros
# Definir valorcreditos como real
# Escribir "Aplicacion Universitaria - Matriculas B2022"
# Escribir "\n"
# Leer programa, creditos, valor
# Hacer valorcreditos=creditos*valor
# Si creditos > 18 entonces
#     Hacer descuento=valorcreditos*0.18
#     Hacer subtotal=valorcreditos-descuento
# SiNo
#     Hacer descuento=0
#     Hacer subtotal=valorcreditos-descuento
# FinComparacion
# Hacer iva=subtotal*0.19
# Hacer total=subtotal+iva
# Escribir "El Programa de: ", programa, "Tiene un costo de: ", total
# FinProceso
#MatriculaU
print ("Aplicacion Universitaria - Matriculas B2022 \n")
programa = input ("Digite su programa: ")
creditos = int (input ("Digite sus creditos: "))
valor = int (input ("Digite el valor sin puntos ni comas: "))
valorcreditos = creditos * valor
if creditos > 18:
  descuento = valorcreditos*0.18
  subtotal = valorcreditos - descuento
else:
  descuento = 0
  subTotal = valorcreditos - descuento
iva = subtotal * 0.19
total = subtotal + iva
print ("El Programa de ", programa, ". Tiene un costo de: ", total)

# 2.2. Realice un script de Python que permita al centro universitario llevar control de las matrículas de sus estudiantes. La aplicación debe estar en capacidad de realizar los siguientes procedimientos:
# • Debe permitir ingresar por teclado a los usuarios la siguiente información: Programa, Numero de Créditos y Valor Total de la Matricula.
# • La aplicación debe funcionar para registrar la información de N estudiantes y cada información debe ser guardada en una lista.
# • Es importante que el script de Python este en capacidad de determinar el estudiante con valor de matrícula más económico y costoso. Muéstrelo en pantalla.
# • Al finalizar el script debe mostrar el número de estudiantes registrados y el valor total de todas las matrículas de los estudiantes.
# • El script debe tener implementada una función con paso de argumentos sin retorno de valor.
Info = {
  "Identificacion" : [ ],
  "Nombre" : [ ],
  "Edad" : [ ]
}
Programas = [ ]
NumCreditos = [ ]
Valor = [ ]
Suma = 0
while True:
  x = input("Desea ingresar un estudiante? Si o No: ").lower()
  if x == "si":
    Programa = input ("Digite el programa: ")
    Programas.append(Programa)
    NumeroCreditos = int (input("Digite sus Creditos: "))
    NumCreditos.append(NumeroCreditos)
    ValorTotal = int (input("Digite el total del valor de la matricula sin punto ni comas: "))
    Suma += ValorTotal
    Valor.append(ValorTotal)
  else:
    Valor.sort()
    def Escribir():
      print ("El valor minimo de matricula es: ", Valor[0])
      print ("El valor maximo de matricula es: ", Valor[-1])
      print ("El total de estudiantes ingresados son: ", len(Programas))
      print ("El valor total de todas las matriculas es ", Suma, " pesos.")
    Escribir()
    