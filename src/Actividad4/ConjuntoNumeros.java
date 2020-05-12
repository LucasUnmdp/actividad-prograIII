package Actividad4;

public class ConjuntoNumeros implements Cloneable{
	private Numero[] celda= new Numero[100];
	private int largo;
	private String nombre;
	
	public ConjuntoNumeros(int largo, String nombre) {
		int i;
		this.largo = largo;
		this.nombre = nombre;
		for(i=0;i<this.largo;i++) {
			this.celda[i]=new Numero(0);
		}
	}
	public void cambiarNum(int numero,int celda) {
		this.celda[celda].setDato(numero);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		ConjuntoNumeros conjunto;
		int i;
		try {
			conjunto=(ConjuntoNumeros) super.clone();
			conjunto.celda=new Numero[100];
			for(i=0;i<this.largo;i++) {
				conjunto.celda[i]=new Numero(this.celda[i].getDato());
			}
		}
		catch(CloneNotSupportedException e)
		{
			conjunto=null;
		}
		return conjunto;
	}

	public Numero[] getCelda() {
		return celda;
	}
	public int getNumero(int celda) {
		return this.celda[celda].getDato();
	}
	public int getLargo() {
		return largo;
	}
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		String retorno="largo: "+this.largo+" nombre: "+this.nombre+" celdas: ";
		int i;
		for(i=0;i<this.largo;i++) {
			retorno+=this.celda[i].toString();
		}
		return retorno;
	}
	
}
