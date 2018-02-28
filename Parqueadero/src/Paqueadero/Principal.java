/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paqueadero;

/**
 *
 * @author Estudiantes
 */
public class Principal {
    
    public static void main(String[] args){
        Propietario felipe = new Propietario();
        Propietario camilo = new Propietario();
        Propietario daniela = new Propietario();
        Propietario luisa = new Propietario();
        
        felipe.setEbrio(4);
        felipe.setGafas(false);
        felipe.setGenero('H');
        
        camilo.setEbrio(0);
        camilo.setGafas(false);
        camilo.setGenero('H');
        
        daniela.setEbrio(4);
        daniela.setGafas(false);
        daniela.setGenero('M');
        
        luisa.setEbrio(0);
        luisa.setGafas(false);
        luisa.setGenero('M');
                

        Celador cel = new Celador();
        System.out.println(cel.saludar(felipe.isGafas(),felipe.getGenero(),felipe.getEbrio()));
        System.out.println(cel.saludar(camilo.isGafas(),camilo.getGenero(),camilo.getEbrio()));
        System.out.println(cel.saludar(daniela.isGafas(),daniela.getGenero(),daniela.getEbrio()));
        System.out.println(cel.saludar(luisa.isGafas(),luisa.getGenero(),luisa.getEbrio()));
        
        
        
    }
    
}
