//Referencia tomada de: https://www.baeldung.com/java-binary-tree
class Nodo 
{
    public String valor;
    public Nodo izq;
    public Nodo der;
    public String traduccion;
 
    Nodo(String valor, String PalabraEspanol) 
    {
        this.valor = valor;
        der = null;
        izq = null;
        traduccion=PalabraEspanol;
    }
}