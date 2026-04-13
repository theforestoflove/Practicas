using System;
using MiProyectoTAD.Implementaciones;

class Program
{
    static void Main(string[] args)
    {
        Cola<int> cola = new Cola<int>();

        cola.Encolar(10);
        cola.Encolar(20);
        cola.Encolar(30);

        Console.WriteLine("Peek: " + cola.Peek());

        Console.WriteLine("Desencolar: " + cola.Desencolar());
        Console.WriteLine("Desencolar: " + cola.Desencolar());

        Console.WriteLine("¿Está vacía?: " + cola.EstaVacia());
    }
}