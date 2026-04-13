namespace MiProyectoTAD.Interfaces
{
    public interface ICola<T>
    {
        void Encolar(T elemento);
        T Desencolar();
        T Peek();
        bool EstaVacia();
    }
}