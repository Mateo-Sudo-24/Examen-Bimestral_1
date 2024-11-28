import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nBienveido");
        System.out.println("Agregue su platillo de comida tipica favorito");
        System.out.println("\nIngrese su nombre del platillo: ");
        String nombre = sc.nextLine();
        System.out.println("\nIngrese el tipo del platillo (Seco o sopa): ");
        String tipo = sc.nextLine();
        System.out.println("\nIngrese el pais del platillo: ");
        String pais = sc.nextLine();
        System.out.println("\nIngrese la region del platillo : ");
        String region = sc.nextLine();
        System.out.println("\nIngrese la ciudad donde se creo el platillo: ");
        String ciudad = sc.nextLine();
        System.out.println("\nIngrese el año de creacion del platillo: ");
        int creacion = sc.nextInt();
        System.out.println("\nIngrese el costo del platillo por unidad: ");
        double costo = sc.nextDouble();
        Costo costo1 = new Costo();
        costo1.setNombre(nombre);
        costo1.setTipo(tipo);
        costo1.setPais(pais);
        costo1.setRegion(region);
        costo1.setCiudad(ciudad);
        costo1.setCreacion(creacion);
        costo1.setCosto(costo);

        try{
            costo1.Imprimir();
        }catch(Exception e){
            System.out.println("Ingrese adecuadamente los datos" + e.getMessage());
        }finally {
            System.out.println("Los datos fueron agregados adecuadamente");
        }

    }
}