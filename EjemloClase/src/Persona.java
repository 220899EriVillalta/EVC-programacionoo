/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumnos
 */
public class Persona {
    String nombre;
    int edad;
    String direccion;
    
    String dormir(){
        
        return "duerme a las 9:30 pm";
    }
    
    String dormir(String hora){
        
        return"duerme a las "+hora;
        
    }
    
    String comer(){
        
        return nombre+ "come un chocolate";
    }
    
    void comer(String x){
        System.out.println("come un chocolate"+x);
    }
}
