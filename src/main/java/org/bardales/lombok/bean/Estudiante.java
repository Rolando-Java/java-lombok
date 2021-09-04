package org.bardales.lombok.bean;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

//esta anotacion reune las caracteristicas
//de la antacion @ToString, @Getter, @Setter
//@RequiredArgsConstructor y @EqualsAndHashCode
@Data
public class Estudiante implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final Integer id;
    @NonNull
    private String nombre;
    @NonNull
    private Double nota;

}