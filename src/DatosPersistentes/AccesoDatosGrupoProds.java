/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;
import Negocio.Entidades.ProdsVendidos;
import java.util.List;
/**
 *
 * @author DEMON
 */
public class AccesoDatosGrupoProds extends AccesoDatos<ProdsVendidos> {
    
    
    
    @Override
    protected Class getTipoClase() {
        return ProdsVendidos.class;
    }
    
}
