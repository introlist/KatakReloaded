/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import Negocio.Entidades.ProductosVendidos;
import Negocio.Entidades.Producto;
import Negocio.Entidades.Venta;
import Negocio.Entidades.Cliente;
import Negocio.Operaciones.AdminClientes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Mario
 */
public class VendedorMayoreo {
    private final AdminVentas adminVentas;
    private final AdminProductos adminProductos;
    private final AdminProductosVendidos adminProductosVendidos;
    public List<ProductosVendidos> ProductosVendidosInput;
    public List<ProductosVendidos> ProductosVendidosVenta;
    public List<Producto> prodsDisponibles;
    private Venta nuevaVenta = new Venta();
    private double costo;
    private Cliente nuevoCliente;
    
        public VendedorMayoreo(){
        adminVentas = new AdminVentas();
        adminProductosVendidos = new AdminProductosVendidos();
        adminProductos = new AdminProductos();
        ProductosVendidosInput = new ArrayList<>();
        ProductosVendidosVenta = new ArrayList<>();
        nuevaVenta = new Venta();
        prodsDisponibles = adminProductos.getListaProductos();
        
    }
      
        public void elaborarVenta() {
            this.nuevaVenta = new Venta(
                    nuevoCliente,
                    ProductosVendidosVenta,
                    getFechaActual()
                    
            );
    }
        
        public void guardarVenta(){
        guardarGruposProds();
        elaborarVenta();
        adminVentas.AgregarVenta(nuevaVenta);
    }
        
        private Date getFechaActual() {
        Date fechaActual = new Date();
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        formatoFecha.format(fechaActual);
        return fechaActual;
    }
        
        private void guardarGruposProds(){
        for(ProductosVendidos gp : ProductosVendidosInput){
            ProductosVendidos nuevoGrupoProd = new ProductosVendidos(
                    gp.getProd(), 
                    gp.getCantidad()
            );
            System.out.println(gp.getNombreProd()+"   -   "+gp.getCantidad());
            adminProductosVendidos.AgregarGrupoProd(nuevoGrupoProd);
            ProductosVendidosVenta.add(nuevoGrupoProd);
        }
    }
        
        
        public List<String> getNombresTodosProd(){
            return adminProductos.getNombresTodosProductos();
        }

        public List<ProductosVendidos> getGruposProdsSeleccionados() {
            return ProductosVendidosInput;
        }

        public void setGruposProdsSeleccionados(List<ProductosVendidos> gruposProdsSeleccionados) {
            this.ProductosVendidosInput = gruposProdsSeleccionados;       
        }

        public Producto getProdPorNombre(String nombreProd){
            return adminProductos.getProductosPorNombre(nombreProd);
        }

        public double getCosto() {
            return costo;
        }

        public void setCosto(double costo) {
            this.costo = costo;
        }

    public void setNuevaVenta(Venta nuevaVenta) {
        this.nuevaVenta = nuevaVenta;
    }

    public void setNuevoCliente(Cliente nuevoCliente) {
        this.nuevoCliente = nuevoCliente;
    }

    public Venta getNuevaVenta() {
        return nuevaVenta;
    }

    public Cliente getNuevoCliente() {
        return nuevoCliente;
    }
        
        
    
    
    
}
