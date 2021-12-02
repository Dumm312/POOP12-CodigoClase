/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop12;

/**
 *Class for ThreadR
 *@author Daniel Medrano, Angel Jimenez, Ariana Alvarez, Melisa Matias,Luis Gustavo
 */
public class HiloR implements Runnable{

    @Override
    public void run() {
        for (int i = 10; i < 20; i++) {
            System.out.println("Iteración de "+i+" del "+Thread.currentThread().getName());
        }
        System.out.println("Termina el "+Thread.currentThread().getName());
    }
    
}
