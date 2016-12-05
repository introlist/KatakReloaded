/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosClientes;
import Negocio.Entidades.Cliente;
import Negocio.Entidades.Producto;
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
    
    public void agregarCliente(Cliente cliente){
        datosClientes.insertar(cliente);
    }
    
    public void editarCliente(Cliente cliente){
        cliente.setId(getListaClientesPorNombre(cliente.getNombre()).get(0).getId());
        datosClientes.sobrescribir(cliente);
    }
    
    public void eliminarCliente(Cliente cliente){
        cliente.setId(getListaClientesPorNombre(cliente.getNombre()).get(0).getId());
        datosClientes.borrar(cliente);
    }
    
    public List<Cliente> getListaClientes(){
        return datosClientes.getListaTodos();
    }
    
    public List<Cliente> getListaClientesPorNombre(String nombre){
        return datosClientes.getPorNombre(nombre);
    }
    
    //Commit: Mario
    //Se agregaron listas de los clientes del tipo string en vez del tipo array 
       
    public List<String> getNombresTodosClientes() {
        List nombresClientes = new ArrayList();
        for(Cliente cliente : getListaClientes()){
            nombresClientes.add(cliente.getNombre());
        }
        return nombresClientes;
    }
    
    
}
