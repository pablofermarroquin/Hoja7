class Main
{
    public static void main(String[] args)
    {
        BinaryTree<String> arbol = new BinaryTree<String>();
        arbol.Insertar("amigo");
        arbol.Insertar("bueno");
        arbol.Insertar("casa");
        arbol.InOrder();
    }
}