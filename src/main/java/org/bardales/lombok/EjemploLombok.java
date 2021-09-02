package org.bardales.lombok;

import lombok.extern.log4j.Log4j2;
import org.bardales.lombok.bean.Persona;

import java.util.HashSet;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//@Log4j2
public class EjemploLombok {

    private static final Logger LOGGER = LogManager.getLogger(EjemploLombok.class);

    public static void main(String... args){
	System.out.println("Hola mundo");
	Persona persona = new Persona();
	persona.setId(1);
	persona.setNombre("susan");
	persona.setEdad(20);
	String nombre = persona.getNombre();
	int edad = persona.getEdad();
	System.out.printf("Nombre: %s, Edad: %s\n",nombre, edad);
	System.out.println(persona);
	LOGGER.info("Se creo el objeto persona: {}", () -> persona);

	//Lista de personas
	Set<Persona> personas = new HashSet<>();
	Persona personaUno = new Persona(1, "susan", 15);
	Persona personaDos = new Persona(2, "lucas", 19);
	Persona personaTres = new Persona(3, "felipe", 20);

	personas.add(personaUno);
	personas.add(personaDos);
	personas.add(personaTres);
	personas.add(new Persona(2, "feliper4", 19));

	personas.forEach(System.out::println);

	//Validando la no nulidad de los campos
	Persona personaCuatro = new Persona(1,"lucas",null);
	System.out.println("personaCuatro: " + personaCuatro);


    }

}