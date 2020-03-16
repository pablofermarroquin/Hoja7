//Reference from: https://www.baeldung.com/java-binary-tree
class BinaryTree<E>
{
    Nodo raiz;

    private Nodo InsertarRecursivo(Nodo actual, String valor) //Reference from: https://www.baeldung.com/java-binary-tree
    {
        if (actual == null) {
            return new Nodo(valor);
        }
     
        int condicion=valor.compareTo(actual.valor);

        if (condicion<0) {
            actual.izq = InsertarRecursivo(actual.izq, valor);
        } else if (condicion>0) {
            actual.der = InsertarRecursivo(actual.der, valor);
        } else {
            
            return actual;
        }
     
        return actual;
    }

    public void Insertar(String valor) //Reference from: https://www.baeldung.com/java-binary-tree
    {
        raiz = InsertarRecursivo(raiz, valor);
    }

    /*
    private boolean BuscarRecursivo(Nodo actual, String valor) //Reference from: https://www.baeldung.com/java-binary-tree
    {
        if (actual == null) {
            return false;
        } 
        if (valor.equals(actual.valor)) {
            return true;
        } 

        return (valor.compareTo(actual.valor)>0)
          ? BuscarRecursivo(actual.izq, valor)
          : BuscarRecursivo(actual.der, valor);
    }

    public boolean Buscar(String valor) {
        return BuscarRecursivo(raiz, valor);
    }*/

    public void InOrder()
    {
        printInorder(raiz);
    }

    void printInorder(Nodo nodo) 
    { 
        if (nodo == null) 
            return; 
  
        /* first recur on izq child */
        printInorder(nodo.izq); 
  
        /* then print the data of nodo */
        System.out.print(nodo.valor + " "); 
  
        /* now recur on der child */
        printInorder(nodo.der); 
    } 

}