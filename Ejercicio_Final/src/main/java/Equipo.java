/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Equipo {
    String nombre;
    String ciudad;
    int n_jugadores;
    public String obtenernombre() {
       return nombre;
    }
    public void agregar(String x ) {
        nombre = x; 
    }
    public String obtenerciudad() {
        return  ciudad;
    }
    public void agregarciudad(String y) {
        ciudad = y;
    }
    public int obtenerjugadores() {
        return n_jugadores;
    }
    public void agregarjugadores ( int z){
        n_jugadores = z;
    }
    public Equipo(){
        agregar("Nacional");
        agregarciudad("Quito");
        agregarjugadores(22);
    }
    public Equipo(String n){
         agregar(n);
    }
    public Equipo(String n,int y){
        agregar(n);
        agregarjugadores(y);     
    }
    public Equipo (String x,String y,int z){
        agregar(x);
        agregarciudad(y);
        agregarjugadores(z);
        
        
        
        
    }
}
