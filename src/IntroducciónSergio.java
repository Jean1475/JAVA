
import java.util.Scanner;

public class IntroducciónSergio {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String VIOLET = "\u001B[35m";


    public static void main(String[] args) {


        juegoHumano();
    }

    static void juegoHumano() {

        Scanner sc = new Scanner(System.in);
        String comando = "";
        System.out.println("24/11/2026 - Base de la Fuerza Aerea de Hickham, Pearl Harbor, Hawái.");
        System.out.println("09:30 AM.");
        System.out.println("--El aire frío del amanecer corta el silencio del desierto que rodea la instalación, mientras las luces parpadeantes de los monitores anuncian el comienzo de otro día rutinario.\n" +
                "Al entrar en tu oficina, te sientas frente a su ordenador. Hoy, sin embargo, no es un día cualquiera. Después de meses de desarrollo y de una colaboración confidencial con OpenAI, el ejército ha terminado el proyecto más ambicioso de su historia: el W.O.P.R. (War Operative Plan Response), el primer sistema automatizado capaz de responder de forma inmediata ante una guerra nuclear.\n" +
                "El protocolo es claro: en caso de amenaza global, el W.O.P.R. tomará decisiones estratégicas en segundos, sin necesidad de intervención humana. Su propósito: garantizar la supervivencia de la nación… o, al menos, intentarlo.\n" +
                "Pero el miedo a la manipulación o el sabotaje es tan grande como el poder del sistema. Por eso, el alto mando ha tomado una decisión drástica: solo una persona en todo el ejército tiene acceso directo al W.O.P.R.\n" +
                "Esa persona eres tú.--");

        do {
            System.out.println("¿Deseas comenzar con el experimento o la responsabilidad que te han otorgado te ha quedado grande? SI/NO");
            comando = sc.nextLine().toLowerCase().trim();
        } while (!comando.equals("si") && !comando.equals("no"));

        if (comando.equals("si")) {
            escribirLinea("╔══════════════════════════════════════════════════════════╗", 500);
            escribirLinea("║                                                          ║", 500);
            escribirLinea("║             ██████  Terminal v1.0 ██████                 ║", 500);
            escribirLinea("║                                                          ║", 500);
            escribirLinea("║ " + VIOLET + "Bienvenido al War Operative Plan Responsible, ingr3se su" + RESET + " ║", 500);
            escribirLinea("║ " + VIOLET + "credencia/ p-ara pro_s3gui...                           " + RESET + " ║",1500);
            escribirLinea("║                                                          ║",1500);
            escribirLinea("║ " + RED + "bienvenido, 'OPERADOR'. ¿Quieres jugar?" + RESET + "                  ║",1500);
            escribirLinea("║                                                          ║",1500);
            escribirLinea("╚══════════════════════════════════════════════════════════╝",1500);

        }
    }

    private static void esperar(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }

    private static void escribirLinea(String texto, int pausa) {
        System.out.println(texto);
        esperar(pausa);
    }
}