/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mpoo;

/**
 *
 * @author edgarriv69
 */
public class Alumno {
    
    String[] nombre;
    String[] apellido;
    int edad;
    String[] direccion;
    String[] asignaturas;
    int numIns;
    
    //Método para generar nombres
    public void generarAl(){
        //Array de nombres propios
        String[] nPropio= new String[]{"Sofía", "Margarita", "Dulce", "Ximena", "Andrea", "Raúl", "Diego", "Daniel", "Iker", "Fernando",
        "Luna", "Regina", "Renata", "Mariana", "Samantha", "Carlos", "Rodrigo", "Mateo", "Pablo", "José"};
        //Array de apellidos
        String[] ape = new String[]{"Hernández", "García", "Martínez", "López", "González", "Pérez", "Rodríguez", "Sánchez", "Ramírez",
        "Cruz", "Flores", "Gómez", "Díaz", "Torres", "Guerrero", "Mondragón", "Pineda", "Toledo", "Rivera", "Medina"};
        //Obtención de un no. aleatorio
        int n = (int) (Math.random() * (20 - 0)) + 0; //Valor para nombre
        int m = (int) (Math.random() * (20 - 0)) + 0; //Valor para apellido 1
        int o = (int) (Math.random() * (20 - 0)) + 0; //Valor para apellido 2
        
        //Construcción del nombre
        String nombre = nPropio[n];
        String apellido = ape[m] + " " + ape[o];
        
        System.out.println("Nombre: " + nombre + " " + "Apellidos: " + apellido);
    }
    
    
    
}
