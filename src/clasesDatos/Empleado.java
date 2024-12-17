package clasesDatos;

public class Empleado {
	private String DNI;
	private String Nombre;
	private String Apellidos;
	private String Categoria;
	private boolean ClubSocial; //Indica si el empleado esta en el club social de la empresa
	private float sueldo;
	
	
	
	/**
	 * Constructor Completo
	 * @param dNI
	 * @param nombre
	 * @param apellidos
	 * @param categoria
	 * @param clubSocial
	 * @param sueldo
	 */
	public Empleado(String dNI, String nombre, String apellidos, String categoria, boolean clubSocial, float sueldo) {
		super();
		this.DNI = dNI;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Categoria = categoria;
		this.ClubSocial = clubSocial;
		this.sueldo = sueldo;
	}
	
	//Constructor vacio
	public Empleado{
		super();
		this.DNI = "";
		this.Nombre = "**********";
		this.Apellidos = "************";
		this.Categoria = "Base";
		this.ClubSocial = false;
		this.sueldo = (float)0.0;
	}
	
}
