/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_abstractos;

import fabricas_abstractas.Transformar;

/**
 *
 * @author Mai Perez
 */
public class Binario implements Transformar {

    @Override
    public int Calcular(int a) {
        int binario=0;
        while(a>2){
            int cons=1;
            int num= a%2;
            a=a/2;
            binario=num*cons;
            cons=(cons*10);
        }
        return binario;
    }
    
}
