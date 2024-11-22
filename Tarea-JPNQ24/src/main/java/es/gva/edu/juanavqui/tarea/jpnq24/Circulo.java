/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.gva.edu.juanavqui.tarea.jpnq24;

/**
 *
 * @author Juan Pedro
 */
public class Circulo implements Figura{
    private int radio;

    @Override
    public double calcularArea() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return (Math.PI*Math.pow(radio, 2));
    }

    @Override
    public double calcularPerimetro() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return (2*Math.PI*radio);
    }
    
    /**
     * Constructor
     */
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    /* Getters & Setters */

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    
    
    
    
    
}
