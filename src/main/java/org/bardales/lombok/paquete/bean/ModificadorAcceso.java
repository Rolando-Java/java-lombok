package org.bardales.lombok.paquete.bean;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/*
esta anotacion permite agregar modificadores de acceso
(public, private o protected) a cada campo en la clase
o enumeracion anotada
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@ToString
public class ModificadorAcceso {

    String nombre;
    Integer edad;

}
