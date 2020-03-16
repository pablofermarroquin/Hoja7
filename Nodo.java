//Referencia tomada de: https://www.baeldung.com/java-binary-tree
class Nodo 
{
    String valor;
    Nodo izq;
    Nodo der;
 
    Nodo(String valor) 
    {
        this.valor = valor;
        der = null;
        izq = null;
    }
}