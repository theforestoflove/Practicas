# 📚 Lista Simple en Java (Recursividad)

## 📌 Descripción

Este proyecto implementa una **lista simplemente enlazada** en Java utilizando **recursividad** para:

* Insertar elementos al final de la lista
* Mostrar los elementos de la lista

El objetivo es comprender cómo funciona la recursividad aplicada a estructuras de datos dinámicas.

---

## 🧠 Funcionamiento

### 🔹 Estructura general

El programa está dividido en tres clases:

* **Nodo** → Representa cada elemento de la lista
* **ListaSimple** → Contiene la lógica de la lista
* **Main** → Ejecuta el programa

---

### 🔹 Clase `Nodo`

Cada nodo contiene:

* Un dato (`int`)
* Una referencia al siguiente nodo

```java
int dato;
Nodo siguiente;
```

---

### 🔹 Clase `ListaSimple`

#### ✔ Insertar al final (recursivo)

```java
public void insertarFinal(int dato)
```

**Cómo funciona:**

* Si el nodo actual es `null`, se crea uno nuevo
* Si no, se llama recursivamente al siguiente nodo
* El nuevo nodo se inserta al final de la lista

---

#### ✔ Mostrar elementos (recursivo)

```java
public void mostrar()
```

**Cómo funciona:**

* Imprime el valor del nodo actual
* Llama recursivamente al siguiente nodo
* Termina cuando llega a `null`

---

### 🔁 Flujo de ejecución

Ejemplo de inserciones:

```java
lista.insertarFinal(10);
lista.insertarFinal(20);
lista.insertarFinal(30);
lista.insertarFinal(40);
```

La lista queda:

```
10 -> 20 -> 30 -> 40 ->
```

---

### 🖥️ Salida esperada

```
Elementos de la lista:
10 -> 20 -> 30 -> 40 ->
```

---

## ⚙️ Requisitos

* Java JDK 8 o superior
* Terminal o consola
* Editor de código (opcional, recomendado: VS Code o IntelliJ)

---

## 📁 Estructura del proyecto

```
Proyecto/
│
├── Nodo.java
├── ListaSimple.java
└── Main.java
```

---

## ▶️ Cómo ejecutar

1. Abrir la terminal en la carpeta del proyecto

2. Compilar los archivos:

```bash
javac *.java
```

3. Ejecutar el programa:

```bash
java Main
```

---

## 🎯 Conclusión

Este proyecto demuestra cómo:

* Usar recursividad en estructuras dinámicas
* Implementar listas enlazadas en Java
* Separar correctamente el código en clases

Es una base importante para estructuras más avanzadas como:

* Listas dobles
* Pilas
* Colas
* Árboles

---

## 🚀 Mejores posibles

* Eliminar elementos
* Buscar valores
* Evitar el "->" final en la impresión
* Entrada de datos por teclado

---
