public class Comida_Tipica extends Comida{
    private String pais;

    public Comida_Tipica(String nombre, String tipo, String pais) {
        super(nombre, tipo);
        this.pais = pais;
    }

    public Comida_Tipica(String pais) {
        this.pais = pais;
    }
    public Comida_Tipica() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
        System.out.println("El pais de este platillo es: "+getPais());
    }
}
