
package persona;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        String nombre;
        int edad;
        char sexo;
        double peso,altura;
        Scanner n= new Scanner (System.in);
        System.out.println("ingrese el nombre");
        nombre=n.nextLine();
        System.out.println("ingrese la edad");
        edad=n.nextInt();
        System.out.println("ingrese el sexo");
        sexo= n.next().charAt(0);
        System.out.println("ingrese el peso");
        peso=n.nextDouble();
        System.out.println("ingrese la altura");
        altura=n.nextDouble();
     
        Persona persona1 = new Persona(nombre, sexo, edad, peso, altura);
        Persona persona2 = new Persona(nombre, sexo,edad);
        Persona persona3 = new Persona();
        
        
        System.out.println(persona1);
        muestraedad(persona1);
        compeso(persona1);
        System.out.println(persona2);
        muestraedad(persona2);
        compeso(persona2);
        System.out.println(persona3);
        muestraedad(persona3);
        compeso(persona3);
    }
    public static void compeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case 1:
                System.out.println("La persona esta en su peso ideal");
                break;
            case 2:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case 3:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }
    public static void muestraedad(Persona p) {
 
        if (p.MayorEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
}
}
