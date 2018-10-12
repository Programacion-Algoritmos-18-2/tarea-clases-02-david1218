/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Precio {

    private double euros;
// metodo set
    public double obtener() {
        return euros;
    }
//metodo get
    public void agregar(double x) {
        euros = x;
    }
// son contructores los cuales nos va a dar por predeterminado los valores.
    public Precio() {
        agregar(302);
    }

    public Precio(double y) {
        agregar(y);
    }
}
