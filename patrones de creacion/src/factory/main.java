
package factory;

public class main {
    public static void main(String[] args) {
        pagofactory pagofactory = new pagofactory();
        pago pago = pagofactory.obtenerpago(tipopago.tarjeta);
        pago.crearpago();
    }
}
