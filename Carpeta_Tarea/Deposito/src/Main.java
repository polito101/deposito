
public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;

        miCuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        double saldoActual;
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);
        
        operativa_cuenta(miCuenta, 1);
    }

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
