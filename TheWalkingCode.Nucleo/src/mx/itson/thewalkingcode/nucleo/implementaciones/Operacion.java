/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.thewalkingcode.nucleo.implementaciones;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mx.itson.thewalkingcode.nucleo.entidades.Asignacion;
import mx.itson.thewalkingcode.nucleo.entidades.Entrega;
import mx.itson.thewalkingcode.nucleo.interfaces.IOperacion;

/**
 *
 * @author jesus
 */
public class Operacion implements IOperacion {

    String ruta1 = "Entrega.txt", ruta2 = "Asigancion.txt";
    int i = 0, j = 0;

    /**
     * Guarda un objeto en un txt.
     *
     * @param tipoObjeto 0: Entrega; 1: Asignacion.
     * @param object
     */
    @Override
    public void guardarObjeto(int tipoObjeto, Object object) {
        Gson gson = new Gson();
        FileWriter fw = null;
        PrintWriter pw = null;
        File file = null;
        if (tipoObjeto == 0) {
            file = new File(ruta1);
            if (file.exists()) {
                i = 0;
                FileReader fr = null;
                BufferedReader br = null;
                try {
                    fw = new FileWriter(ruta1, true);
                    fr = new FileReader(file);
                    br = new BufferedReader(fr);
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        i++;
                    }
                } catch (Exception e) {
                } finally {
                    try {
                        if (null != fr) {
                            fr.close();
                        }
                    } catch (Exception e2) {
                    }
                }
            } else {
                try {
                    fw = new FileWriter(ruta1);
                } catch (IOException ex) {
                }
            }
            try {
                pw = new PrintWriter(fw);
                Entrega entrega = (Entrega)object;
                entrega.setIdEntrenga(i);
                pw.println(gson.toJson(entrega));
            } catch (Exception e) {
            } finally {
                try {
                    if (null != fw) {
                        fw.close();
                    }
                } catch (Exception e2) {
                }
            }
        } else {
            file = new File(ruta2);
            if (file.exists()) {
                j = 0;
                FileReader fr = null;
                BufferedReader br = null;
                try {
                    fw = new FileWriter(ruta2, true);
                    fr = new FileReader(file);
                    br = new BufferedReader(fr);
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        j++;
                    }
                } catch (Exception e) {
                } finally {
                    try {
                        if (null != fr) {
                            fr.close();
                        }
                    } catch (Exception e2) {
                    }
                }
            } else {
                try {
                    fw = new FileWriter(ruta2);
                } catch (IOException ex) {
                }
            }
            try {
                pw = new PrintWriter(fw);
                Asignacion asignacion = (Asignacion)object;
                asignacion.setIdAsignacion(j);
                pw.println(gson.toJson(asignacion));
            } catch (Exception e) {
            } finally {
                try {
                    if (null != fw) {
                        fw.close();
                    }
                } catch (Exception e2) {
                }
            }
        }
    }
    /**
     * Busca en un txt por medio del id.
     * @param tipoObjeto 0: Entrega; 1: Asignacion.
     * @param id del objeto a buscar.
     * @return el Objeto encontrado o null si no se encontró nada.
     */
    @Override
    public Object obtenerObjecto(int tipoObjeto, int id) {
        Gson gson = new Gson();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Object object = null;
        if (tipoObjeto == 0) {
            try {
            archivo = new File(ruta1);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                Entrega tempEntrega = gson.fromJson(linea, Entrega.class);
                if (tempEntrega.getIdEntrenga() == id) {
                    object = tempEntrega;
                    break;
                }
            }
        } catch (Exception e) {
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
            }
        }
        }else{
            try {
            archivo = new File(ruta2);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                Asignacion tempAsignacion = gson.fromJson(linea, Asignacion.class);
                if (tempAsignacion.getIdAsignacion() == id) {
                    object = tempAsignacion;
                    break;
                }
            }
        } catch (Exception e) {
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
            }
        }
        }
        return object;
    }

   @Override
    public boolean validarDescripcion(String descripcion) {
        Pattern pat = Pattern.compile("^A-Za-z{100}$");
        Matcher mat = pat.matcher(descripcion);
        return mat.find();
    }
    @Override
    public boolean validarNombreAsignacion(String nombre) {
       Pattern pat = Pattern.compile("^\\w{20}$");
       Matcher mat = pat.matcher(nombre);
       return mat.find();
    }

   
 
    
}
