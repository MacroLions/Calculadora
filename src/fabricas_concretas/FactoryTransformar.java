/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.Operacion;
import fabricas_abstractas.Transformar;
import productos_abstractos.Abstract;
import productos_abstractos.Binario;

/**
 *
 * @author LN710Q
 */
public class FactoryTransformar implements Abstract{
    public Transformar CrearTransformar(int a){
        switch(a){
            case 1:
                return new Binario();      
        }
        
        return null;
        
    }

    @Override
    public Operacion CrearAritmetica(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
