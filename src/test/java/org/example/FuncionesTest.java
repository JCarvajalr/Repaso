package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import static org.junit.jupiter.api.Assertions.*;


class FuncionesTest {

    Funciones funciones;

    @BeforeEach
    void setUp (){
        funciones = new Funciones();
    }

    @Test
    void sumarTest(){
        Assertions.assertEquals(4, Funciones.sumar(2, 2));
    }

}