import java.util.Scanner;

public class Juego2 {

    public static void main(String[] args) {
    }
    }

//        Scanner sc = new Scanner(System.in);
//
//        String palabraSecreta = "cortafuegos";
//        char[] palabraOculta = new char[palabraSecreta.length()];
//
//        for (int i = 0; i < palabraOculta.length; i++) {
//            palabraOculta[i] = '_';
//        }
//
//        int intentos = 6;
//        boolean ganaste = false;

//        printSlow("Muy bien 'humano', si quieres detener el proceso tendrás que adivinar la palabra secreta que creaste para detenerlo", 20);
//        System.out.println(palabraOculta);
//
//        while (intentos > 0 && !ganaste) {
//
//            System.out.print("Introduce una letra: ");
//            char letra = sc.nextLine().toLowerCase().charAt(0);
//
//            boolean acierto = false;
//
//            for (int i = 0; i < palabraSecreta.length(); i++) {
//
//                if (palabraSecreta.charAt(i) == letra && palabraOculta[i] == '_') {
//                    palabraOculta[i] = letra;
//                    acierto = true;
//                }
//            }
//
//            if (acierto) {
//                printSlow("Has acertado una letra, sigue así", 20);
//            } else {
//                printSlow("Letra incorrecta. Te quedan " + intentos + " intentos...", 20);
//            }
//
//            System.out.println(palabraOculta);
//
//
//            if (String.valueOf(palabraOculta).equals(palabraSecreta)) {
//                ganaste = true;
//                printSlow("Muy bien 'humano'. Has adivinado la palabra: " + palabraSecreta, 20);
//            }
//        }
//
//        if (!ganaste) {
//            System.out.println("Lo siento. La palabra era: " + palabraSecreta);
//        }
//    }
//}
//
//
//
//

