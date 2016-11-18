/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosClientes;
import Negocio.Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bernardo Espinoza
 */
public class AdminClientes {
    private  AccesoDatosClientes datosClientes;
    
    public AdminClientes(){
        datosClientes = new AccesoDatosClientes();
    }
    
    public void agregarCliente(String[] datos){
        Cliente cliente=new Cliente(datos[0],datos[1],datos[2],datos[3]);
        datosClientes.insertar(cliente);
    }
    
    public void editarCliente(String[] datos){
        Cliente cliente=new Cliente(datos[0],datos[1],datos[2],datos[3]);
        cliente.setId(getListaClientesPorNombre(datos[0]).get(0).getId());
        datosClientes.sobrescribir(cliente);
    }
    
    public void eliminarCliente(String[] datos){
        Cliente cliente=new Cliente(datos[0],datos[1],datos[2],datos[3]);
        cliente.setId(getListaClientesPorNombre(datos[0]).get(0).getId());
        datosClientes.borrar(cliente);
    }
    
    public List<String[]> getListaClientes(){
        List<String[]> lista=null;
        String[] datos=new String[4];
            for(Cliente cliente: datosClientes.getListaTodos()){
                datos[0]=cliente.getNombre();
                datos[1]=cliente.getDireccion();
                datos[2]=cliente.getTelefono();
                datos[3]=cliente.getEmail();
                lista.add(datos);
            }
        return lista;
    }
    
    public List<Cliente> getListaClientesPorNombre(String nombre){
        return datosClientes.getPorNombre(nombre);
    }
    
    
}
