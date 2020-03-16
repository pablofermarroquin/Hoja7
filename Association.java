import java.util.HashMap;

class Association<K, V>
{
    String key;
    String value;
    
    public String AssociatedValue(String key)
    {
        return value;
        
    }

    public void InsertNewAssociation(String llave, String valor)
    {
       key=llave;
       value=valor;
       // System.out.println("Paso el insert");
    }
   
    /*public HashMap<String,String> diccionario;

    public Association()
    {
        diccionario = new HashMap<String, String>();
       // System.out.println("Paso el constructor");
    }

    public String AssociatedValue(String key)
    {
        //System.out.println("Entro al AsoValue");
        return diccionario.get(key);
        
    }

    public void InsertNewAssociation(String key, String value)
    {
        diccionario.put(key, value);
       // System.out.println("Paso el insert");
    }

    */


}