/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_abstractos;

import fabricas_abstractas.Operacion;
import fabricas_abstractas.Transformar;

/**
 *
 * @author Mai Perez
 */
public interface Abstract {
    public Operacion CrearAritmetica(int a);
    public Transformar CrearTransformar(int a);
    
}
