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
import javax.persistence.Table;
import org.hibernate.annotations.Type;
/********************************************************************** 
 
    CLASE: {@link Producto}
    
    @AUTOR: Roberto Gil Flores

 **********************************************************************/
@Entity
@Table (name = "productos")
public class Producto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;
    @Column(name = "precio", nullable = false)
    private double precio;
    @Column(name = "producto_disponible",nullable = false)
    @Type(type = "true_false")
    private boolean esDisponible;

    public Producto(){
        
    }

    public Producto(
            String nombre, 
            double precio
    ) {
        this.nombre = nombre;
        this.precio = precio;
        this.esDisponible = true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean esDisponible() {
        return esDisponible;
    }

    public void setEsDisponible(boolean esDisponible) {
        this.esDisponible = esDisponible;
    }
    
    

    
}
