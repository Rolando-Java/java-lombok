package org.bardales.lombok.paquete.bean;

import java.io.Serial;
import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
/*
 @SuperBuilder es una anotacion experimental que se debe colocar
 en las clases que componen la jerarquía de herencia, para que cuando
 hagamos uso del método Builder, podamos acceder a las propiedades de
 la clase padre.
 */
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Animal implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    String nombre;
    String especie;
    String alimentacion;

}
