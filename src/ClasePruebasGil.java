
import DatosPersistentes.AccesoDatosPedido;
import DatosPersistentes.AccesoDatosProductos;
import Negocio.Entidades.Pedido;
import Negocio.Entidades.Producto;
import Negocio.Operaciones.AdminProductos;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEMON
 */
public class ClasePruebasGil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdminProductos ap = new AdminProductos();
        
        Producto producto = new Producto("nombre", 1);
        ap.AgregarProductos(producto);
        for(String nombre:ap.getNombresProductosDisponibles()){
            System.out.println(nombre);
        }
        
        
    }   
}       
//*        List<Pedido> pedidosPendientes = new ArrayList<>();
//        AccesoDatosPedido adp = new AccesoDatosPedido();
//        pedidosPendientes = adp.getPorPendiente(true);
//        for(Pedido p : pedidosPendientes){
//            System.out.println(p.getId()+" "+p.getNombreComprador());
//        }
//        Pedido cambiado = pedidosPendientes.get(0);
//        cambiado.setPendiente(false);
//        adp.sobrescribir(cambiado);
//        
//        pedidosPendientes = new ArrayList<>();
//        pedidosPendientes = adp.getPorPendiente(true);
//        for(Pedido p : pedidosPendientes){
//            System.out.println("true: "+p.getId()+" "+p.getNombreComprador());
//        }
//        
//        pedidosPendientes = new ArrayList<>();
//        pedidosPendientes = adp.getPorPendiente(false);
//        for(Pedido p : pedidosPendientes){
//            System.out.println("false: "+p.getId()+" "+p.getNombreComprador());
//        }
//        List<Producto> productosDisponibles = new ArrayList<>();
//        AccesoDatosProductos adp = new AccesoDatosProductos();
//        productosDisponibles = adp.getPorDisponibilidad(true);
//        for(Producto p : productosDisponibles){
//            System.out.println("All true: "+p.getId()+" "+p.getNombre());
//        }
//        Producto cambiado = productosDisponibles.get(0);
//        cambiado.setEsDisponible(false);
//        adp.sobrescribir(cambiado);
//        
//        productosDisponibles = new ArrayList<>();
//        productosDisponibles = adp.getPorDisponibilidad(true);
//        for(Producto p : productosDisponibles){
//            System.out.println("true: "+p.getId()+" "+p.getNombre());
//        }
//        
//        productosDisponibles = new ArrayList<>();
//        productosDisponibles = adp.getPorDisponibilidad(false);
//        for(Producto p : productosDisponibles){
//            System.out.println("false: "+p.getId()+" "+p.getNombre());
//        }
//        
//        System.exit(0);
 //*


    
    

