package persona;
import javax.management.Query;


public class Persona {
   private String nombre,DNI;
   private int edad;
   private char sexo= 'H' ;
   private double peso=0,altura=0; 

    public Persona(){
    this("",'H',0,0,0);
    }   

    public Persona(String nombre, char sexo, int edad) {
        this(nombre,sexo,edad,0,0);
    }
    
    
    
    public Persona(String nombre, char sexo, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        gDNi();
        this.peso = peso;
        this.altura = altura;
    }
  
    
    public int calcularMC(){
      double  ideal = peso/Math.pow(altura,2);
    if(ideal < 20){
     return -1;
    }else{if(ideal >= 25){
    return 0;
    }else{
    return 1;
    }}
    }
    
    public boolean MayorEdad(){
    if(edad >= 18){
    return true;
    }else{
    return false;
    }
      }
    
    public int calcularIMC() {
        double pesoA;
        pesoA = peso / (Math.pow(altura, 2));

        if (pesoA >= 20 && pesoA <= 25) {
            return 1;
        } else if (pesoA < 20) {
            return 2;
        } else {
            return 3;
        }
    }
    private void comprobarsexo(){
    if(sexo !='H' && sexo != 'M'){
    sexo='H';
    }
    
    } 
    
    private void gDNi(){
    int random;
    String letras[]= {"T","R","W","A","G","M","Y","F","P","D","X","B","N"
            ,"J","Z","S","Q","V","H","L","C","K","E"} ;
    random=((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000)); 
    
    DNI=letras[random%23];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", DNI=" + DNI + ", peso=" + peso + ", altura=" + altura + '}';
    }
}