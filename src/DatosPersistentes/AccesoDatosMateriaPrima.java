/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;

import Negocio.Entidades.Cliente;
import Negocio.Entidades.MateriaPrima;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author Bernardo Espinoza
 */
public class AccesoDatosMateriaPrima extends AccesoDatos<MateriaPrima>{
    
    public List<MateriaPrima> getPorNombre(String inputNombre) {
        String NOMBRE_COLUMNA = "nombre";
        List<MateriaPrima> materiaPrimaExistente = null;
        
        try {
            iniciarTransaccion();
            Query query = sesion.createSQLQuery(
                    SentenciaBusquedaNombre(NOMBRE_COLUMNA, inputNombre)
            ).addEntity(getTipoClase());
            materiaPrimaExistente = query.list();
        } catch (HibernateException exception) {
            manejarExcepcionHibernate(exception);
            throw exception;
        } finally{
            terminarTransaccion();
        }
        return materiaPrimaExistente;
    }
    
    private String SentenciaBusquedaNombre(String NOMBRE_COLUMNA, String inputNombre) {
        String SentenciaBusqueda = "SELECT * FROM materia_prima WHERE " 
                + NOMBRE_COLUMNA + " REGEXP"
                + "'^" + inputNombre + "'";
        return SentenciaBusqueda;
    }

    @Override
    protected Class getTipoClase() {
        return MateriaPrima.class;
    }
    
}
