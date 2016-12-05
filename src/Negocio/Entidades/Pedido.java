/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.Type;
/********************************************************************** 
 
    CLASE: {@link Pedido}
    
    @AUTOR: Roberto Gil Flores

 **********************************************************************/

@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;
    @Column(name = "nombre_comprador", nullable = false)
    private String nombreComprador;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "fecha_entrega", nullable = false)
    private Date fechaEntrega;
    @Column(name = "tiempo_entrega", nullable = false)
    private String tiempoEntrega;
    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ProductosVendidos> productosVendidos;
    @Column (name = "costo", nullable = false)
    private double costoTotal;
    @Column (name = "pedido_pendiente", nullable = false)
    @Type(type = "true_false")
    private boolean esPendiente;
    
    public Pedido(){
        
    }


    public Pedido(
            String nombreComprador, 
            String direccion, 
            String telefono, 
            Date fechaEntrega, 
            List<ProductosVendidos> productosVendidos,
            String tiempoEntrega,
            double costoTotal
    ) {
        this.fechaCreacion = getFechaActual();
        this.nombreComprador = nombreComprador;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaEntrega = fechaEntrega;
        this.productosVendidos = productosVendidos;
        this.tiempoEntrega = tiempoEntrega;
        this.costoTotal = costoTotal;
        this.esPendiente = true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<ProductosVendidos> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(List<ProductosVendidos> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }
    
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(String tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public boolean esPendiente() {
        return esPendiente;
    }

    public void setEsPendiente(boolean esPendiente) {
        this.esPendiente = esPendiente;
    }
    
    private Date getFechaActual() {
        Date fechaActual = new Date();
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        formatoFecha.format(fechaActual);
        return fechaActual;
    }
    
}
