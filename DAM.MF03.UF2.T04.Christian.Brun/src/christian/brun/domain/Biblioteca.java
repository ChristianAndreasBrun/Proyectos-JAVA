package christian.brun.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {

	// - Atributos
	private List<Libro> listaLibros;
	private List<Usuario> listaUsuarios;
	
	// - Constructor
	public Biblioteca() {
        listaLibros = new ArrayList<Libro>();
        listaUsuarios = new ArrayList<Usuario>();
    }
	
	
	
	
	// - METODOS -
	//añadir libro
	public void anadirLibro(Libro libro) {

		listaLibros.add(libro);
	}
	
	//eliminar libro
	public void eliminarLibro(Libro libro) {
		
		Iterator<Libro> iteradorLibros = listaLibros.iterator();
		
		while (iteradorLibros.hasNext()) 
		{
			Libro i = iteradorLibros.next();
			if (i.getIsbn().equals(libro.getIsbn()))
			{
				iteradorLibros.remove();
				break;
			}
		}
	}
	
	//añadir usuario
	public void anadirUsuario(Usuario usuario) {
		
		listaUsuarios.add(usuario);
	}
	
	//elimniar usuario
	public void eliminarUsuario(Usuario usuario) {
		
        Iterator<Usuario> iteradorUsuarios = listaUsuarios.iterator();

        while (iteradorUsuarios.hasNext()) 
        {
            Usuario i = iteradorUsuarios.next();
            if (i.getDni().equals(usuario.getDni())) 
            {
                iteradorUsuarios.remove();
                break;
            }
        }
    }
	
	//consultar libros
	public void getInfoLibros() {
	    for (Libro libro : listaLibros) 
	    {
	        System.out.println(libro.getInformacion());
	    }
	    System.out.println("Fin de la lista de libros");
	}
	
	//consultar usuarios
	public void getInfoUsuarios() {
		for (Usuario usuario : listaUsuarios)
		{
			System.out.println(usuario.getInformacion());
		}
		System.out.println("Fin de la lista de usuarios");

	}
	
}
