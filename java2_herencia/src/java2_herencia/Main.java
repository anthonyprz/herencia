
public class Main {
	public static void main(String[] args) {
		Parque parque = new Parque();
		
		parque.setCodigoParque(545);
		parque.setNombre("central park");
		parque.setTipo("parque");
		parque.setDireccion("New York, NY");
		parque.setPoblacion("Estados Unidos");
		parque.setMetros(4000);
		
		System.out.println("codigo " + parque.getCodigoParque());
		System.out.println("nombre " + parque.getNombre());
		System.out.println("tipo" + parque.getTipo());
		System.out.println("direccion " + parque.getDireccion());
		System.out.println("poblacion " + parque.getPoblacion());
		System.out.println("metros " + parque.getMetros());
		
	}
}