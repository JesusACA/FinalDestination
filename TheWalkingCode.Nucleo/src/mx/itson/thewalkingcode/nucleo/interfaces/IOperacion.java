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
     * @param tipoObjeto 0: Cuenta; 1: Entrega; 2: Asignacion.
     * @param object
     */
    public void guardarObjeto(int tipoObjeto, Object object);
}
