
package bridge;


public class main {
    public static void main(String[] args)
    {

        alimento lasagna = new lasagna( new carne() );
        lasagna.obtener();
        
        lasagna.setImplementador( new verdura() );
        lasagna.obtener();
    }
}
