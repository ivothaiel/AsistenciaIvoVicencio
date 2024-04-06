package ar.edu.unju.fi.main;
import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNotas;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
        //NOS PIDEN PARA EL ALUMNO VICENCIO SE REGISTRE LAS NOTAS FINALES DE 4 MATERIAS
        
        Alumno alumno = new Alumno();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el legajo");
        Integer legajo = scanner.nextInt();
        System.out.println("Ingrese el apellido");
        String apellido = scanner.next();
        System.out.println("Ingrese el nombre");
        String nombre = scanner.next();
        
        alumno.setLegajo(legajo);
        alumno.setApellido(apellido);
        alumno.setNombre(nombre);
        
        System.out.println(alumno.toString());
        
        int numMaterias = 1;
        
        while(numMaterias <=4) {
        	//cargando materias
        	System.out.println("Ingrese el codigo de la materia");
        	String codigoMateria = scanner.next();
        	System.out.println("Ingrese el nombre de la materia");
        	String nombreMateria = scanner.next();
        	

			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el codigo del registro");
        	String codigoNota = scanner.next();
        	System.out.println("Ingrese la nota final");
        	Float notafinal = scanner.nextFloat();
        	
        	
        	RegistroNotas registroNota = new RegistroNotas(codigoNota, alumno, materia, notafinal);
        	
        	System.out.println(registroNota.toString()); 
        	numMaterias++;
        } 
        
     
        
        
	}

}
