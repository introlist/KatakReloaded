/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;

import Negocio.Entidades.Producto;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;



/**
 *
 * @author DEMON
 */
public class AccesoDatosProductos extends AccesoDatos<Producto>{
     
    public List<Producto> getPorNombre(String inputNombre) {
        String NOMBRE_COLUMNA = "nombre";
        List<Producto> productoExistente = null;
        
        try {
            iniciarTransaccion();
            String SentenciaBusqueda = "SELECT * FROM productos WHERE " + NOMBRE_COLUMNA + " REGEXP"
                    + "'^" + inputNombre + "'";
            Query query = sesion.createSQLQuery(SentenciaBusqueda).addEntity(getTipoClase());
            productoExistente = query.list();
        } catch (HibernateException excepcion) {
            manejarExcepcionHibernate(excepcion);
            throw excepcion;
        } finally {
            terminarTransaccion();
        }
        
        return productoExistente;
    }
    
     public List<Producto> getPorDisponibilidad(boolean esDisponible) {
        List<Producto> clienteExistente = null;
        char estadoDisponibilidad;
        if(esDisponible){
            estadoDisponibilidad = 'T';
        }else{
            estadoDisponibilidad = 'F';
        }
        
        try {
            iniciarTransaccion();
            Query query = sesion.createSQLQuery(
                    sentenciaBusquedaPendiente(estadoDisponibilidad)
            ).addEntity(getTipoClase());
            clienteExistente = query.list();
        } catch (HibernateException exception) {
            manejarExcepcionHibernate(exception);
            throw exception;
        } finally{
            terminarTransaccion();
        }
        return clienteExistente;
    }

    private String sentenciaBusquedaPendiente(char esDisponible) {
        String SentenciaBusqueda = "SELECT * FROM productos WHERE producto_disponible REGEXP"
                + "'^" + esDisponible + "'";
        return SentenciaBusqueda;
    }
    
    @Override
    protected Class getTipoClase() {
        return Producto.class;
    }
}
