public class Comida {
    private String nombre;
    private String tipo;


    public Comida(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;

    }

    public Comida() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    //Metodo Personañizado

    public void Imprimir(){
        System.out.println("El nombre del platillo es: " + getNombre());
        System.out.println("El tipo del platillo es: " + getTipo());
      }
}
