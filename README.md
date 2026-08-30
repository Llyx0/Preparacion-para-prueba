Preparación Prueba
1.	2100.202620 
2.	Unidad 1 
3.	Preparación Prueba 
Requisitos de finalización 
Herencia en Java
Una empresa de desarrollo de videojuegos necesita implementar un sistema para registrar distintos tipos de personajes dentro de un juego.
Todos los personajes poseen un nombre y una cantidad de vida. Sin embargo, existen distintos tipos de personajes con características adicionales.
Los Guerreros poseen además un valor de fuerza, mientras que los Magos poseen una cantidad de maná.
Dentro de los Guerreros existe además un tipo especial denominado Caballero, que mantiene las características de un Guerrero, pero adicionalmente posee un valor de armadura.
Objetivo
Desarrollar un programa en Java utilizando herencia que permita representar la relación entre las clases:
Personaje
├── Guerrero
│   └── Caballero
└── Mago
Clases a desarrollar
Clase Personaje
•	nombre : String
•	vida : int
Clase Guerrero
•	Debe heredar de Personaje.
•	fuerza : int
Clase Mago
•	Debe heredar de Personaje.
•	mana : int
Clase Caballero
•	Debe heredar de Guerrero.
•	armadura : int
Requerimientos
1.	Crear las clases Personaje, Guerrero, Mago y Caballero.
2.	Cada clase deberá contener los atributos que le correspondan.
3.	Crear los constructores necesarios para inicializar los objetos.
4.	Utilizar extends para establecer las relaciones de herencia.
5.	Utilizar super(...) para enviar los datos correspondientes al constructor de la clase padre.
6.	Crear los métodos get y set necesarios.
7.	Implementar el método toString() para mostrar la información de los personajes.
8.	En la clase principal utilizar Scanner para solicitar los datos al usuario.
9.	El programa deberá permitir crear como mínimo: 
o	1 objeto de tipo Mago.
o	1 objeto de tipo Caballero.
10.	Finalmente, mostrar en consola la información de los objetos creados.
Ejemplo de ejecución
=== CREAR MAGO ===

Ingrese nombre: Gandalf
Ingrese vida: 100
Ingrese mana: 250

=== CREAR CABALLERO ===

Ingrese nombre: Arturo
Ingrese vida: 150
Ingrese fuerza: 80
Ingrese armadura: 120

=== PERSONAJES CREADOS ===

Mago:
Nombre: Gandalf
Vida: 100
Mana: 250

Caballero:
Nombre: Arturo
Vida: 150
Fuerza: 80
Armadura: 120
Antes de programar
Realice primero un diagrama simple de herencia e identifique:
•	¿Cuál es la clase padre principal?
•	¿Qué clases heredan directamente de Personaje?
•	¿De qué clase debe heredar Caballero?
•	¿Qué atributos pertenecen a cada clase?
Importante
No se deben repetir en las clases hijas atributos que ya se encuentren definidos en una clase padre.
El objetivo del ejercicio es aplicar correctamente extends, super(...), constructores y reutilización de atributos mediante herencia.

