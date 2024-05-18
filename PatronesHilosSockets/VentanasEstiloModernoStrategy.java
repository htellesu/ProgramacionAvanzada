public class VentanasEstiloModernoStrategy implements ConstruccionVentanasStrategy {

    public void construirVentanas(Construccion construccion, String material) {
        VentanasNuevas ventanasNuevas = new VentanasNuevas(material);
        MaterialInterface ventanas = new VentanasAdapter(ventanasNuevas);
        construccion.setVentanas(ventanas);
        System.out.println("Construcción de ventanas modernas con material: " + material);
    }
}