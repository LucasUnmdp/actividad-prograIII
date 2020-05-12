package Actividad4;

public class Prueba {

	public static void main(String[] args) {
		ConjuntoNumeros c1=new ConjuntoNumeros(3,"Choto");
		ConjuntoNumeros c2=null;
		c1.cambiarNum(1, 0);
		c1.cambiarNum(2, 1);
		c1.cambiarNum(3, 2);
		try {
			c2= (ConjuntoNumeros) c1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Error al clonar");
		}
		System.out.println(c1);
		System.out.println(c2);
		c2.cambiarNum(3, 0);
		c2.cambiarNum(1, 2);
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
