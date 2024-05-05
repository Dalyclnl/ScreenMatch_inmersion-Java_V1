import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersion Java");
        // System.out.println("Pelicula Matrix");

        // Declaracion de variables
        int fechaDeLanzamiento = 1999;        //dato primitivo
        double evaluacion = 4.5;             //dato primitivo
        boolean incluidoPlanBasico = true;   //dato primitivo
        String nombre = "Matrix";            //clase comienzan con Mayuscula
        String sinopsis = """
                La mejor pelicula del fin del milineio
                """;

        double mediaEvaluacionUsuario = 0;              // se usa "," para los decimales ( coma)

        System.out.println("Pelicula:" + nombre);   // el + concatena texto con string u otro texto
        System.out.println(fechaDeLanzamiento);  //
        System.out.println(evaluacion);
        System.out.println(incluidoPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;  // operaciones matematicas
        System.out.println("Media de Evaluacion" + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula Popular del momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula" + "Matrix calculada por el usuario es: " +
                 + mediaEvaluacionUsuario / 3);
    }
}