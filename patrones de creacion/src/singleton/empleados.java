
package singleton;


public class empleados {
	private  String name;
	private  String position;
	private  String role;

    public empleados(String name, String position, String role) {
        this.name = name;
        this.position = position;
        this.role = role;
    }

    @Override
    public String toString() {
        return "empleados{" + "name=" + name + ", position=" + position + ", role=" + role + '}';
    }
	

}

