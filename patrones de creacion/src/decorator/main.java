
package decorator;


    public class main  {
private String empleado;
public main(String empleado){
	this.empleado = empleado;
}
public String getName(){
	
	String name = empleado;
	
	name = Character.toUpperCase(name.charAt(0)) 
	+ name.substring(1, name.length());
	return name;
}
}

