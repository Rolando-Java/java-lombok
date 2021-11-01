package org.bardales.lombok.paquete;

import lombok.extern.log4j.Log4j2;
import org.bardales.lombok.paquete.bean.*;

import java.util.HashSet;
import java.util.Set;

//esta anotacion instancia la clase de Log4j2
@Log4j2
public class EjemploLombok {


    public static void main(String... args) {
        //Creacion de objeto Persona
        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("susan");
        persona.setEdad(20);
        String nombre = persona.getNombre();
        int edad = persona.getEdad();
        System.out.printf("Nombre: %s, Edad: %s\n", nombre, edad);
        System.out.println(persona);
        LOG.info("Se creo objeto persona {}", persona);

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
        Persona personaCuatro = new Persona(1, "lucas", null);
        LOG.info("Se creo objeto personaCuatro {}", personaCuatro);

        //Creacion de objeto Usuario
        Usuario usuario = new Usuario(2, "lucas", 15);
        usuario.setEdad(15);
        LOG.info("Se creo objeto usuario {} ", usuario);

        //Creacion de objeto Estudiante
        Estudiante estudiante = new Estudiante(1, "Leo", 2D);
        LOG.info("Se creo objeto estudiante {}", estudiante);

        estudiante.setNota(18.5);
        double nota = estudiante.getNota();
        System.out.println("Nota: " + nota);

        //Lista de estudiantes
        Set<Estudiante> estudianteList = new HashSet<>();
        estudianteList.add(estudiante);
        estudianteList.add(new Estudiante(2, "Miguel", 14.5));
        estudianteList.add(new Estudiante(3, "Javier", 16.5));
        estudianteList.add(new Estudiante(3, "Javier", 16.5));
        LOG.info("Se creo lista estudiante {}", estudianteList);

        //Creando objetos Aula con el patron Builder de lombok
        Aula aula = Aula.builder().colegio("Santarder").seccion("SecionA")
                .estudiante(new Estudiante(1, "Lucas", 18.0))
                .estudiante(new Estudiante(2, "Mateo", 17.5))
                .build();
        System.out.println("seccion: " + aula.getSeccion());
        LOG.info("Se creo aula {}", aula);

        Aula aulaDos = Aula.builder().colegio("SAnMiguel").seccion("SecionB")
                .estudianteList(estudianteList)
                .build();
        System.out.println("aulaDos = " + aulaDos);
        LOG.info("Se creo aulados {}", aulaDos);

        //Creación de objeto Auto
        Auto auto = Auto.of();
        auto.setMarca("Toyota");
        auto.setNumRuedas(4);
        auto.setVelocidad(50.45);
        LOG.info("Se creo auto {}", auto);

        //Creación de segundo objeto Auto
        Auto autoDos = Auto.of("Copeable", 6, 30.5);
        LOG.info("Se creo autodos {}", autoDos);

        //Creación de objeto Perro
        Perro perro = Perro.of("rufuz", "dalmata");
        perro.setEdad(3);
        LOG.info("Se creo perro {}", perro);

        //lombok en enums
        Constantes.Color colorAzul = Constantes.Color.AZUL;
        LOG.info("color {}", colorAzul.getValue());

    }

}
