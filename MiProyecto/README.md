# 📌 Proyecto: Implementación de TAD Cola en C# (.NET)

## 🧾 Descripción

Este proyecto implementa un **Tipo Abstracto de Datos (TAD) Cola** utilizando C# y .NET.
La cola sigue el principio **FIFO (First In, First Out)**, es decir, el primer elemento en entrar es el primero en salir.

Se utilizan:

* **Interfaces** para definir el comportamiento del TAD
* **Clases** para implementar su funcionamiento

---

## ⚙️ Requisitos

Antes de ejecutar el proyecto, necesitas tener instalado:

* .NET SDK (versión 6 o superior recomendada)
* Un editor de código (Visual Studio o Visual Studio Code)

Para verificar que tienes .NET instalado, ejecuta en la terminal:

```bash
dotnet --version
```

---

## ▶️ Cómo ejecutar el proyecto

### 1. Clonar o descargar el proyecto

Si usas Git:

```bash
git clone <url-del-repositorio>
cd MiProyectoTAD
```

O simplemente descarga y abre la carpeta del proyecto.

---

### 2. Ejecutar el programa

Desde la terminal, dentro de la carpeta del proyecto:

```bash
dotnet run
```

---

## 📁 Estructura del proyecto

```
MiProyectoTAD/
│
├── Program.cs              → Punto de entrada del programa
├── Interfaces/
│   └── ICola.cs           → Definición del TAD
│
├── Implementaciones/
│   └── Cola.cs            → Implementación de la cola
```

---

## 🧠 ¿Qué hace el código?

El programa:

1. Crea una cola de enteros
2. Inserta elementos usando `Encolar()`
3. Muestra el primer elemento con `Peek()`
4. Elimina elementos con `Desencolar()`
5. Verifica si la cola está vacía con `EstaVacia()`

---

## 🧪 Ejemplo de ejecución

Salida esperada en consola:

```
Peek: 10
Desencolar: 10
Desencolar: 20
¿Está vacía?: False
```

---

## 🔧 Operaciones implementadas

* `Encolar(T elemento)` → Agrega un elemento a la cola
* `Desencolar()` → Elimina y devuelve el primer elemento
* `Peek()` → Devuelve el primer elemento sin eliminarlo
* `EstaVacia()` → Verifica si la cola está vacía

---

## 📌 Conceptos aplicados

* Abstracción
* Encapsulamiento
* Programación orientada a objetos
* Uso de interfaces
* Separación de responsabilidades

---

## 🚀 Autor

Proyecto académico para el aprendizaje de estructuras de datos en C#.
