public class Platillo_Region extends Comida_Tipica{
    private String region;
    private String ciudad;
    private int creacion;

    public Platillo_Region(String nombre, String tipo, String pais, String region, int creacion) {
        super(nombre, tipo, pais);
        this.region = region;
        this.creacion = creacion;
    }

    public Platillo_Region(String pais, String region, int creacion) {
        super(pais);
        this.region = region;
        this.creacion = creacion;
    }

    public Platillo_Region() {
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCreacion() {
        return creacion;
    }

    public void setCreacion(int creaacion) {
        this.creacion = creaacion;
    }


    @Override
    public void Imprimir(){
        super.Imprimir();
        System.out.println("La region de este platillo es: "+getRegion());
        System.out.println("La ciudad de este platillo es: "+getCiudad());
        System.out.println("El año de creacion de este  platillo es: "+getCreacion());
    }
}
