//Reference from: https://www.baeldung.com/java-binary-tree
class BinaryTree<E>
{
    Nodo raiz;
    public int size=0;

    private Nodo InsertarRecursivo(Nodo actual, String valor, String PalabraEspanol) //Reference from: https://www.baeldung.com/java-binary-tree
    {
        if (actual == null) {
            return new Nodo(valor, PalabraEspanol);
        }
     
        int condicion=valor.compareTo(actual.valor);

        if (condicion<0) {
            actual.izq = InsertarRecursivo(actual.izq, valor, PalabraEspanol);
        } else if (condicion>0) {
            actual.der = InsertarRecursivo(actual.der, valor, PalabraEspanol);
        } else {
            
            return actual;
        }
     
        return actual;
    }

    public void Insertar(String valor, String PalabraEspanol) //Reference from: https://www.baeldung.com/java-binary-tree
    {
        raiz = InsertarRecursivo(raiz, valor, PalabraEspanol);
        size++;
    }

    
    private String BuscarRecursivo(Nodo actual, String valor) //Reference from: https://www.baeldung.com/java-binary-tree
    {
        if (actual == null) {
            return "*"+valor+"*";
        } 

        if (valor.equals(actual.valor)) {
            return actual.traduccion;
        } 

        return (valor.compareTo(actual.valor)<0)
          ? BuscarRecursivo(actual.izq, valor)
          : BuscarRecursivo(actual.der, valor);
    }

    public String Buscar(String valor) {
        return BuscarRecursivo(raiz, valor);
    }

    public void InOrder()
    {
        printInorder(raiz);
    }

    void printInorder(Nodo nodo)  //Referece from: https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
    { 
        if (nodo == null) 
            return; 

        printInorder(nodo.izq); 

        System.out.print(nodo.valor+" "); 
  
        printInorder(nodo.der); 
    } 

}