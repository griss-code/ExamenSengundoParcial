from functools import reduce

envios = [
    ("Taza", 0.5, 10.0),
    ("Mesa", 15.0, 50.0),
    ("Libro", 0.8, 4.0),
    ("Silla", 5.0, 30.0),
    ("Bateria", 1.0, 25.0)
]


productos_elegibles = list(filter(lambda item: item[1] <= 1 and item[2] > 5, envios))
print("Productos elegibles: ", productos_elegibles)

costo_envio_individual = list(map(lambda item: item[2] + (item[1] *2) , productos_elegibles))
print("Costo del envio de producto elegible: ", costo_envio_individual)

valor_total = reduce(lambda x, y: x + y, costo_envio_individual)
print("Suma del costo total de los productos ", valor_total)
