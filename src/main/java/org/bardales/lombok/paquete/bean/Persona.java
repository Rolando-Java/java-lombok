package org.bardales.lombok.paquete.bean;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

/*esta anotacion genera el getter de todos los
atributos de clase*/
@Getter
/*esta anotacion genera el setter de todos los
atributos de la clase*/
@Setter
//esta anotacion genera el metodo toString
@ToString
//esta anotacion genera el metodo equals y hashCode
@EqualsAndHashCode
//esta anotacion genera un constructor vacio
@NoArgsConstructor
/*esta anotacion genera un constructor de todos los
miembros de clase*/
@AllArgsConstructor
public class Persona implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @NonNull
    private Integer id;

    @NonNull
    @EqualsAndHashCode.Exclude
    private String nombre;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Integer edad;

}
