package org.bardales.lombok.bean;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/*
Haciendo uso del constructor statico con @Data en lombok
mediante la propiedad staticConstructor de la anotacion. Lo que quiere decir
que vuelve privado al constructor para que ya no puedas hacer
el típico new NombreClase()
 */
@Data(staticConstructor = "of")
public class Perro implements Serializable {

    @Serial
    private static final long seriaVlVersionUID = 1L;

    private final String nombre;
    private final String raza;
    private int edad;

}
