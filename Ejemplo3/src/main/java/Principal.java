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
        Precio n = new Precio(259);
        // System.out.println(p.euros);
        //p.euros = 101;
        //System.out.println(p.euros);
        //p.agregar(20.2);
        System.out.println("El valor es:");
        // estamos llamando a los los valores predeterminados de los dos constructores
        System.out.println(p.obtener());
        System.out.println(n.obtener());
    }
}
