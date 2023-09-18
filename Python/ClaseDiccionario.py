from asyncio.windows_events import NULL


Info = {
    "Identificacion" : NULL,
    "Nombre" : NULL,
    "Apellido" : NULL,
    "Edad" : NULL,
    "Fecha de Nacimiento" : NULL,
    "Direccion" : NULL,
    "Telefono" : NULL,
}
Usuarios = []
rango = int (input ("Digite el numero de usuarios a ingresar"))
for x in range (rango):
    Ide = int(input("Digite la identificacion del usuario (sin puntos, comas o espacios): "))
    Info["Identificacion"] = Ide 
    Nom = input("Digite el nombre del usuario: ")
    Info["Nombre"] = Nom
    Ape = input("Digite el apellido del usuario: ")
    Info["Apellido"] = Ape
    Edad = int (input ("Digite la edad del usuario: "))
    Info["Edad"] = Edad
    Nac = input ("Digite la fecha de nacimiento del usuario del usuario: ")
    Info["Fecha de Nacimiento"] = Nac
    Dir = input ("Digite la direccion del usuario: ")
    Info["Direccion"] = Dir
    Cel = int(input("Digite el numero telefonico del usuario (sin puntos, comas o espacios): "))
    Info["Telefono"] = Cel
    Usuarios.append (Info)
print (Usuarios)