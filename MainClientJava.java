/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverjava;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Studente
 */
public class MainClientJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ClientjavaGio cc=new ClientjavaGio(InetAddress.getLocalHost(), 2000);
            
        
            cc.leggiData();
            cc.scrivi();
           //     cc.scrivi();
              
               //     cc.leggi();
            
                
         //   cc.chiudi();
        } catch (UnknownHostException ex) {
            Logger.getLogger(MainClientJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
