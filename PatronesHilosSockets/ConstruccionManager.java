//Maneja la entrada del usuario para construir una casa o apartamento utilizando el patrón Builder. Usa el patrón Strategy para construir las ventanas con diferentes estilos.
import java.util.Scanner;

public class ConstruccionManager implements Runnable {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de construcción:");
        System.out.println("1. Casa");
        System.out.println("2. Apartamento");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        ConstruccionBuilder builder = null;

        if (tipo == 1) {
            builder = new ConstruccionBuilder("casa");
        } else if (tipo == 2) {
            builder = new ConstruccionBuilder("apartamento");
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        Construccion construccion = builder.getConstruccion();

        System.out.println("Ingrese el material de las paredes:");
        String paredes = scanner.nextLine();
        builder.setParedes(paredes);

        System.out.println("Ingrese el material del techo:");
        String techo = scanner.nextLine();
        builder.setTecho(techo);

        System.out.println("Ingrese el material de las puertas:");
        String puertas = scanner.nextLine();
        builder.setPuertas(puertas);

        System.out.println("Ingrese el material de las ventanas:");
        String materialVentanas = scanner.nextLine();

        System.out.println("Seleccione el estilo de ventanas:");
        System.out.println("1. Tradicional");
        System.out.println("2. Moderno");
        int estiloVentanas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        ConstruccionVentanasStrategy ventanasStrategy;
        if (estiloVentanas == 1) {
            ventanasStrategy = new VentanasEstiloTradicionalStrategy();
        } else {
            ventanasStrategy = new VentanasEstiloModernoStrategy();
        }
        ventanasStrategy.construirVentanas(construccion, materialVentanas);

        System.out.println("Ingrese el número de habitaciones:");
        int habitaciones = scanner.nextInt();
        builder.setHabitaciones(habitaciones);

        System.out.println("Ingrese el número de toilets:");
        int toilets = scanner.nextInt();
        builder.setToilets(toilets);

        if (tipo == 1) {
            System.out.println("¿Tiene jardín? (true/false):");
            boolean tieneJardin = scanner.nextBoolean();
            builder.setJardin(tieneJardin); // Corrección aquí
        } else if (tipo == 2) {
            System.out.println("Ingrese el número de piso:");
            int numeroPiso = scanner.nextInt();
            builder.setNumeroPiso(numeroPiso);
        }

        construccion.mostrarDetalles();

        scanner.close();
    }
}
