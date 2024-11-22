/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.gva.edu.juanavqui.tarea.jpnq24;

/**
 *
 * @author Juan Pedro
 */
public class Triangulo implements Figura{
    private int base, altura;

    @Override
    public double calcularArea() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return (base * altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double hipotenusa=Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return (base + altura + hipotenusa);
    }
    
    /**
     * Constructor 
     */
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /* Getters & Setters */

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}

