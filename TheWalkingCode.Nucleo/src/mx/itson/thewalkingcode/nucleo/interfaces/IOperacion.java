/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.thewalkingcode.nucleo.interfaces;

/**
 *
 * @author jesus
 */
public interface IOperacion {
    /**
     * Guarda un objeto en un txt.
     * @param tipoObjeto 0: Entrega; 1: Asignacion.
     * @param object Objeto a guardar
     */
    public void guardarObjeto(int tipoObjeto, Object object);
    /**
     * Busca en un txt por medio del id.
     * @param tipoObjeto 0: Entrega; 1: Asignacion.
     * @param id del objeto a buscar.
     * @return el Objeto encontrado o null si no se encontró nada.
     */
    public Object obtenerObjecto(int tipoObjeto, int id);
    /**
     * Valida que se cumpla una cadena de texto mediante un patrón
     * 
     * @param descripcion
     * @return El estado del patrón
     */
    public boolean validarDescripcion(String descripcion);
    /**
     * Valida que se cumpla una cadena de texto mediante un patrón
     * @param nombre
     * @return El estado del patron
     */
    public boolean validarNombreAsignacion(String nombre);
}
