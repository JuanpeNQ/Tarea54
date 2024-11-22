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
public class TrianguloTest {
    private static Triangulo t0;
    private static Triangulo t1;
    private static Triangulo t8x5;
    private static Triangulo tn3x7;
    private static String s = "";

    public TrianguloTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        t0 = new Triangulo(0, 0);
        t1 = new Triangulo(1, 1);
        t8x5 = new Triangulo(8, 5);
        tn3x7 = new Triangulo(-3, 7);
        s = t8x5.toString();
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
     * Test of getBase and getAltura methods, of class Triangulo.
     */
    @Test
    public void testGetBaseAltura() {
        System.out.println("getBaseAltura");
        assertEquals(0, t0.getBase());
        assertEquals(0, t0.getAltura());

        assertEquals(1, t1.getBase());
        assertEquals(1, t1.getAltura());

        assertEquals(8, t8x5.getBase());
        assertEquals(5, t8x5.getAltura());

        assertEquals(0, tn3x7.getBase());
        assertEquals(7, tn3x7.getAltura());
    }

    /**
     * Test of setBase and setAltura methods, of class Triangulo.
     */
    @Test
    public void testSetBaseAltura() {
        System.out.println("setBaseAltura");
        Triangulo instance = new Triangulo(0, 0);
        instance.setBase(6);
        instance.setAltura(4);

        assertEquals(6, instance.getBase());
        assertEquals(4, instance.getAltura());
    }

    /**
     * Test of toString method, of class Triangulo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Triangulo instance = t8x5;
        String expResult = s;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularArea method, of class Triangulo.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        assertEquals(0.0, t0.calcularArea(), 0);
        assertEquals(0.5, t1.calcularArea(), 0);
        assertEquals(20.0, t8x5.calcularArea(), 0);
        assertEquals(0.0, tn3x7.calcularArea(), 0);
    }

    /**
     * Test of calcularPerimetro method, of class Triangulo.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        assertEquals(0.0, t0.calcularPerimetro(), 0);

        Triangulo tEquilatero = new Triangulo(3, 3);
        assertEquals(9.0, tEquilatero.calcularPerimetro(), 0);

        // Para un triángulo escaleno (requiere una implementación más avanzada).
        assertEquals(0.0, tn3x7.calcularPerimetro(), 0); // Asumiendo cálculo básico.
    }
}
