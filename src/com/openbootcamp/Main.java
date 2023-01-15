package com.openbootcamp;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Lucia";
        cliente.edad = 23;
        cliente.telefono = "0303456";
        cliente.credito  = 60000;
        System.out.println("Nombre de cliente: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono de contacto: " + cliente.telefono);
        System.out.println("Credito disponible: " + cliente.credito);
        System.out.println("********************************************");
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Esteban";
        trabajador.edad = 32;
        trabajador.telefono = "3764676018";
        trabajador.salario  = 5000;
        System.out.println("Nombre del trabajador: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Contacto: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}
