import java.util.ArrayList;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

class Traduccion
{
    BinaryTree<String> arbol;
    String textoEnEspanol;

    public void TraducirArchivo()
    {
        try
        {
            arbol = new BinaryTree<String>();
            LeerArchivoDictionary();
            LeerArchivoText();
            
            //MostrarInOrder();
            Traducir();
        }
        catch (Exception e)
        {
            
        }
        //LeerArchivoDictionary();
        
    }
    
    private void LeerArchivoDictionary() throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("dictionary.txt"));
        String linea; 
        while ((linea = br.readLine()) != null) 
        {
            linea=linea.toLowerCase();
            PrepararAssociations(linea);
        }
        //System.out.println("Termino LeerArchivoDictionary");
        //PrepararAssociations("(house, casa)");
    }

    private void LeerArchivoText() throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        textoEnEspanol = br.readLine();
        //System.out.println("Termino LeerArchivoText");
    }

    private void PrepararAssociations(String linea)
    {
        linea=linea.substring(1, linea.length()-1);
        String[] par= linea.split(", ");
       
        //System.out.println(par[0]);
        //asociaciones.InsertNewAssociation(par[0], par[1]);
        //System.out.println("Paso el NEW");
        arbol.Insertar(par[0], par[1]);
        //System.out.println("Termino PrepararAsso");
    }

    private void Traducir()
    {
        String output="";
        textoEnEspanol = textoEnEspanol.substring(0, textoEnEspanol.length()-1);
        String[] palabras= textoEnEspanol.split(" ");
        for(int i=0;i<palabras.length;i++)
        {
            output+=arbol.Buscar(palabras[i])+" ";
        }
        System.out.println("Traduccion:");
        System.out.println(output+".\n");
    }

    public void MostrarInOrder()
    {
        System.out.println("Recorrido InOrder:");
        arbol.InOrder();
    }


}