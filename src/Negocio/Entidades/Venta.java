/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades;
import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Mario
 */

@Entity 
@Table (name = "ventas") 
public class Venta implements Serializable{
    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @OneToOne(optional = false)
    private Cliente cliente;
    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ProductosVendidos> prodsVendidos;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column (name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;
    @Column (name = "costo", nullable = false)
    private double costoTotal;
    
    public Venta(){
        
    };

    //Constructor

    public Venta(Cliente cliente, 
                 List<ProductosVendidos> prodsVendidos, 
                 Date fechaCreacion, 
                 double costoTotal) {
        
        this.cliente = cliente;
        this.prodsVendidos = prodsVendidos;
        this.fechaCreacion = fechaCreacion;
        this.costoTotal = costoTotal;
    }

    //Metodo get

    public long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ProductosVendidos> getProdsVendidos() {
        return prodsVendidos;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public double getCostoTotal() {
        return costoTotal;
    }
    
    //Metodos set

    public void setId(long id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProdsVendidos(List<ProductosVendidos> prodsVendidos) {
        this.prodsVendidos = prodsVendidos;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    

}
