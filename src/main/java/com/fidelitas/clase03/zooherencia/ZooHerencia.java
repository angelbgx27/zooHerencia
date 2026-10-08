/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fidelitas.clase03.zooherencia;

import java.util.HashSet;

/**
 *
 * @author gab20
 */
public class ZooHerencia {

    public static void main(String[] args) {
        

        Gato ani1 = new Siames("lucas");
        
        
        
        System.out.println(ani1.toString());
        String sonido = ani1.hacerSonido();
        System.out.println(sonido);
        
    }
}
