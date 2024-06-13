package m03uf02.c01.p01.view;

import java.util.Scanner;

import m03uf02.c01.p01.model.domain.Alumno;

public class AlumnoView {

	public static Alumno getAlumno()
	{
		Alumno alumno = new Alumno();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca DNI: ");
		alumno.setDni(scanner.next());
		
		System.out.println("Introduzca Nombre: ");
		alumno.setNombre(scanner.next());
		
		System.out.println("Introduzca Apellido 1: ");
		alumno.setApellido1(scanner.next());
		
		System.out.println("Introduzca Apellido 2: ");
		alumno.setApellido2(scanner.next());
		
		System.out.println("Introduzca N.Matricula: ");
		alumno.setNumeroMatricula(scanner.nextShort());
		
		
		scanner.close();
		
		System.out.println(alumno.toString());
		return alumno;
	}
	
	public void showAlumno(Alumno alumno) 
	{
		System.out.println(alumno);
	}
}
