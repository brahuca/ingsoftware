
package cuenta;

public class Cuenta {

double cantidad;
  String titular;  
  
public Cuenta(double cantidad, String titular) {
        this.cantidad = cantidad;
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "el titular " +titular + " tiene en la cuenta " + cantidad ;
    }


    }
    