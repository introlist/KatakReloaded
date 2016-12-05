/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;


import Negocio.Entidades.Pedido;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.hibernate.Query;

/********************************************************************** 
 
    CLASE: {@link AccesoDatosPedido}
    
    AUTOR: Roberto Gil Flores

 **********************************************************************/
public class AccesoDatosPedido extends AccesoDatos<Pedido>{

    public List<Pedido> getPorFechaCreacion(Date fecha) {
        String COLUMN_NAME = "fecha_creacion";
        List<Pedido> pedidosEncontrados = null;
        
        try {
            iniciarTransaccion();
            Criteria criterio = sesion.createCriteria(getTipoClase());
            SimpleExpression restriccion = Restrictions.eq(COLUMN_NAME, fecha);
            pedidosEncontrados = criterio.add(restriccion).list();
        } catch (HibernateException excepcion) {
            manejarExcepcionHibernate(excepcion);
            throw excepcion;
        } finally {
            terminarTransaccion();
        }
        
        return pedidosEncontrados;
    }

    public List<Pedido> getPorFechaEntrega(Date fecha) {
        String COLUMN_NAME = "fecha_entrega";
        List<Pedido> pedidosEncontrados = null;
        
        try {
            iniciarTransaccion();
            Criteria criterio = sesion.createCriteria(getTipoClase());
            SimpleExpression restriccion = Restrictions.eq(COLUMN_NAME, fecha);
            pedidosEncontrados = criterio.add(restriccion).list();
        } catch (HibernateException excepcion) {
            manejarExcepcionHibernate(excepcion);
            throw excepcion;
        } finally {
            terminarTransaccion();
        }
        
        return pedidosEncontrados;
    }
    
    public List<Pedido> getPorPendiente(boolean pendiente) {
        List<Pedido> clienteExistente = null;
        char esPendiente;
        if(pendiente){
            esPendiente = 'T';
        }else{
            esPendiente = 'F';
        }
        
        try {
            iniciarTransaccion();
            Query query = sesion.createSQLQuery(
                    sentenciaBusquedaPendiente(esPendiente)
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

    private String sentenciaBusquedaPendiente(char esPendiente) {
        String SentenciaBusqueda = "SELECT * FROM pedidos WHERE pedido_pendiente REGEXP"
                + "'^" + esPendiente + "'";
        return SentenciaBusqueda;
    }
     
    @Override
    protected Class getTipoClase() {
        return Pedido.class;
    }
}
