/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import fabricas_abstractas.Operacion;

/**
 *
 * @author LN710Q
 */
public class Suma implements Operacion{
    @Override
    public int Calcular(int a,int b){
        return a+b;
    }   
    
}
