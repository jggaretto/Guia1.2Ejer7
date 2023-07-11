/*
En un nuevo proyecto, crear una clase de nombre Robot con los atributos: batería inicializado
en 500 unidades de energía y nombre; un constructor que permita inicializar únicamente a su
atributo nombre; los métodos getter y setter para sus atributos y los siguientes métodos
adicionales:
 avanzar(): Este método recibirá la cantidad de pasos que deberá dar el robot, sabiendo que
por cada 100 pasos consume 10 unidades de energía y que sólo avanzará si hay batería
suficiente.
 bateriaVacia(): Este método retornará true, sólo cuando la batería quede con un valor
menor o igual a cero.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Robot de nombre “Tito”
Luego utilizando sus métodos:
b) Hacerlo avanzar de a un paso hasta que se quede sin batería.
 */
package ejer7;


public class Robot {
     private int bateria; // Batería en unidades de energía
    private String nombre; // Nombre del robot

    // Constructor que inicializa únicamente el nombre del robot
    public Robot(String nombre) {
        this.bateria = 500; // Batería inicializada en 500 unidades de energía
        this.nombre = nombre;
    }

    // Getter y Setter para la batería
    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    // Getter y Setter para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para avanzar la cantidad de pasos especificada
    // El robot solo avanzará si tiene suficiente batería
    public void avanzar(int pasos) {
        int energiaNecesaria = pasos / 100 * 10; // Cada 100 pasos consume 10 unidades de energía
        if (bateria >= energiaNecesaria) {
            System.out.println("Avanzando " + pasos + " pasos...");
            bateria -= energiaNecesaria; // Se resta la energía consumida de la batería
        } else {
            System.out.println("No hay suficiente batería para avanzar " + pasos + " pasos.");
        }
    }

    // Método para verificar si la batería está vacía
    public boolean bateriaVacia() {
        return bateria <= 0;
    }
}

