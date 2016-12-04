/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Mario
 */
@Entity 
public class ProductosExistentes implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @ManyToOne(optional = false)
    private Producto producto;
    @Column(name = "existencia", nullable = false)
    private int existencia;
    
    public ProductosExistentes(){
        
    }
    
    //Constructor

    public ProductosExistentes(Producto producto, int existencia) {
        this.producto = producto;
        this.existencia = existencia;
    }

    
    //Getters

    public int getId() {
        return id;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getExistencia() {
        return existencia;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    
    
}
