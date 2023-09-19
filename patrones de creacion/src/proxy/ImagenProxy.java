
package proxy;

public class ImagenProxy implements Imagen{
     private ImagenReal imagen = null;
     private String nombreImagen = "";
  
    public ImagenProxy( String nombreImagen ){
        this.nombreImagen = nombreImagen;
    }
   
    @Override
     public void mostrarImagen()
    {
        if(this.imagen == null)
        {
            this.imagen = new ImagenReal( nombreImagen );
        }
        this.imagen.mostrarImagen();
    }
}