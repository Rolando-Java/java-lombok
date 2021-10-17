package org.bardales.lombok.paquete.bean;

import lombok.*;
import java.io.Serial;
import java.io.Serializable;

@Setter
@ToString
/*esta anotacion genera un constructor de
todos los atributos final y atributos
declarados como @NonNull*/
@RequiredArgsConstructor
public class Usuario implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final Integer id;
    private final String nombre;
    @NonNull
    private Integer edad;

}