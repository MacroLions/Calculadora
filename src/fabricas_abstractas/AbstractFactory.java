/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_abstractas;

import fabricas_concretas.FactoryTransformar;
import fabricas_concretas.FactoryAritmetica;
import productos_abstractos.Abstract;

/**
 *
 * @author Mai Perez
 */
public class AbstractFactory {
    public Abstract NuevaFabrica(int a){
        switch(a){
            case 1:
                return new FactoryAritmetica();
            case 2:
                return new FactoryTransformar();
        }
        return null;
    }
}
