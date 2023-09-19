
package bridge;

public abstract class alimento {
 
    
     ielaborar implementador;
    String nombre;

    public ielaborar getImplementador()
    {
        return this.implementador;
    }

    public void setImplementador( ielaborar implementador )
    {
        this.implementador = implementador;
    }
   
     public abstract void obtener();
}
