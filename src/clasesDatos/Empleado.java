package clasesDatos;

public class Empleado {
	private String DNI;
	private String Nombre;
	private String Apellidos;
	private String Categoria;
	private boolean ClubSocial; //Indica si el empleado esta en el club social de la empresa
	private float sueldo;
	/**
	 * @param dNI
	 * @param nombre
	 * @param apellidos
	 * @param categoria
	 * @param clubSocial
	 * @param sueldo
	 */
	public Empleado(String dNI, String nombre, String apellidos, String categoria, boolean clubSocial, float sueldo) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Categoria = categoria;
		ClubSocial = clubSocial;
		this.sueldo = sueldo;
	}
	public Empleado(String dNI, String nombre, String apellidos) {
		// TODO Auto-generated constructor stub
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public boolean isClubSocial() {
		return ClubSocial;
	}
	public void setClubSocial(boolean clubSocial) {
		ClubSocial = clubSocial;
	}
	
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public void setClubSocial() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Empleado [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Categoria=" + Categoria
				+ ", ClubSocial=" + ClubSocial + ", sueldo=" + sueldo + "]";
	}
}
	
	
	
	
	
	
