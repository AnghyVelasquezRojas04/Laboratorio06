/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;

/**
 *
 * @author anghy
 */
public class Curso {

    private String codigo;
    private int credito;
    private String nombre;
    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;

    public Curso(String codigo, int credito, String nombre) {
        this.codigo = codigo;
        this.credito = credito;
        this.nombre = nombre;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the credito
     */
    public int getCredito() {
        return credito;
    }

    /**
     * @param credito the credito to set
     */
    public void setCredito(int credito) {
        this.credito = credito;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void agregarProfesor(Profesor profesor) {

        if (this.profesores != null && this.profesores.size() >= 0) {
            profesores.add(profesor);
        }
    }

    public void agregarEstudiante(Estudiante estudiante) {

        if (this.estudiantes != null && this.estudiantes.size() >= 0) {
            estudiantes.add(estudiante);
        }
    }

    
    public String getTexto(){
        return " Cred: " + this.credito +
               " | Codig:" + this.codigo + 
               " | Nombre:" + this.nombre;
    }
   
}
