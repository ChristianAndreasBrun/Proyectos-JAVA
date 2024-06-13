package m03uf02.c01.p01.controller;

import m03uf02.c01.p01.model.domain.Alumno;
import m03uf02.c01.p01.view.AlumnoView;

public class AlumnoController {

	public static void main(String[] args) 
	{
		AlumnoView alumnoView = new AlumnoView();
		Alumno alumno1 = AlumnoView.getAlumno();
		Alumno alumno2 = AlumnoView.getAlumno();
		
		alumnoView.showAlumno(alumno1);
		alumnoView.showAlumno(alumno2);
	}

}
