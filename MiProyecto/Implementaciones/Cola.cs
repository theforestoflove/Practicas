using System;
using System.Collections.Generic;
using MiProyectoTAD.Interfaces;

namespace MiProyectoTAD.Implementaciones
{
    public class Cola<T> : ICola<T>
    {
        private Queue<T> elementos = new Queue<T>();

        public void Encolar(T elemento)
        {
            elementos.Enqueue(elemento);
        }

        public T Desencolar()
        {
            if (EstaVacia())
                throw new InvalidOperationException("Cola vacía");

            return elementos.Dequeue();
        }

        public T Peek()
        {
            if (EstaVacia())
                throw new InvalidOperationException("Cola vacía");

            return elementos.Peek();
        }

        public bool EstaVacia()
        {
            return elementos.Count == 0;
        }
    }
}