package org.bardales.lombok.paquete.bean;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class Constantes {

    //no es necesario agregar el acceso privado del constructor enum
    @RequiredArgsConstructor
    @Getter
    public enum Color {
        AZUL("azul"),
        VERDE("verde"),
        ROJO("rojo");

        private final String value;
    }

}
