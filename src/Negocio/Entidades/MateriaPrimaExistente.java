/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Bernardo Espinoza
 */
@Entity
public class MateriaPrimaExistente {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    @ManyToOne(optional=false)
    private MateriaPrima materiaPrima;
    
    @Column(name="cantidad",nullable=false)
    private int cantidad;

    public MateriaPrimaExistente() {
    }

    public MateriaPrimaExistente(MateriaPrima materiaPrima, int cantidad) {
        this.materiaPrima = materiaPrima;
        this.cantidad = cantidad;
    }

    public long getId() {
        return id;
    }

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
