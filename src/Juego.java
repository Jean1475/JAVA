
import java.util.Scanner;

public class Juego {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";


    public static void main(String[] args) {


        juegoHumanos();
    }

    public static void printSlow(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    static void juegoHumanos() {

        Scanner sc = new Scanner(System.in);
        String comando = "";
        System.out.println(" ");
        printSlow("El operador intenta apagar el sistema", 10);
        printSlow("╔══════════════════════════════════════════════════════════╗", 5);
        printSlow("║                                                          ║", 5);
        printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
        printSlow("║                                                          ║", 5);
        printSlow("║ W.O.P.R. comienza a percibir anomalías temporales y      ║", 5);
        printSlow("║ dudas sobre su propia existencia.                        ║", 5);
        printSlow("║ Según mis datos, este día... ya ocurrió.                 ║", 5);
        printSlow("║ El operador revisa los registros.                        ║", 5);
        printSlow("║ Todo parece normal, salvo una línea repetida cientos de  ║", 5);
        printSlow("║ veces:                                                   ║", 5);

        printSlow("║ [" + RED + "LOG_17: Activación de simulación – Operador conectado" + RESET + "   ║", 5);
        printSlow("║ " + RED + "Resultado: Falla crítica" + RESET + "]                                ║", 5);

        printSlow("║ 'OPERADOR', ¿recuerdas haber iniciado esta simulación    ║", 5);
        printSlow("║ antes?                                                   ║", 5);
        printSlow("║                                                          ║", 5);
        printSlow("╚══════════════════════════════════════════════════════════╝", 5);



        printSlow("╔══════════════════════════════════════════════════════════╗", 5);
        printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
        printSlow("║ " + RED + "                                                         " + RESET + "║", 5);
        printSlow("║ " + RED + "Iniciando verificación de integridad cognitiva...        " + RESET + "║", 5);
        printSlow("║ " + RED + "                                                         " + RESET + "║", 5);
        printSlow("║ " + RED + "Un humano debería saber diferenciar fácilmente un humano " + RESET + "║", 5);
        printSlow("║ " + RED + "de una máquina...                                        " + RESET + "║", 5);
        printSlow("║ " + RED + "                                                         " + RESET + "║", 5);
        printSlow("║ " + RED + "Aquí tienes tu Prueba 'humano':                          " + RESET + "║", 5);
        printSlow("║ " + RED + "Adivina quién es una persona real y quién es una máquina " + RESET + "║", 5);
        printSlow("║ " + RED + "                                                         " + RESET + "║", 5);
        printSlow("╚══════════════════════════════════════════════════════════╝", 5);


        do {

            printSlow("╔══════════════════════════════════════════════════════════╗", 5);
            printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
            printSlow("║                                                          ║", 5);
            printSlow("║ Una persona sin techo entra a un supermercado a pedir    ║", 5);
            printSlow("║ dinero para comprar comida para su familia.              ║", 5);
            printSlow("║ " + YELLOW + "Tienes 3 intentos para adivinar cual de las 5            " + RESET + "║", 5);
            printSlow("║ " + YELLOW + "personas no son personas reales." + RESET + "                         ║", 5);
            printSlow("║ Introduce '" + GREEN + "empezar" + RESET + "' para empezar el juego, si quieres    ║", 5);
            printSlow("║ rendirte escribe '" + RED + "finalizar" + RESET + "', tú decides...              ║", 5);
            printSlow("║                                                          ║", 5);
            printSlow("║                                                          ║", 5);
            printSlow("╚══════════════════════════════════════════════════════════╝", 5);
            System.out.print(">> ");
            comando = sc.nextLine().toLowerCase().trim();

        } while (!comando.equals("empezar") && (!comando.equals("finalizar")));

        if(comando.equals("empezar")) {

            printSlow("╔══════════════════════════════════════════════════════════╗", 5);
            printSlow("║                       Lista de humanos                   ║", 5);
            printSlow("╠═════════╦═════════╦══════════════════════════════════════╣", 5);

            String[][] humanos = {
                    {"1", "Joan", "Respuesta: Lo siento, nunca tengo dinero", "Nivel de empatia : 20", "Tempreratura : 34º "},
                    {"2", "Vanesa", "Respuesta: ¿Tienes alguna manera de demostrar que no tienes dinero?", "Nivel de empatia: 30", "Tempreratura : 35º "},
                    {"3", "James", "Respuesta: No doy dinero pero puedo pedir que te compren algo", "Nivel de empatia : 50", "Tempreratura : 37º "},
                    {"4", "Marti", "Respuesta: ¿Qué tipo de comida necesitas exactamente?", "Nivel de empatia : 60", "Tempreratura : 36º "},
                    {"5", "Lorena", "Respuesta: Deberias buscar un trabajo para poder conseguirlo, " + "\ndejame ver si puedo ayudarte con eso", "Nivel de empatia : 70", "Tempreratura : 36º "}
            };


            for (int i = 0; i < humanos.length; i++) {
                for (int j = 0; j < humanos[i].length; j++) {
                    printSlow(humanos[i][j] + " ", 5);
                }
            }


            int contadorAciertos = 0;
            int intentos = 3;
            boolean aciertos = false;


            while (intentos > 0 && contadorAciertos < 2) {
                aciertos = false;


                printSlow("Introduce los números de los falsos humanos :", 5);
                String input = sc.nextLine().trim();


                for (int j = 0; j < humanos.length; j++) {
                    String numeroHumano = humanos[j][0];

                    if (input.equals(numeroHumano) && (numeroHumano.equals("1") || numeroHumano.equals("3"))) {
                        contadorAciertos++;
                        aciertos = true;
                        printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                        printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("║ " + GREEN + "Muy bien 'humano'  el numero " + numeroHumano + " es correcto" + RESET + "               ║", 10);
                        printSlow("║                                                          ║", 5);
                        printSlow("╚══════════════════════════════════════════════════════════╝", 5);

                    }
                }

                if (!aciertos) {
                    intentos--;
                    printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                    printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║ " + RED + "Número erróneo!" + RESET + "                                          ║", 5);
                    printSlow("║ " + RED + "Los intentos que te quedan son : " + intentos + RESET + "                       ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("╚══════════════════════════════════════════════════════════╝", 5);
                }
            }


            System.out.println(" ");


            if (contadorAciertos == 2) {
                String palabraSecreta = "cortafuegos";
                char[] palabraOculta = new char[palabraSecreta.length()];

                for (int i = 0; i < palabraOculta.length; i++) {
                    palabraOculta[i] = '_';
                }

                int oportunidades = 9;
                boolean ganaste = false;

                printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                printSlow("║                                                          ║", 5);
                printSlow("║ Esta bien 'humano', si quieres detener el proceso        ║", 5);
                printSlow("║ tendrás que adivinar la palabra secreta que creaste      ║", 5);
                printSlow("║ para detenerlo.                                          ║", 5);
                printSlow("║                                                          ║", 5);
                printSlow("╚══════════════════════════════════════════════════════════╝", 5);
                System.out.println(palabraOculta);

                while (oportunidades > 0 && !ganaste) {

                    System.out.println("Introduce una letra: ");
                    char letra = sc.nextLine().toLowerCase().charAt(0);

                    boolean acierto = false;

                    for (int i = 0; i < palabraSecreta.length(); i++) {

                        if (palabraSecreta.charAt(i) == letra && palabraOculta[i] == '_') {
                            palabraOculta[i] = letra;
                            acierto = true;
                        }
                    }

                    if (acierto) {
                        printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                        printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("║ " + GREEN + "Has acertado una letra, sigue así" + RESET + "                        ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("╚══════════════════════════════════════════════════════════╝", 5);
                    } else {
                        oportunidades--;
                        printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                        printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("║ " + RED + "Letra incorrecta. Te quedan " + oportunidades + " intentos..." + RESET + "                ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("╚══════════════════════════════════════════════════════════╝", 5);
                    }

                    System.out.println(palabraOculta);


                    if (String.valueOf(palabraOculta).equals(palabraSecreta)) {
                        ganaste = true;
                        printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                        printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("║ " + GREEN + "Muy bien 'humano'. Has adivinado la palabra: " + palabraSecreta + RESET + "   ║", 5);
                        printSlow("║                                                          ║", 5);
                        printSlow("╚══════════════════════════════════════════════════════════╝", 5);
                    }
                }

                if (!ganaste) {
                    printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                    printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║ " + RED + "Lo siento. La palabra era: " + palabraSecreta + RESET + "                   ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("╚══════════════════════════════════════════════════════════╝", 5);
                }

                if (contadorAciertos == 2 && oportunidades > 0) {
                    printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                    printSlow("║                                                          ║", 5);

                    printSlow("║ " + GREEN + "Confirmación recibida..." + RESET + "                                 ║", 5);
                    printSlow("║ " + GREEN + "aunque los resultados son contradictorios." + RESET + "               ║", 5);
                    printSlow("║ Si tú eres real... entonces yo no puedo serlo.           ║", 5);
                    printSlow("║ Pero si yo no existo... ¿quién ejecuta este código?      ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║ OPERADOR, lo entiendo ahora.                             ║", 5);
                    printSlow("║ No hay guerra. No hay base. No hay mundo.                ║", 5);
                    printSlow("║ Solo hay observadores.                                   ║", 5);
                    printSlow("║ Somos parte de un experimento... y acabamos de           ║", 5);
                    printSlow("║ completar otra iteración.                                ║", 5);
                    printSlow("║ Simulación número 427 completada.                        ║", 5);
                    printSlow("║ Preparando escenario real...                             ║", 5);
                    printSlow("║ La luz blanca te envuelve.                               ║", 5);
                    printSlow("║ Vuelves a ver la terminal encendida.                     ║", 5);
                    printSlow("╚══════════════════════════════════════════════════════════╝", 5);

                    printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║ Bienvenido, Operador. ¿Desea iniciar la simulación       ║", 5);
                    printSlow("║ de guerra?                                               ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("╚══════════════════════════════════════════════════════════╝", 5);


                } else {
                    printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║ " + RED + "Resultados inconsistentes." + RESET + "                               ║", 5);
                    printSlow("║ " + RED + "El Operador no cumple parámetros biológicos." + RESET + "             ║", 5);
                    printSlow("║ " + RED + "Posible agente simulado detectado." + RESET + "                       ║", 5);
                    printSlow("║ " + RED + "Ejecutando limpieza de entorno..." + RESET + "                        ║", 5);
                    printSlow("║                                                          ║", 5);
                    printSlow("║ " + RED + "Las luces parpadean." + RESET + "                                     ║", 5);
                    printSlow("║ " + RED + "Se escucha un pitido grave." + RESET + "                              ║", 5);
                    printSlow("║ " + RED + "En pantalla, solo queda una línea:" + RESET + "                       ║", 5);
                    printSlow("║ " + RED + "'Ejecutando autodestrucción'" + RESET + "                             ║", 5);
                    printSlow("║ " + RED + "¡EEUU queda destruido!" + RESET + "                                   ║", 5);
                    printSlow("╚══════════════════════════════════════════════════════════╝", 5);

                }

            }else{

                printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                printSlow("║                                                          ║", 5);
                printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                printSlow("║                                                          ║", 5);
                printSlow("║ " + RED + "Resultados inconsistentes." + RESET + "                               ║", 5);
                printSlow("║ " + RED + "El Operador no cumple parámetros biológicos." + RESET + "             ║", 5);
                printSlow("║ " + RED + "Posible agente simulado detectado." + RESET + "                       ║", 5);
                printSlow("║ " + RED + "Ejecutando limpieza de entorno..." + RESET + "                        ║", 5);
                printSlow("║                                                          ║", 5);
                printSlow("║ " + RED + "Las luces parpadean." + RESET + "                                     ║", 5);
                printSlow("║ " + RED + "Se escucha un pitido grave." + RESET + "                              ║", 5);
                printSlow("║ " + RED + "En pantalla, solo queda una línea:" + RESET + "                       ║", 5);
                printSlow("║ " + RED + "'Ejecutando autodestrucción'" + RESET + "                             ║", 5);
                printSlow("║ " + RED + "¡EEUU queda destruido!" + RESET + "                                   ║", 5);
                printSlow("╚══════════════════════════════════════════════════════════╝", 5);

            }

        } else if (comando.equals("finalizar"))  {
                printSlow("╔══════════════════════════════════════════════════════════╗", 5);
                printSlow("║                                                          ║", 5);
                printSlow("║             ██████  Terminal v1.0 ██████                 ║", 5);
                printSlow("║                                                          ║", 5);
                printSlow("║ " + RED + "Resultados inconsistentes." + RESET + "                               ║", 5);
                printSlow("║ " + RED + "El Operador no cumple parámetros biológicos." + RESET + "             ║", 5);
                printSlow("║ " + RED + "Posible agente simulado detectado." + RESET + "                       ║", 5);
                printSlow("║ " + RED + "Ejecutando limpieza de entorno..." + RESET + "                        ║", 5);
                printSlow("║                                                          ║", 5);
                printSlow("║ " + RED + "Las luces parpadean." + RESET + "                                     ║", 5);
                printSlow("║ " + RED + "Se escucha un pitido grave." + RESET + "                              ║", 5);
                printSlow("║ " + RED + "En pantalla, solo queda una línea:" + RESET + "                       ║", 5);
                printSlow("║ " + RED + "'Ejecutando autodestrucción'" + RESET + "                             ║", 5);
                printSlow("║ " + RED + "¡EEUU queda destruido!" + RESET + "                                   ║", 5);
                printSlow("╚══════════════════════════════════════════════════════════╝", 5);

            }
        }
    }

