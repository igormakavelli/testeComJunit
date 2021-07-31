package com.teste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import jdk.jfr.Timestamp;

import org.junit.Test;


public class testeCalculadora
{
 
@BeforeAll
public static void setup(){
    calculadoraSimples = new calculadora();
}

    @Test
    public void somarDoisNumerosResultado5()
    {  
        assertEquals(5.0,calculadoraSimples.soma(2,3));
    }

@Test
public void subtrairDoisNumerosResultado1(){
    assertEquals(1.0,calculadoraSimples.subtrai(5,4));
}



}
