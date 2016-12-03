/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;

import Negocio.Entidades.Cliente;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author DEMON
 */
public class AccesoDatosClientes extends AccesoDatos<Cliente>  {


    public List<Cliente> getPorNombre(String inputNombre) {
        List<Cliente> clienteExistente = null;
        
        try {
            iniciarTransaccion();
            Query query = sesion.createSQLQuery(
                    SentenciaBusquedaNombre(inputNombre)
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

    private String SentenciaBusquedaNombre(String inputNombre) {
        String SentenciaBusqueda = "SELECT * FROM clientes WHERE nombre REGEXP"
                + "'^" + inputNombre + "'";
        return SentenciaBusqueda;
    }
    
    @Override
    protected Class getTipoClase() {
        return Cliente.class;
    }
    
}
