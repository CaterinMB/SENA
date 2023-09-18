Color = ["Negro", "Amarillo", "Rojo", "Azul"]
print (Color)
print ("\n")
    
Color.insert (3, "Verde")
print (Color)

print (len(Color))
print ("\n")

print (Color[-5])
print ("\n")

print (Color[2:3])
print ("\n")

if "Azul" in Color:
    print ("El color Azul esta en la lista.")
    Color[4] = "Morado"
    print (Color)
else: 
    print ("El color Azul no esta en la lista")
Color.insert (1, "Azul Cielo")
print ("\n")

Juguetes = ["Oso", "Muñeco", "Espada", "Corona"]
Color.extend(Juguetes)
print (Color)
print ("\n")

Color.remove("Oso")
print (Color)
print ("\n")

Juguetes.pop()
print (Juguetes)
print ("\n")

Color.clear()
print (Color)