public class Vendedor{
	public Carro comprarCarro(FabricaCarros pedido){
		return pedido.crearCarro(pedido.crearMotor());
	}
}