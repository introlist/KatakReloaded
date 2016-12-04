/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades;

import Negocio.Entidades.Enums.UnidadMedida;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/********************************************************************** 
 
    CLASE: {@link Producto}
    
    AUTOR: Roberto Gil Flores

 **********************************************************************/
@Entity
@Table(name="materia_prima")
public class MateriaPrima implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    @Column(name="nombre", nullable=false)
    private String nombre;
    
    @Column(name="medida", nullable=false)
    private UnidadMedida unidadMedida;
    
    public MateriaPrima(){
        
    }
    
    public MateriaPrima(
            String nombre, 
            UnidadMedida unidMed
    )  {
        this.nombre = nombre;
        this.unidadMedida = unidMed;
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

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidMed) {
        this.unidadMedida = unidMed;
    }

}
