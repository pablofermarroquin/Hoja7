//Referencia tomada de: https://www.baeldung.com/java-binary-tree
class Nodo 
{
    public String valor;
    public Nodo izq;
    public Nodo der;
    public String traduccion;
    private Association<String, String> association;
 
    Nodo(String valor, String PalabraEspanol) //Referencia tomada de: https://www.baeldung.com/java-binary-tree
    {
        this.valor = valor;
        der = null;
        izq = null;
        traduccion=PalabraEspanol;
        association= new Association<String, String>();
        association.key=valor;
        association.value=PalabraEspanol;
    }
}