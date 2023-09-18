ADSO = {
    "ficha" : "Primer Trimestre",
    "calidad 1" : "Primer Trimestre",
    "algoritmos con python" : "Primer Trimestre",
    "bd relacionales" : "Primer trimestre",
    "refinaciamiento de requerimientos" : "Primer trimestre",
    "java" : "Segundo Trimestre",
    "css" : "Segundo Trimestre",
    "html" : "Segundo Trimestre",
    "requisitos" : "Segundo Trimestre",
    "analisis" : "Tercer Trimestre",
    "php" : "Tercer Trimestre",
    "javascript" : "Tercer Trimestre",
    "modelado de artefactos" : "Cuarto Trimestre",
    "bd nosql" : "Cuarto Trimestre",
    "node js" : "Cuarto Trimestre",
    "net" : "Quinto Trimestre",
    "moviles" : "Quinto Trimestre",
    "proyecto 1" : "Sexto Trimestre",
    "manual tecnico" : "Sexto Trimestre",
    "calidad 2" : "Sexto Trimestre",
    "python" : "Sexto Trimestre",
    "negociacion" : "Sexto Trimestre",
    "proyecto 2" : "Septimo Trimestre",
    "calidad 3" : "Septimo Trimestre",
    "pruebas" : "Septimo Trimestre",
    "implantacion" : "Septimo Trimestre",
    "manuales" : "Septimo Trimestre",
    "capacitacion" : "Septimo Trimestre"
}
for x in ADSO:
    print (x)

Asig = input ("Digite la materia que desea averiguar: ").lower()
Buscar = ADSO.get(Asig)
print ("El semestre de ", Asig, " es: ", Buscar)