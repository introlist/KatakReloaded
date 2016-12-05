/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import Negocio.Entidades.ProductosVendidos;
import Negocio.Entidades.Pedido;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/********************************************************************** 
 
    CLASE: {@link VendedorMenudeo}
    
    AUTOR: Roberto Gil Flores
     
    Encargada de los realizar los {@link Pedido} a los compradores 
    casuales de productos.

 **********************************************************************/
public class VendedorMenudeo {        
    AdminProductosVendidos adminProdVendidos;
    AdminPedidos adminPedidos;

    public VendedorMenudeo(){
        adminProdVendidos = new AdminProductosVendidos();
        adminPedidos = new AdminPedidos();
    }

    private Pedido construirPedido(
        String nombreComprador, 
        String direccion, 
        String telefono, 
        Date fechaEntrega, 
        List <ProductosVendidos> prodsVendidosPedido,
        String hora
        ) {
            Pedido nuevoPedido;
            nuevoPedido = new Pedido(
            nombreComprador,
            direccion,
            telefono,
            fechaEntrega,
            prodsVendidosPedido,
            hora,
            calcularCostoTotal(prodsVendidosPedido)
        );
            
        return nuevoPedido;
    }
    
    public void registrarPedido(
            String nombreComprador, 
            String direccion, 
            String telefono, 
            Date fechaEntrega, 
            List <ProductosVendidos> inputProdsVendidos,
            String hora
            ) {

        List<ProductosVendidos> prodsVendidosRegistrados =
                registrarProdictosVendidos(inputProdsVendidos);
        
        
        adminPedidos.agregarPedidoRegistro(
                construirPedido(
                        nombreComprador, 
                        direccion, 
                        telefono, 
                        fechaEntrega, 
                        prodsVendidosRegistrados, 
                        hora
                )
        );
    }

    /* Toma los productos seleccionados finales y se registran 
    como productos vendidos en la base de datos */
    private List<ProductosVendidos> registrarProdictosVendidos(
            List<ProductosVendidos> inputProductosVendidos
    ){
        List<ProductosVendidos> prodsVendidosRegistrados;
        prodsVendidosRegistrados = new ArrayList<>();
        
        for(ProductosVendidos nuevoProductosVendidos : inputProductosVendidos){
            adminProdVendidos.AgregarProductosVendidos(nuevoProductosVendidos);
            prodsVendidosRegistrados.add(nuevoProductosVendidos);
        }
        return prodsVendidosRegistrados;
    }
    
    public double calcularCostoTotal(List<ProductosVendidos> prodsSeleccionados) {
        double costoTotal = 0;
        for(ProductosVendidos actual : prodsSeleccionados){
            costoTotal += actual.getCostoTotal();
        }
        return costoTotal;
    }
}


