package org.bardales.lombok.paquete.bean;

import java.io.Serial;
import java.io.Serializable;
import java.util.*;

import lombok.*;

/*anotacion que permite construir el patron Builder
de la clase Aula */
@Builder
@Data
public class Aula implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String colegio;
    private final String seccion;
    @Singular(value = "estudiante")
    private final List<Estudiante> estudianteList;

}
