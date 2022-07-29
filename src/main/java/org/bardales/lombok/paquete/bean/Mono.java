package org.bardales.lombok.paquete.bean;

import java.io.Serial;
import java.io.Serializable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
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
/*
 Se debe agregar callSuper = true, para que tanto el método equals como
 HashCode tomen en cuenta los atributos de la clase Padre
 */
@EqualsAndHashCode(callSuper = true)
/*
 Se debe agregar callSuper = true, para que el método toString
 tome en cuenta los atributos de la clase Padre
 */
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Mono extends Animal implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    String colorPelo;
    String tanCola;

}
