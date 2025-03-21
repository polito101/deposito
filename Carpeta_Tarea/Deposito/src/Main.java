
/**
 *
 * @author pobom
 *
 * La clase Main contiene el punto de entrada principal para ejecutar la aplicación,
 * gestionando las operaciones sobre una cuenta bancaria.
 *
 */
public class Main {

    /**
     * Método principal que inicializa una cuenta bancaria y realiza operaciones
     * sobre ella.
     *
     * @param args Los argumentos de la línea de comandos (no se usan en este
     * caso).
     */
    public static void main(String[] args) {
        CCuenta miCuenta;

        miCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        double saldoActual;

        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);

        operativa_cuenta(miCuenta, 1);
    }

    /**
     * Realiza operaciones de retiro e ingreso en la cuenta bancaria.
     *
     * @param miCuenta La cuenta sobre la que se realizarán las operaciones.
     * @param cantidad La cantidad de dinero a retirar o ingresar.
     */
    public static void operativa_cuenta(CCuenta miCuenta, float cantidad) {
        try {
            miCuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
