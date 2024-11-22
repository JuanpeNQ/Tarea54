/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package es.gva.edu.juanavqui.tarea.jpnq24;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Juan Pedro
 */
public class CirculoTest {
    private static Circulo c0;
    private static Circulo c1;
    private static Circulo c8;
    private static Circulo cn5;
    private static String s = "";

    public CirculoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        c0 = new Circulo(0);
        c1 = new Circulo(1);
        c8 = new Circulo(8);
        cn5 = new Circulo(-5);
        s = c8.toString();
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getRadio method, of class Circulo.
     */
    @Test
    public void testGetRadio() {
        System.out.println("getRadio");
        assertEquals(0, c0.getRadio());
        assertEquals(1, c1.getRadio());
        assertEquals(8, c8.getRadio());
        assertEquals(0, cn5.getRadio());
    }

    /**
     * Test of setRadio method, of class Circulo.
     */
    @Test
    public void testSetRadio() {
        System.out.println("setRadio");
        Circulo instance = new Circulo(0);
        instance.setRadio(10);
        assertEquals(10, instance.getRadio());
    }

    /**
     * Test of toString method, of class Circulo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Circulo instance = c8;
        String expResult = s;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularArea method, of class Circulo.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        assertEquals(0.0, c0.calcularArea(), 0);
        assertEquals(Math.PI, c1.calcularArea(), 0);
        assertEquals(64 * Math.PI, c8.calcularArea(), 0);
        assertEquals(0.0, cn5.calcularArea(), 0);
    }

    /**
     * Test of calcularPerimetro method, of class Circulo.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        assertEquals(0.0, c0.calcularPerimetro(), 0);
        assertEquals(2 * Math.PI, c1.calcularPerimetro(), 0);
        assertEquals(16 * Math.PI, c8.calcularPerimetro(), 0);
        assertEquals(0.0, cn5.calcularPerimetro(), 0);
    }
}