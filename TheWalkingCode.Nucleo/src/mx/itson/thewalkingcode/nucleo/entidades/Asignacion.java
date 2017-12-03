/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.thewalkingcode.nucleo.entidades;

import java.util.Date;

/**
 *
 * @author jesus
 */
public class Asignacion {
    private int idAsignacion;
    private String nombreProfesor;
    private String nombreAsignacion;
    private String descripcion;
    private Date fechaLimite;

    /**
     * @return the idAsignacion
     */
    public int getIdAsignacion() {
        return idAsignacion;
    }

    /**
     * @param idAsignacion the idAsignacion to set
     */
    public void setIdAsignacion(int idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    /**
     * @return the nombreAsignacion
     */
    public String getNombreAsignacion() {
        return nombreAsignacion;
    }

    /**
     * @param nombreAsignacion the nombreAsignacion to set
     */
    public void setNombreAsignacion(String nombreAsignacion) {
        this.nombreAsignacion = nombreAsignacion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fechaLimite
     */
    public Date getFechaLimite() {
        return fechaLimite;
    }

    /**
     * @param fechaLimite the fechaLimite to set
     */
    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    /**
     * @return the nombreProfesor
     */
    public String getNombreProfesor() {
        return nombreProfesor;
    }

    /**
     * @param nombreProfesor the nombreProfesor to set
     */
    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }
    
}
