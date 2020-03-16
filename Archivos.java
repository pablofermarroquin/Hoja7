import java.util.ArrayList;

class Archivos
{
    public ArrayList<String> importText() throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
        ArrayList<String> LineasDeArchivo = new ArrayList<String>();
        String st; 
        while ((st = br.readLine()) != null) 
        {
            LineasDeArchivo.add(st); 
        }

        return LineasDeArchivo;
    }
}