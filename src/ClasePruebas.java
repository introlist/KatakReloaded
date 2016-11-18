
import DatosPersistentes.AccesoDatosClientes;
import DatosPersistentes.AccesoDatosGrupoProds;
import DatosPersistentes.AccesoDatosProd;
import DatosPersistentes.AccesoDatosVenta;
import Negocio.Entidades.Cliente;
import Negocio.Entidades.GrupoProds;
import Negocio.Entidades.Pedido;
import Negocio.Entidades.Producto;
import Negocio.Entidades.Venta;
import Negocio.Operaciones.AdminClientes;
import Negocio.Operaciones.AdminGrupoProd;
import Negocio.Operaciones.AdminPedidos;
import Negocio.Operaciones.AdminProd;
import Negocio.Operaciones.AdminVentas;
import Vista.MenuPrincipal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEMON
 */
public class ClasePruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fechaActual = new Date();
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        formatoFecha.format(fechaActual);
        Cliente hGil = new Cliente("Hector Gil", "9999273285", "Calle 76 Las Americas");
        Cliente dGil = new Cliente("Daniel Gil", "test", "Test2");
       
        Producto Ej1 = new Producto("Ej 1",11);
        Producto Ej2 = new Producto("Ej2", 6);
            
        List<GrupoProds> prodsVendidos = new ArrayList<>();
//        
//        AdminClientes ac = new  AdminClientes();
//        ac.agregarCliente(dGil);
//        ac.agregarCliente(hGil);

        
        AdminProd ap = new AdminProd();
        ap.AgregarProd(Ej1);
        ap.AgregarProd(Ej2);
        
        
        GrupoProds gp1 = new GrupoProds(Ej1, 40);
        GrupoProds gp2 = new GrupoProds(Ej2,60);
        GrupoProds gp3 = new GrupoProds(Ej1,50);
        List<GrupoProds> lgp = new ArrayList<>();
        lgp.add(gp1);
        lgp.add(gp2);
        lgp.add(gp3);
        
        AdminGrupoProd agp = new AdminGrupoProd();
        for(GrupoProds gp: lgp){
            agp.AgregarGrupoProd(gp);
        }
        

//        
//        Pedido pedido = new Pedido(fechaActual, "Roberto Gil", "Calle 76", "9999979832", fechaActual, lgp, "2:11 am", 22.0);
//        AdminPedidos aped = new AdminPedidos();
//        aped.agregarPedidoRegistro(pedido);
        
//        List<Cliente> busqueda1 = ac.getListaClientesPorNombre("Roberto Gil");
//        System.out.println("Busqueda1");
//        for(Cliente c:busqueda1){
//            System.out.println(c.getNombre());
//        }
//        
//        List<Cliente> busqueda2 = ac.getListaClientesPorNombre("Hector Gil");
//        System.out.println("Busqueda2");
//        for(Cliente c:busqueda2){
//            System.out.println(c.getNombre());
//            System.out.println(c.getTelefono());
//        }
//        
        
//        List<Producto> test = ap.getListaProd();

    System.exit(0);
    }
    
}
