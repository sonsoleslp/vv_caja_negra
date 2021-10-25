package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("ToString")
public class ToStringTest {

    @DisplayName("Funciona para una lista vacía")
    @Test
    void vacioToString() {
        SingleLinkedListImpl<String> lista = new SingleLinkedListImpl<>();
        assertEquals("[]", lista.toString());
    }

}
