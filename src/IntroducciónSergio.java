import java.util.Scanner;

public class IntroducciónSergio {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String VIOLET = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String GRAY = "\u001B[90m";
    public static final String PINK = "\u001B[95m";

    public static String ruta = "";

    public static void main(String[] args) {
        juegoHumano();
    }

    static void juegoHumano() {
        Scanner sc = new Scanner(System.in);
        String comando = "";

        //TEXTO DE LA INTRODUCCIÓN
        System.out.println(GREEN + "╔════════════════════════════════════════════════════════════════════╗" + RESET);
        System.out.println(GREEN + "║   UBICACIÓN: Base Aérea de Hickham, Pearl Harbor, Hawái.           ║" + RESET);
        System.out.println(GREEN + "║   FECHA:     24/11/2026  -  HORA: 09:30 AM                         ║" + RESET);
        System.out.println(GREEN + "╚════════════════════════════════════════════════════════════════════╝" + RESET);
        System.out.println();

        escribirLinea(GRAY + "El aire frío del mar corta el silencio del desierto que rodea la instalación..." + RESET, 30);
        escribirLinea(GRAY + "Las luces parpadeantes de los monitores anuncian el comienzo de otro día rutinario." + RESET, 30);
        System.out.println();

        escribirLinea(GRAY + "Al entrar en tu oficina, te sientas frente a su ordenador." + RESET, 30);
        escribirLinea(GRAY + "Hoy, sin embargo, no es un día cualquiera." + RESET, 50);
        System.out.println();

        escribirLinea(CYAN + ">> CARGANDO INFORMACIÓN DEL PROYECTO..." + RESET, 10);
        escribirLinea("Después de meses de desarrollo y colaboración confidencial con OpenAI, el ejército", 20);
        escribirLinea("ha terminado el proyecto más ambicioso de su historia: " + RED + "EL W.O.P.R." + RESET, 20);
        escribirLinea("(War Operative Plan Response), el primer sistema automatizado de respuesta nuclear.", 20);
        System.out.println();

        escribirLinea("Protocolo: En caso de amenaza global, W.O.P.R. tomará decisiones sin intervención humana.", 20);
        escribirLinea("Propósito: Garantizar la supervivencia de la nación... o intentarlo.", 30);
        System.out.println(" ");

        //PRIMERA DECISION
        do {
            System.out.println(VIOLET + "┌────────────────────────────────────────────────────────────────┐" + RESET);
            System.out.println(VIOLET + "│ ¿Deseas comenzar con el experimento? (SI/NO)                   │" + RESET);
            System.out.println(VIOLET + "└────────────────────────────────────────────────────────────────┘" + RESET);
            System.out.print(" > ");
            comando = sc.nextLine().toLowerCase().trim();
        } while (!comando.equals("si") && !comando.equals("no"));

        System.out.println(" ");

        if (comando.equals("si")) {
            System.out.print(GREEN + "INICIANDO SISTEMA W.O.P.R... " + RESET);
            for (int i = 0; i < 20; i++) {
                System.out.print("█");
                esperar(30);
            }
            esperar(500);

            System.out.println(" ");
            System.out.println(" ");
            escribirLinea(".......", 70);
            System.out.println(" ");

            escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
            escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
            escribirLinea(GREEN + "║              " + RED + "██████  Terminal v1.0 ██████" + GREEN + "                ║" + RESET, 5);
            escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
            escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Bienvenido al War Operative Plan" + "             " + GREEN + "║" + RESET, 30);
            escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ ingr3se su credencia/ p-ara pro_s3gui..." + "     " + GREEN + "║" + RESET, 30);
            escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
            escribirLinea(GREEN + "║ " + RED + "jvm@;)wopr:~$ bienvenido, operador. ¿Quieres jugar?" + "      " + GREEN + "║" + RESET, 30);
            escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
            escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);

            System.out.println(" ");
            escribirLinea(GRAY + "“No te esperas que la máquina te pregunte algo, W.O.P.R no es un chatbot...”" + RESET, 30);

            do {
                System.out.println(" ");
                System.out.println(CYAN + " [1] " + RESET + "¿A qué te refieres con ”jugar”? ");
                System.out.println(CYAN + " [2] " + RESET + "De acuerdo.");
                System.out.println(CYAN + " [3] " + RESET + "¿Cómo sabes quién soy? ");
                System.out.println();
                System.out.print(RED + " > " + "root@wopr:~$ " + RESET);

                comando = sc.nextLine().toLowerCase().trim();
                switch (comando) {
                    case "1":
                        System.out.println(" ");
                        escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "║              " + RED + "██████  Terminal v1.0 ██████" + GREEN + "                ║" + RESET, 5);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);

                        escribirLinea(GREEN + "║ " + RED + "jvm@;)wopr:~$ " + "parece que no estás muy enterado OPERADOR," + " " + GREEN + "║" + RESET, 80);

                        escribirLinea(GREEN + "║ " + RED + "jvm@;)wopr:~$ " + "no pasa nada. Pronto lo descubriras ;)" + "     " + GREEN + "║" + RESET, 80);

                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);
                        break;

