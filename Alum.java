package alumno;

public class Alum {
	public String nombre;
	public String apellido;
	public int legajo;
	public int notaMat;
	public int notaLen;
	public int notaProg;
	public float prome;
	
	public Alum (String nom, int lega)
	{
		nombre = nom;
		legajo = lega;
	}
	
/*1-Si el promedio es menor a 6 entonces debe aparecer el texto "El alumno no est� aprobado".
2-Si alguna de las materias tiene un puntaje menor a 6 debe aparecer el texto "El alumno tiene materias sin aprobar".
3-Si el promedio es mayor a 9 entonces debe aparecer la leyenda "Es un alumno destacado".*/
	
	 public void mostrarInfo (int notaM, int notaL, int notaProg)
	 {
		 prome = (notaM+notaL+notaProg)/3;
		 System.out.println("-->Nombre: " + nombre + ", Legajo: " + legajo);
		 System.out.println("Promedio: "+ prome);
		 if(prome<6)
	      {
	        System.out.println("El alumno no esta aprobado");
	      }
	      if(prome>9)
	      {
	        System.out.println("El alumno es destacado");
	      }
	      if(notaL <6 || notaM<6 || notaProg<6)
	      {
	        System.out.println("El alumno tiene materias sin probar");
	      }
	 }
}
