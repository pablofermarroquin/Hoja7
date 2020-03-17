import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @org.junit.jupiter.api.Test
    void insertar()
    {
        BinaryTree<String> br = new BinaryTree<>();
        br.Insertar("car", "carro");
        assertEquals(1, br.size);
    }

    @org.junit.jupiter.api.Test
    void buscar()
    {
        Traduccion tr= new Traduccion();
        tr.TraducirArchivo();

        assertEquals("*pet*",tr.arbol.Buscar("pet"));
    }
}