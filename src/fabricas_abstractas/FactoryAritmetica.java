/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_abstractas;

import fabricas_concretas.Suma;
import fabricas_concretas.Resta;
import fabricas_concretas.Multiplicacion;
import fabricas_concretas.Division;

/**
 *
 * @author LN710Q
 */
public class FactoryAritmetica{
    public Operacion CrearAritmetica(int a){
        switch(a){
            case 1:
                Operacion suma = new Suma();
                return suma;
            case 2:
                Operacion resta = new Resta();
                return resta;
            case 3:
                Operacion multiplicacion = new Multiplicacion();
                return multiplicacion;
            case 4:
                Operacion division = new Division();
                return division;           
        }
        
        return null;
        
    }
    
}
