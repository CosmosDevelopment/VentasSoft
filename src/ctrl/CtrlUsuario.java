/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrl;

import entidades.Usuario;
import java.util.ArrayList;
import dao.daoUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author wasp
 */
public class CtrlUsuario {
    daoUsuario daoU = new daoUsuario();
    
    public boolean getPass(String pass){
      
        ArrayList<Usuario> usuario;
        try {
            usuario = daoU.getPass(pass);
            String respuesta = usuario.get(0).getIdUsuario();
            if (respuesta.equals("1")){
                return true;
            }else{
                return false;
            }
       
        } catch (Exception ex) {
            Logger.getLogger(CtrlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
   public boolean actualizarPass(String passAntigua, String passNueva){
      
        ArrayList<Usuario> usuario;
        try {
           
            usuario = daoU.getPass(passAntigua);
            String respuesta = usuario.get(0).getIdUsuario();
            if (respuesta.equals("1")){
                usuario.get(0).setPassUsuario(passNueva);
                daoU.updatePass(usuario.get(0));
                return true;
            }else{
                return false;
            }
       
        } catch (Exception ex) {
            Logger.getLogger(CtrlUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
