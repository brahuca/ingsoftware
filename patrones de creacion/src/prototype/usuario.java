
package prototype;


public class usuario implements Cloneable {
    
        String nombre,apellido;
        int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    protected Object clone() {
        usuario clonusuario = new usuario();
        clonusuario.setNombre(this.getNombre());
        clonusuario.setEdad(this.getEdad());
        clonusuario.setApellido(this.getApellido());
        return clonusuario;
    }
    
    
}
