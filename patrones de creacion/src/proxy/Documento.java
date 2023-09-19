
package proxy;


public class Documento {
      private String nombreDoc;
    private String texto;
     private ImagenProxy imgProxy;
  
     public Documento( String nombreDoc ){
        this.setNombreDoc( nombreDoc );
        this.cargarContenido();
        this.mostrar();
    }
   
    public String getNombreDoc(){
        return this.nombreDoc;
    }
  
    public void setNombreDoc( String nombreDoc ){
        this.nombreDoc = nombreDoc;
    }

    public void cargarContenido(){
        this.texto = "Texto del documento";
         this.imgProxy = new ImagenProxy( "imagen.jpg" );
        System.out.println("Documento cargado en memoria");
    }
  
    public void mostrar(){
        System.out.println("Mostrando el contenido...\n");
    }

     public void hacerScroll(){
        System.out.println("El usuario ha hecho scroll...");
         imgProxy.mostrarImagen();
    }
}

