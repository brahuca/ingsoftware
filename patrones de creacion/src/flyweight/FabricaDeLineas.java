
package flyweight;

import java.util.ArrayList;
import java.util.List;


public class FabricaDeLineas {
    
     private List<ILineaLigera> lineas;

    public FabricaDeLineas()
    {
         this.lineas = new ArrayList<ILineaLigera>();
    }
     public ILineaLigera getLine( String color )
    {
    
         for(ILineaLigera linea : this.lineas)
        {
             if( linea.getColor().equals(color) )
            {
                System.out.println("Línea de color [" + color + "] encontrada, la devolvemos");
                return linea;
            }
        }
      
        System.out.println("Creando una línea de color [" + color + "]");
         ILineaLigera linea = new Linea( color );
         this.lineas.add( linea );
        return linea;
    }
}

