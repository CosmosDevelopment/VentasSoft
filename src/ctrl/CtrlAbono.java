/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ctrl;

import dao.daoAbono;
import entidades.Abono;
import java.util.ArrayList;

/**
 *
 * @author wasp
 */
public class CtrlAbono {
    
    daoAbono da= new daoAbono();
    
    public void agregarAbono(Abono abono) throws Exception{
        
        da.insertAbono(abono);
    }
    public ArrayList<Abono> listByCliente (String idCliente) throws Exception{
        return da.getAbonoByIdCliente(Integer.parseInt(idCliente));
    }
    public Abono ultimoAbonoCliente (int idCliente) throws Exception{
        ArrayList<Abono> abonos=da.getAbonoByIdCliente(idCliente);
        if(abonos.size()>0){
            return abonos.get(abonos.size()-1);
        }
        else{
            return null;
        }
        
    }
    public boolean eliminarAbono(String idAbono) throws Exception {
        Abono abono= da.getAbonoById(idAbono);        
        return da.deleteAbono(abono);
    }   
     public Abono findByID(String id) throws Exception{
        return da.getAbonoById(id);
    }
    
}
