package org.bardales.lombok.bean;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/*
Haciendo uso de los constructores staticos en lombok
mediante la propiedad staticName de la anotacion. Lo que quiere decir
que vuelve privado al constructor para que ya no puedas hacer
el típico new NombreClase()
 */
@Data
@NoArgsConstructor(staticName = "of")
@AllArgsConstructor(staticName = "of")
public class Auto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String marca;
    private Integer numRuedas;
    private Double velocidad;

}
