
 
package ejer7;


public class Ejer7 {

    public static void main(String[] args) {
       
    // Crear un objeto Robot de nombre "Tito"
        Robot tito = new Robot("Tito");

        // Hacer que el robot avance de a un paso hasta que se quede sin batería
        while (!tito.bateriaVacia()) {
            tito.avanzar(1);
        }

        // Mostrar mensaje cuando la batería está vacía
        System.out.println("La batería de " + tito.getNombre() + " está vacía.");
    }
    
}
/*
Este código crea una clase Robot con los atributos bateria y nombre, 
así como los métodos getter y setter para ambos atributos. Además, se 
implementan los métodos avanzar() y bateriaVacia() tal como se describen en el 
enunciado del proyecto. Luego, en la clase principal Main, se crea un objeto Robot 
de nombre "Tito" y se utiliza el método avanzar() para hacer que el robot avance de a 
un paso hasta que se quede sin batería, y finalmente se muestra un mensaje cuando la batería está vacía.
*/