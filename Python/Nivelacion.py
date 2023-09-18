Nomina = {
    "Identificacion" : [],
    "Nombre" : [],
    "Apeliido" : [],
    "Salario Mensual" : [],
    "Dias Trabajados" : [],
    "Extras Dia" : [],
    "Extras Noche" : [],
    "Valor del Dia" : [],
    "Basico" : [],
    "Valor Extras Noche" : [],
    "Valor Extras Dia" : [],
    "SubTotal" : [],
    "Salud" : [],
    "Pension" : [],
    "Auxilio Transporte" : [],
    "Neto" : []
}
Identi = [ ]
Nom = [ ]
Ape = [ ]
SMensual = [ ]
DTraba = [ ]
ExtraD = [ ]
ExtraN = [ ]
ValorDia = [ ]
BasicoT = [ ]
VExtraD = [ ]
VExtraN = [ ]
SubTotal = [ ]
SaludT = [ ]
PensionT = [ ]
ATransporte = [ ]
NetoT = [ ]
y = int (input("Digite los trabajadores a ingresar"))
TNomina = 0
for c in range (y):
    if c <= y:
        ID = int (input ("Digite la identificacion (sin puntos ni comas): "))
        Identi.append(ID)
        NE = input ("Digite el nombre: ")
        Nom.append(NE)
        AO = input ("Digite el apellido: ")
        Ape.append(AO)
        SM = int (input ("Digite salario mensual (sin puntos ni comas): "))
        SMensual.append(SM)
        DT = int (input ("Digite los dias trabajados  (mínimo 1 máximo 30): "))
        DTraba.append(DT)
        ED = int (input ("Digite el numero de horas extras diurnas  (mínimo  máximo 30): "))
        ExtraD.append(ED)
        EN = int (input ("Digite el numero de horas extras nocturnas: "))
        ExtraN.append(EN)
        VDia = SM / 30
        ValorDia.append(VDia)
        Basico = DT * VDia
        BasicoT.append(Basico)
        VED = ((VDia/8)*1.25)*ED
        VExtraD.append(VED)
        VEN = ((VDia/8)*1.75)*ED
        VExtraN.append(VEN)
        SubT = Basico+VED+VEN
        SubTotal.append(SubT)
        Salud = (SubT/100)*12.5
        SaludT.append(Salud)
        Pension = (SubT/100)*16
        PensionT.append(Pension)
        if SM <= 2000000:
            AT = 106454
        else:
            AT = 0
        ATransporte.append(AT)
        Neto = (SubT-(Salud+Pension))+AT
        TNomina += Neto
        NetoT.append(Neto)
    Nomina["Identificacion"] = Identi
    Nomina["Nombre"] = Nom
    Nomina["Apeliido"] = Ape
    Nomina["Salario Mensual"] = SMensual
    Nomina["Dia Trabajado"] = DTraba
    Nomina["Extras Dia"] = ExtraD
    Nomina["Extras Noche"] = ExtraN
    Nomina["Valor del Dia"] = ValorDia
    Nomina["Basico"] = BasicoT
    Nomina["Valor Extras Noches"] = VExtraN
    Nomina["Valor Extras Dia"] = VExtraD
    Nomina["SubTotal"] = SubTotal
    Nomina["Salud"] = SaludT
    Nomina["Pension"] = PensionT
    Nomina["Neto"] = NetoT
print (Nomina)
print ("El valor total de las nominas es: ", TNomina)