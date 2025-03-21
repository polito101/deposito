
/**
 *
 * @author pobom
 *  La clase CCuenta representa una cuenta bancaria con operaciones básicas como ingresar y retirar dinero.
 * 
 */
public class CCuenta {
    
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
      /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

      /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre El nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * Obtiene el número de cuenta.
     * 
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param cuenta El número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

     /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo El saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

      /**
     * Obtiene el tipo de interés asociado a la cuenta.
     * 
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    
    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés El tipo de interés a establecer.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

      /**
     * Constructor vacío de la clase CCuenta.
     * Este constructor crea una cuenta sin inicializar los valores.
     */
    public CCuenta()
    {
    }

    
    /**
     * Constructor de la clase CCuenta con parámetros para inicializar la cuenta.
     * 
     * @param nom El nombre del titular de la cuenta.
     * @param cue El número de cuenta.
     * @param sal El saldo inicial de la cuenta.
     * @param tipo El tipo de interés asociado a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    
    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return El saldo de la cuenta.
     */
    public double estado()
    {
        return saldo;
    }

    
    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * 
     * @param cantidad La cantidad de dinero a ingresar. Debe ser mayor que 0.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    
    /**
     * Retira una cantidad de dinero de la cuenta.
     * 
     * @param cantidad La cantidad de dinero a retirar. Debe ser mayor que 0.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
