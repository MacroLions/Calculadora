/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.Operacion;
import fabricas_abstractas.Transformar;
import productos_abstractos.Abstract;
import productos_abstractos.Suma;
import productos_abstractos.Resta;
import productos_abstractos.Multiplicacion;
import productos_abstractos.Division;

/**
 *
 * @author LN710Q
 */
public class FactoryAritmetica implements Abstract{
    public Operacion CrearAritmetica(int a){
        switch(a){
            case 1:
                return new Suma();
            case 2:
                return new Suma();
            case 3:
                return new Multiplicacion();
            case 4:
                return new Division();           
        }
        
        return null;
        
    }

    @Override
    public Transformar CrearTransformar(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
