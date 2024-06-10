package es.dsw.app;

import es.dsw.models.Alumno;
import es.dsw.models.Profesor;

public class Actividad7Application {

	public static void main(String[] args) {

		System.out.println("##################################################");
		System.out.println("########                                 #########");
		System.out.println("########       Actividad Práctica 7      #########");
		System.out.println("########                                 #########");
		System.out.println("########      El control de versiones    #########");
		System.out.println("########                                 #########");
		System.out.println("##################################################");
		
		Profesor objProfesor = new Profesor("Pepito","Pérez","Sánchez","44332234L");
		System.out.println("El nuevo profesor se llama " + objProfesor.getNombre());

		Alumno objAlumno = new Alumno ("Pepita", "Sánchez", "Martín", "44332234L");
		System.out.println("El nuevo alumno se llama " + objAlumno.getNombre());


		
	}

}
