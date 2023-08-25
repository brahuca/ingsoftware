
package cuenta;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        String t;
        double i,j; 
        Cuenta cuenta1 =new Cuenta (0.00,"");
        Scanner n= new Scanner (System.in);
          
    System.out.println("ingrese nombre de la cuenta");
    cuenta1.setTitular(n.nextLine());
    
    System.out.println("ingrese la cantidad ");
    i=n.nextDouble();
    if(i>0){
    cuenta1.setCantidad(i);
    }
     System.out.println("cantidad actual \n "+cuenta1.getCantidad());
    
    System.out.println("ingrese la cantidad que retirara");
    j=n.nextDouble();
    
    if(j>i){
    i=0.00;
    }else{
    i=i-j;
    }
    cuenta1.setCantidad(i);
    
        System.out.println(cuenta1);
    }
}

