//construcción de estrategias -- base patron Strategy
public class VentanasEstiloTradicionalStrategy implements ConstruccionVentanasStrategy {

    public void construirVentanas(Construccion construccion, String material) {
        MaterialInterface ventanas = new Ventanas(material);
        construccion.setVentanas(ventanas);
        System.out.println("Construcción de ventanas tradicionales con material: " + material);
    }
}
