package christian.brun.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import christian.brun.domain.Biblioteca;
import christian.brun.domain.EstadoLibro;
import christian.brun.domain.Libro;
import christian.brun.domain.Usuario;

public class TestMain {


	public static void main(String[] args) {

		// Creamos libros
		Libro libro1 = new Libro();
		libro1.setTitulo("El Quijote");
		libro1.setAutor("Miguel de Cervantes");
		libro1.setIsbn("978-84-15480-39-8");
		libro1.setEditorial("Real Academia Española");
		libro1.setNumeroPaginas((short) 1080);
		libro1.setEstado(EstadoLibro.DISPONIBLE);
		libro1.setFechaEstado(LocalDate.now());
		
		Libro libro2 = new Libro();
		libro2.setTitulo("El Principito");
		libro2.setAutor("Antoine de Saint-Exupéry");
		libro2.setIsbn("978-84-450-7692-0");
		libro2.setEditorial("Harcourt Brace & Company");
		libro2.setNumeroPaginas((short) 96);
		libro2.setEstado(EstadoLibro.DISPONIBLE);
		libro2.setFechaEstado(LocalDate.now());
		

		// Creamos usuarios
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("Juan");
		usuario1.setApellido("Pérez");
		usuario1.setDni("12345678A");
		
		Usuario usuario2 = new Usuario();
		usuario2.setNombre("María");
		usuario2.setApellido("González");
		usuario2.setDni("87654321B");

		
		
		// Creamos una biblioteca y añadimos los libros y usuarios
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.anadirLibro(libro1);
		biblioteca.anadirLibro(libro2);
		biblioteca.anadirUsuario(usuario1);
		biblioteca.anadirUsuario(usuario2);
		System.out.println("Añadimos el libro: " + libro1.getTitulo() + ", a la biblioteca");
		System.out.println("Añadimos el libro: " + libro2.getTitulo() + ", a la biblioteca");
		System.out.println("Añadimos el usuario: " + usuario1.getNombre() + ", a la lista");
		System.out.println("Añadimos el usuario: " + usuario2.getNombre() + ", a la lista");

		
		System.out.println("------------------------------------------------------------------------------------------------------------");
		
		// Biblioteca - eliminar libro
		System.out.println("Eliminamos el libro: " + libro2.getTitulo() + ", de la biblioteca");
		biblioteca.eliminarLibro(libro2);
		
		// Biblioteca - eliminar usuario
		System.out.println("Eliminamos el usuario: " + usuario1.getNombre() + " " + usuario1.getApellido()
		+ ", de la biblioteca");
		biblioteca.eliminarUsuario(usuario1);
		
		System.out.println("------------------------------------------------------------------------------------------------------------");
		
		// Biblioteca - consultar libros
		System.out.println("Libros disponibles en la biblioteca: ");
		biblioteca.getInfoLibros();
		
		System.out.println("------------------------------------------------------------------------------------------------------------");

		// Biblioteca - consultar usuarios
		System.out.println("Usuarios registrados en la biblioteca: ");
		biblioteca.getInfoUsuarios();
		
	}

}
