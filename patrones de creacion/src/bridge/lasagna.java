
package bridge;


public class lasagna extends alimento {
    
 public lasagna( ielaborar implementador )
    {
        this.setImplementador( implementador );
    }

    @Override
     public void obtener()
    {
        System.out.println("Preparando lasagna...");
         this.getImplementador().procesar();
    }
}