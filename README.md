# MamiferosPOO
Proyecto en Java que demuestra Programación Orientada a Objetos (POO) mediante una jerarquía de mamíferos, utilizando herencia, clases abstractas y polimorfismo. Incluye ejemplos de caninos y felinos con atributos y comportamientos específicos.

# MamiferosPOO

**Proyecto en Java que demuestra Programación Orientada a Objetos (POO)** mediante una jerarquía de mamíferos. 
El proyecto utiliza **herencia, clases abstractas y polimorfismo**, mostrando comportamientos específicos de distintos animales, principalmente **caninos y felinos**.

## Jerarquía de clases

- **Mamifero** (abstract)
  - **Canino** (abstract)
    - Lobo
    - PerroAfricano
  - **Felino** (abstract)
    - Leon
    - Tigre
    - Guepardo

## Características principales

- Uso de **atributos protegidos** (`protected`) y **constructores con super()`)
- Implementación de **métodos abstractos** (`comer`, `dormir`, `correr`, `comunicarse`)
- Ejemplo de **polimorfismo** con `List<Mamifero>`
- Código escalable para agregar nuevos animales fácilmente

## Ejemplo de uso

```java
import Mamiferos.*;
import java.util.ArrayList;
import java.util.List;

List<Mamifero> mamiferos = new ArrayList<>();
mamiferos.add(new Lobo("Bosques", 0.85, 1.4, 42, "Canis lupus lupus", "gris", 5.5, 8, "Lobo gris europeo"));
mamiferos.add(new Leon("Sabanas africanas", 1.2, 2.1, 190, "Panthera leo", 7, 80, 12, 114));

for(Mamifero m : mamiferos){
    System.out.println(m.comer());
    System.out.println(m.comunicarse());
    System.out.println(m.correr());
    System.out.println(m.dormir());
}
