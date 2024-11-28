public class Costo extends Platillo_Region{
    private double costo;

    public Costo(String nombre, String tipo, String pais, String region, int creacion, double costo) {
        super(nombre, tipo, pais, region, creacion);
        this.costo = costo;
    }

    public Costo(String pais, String region, int creacion, double costo) {
        super(pais, region, creacion);
        this.costo = costo;
    }

    public Costo() {
     super();
    }

    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("El costo del platillo es: " + getCosto());
    }
}
