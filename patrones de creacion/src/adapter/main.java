
package adapter;


public class main {
   public static void main(String[] args)
    {
         Adapta conversor = new Adapta();
        conversor.ingresarPesetas( 2000 );
        conversor.ingresarPesetas( 5000 );
        conversor.ingresarPesetas( 1000 );
        System.out.println( "Total euros: " + conversor.getSaldo() );
    }
}
