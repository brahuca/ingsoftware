
package proxy;

public class main {
      public static void main( String[] args ){
       
         Documento doc = new Documento( "Presupuesto.doc");
        try{     
        Thread.sleep( 3000 );
        doc.hacerScroll();
        }
        catch( Exception e ){
            System.out.println("Ha ocurrido un error");
        }
    }
}

