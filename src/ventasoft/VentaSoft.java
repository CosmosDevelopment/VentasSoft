/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasoft;

import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.util.Properties;
import javax.swing.*;
import views.Login;

/**
 *
 * @author wasp
 */
public class VentaSoft {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
//        try {
//              Properties props = new Properties();
//             props.put("logoString", "my company"); 
//            props.put("licenseKey", "INSERT YOUR LICENSE KEY HERE");
//            
//            // colores borde pantalla           
//            props.put("windowTitleColorLight", "14 45 208"); 
//            props.put("windowTitleColorDark", "14 45 198"); 
//            props.put("windowBorderColor", "27 174 42");
//           
//              props.put("windowBackgroundColor", "27 174 42");
//           
//            // set your theme
//            SmartLookAndFeel.setCurrentTheme(props);
//		UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
        Login l = new Login();
        l.setVisible(true);

// TODO code application logic here
    }
    
}
