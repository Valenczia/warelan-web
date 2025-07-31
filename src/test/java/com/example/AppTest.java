package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void pruebaSumaBasica() {
        int resultado = 2 + 1;
        assertEquals(3, resultado, "La suma debe ser 3");
    }
}
