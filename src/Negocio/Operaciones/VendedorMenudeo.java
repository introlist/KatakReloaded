/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import Negocio.Entidades.ProdsVendidos;
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
    AdminGrupoProd adminProdVendidos;
    AdminPedidos adminPedidos;

    public VendedorMenudeo(){
        adminProdVendidos = new AdminGrupoProd();
        adminPedidos = new AdminPedidos();
    }

    private Pedido construirPedido(
        String nombreComprador, 
        String direccion, 
        String telefono, 
        Date fechaEntrega, 
        List <ProdsVendidos> prodsVendidosPedido,
        String hora
        ) {
            Pedido nuevoPedido;

            nuevoPedido = new Pedido(
            getFechaActual(),
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
            List <ProdsVendidos> inputProdsVendidos,
            String hora
            ) {

        List<ProdsVendidos> prodsVendidosRegistrados =
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

    private List<ProdsVendidos> registrarProdsVendidos(List<ProdsVendidos> gruposProdsInput){
        List<ProdsVendidos> prodsVendidosRegistrados;
        prodsVendidosRegistrados = new ArrayList<>();
        
        for(ProdsVendidos inputGrupoProd : gruposProdsInput){
            adminProdVendidos.AgregarGrupoProd(inputGrupoProd);
            prodsVendidosRegistrados.add(inputGrupoProd);
        }
        return prodsVendidosRegistrados;
    }
    
    public double calcularCostoTotal(List<ProdsVendidos> prodsSeleccionados) {
        double costoTotal = 0;
        for(ProdsVendidos actual : prodsSeleccionados){
            costoTotal += actual.getCostoGrupoProd();
        }
        return costoTotal;
    }
}


