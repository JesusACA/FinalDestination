/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.thewalkingcode.nucleo.entidades;

import java.io.File;
import java.util.Date;
import mx.itson.thewalkingcode.nucleo.enumeradores.Estado;

/**
 *
 * @author jesus
 */
public class Entrega {
    private int idEntrenga;
    private String nombreEstudiante;
    private int idAsignacion;
    private String descripcion;
    private Date horaEntrega;
    private File archivo;
    private Estado estado;

    /**
     * @return the idEntrenga
     */
    public int getIdEntrenga() {
        return idEntrenga;
    }

    /**
     * @param idEntrenga the idEntrenga to set
     */
    public void setIdEntrenga(int idEntrenga) {
        this.idEntrenga = idEntrenga;
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
     * @return the horaEntrega
     */
    public Date getHoraEntrega() {
        return horaEntrega;
    }

    /**
     * @param horaEntrega the horaEntrega to set
     */
    public void setHoraEntrega(Date horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    /**
     * @return the archivo
     */
    public File getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     */
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

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
     * @return the nombreEstudiante
     */
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    /**
     * @param nombreEstudiante the nombreEstudiante to set
     */
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
    
   
}
