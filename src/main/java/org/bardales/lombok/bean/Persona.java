package org.bardales.lombok.bean;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Persona implements Serializable {

    @Serial
    public static final long serialVersionUID = 1L;

    @NonNull
    private Integer id;
    @NonNull
    @EqualsAndHashCode.Exclude
    private String nombre;
    @EqualsAndHashCode.Exclude
    private Integer edad;

}
