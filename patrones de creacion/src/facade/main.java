
package facade;


public class main {
	private forma circulo;
	private forma cuadrado;
	private forma rectangulo;
	public main() {
		circulo = new circulo();
		rectangulo = new rectangulo();
		cuadrado = new cuadrado();
	}
	public void dibujarcirculo(){
		circulo.dibujar();
	}
	public void dibujarrectangulo(){
		rectangulo.dibujar();
	}
	public void dibujarcuadrado(){
		cuadrado.dibujar();
	}
}

