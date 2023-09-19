
package adapter;

public class Adapta implements adaptador{
        CajaEuros cajaEuros = new CajaEuros();
   
    public Adapta() {
    }
  
    public double getSaldo()
    {
         return this.cajaEuros.getTotalEuros();
    }
  
    @Override
     public void sacarPesetas( double pesetas )
    {
        double euros = pesetas / 166.386;
         cajaEuros.sacarEuros( euros );
    }
   
    @Override
     public void ingresarPesetas( double pesetas )
    {
        double euros = pesetas / 166.386;
         cajaEuros.ingresarEuros( euros );
    }
}

