/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Principal {

    public static void main(String[] args) {
        Precio p;
        p = new Precio();
        System.out.println(p.euros);
        p.euros = 101;
        System.out.println(p.euros);
    }
}
