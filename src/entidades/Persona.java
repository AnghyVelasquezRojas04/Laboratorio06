/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author anghy
 */
public class Persona {
    
    private String nombre;
 
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getTexto(){
        return " Nombre: " + this.nombre;
    }
}
