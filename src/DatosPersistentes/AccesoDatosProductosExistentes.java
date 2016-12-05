/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;

import Negocio.Entidades.ProductosExistentes;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/********************************************************************** 
 
    CLASE: {@link AccesoDatosProductosExistentes}
    
    AUTOR: Mario Lopez Duran

 **********************************************************************/
public class AccesoDatosProductosExistentes extends AccesoDatos<ProductosExistentes>{
    
    
    public List<ProductosExistentes> getPorNombre(String inputNombre) {
        String NOMBRE_COLUMNA = "nombre";
        List<ProductosExistentes> productosExistentes = null;
        
        try {
            iniciarTransaccion();
            String SentenciaBusqueda = "SELECT * FROM productosExistentes WHERE " + NOMBRE_COLUMNA + " REGEXP"
                    + "'^" + inputNombre + "'";
            Query query = sesion.createSQLQuery(SentenciaBusqueda).addEntity(getTipoClase());
            productosExistentes = query.list();
        } catch (HibernateException excepcion) {
            manejarExcepcionHibernate(excepcion);
            throw excepcion;
        } finally {
            terminarTransaccion();
        }
        
        return productosExistentes;
    }
    
    protected Class getTipoClase() {
        return ProductosExistentes.class;
    }    

}
