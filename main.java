package principal;

import alumno.Alum;

public class main {

	public static void main (String[] args) {
	    Alum miAlu1 = new Alum("Luz",111);
	    Alum miAlu2 = new Alum("Leo",222);
	    Alum miAlu3 = new Alum("Lila",333);
	    Alum miAlu4 = new Alum("Luis",444);
	    Alum miAlu5 = new Alum("Leon",555);
	    
	    miAlu1.mostrarInfo(10, 10, 10);
	    miAlu2.mostrarInfo(10,8,4);
	    miAlu3.mostrarInfo(1, 3, 4);
	    miAlu4.mostrarInfo(9, 4, 5);
	    miAlu5.mostrarInfo(7, 6, 4);
	    
	    
	}

}
