
package factory;


public class pagofactory {
    
    public pago obtenerpago(tipopago tipopago){
    return switch(tipopago){
        case efectivo -> new pagoefectivo();
        case tarjeta -> new pagotarjeta();    
    
    };
    }
}
