package git.prueba.pkg1.pkg1;

public class MetodoRecurcion {
    
    //un ciclo pero sin utilizar los metodos de ciclos
    
    public void ciclo(int x)
    {
        if(x <= 10)
        {
            System.out.print(x + " ");
            
            ciclo(x + 1);
        }
    }
    
}
