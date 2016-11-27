/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import Negocio.Entidades.ProductosVendidos;
import Negocio.Entidades.Pedido;
import Negocio.Entidades.Producto;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author DEMON
 */
public class VendedorMenudeo {        
    AdminProductosVendidos adminProductosVendidos;
    AdminPedidos adminPedidos;

    public VendedorMenudeo(){
        adminProductosVendidos = new AdminProductosVendidos();
        adminPedidos = new AdminPedidos();
    }

    private Pedido construirPedido(
        String nombreComprador, 
        String direccion, 
        String telefono, 
        Date fechaEntrega, 
        List <ProductosVendidos> productosVendidosMenudeo,
        String hora
        ) {
            Pedido nuevoPedido;

            nuevoPedido = new Pedido(
            getFechaActual(),
            nombreComprador,
            direccion,
            telefono,
            fechaEntrega,
            productosVendidosMenudeo,
            hora,
            calcularCostoTotal(productosVendidosMenudeo)
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
                registrarProdsVendidos(inputProdsVendidos);
        
        Pedido nuevoPedido = construirPedido(
                        nombreComprador, 
                        direccion, 
                        telefono, 
                        fechaEntrega, 
                        prodsVendidosRegistrados, 
                        hora
                );
        adminPedidos.agregarPedidoRegistro(nuevoPedido);
    }
    private Date getFechaActual() {
        Date fechaActual = new Date();
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        formatoFecha.format(fechaActual);
        return fechaActual;
    }

    private List<ProductosVendidos> registrarProdsVendidos(List<ProductosVendidos> productosVendidosInput){
        List<ProductosVendidos> prodsVendidosRegistrados;
        prodsVendidosRegistrados = new ArrayList<>();
        
        for(ProductosVendidos inputProductosVendidos : productosVendidosInput){
            adminProductosVendidos.AgregarProductosVendidos(inputProductosVendidos);
            prodsVendidosRegistrados.add(inputProductosVendidos);
        }
        return prodsVendidosRegistrados;
    }
    
    public double calcularCostoTotal(List<ProductosVendidos> prodsSeleccionados) {
        double costoTotal = 0;
        for(ProductosVendidos actual : prodsSeleccionados){
            costoTotal += actual.getCostoGrupoProd();
        }
        return costoTotal;
    }
}