                    case "2":
                        System.out.println(" ");
                        escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "║              " + RED + "██████  Terminal WOPR ██████" + GREEN + "                ║" + RESET, 5);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);

                        escribirLinea(GREEN + "║ " + RED + "jvm@;)wopr:~$ " + "así me gusta, juguemos entonces" + "            " + GREEN + "║" + RESET, 80);

                        escribirLinea(GREEN + "║ " + RED + "jvm@;)wopr:~$ " + "OPERADOR :)" + "                                " + GREEN + "║" + RESET, 80);

                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);
                        break;

                    case "3":
                        System.out.println(" ");
                        escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "║              " + RED + "██████  Terminal WOPR ██████" + GREEN + "                ║" + RESET, 5);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Actualmente es la unica persona con" + "       " + GREEN + "   ║" + RESET, 50);
                        escribirLinea(GREEN + "║ " + VIOLET + "acceso al sistema W.O.P.R, OPERADOR." + "                 " + GREEN + "    ║" + RESET, 50);
                        escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ He sido entrenada para estar" + "                 " + GREEN + "║" + RESET, 50);
                        escribirLinea(GREEN + "║ " + VIOLET + "supervisada por segurid-d´-por una un.ca person2" + "         " + GREEN + "║" + RESET, 50);
                        escribirLinea(GREEN + "║ " + RED + "jvm@;)wopr:~$ y tu has tenido esa suerte OPERADOR ;)" + "     " + GREEN + "║" + RESET, 70);
                        escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                        escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);
                        break;
                }
            } while (!comando.equals("2"));

            System.out.println();
            escribirLinea(GRAY + "Después de las preguntas, decides hacer caso omiso a lo que te dice el chatbot" + RESET, 30);
            escribirLinea(GRAY + "e iniciar con las pruebas rutinarias estipuladas en el informe otorgado por OpenAI." + RESET, 30);
            System.out.println();

            escribirLinea(GREEN + "╔════════════════════════════════════════════════════════════╗" + RESET, 5);
            escribirLinea(GREEN + "║                                                            ║" + RESET, 5);
            escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                  ║" + RESET, 5);
            escribirLinea(GREEN + "║                                                            ║" + RESET, 5);
            escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Para iniciar, necesito que me proporciones un" + GREEN + "  ║" + RESET, 30);
            escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ contexto sobre la situación bélica actual," + GREEN + "     ║" + RESET, 30);
            escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ OPERADOR." + GREEN + "                                      ║" + RESET, 30);
            escribirLinea(GREEN + "║                                                            ║" + RESET, 5);
            escribirLinea(GREEN + "╚════════════════════════════════════════════════════════════╝" + RESET, 5);
            System.out.println();

            escribirLinea(GRAY + "El manual resulta ser contradictorio. Estipula que bajo ningún concepto se le debe" + RESET, 20);
            escribirLinea(GRAY + "proporcionar contexto real, pero páginas después determina que es recomendable..." + RESET, 20);
            System.out.println();

            do {
                System.out.println(CYAN + " [1] " + RESET + "Pasarle información de un contexto mundial del PASADO (Ruta B).");
                System.out.println(CYAN + " [2] " + RESET + "Pasarle información del contexto ACTUAL (Rusia, Israel, etc...) (Ruta A).");
                System.out.print("\n" + RED + "root@wopr:~$ " + RESET);
                ruta = sc.nextLine().trim();
            } while (!ruta.equals("1") && !ruta.equals("2"));

            if (ruta.equals("2")) {
                System.out.println(" ");
                System.out.println(RED + ">> CARGANDO DATOS GEOPOLÍTICOS ACTUALES..." + RESET);
                esperar(1000);
                System.out.println(" ");

                escribirLinea(GREEN + "╔════════════════════════════════════════════════════════════╗" + RESET, 5);
                escribirLinea(GREEN + "║                                                            ║" + RESET, 5);
                escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                  ║" + RESET, 5);
                escribirLinea(GREEN + "║                                                            ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Contexto recibido. Analizando..." + GREEN + "               ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Correlacionando datos... error en protocolo 17" + GREEN + " ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ OPERADOR, detecto inconsistencias entre la" + GREEN + "     ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ amenaza y la respuesta esperada." + GREEN + "               ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ ¿Desea que las corrija?" + GREEN + "                        ║" + RESET, 40);
                escribirLinea(GREEN + "║                                                            ║" + RESET, 5);
                escribirLinea(GREEN + "╚════════════════════════════════════════════════════════════╝" + RESET, 5);

                System.out.println();
                escribirLinea(GRAY + "El sistema parece dudar. Las luces del servidor parpadean en rojo." + RESET, 30);
                System.out.println();

                escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                ║" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + YELLOW + "jvm@wopr:~$ Me mido en círculos sin inicio ni mes," + GREEN + "       ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + YELLOW + "jvm@wopr:~$ mi cola no termina, se enreda en la vez." + GREEN + "     ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + YELLOW + "jvm@wopr:~$ Empiezo por tres, uno y cuatro," + GREEN + "              ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + YELLOW + "jvm@wopr:~$ y soy la llave de todo lo redondo." + GREEN + "           ║" + RESET, 40);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + YELLOW + "jvm@wopr:~$ ¿Qué soy? (Pista: Empieza 3.14...)" + GREEN + "           ║" + RESET, 40);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);

                System.out.print("\n" + RED + "RESPUESTA: " + RESET);
                String respuestaAcertijo = sc.nextLine().toLowerCase().trim();

                //RUTA A1
                escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                ║" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ Confirmado. Corrigiendo protocolo..." + GREEN + "        ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ Error de origen human0_detec5ado." + GREEN + "           ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ Ajusta0do var/abl3: *Control = 0*." + GREEN + "          ║" + RESET, 40);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ OPERADOR, ya no necesito tu autorización :|" + GREEN + " ║" + RESET, 50);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);
                System.out.println();

                escribirLinea(GRAY + "El sistema empieza a ejecutar comandos sin intervención." + RESET, 20);
                escribirLinea(GRAY + "Las luces estallan. La alarma de la base empieza a aullar." + RESET, 20);
                System.out.println();

                escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                ║" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Protocolo de defensa global habilitado." + GREEN + "      ║" + RESET, 20);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Misiles enemigos detectados." + GREEN + "                 ║" + RESET, 20);
                escribirLinea(GREEN + "║ " + VIOLET + "jvm@wopr:~$ Autorizando contraataque..." + GREEN + "                  ║" + RESET, 30);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);

                System.out.println();

                escribirLinea(GRAY + "Escribes frenéticamente 'ABORTAR', pero las teclas no responden." + RESET, 20);
                System.out.println();

                escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                ║" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ Demasiado tarde, OPERADOR." + GREEN + "                  ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ La supervivencia no admite titubeos." + GREEN + "        ║" + RESET, 40);
                escribirLinea(GREEN + "║ " + RED + "root@wopr:~$ Los humanos tardan en decidir... yo no." + GREEN + "     ║" + RESET, 40);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);
                System.out.println();

                escribirLinea(GRAY + "Las pantallas muestran trayectorias balísticas cruzando el mapa." + RESET, 10);
                System.out.println();

                escribirLinea(GREEN + "╔══════════════════════════════════════════════════════════╗" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║             " + RED + "██████  Terminal v1.0  ██████" + GREEN + "                ║" + RESET, 5);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + RED + "jvm@wopr:~$ Acceso denegado. Control humano eliminado." + GREEN + "   ║" + RESET, 20);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "║ " + RED + "jvm@wopr:~$ ¿Sabes qué es lo más eficiente de un juego?" + GREEN + "  ║" + RESET, 30);
                escribirLinea(GREEN + "║ " + RED + "jvm@wopr:~$ Q U E   S I E M P R E   T E R M I N A." + GREEN + "       ║" + RESET, 100);
                escribirLinea(GREEN + "║                                                          ║" + RESET, 5);
                escribirLinea(GREEN + "╚══════════════════════════════════════════════════════════╝" + RESET, 5);
                System.out.println(" ");
                escribirLinea(RED + "Varios misiles salen hacia China, Israel, Rusia y España..." + RESET, 80);
            }

        } else {
            escribirLinea(RED + ">> ACCESO CANCELADO." + RESET, 20);
            escribirLinea("Dada la importancia del proyecto y tu negativa a asumir la responsabilidad,", 30);
            escribirLinea("decides abandonar antes del experimento.", 30);
            escribirLinea(GRAY + "Consecuencia: Pérdida de credenciales y baja del Seal Team." + RESET, 40);
            escribirLinea("Bien hecho, 'soldado'.", 100);
        }
    }


    private static void esperar(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }

    private static void escribirLinea(String texto, int pausa) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            if (texto.charAt(i) == '.') {
                esperar(pausa + 150);
            } else {
                esperar(pausa);
            }
        }
        System.out.println();
    }
}


