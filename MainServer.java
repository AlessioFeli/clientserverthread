/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverjavagio;

/**
 *
 * @author Studente
 */
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       // cd.start();
      
        
       ServerjavaGio ss=new ServerjavaGio(2000);
      
      ss.attendi();
       
       ss.scriviData();
       
      // ss.leggi();
       
       // ss.scrivi();
        
       
//       ss.chiudiConnessione();
       
     //  ss.chiudiServer();
       
    }
    
}