package ar.com.codoacodo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola mundo");
		
		//voy a crear una instancia de la clase Auto
		
		Auto miPrimerAuto = new Auto(); //nace mi auto
		//aca ya puedo usar los metodos de ese auto
		
		/*Auto miSegundoAuto;//defini un objeto (no nacio) reserva memoria
		miSegundoAuto = new Auto();//nace el objeto
		*/
		miPrimerAuto.mostrarInfo();

		//ejecutar el metodo encender()
		miPrimerAuto.encender();
		
		miPrimerAuto.mostrarInfo();
	}

}
