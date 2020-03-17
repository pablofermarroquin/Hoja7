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
    }


}