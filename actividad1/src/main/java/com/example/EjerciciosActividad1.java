package com.example;

public class EjerciciosActividad1 {
    public static void main(String[] args) {
        // --- Declaración de variables ---
        int edad = 19;
        System.out.println("Edad: " + edad);

        double precio = 10.000;
        System.out.println("Precio: " + precio);

        String nombre = "Tatiana";
        System.out.println("Nombre: " + nombre);

        // --- Identificadores ---
        int edadEstudiante = 20;
        String nombreCompleto = "Juan Pérez";
        final int MAX_EDAD = 100;

        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Edad: " + edadEstudiante);
        System.out.println("Constante MAX_EDAD: " + MAX_EDAD);

        // --- Identificadores ---
        int edadEstudiantet = 20;
        String nombreCompletot = "Tatiana Vanegas";
        System.out.println("Nombre del estudiante: " + nombreCompletot);
        System.out.println("Edad: " + edadEstudiantet);

        // Constante en mayúsculas con guion bajo
        final int MAX_PUNTAJE = 100;
        System.out.println("Constante MAX_PUNTAJE: " + MAX_PUNTAJE);

        // Ejemplo de PascalCase en clase
        class PersonaEjemplo {
            String mensajeConvencion = "Las clases usan PascalCase.";
        }
        PersonaEjemplo ejemplo = new PersonaEjemplo();
        System.out.println(ejemplo.mensajeConvencion);

        // --- Estilos de convención de codificación ---
        int numeroAlumno = 5; // lowerCamelCase
        int valor_snake_case = 15; // snake_case válido, no recomendado
        System.out.println("Variable lowerCamelCase: " + numeroAlumno);
        System.out.println("Variable snake_case: " + valor_snake_case);

        // --- Tipos de datos primitivos ---
        byte b = 100;
        short s = 2000;
        int i = 50000;
        long l = 100000000L;
        float f = 5.75f;
        double d = 99.99;
        boolean activo = true;
        char letra = 'J';

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + activo);
        System.out.println("char: " + letra);

        // Operación aritmética básica
        int suma = 10 + 5;
        System.out.println("Suma: " + suma);

        // Uso de boolean en condicional
        boolean aprobado = true;
        if (aprobado) {
            System.out.println("El aprendiz aprobó el módulo.");
        } else {
            System.out.println("El aprendiz no aprobó.");
        }

        // --- Tipos de datos no primitivos ---
        String saludo = "Centro Tecnológico de la Manufactura Avanzada - SENA";
        System.out.println(saludo);

        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        System.out.println("Valores del arreglo: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);

        class Persona {
            String nombre;
            int edad;

            Persona(String n, int e) {
                nombre = n;
                edad = e;
            }
        }
        Persona persona = new Persona("Laura", 25);
        System.out.println("Persona: " + persona.nombre + ", Edad: " + persona.edad);

        // --- Operadores aritméticos ---
        int a = 8, b2 = 3;
        System.out.println("Suma: " + (a + b2));
        System.out.println("Resta: " + (a - b2));
        System.out.println("Multiplicación: " + (a * b2));
        System.out.println("División entera: " + (a / b2));
        System.out.println("División decimal: " + ((double) a / b2));
        System.out.println("Módulo: " + (a % b2));

        int contador = 5;
        contador++;
        System.out.println("Incremento: " + contador);
        contador--;
        System.out.println("Decremento: " + contador);

        // --- Operadores de asignación ---
         int valor = 10;
        valor += 5;
        System.out.println("Resultado += : " + valor);
        valor -= 3;
        System.out.println("Resultado -= : " + valor);
        valor *= 2;
        System.out.println("Resultado *= : " + valor);
        valor /= 4;
        System.out.println("Resultado /= : " + valor);
        valor %= 3;
        System.out.println("Resultado %= : " + valor);
        System.out.println("El operador %= devuelve el residuo de la división.");


        // --- Operadores de comparación ---
          int x = 7, y = 9;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        if (x < y) {
            System.out.println("x es menor que y");
        }


        // --- Operadores lógicos ---
         boolean cond1 = true, cond2 = false;
        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("!cond1: " + (!cond1));

        boolean resultadoCompuesto = (cond1 && !cond2) || (x < y);
        System.out.println("Resultado compuesto: " + resultadoCompuesto);


        // --- If ---
        int n1 = 10, n2 = 5;
        if (n1 > n2) {
            System.out.println("n1 es mayor que n2");
        }

        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }

        int numeroRango = 75;
        if (numeroRango < 50) {
            System.out.println("Bajo");
        } else if (numeroRango < 80) {
            System.out.println("Medio");
        } else {
            System.out.println("Alto");
        }


        // === Operador ternario ===
        int Edad = 18;
        String resultadoEdad = (Edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(resultadoEdad);

        int cantidad = 15;
        double precioUnitario = 10.0;
        double total = (cantidad > 10) ? precioUnitario * cantidad * 0.9 : precioUnitario * cantidad;
        System.out.println("Total con posible descuento: " + total);

        int numeroParImpar = 7;
        String paridad = (numeroParImpar % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número es: " + paridad);

        // --- Switch ---
        String dia = "Martes";
        switch (dia) {
            case "Lunes": System.out.println("Día 1"); break;
            case "Martes": System.out.println("Día 2"); break;
            case "Miércoles": System.out.println("Día 3"); break;
            case "Jueves": System.out.println("Día 4"); break;
            case "Viernes": System.out.println("Día 5"); break;
            default: System.out.println("Fin de semana");
        }

        int nota = 4;
        switch (nota) {
            case 1: System.out.println("Insuficiente"); break;
            case 2: System.out.println("Regular"); break;
            case 3: System.out.println("Bueno"); break;
            case 4: System.out.println("Muy bueno"); break;
            case 5: System.out.println("Excelente"); break;
            default: System.out.println("Nota inválida");
        }

        int estacion = 3;
        switch (estacion) {
            case 1: System.out.println("Primavera"); break;
            case 2: System.out.println("Verano"); break;
            case 3: System.out.println("Otoño"); break;
            case 4: System.out.println("Invierno"); break;
            default: System.out.println("Número no válido");
        }



        // --- Otros ejemplos ---
        int numero3 = -8;
        if (numero3 > 0) {
            System.out.println("Número positivo");
        } else if (numero3 < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Cero");
        }

        String contrasenaEsperada = "sena2025";
        String contrasenaIngresada = "sena2025";
        if (contrasenaIngresada.equals(contrasenaEsperada)) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Contraseña incorrecta");
        }

        int calificacion = 85;
        if (calificacion >= 90) {
            System.out.println("Excelente");
        } else if (calificacion >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

    }
}