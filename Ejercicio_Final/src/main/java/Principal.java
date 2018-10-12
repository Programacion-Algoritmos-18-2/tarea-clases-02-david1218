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
     
        Equipo e = new Equipo();
        System.out.printf("Nombre:%s\n-Jugadores:%s\n-ciudad:%s\n",e.obtenernombre(),e.obtenerjugadores(),
                e.obtenerciudad());
        System.out.println("----------------------------");
        Equipo e2= new Equipo("Barcelona");
        e2.agregarjugadores(20);
        e2.agregarciudad("Guayaquil");
        System.out.printf("Nombre:%s\n-Jugadores:%s\n-ciudad:%s\n",e2.obtenernombre(),e2.obtenerjugadores(),
        e2.obtenerciudad());    
        System.out.println("---------------------------");
        Equipo e3= new Equipo("Delfines",22);
        e3.agregarciudad("Machala");
        System.out.printf("Nombre:%s\n-Jugadores:%s\n-ciudad:%s\n",e3.obtenernombre(),e3.obtenerjugadores(),
        e3.obtenerciudad());   
        System.out.println("----------------------------");
        Equipo e4= new Equipo("Liga de Quoito","Quito",22);   
         System.out.printf("Nombre:%s\n-Jugadores:%s\n-ciudad:%s\n",e4.obtenernombre(),e4.obtenerjugadores(),
        e4.obtenerciudad());   
    }
}
