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
import javax.persistence.Table;

/********************************************************************** 
 
    CLASE: {@link ProductosExistentes}
    
    AUTOR: Mario Lopez

 **********************************************************************/
@Entity
@Table(name = "productos_existentes") 
public class ProductosExistentes implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idProductoExistente;
    @ManyToOne(optional = false)
    private Producto producto;
    @Column(name = "cantidadExistencia", nullable = false)
    private int cantidadExistente;
    
    public ProductosExistentes(){
        
    }
    
    //Constructor

    public ProductosExistentes(Producto productoExistente, int cantidadExistente) {
        this.producto = productoExistente;
        this.cantidadExistente = cantidadExistente;
    }

        
    //Getters

    public int getIdProductoExistente() {
        return idProductoExistente;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidadExistente() {
        return cantidadExistente;
    }

    //Setters

    public void setIdProductoExistente(int idProductoExistente) {
        this.idProductoExistente = idProductoExistente;
    }

    public void setProductoExistente(Producto productoExistente) {
        this.producto = productoExistente;
    }

    public void setCantidadExistente(int cantidadExistente) {
        this.cantidadExistente = cantidadExistente;
    }

}
