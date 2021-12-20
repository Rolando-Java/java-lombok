package org.bardales.lombok.paquete.bean;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

/*anotacion que permite hacer uso del patron Builder
de la clase Aula */
@Builder
@Data
public class Aula implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String colegio;
    private String seccion;
    /*
    La anotacion declara el campo y lo inicializa con 12. Como resultado
    , si no se proporciona ningun valor para aforo durante la fase de build,
    entonces el constructor usara el valor predeterminado que es 12
     */
    @Builder.Default
    private final Integer aforo = 12;
    /*
     La anotacion permite agregar un tipo Estudiante a las lista, al hacer
     uso del patron builder. Ademas, gracias a esta anotacion, es que si quieres
     agregar una lista completa. El metodo admitira cualquier interfaz que herede de la
     clase Collection. Asimismo, esta anotacion permite que cuando no se agregue ningun
     elemento a la lista, entonces se genere por defecto una lista vacia durante el build
     */
    @Singular(value = "estudiante")
    private List<Estudiante> estudianteList;

}
