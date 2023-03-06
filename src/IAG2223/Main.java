
package IAG2223;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoIAG2223 miVehiculoIAG2223;
        int stockActual;
        
        miVehiculoIAG2223 = new VehiculoIAG2223("Seat",18000,100);
        operativaVehiculosIAG2223(miVehiculoIAG2223, 50); 
        stockActual = miVehiculoIAG2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operativaVehiculosIAG2223(VehiculoIAG2223 miVehiculoIAG2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoIAG2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoIAG2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
