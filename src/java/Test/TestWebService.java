/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author raquel
 */
public class TestWebService {
    public static void main(String[] args) {
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones cliente = servicio.getWSOperacionesPort();
        
        
        if(cliente.login("Ana", "ana123")){
            System.out.println("Credenciales correctas");
            
        }else{
            System.out.println("Credenciales Incorrectas");
        }
        
        System.out.println(cliente.procesarPago(5000, 50));    
        
        
    }
    
}
