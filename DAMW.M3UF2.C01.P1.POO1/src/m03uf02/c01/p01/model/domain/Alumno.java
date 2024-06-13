package m03uf02.c01.p01.model.domain;

public class Alumno {

	//Constructor por defecto
//	public Alumno() 
//	{
//		
//	}
	
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private short numeroMatricula;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", numeroMatricula=" + numeroMatricula + "]";
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public short getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(short numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

}
