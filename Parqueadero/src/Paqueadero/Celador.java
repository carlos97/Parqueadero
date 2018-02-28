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
public class Celador {
    
    String saludar(boolean gafas, char genero, int ebrio){
        if(ebrio>0 ){
            if(genero !='H')
                return saludar(ebrio) + saludar(genero);
            else
                return saludar(ebrio);
        }else {
            if (genero =='H'){
                if(gafas == true){
                    return saludar(ebrio) + saludar(genero) + saludar(gafas);
                }else{
                    return saludar(ebrio) + saludar(genero);
                }
            }else{
                if(gafas == true){
                    return saludar(ebrio) + saludar(genero) + saludar(gafas);
                }else{
                    return saludar(ebrio) + saludar(genero);
                }
            }
        }
    }
    
    String saludar(int ebrio){
        if(ebrio!=0)
            return " Fuera de aqui";
        else
            return " ";
    }
    
    String saludar(char genero){
        if(genero =='H')
            return " Hola doctor";
        else
            return " (piropo)";
    }
    
    String saludar(boolean gafas){
        if(gafas==true)
            return " no se le olviden as gafas al salir";
        else
            return " ";
    }
    
    
    
}
