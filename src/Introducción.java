import java.util.Scanner;

public class Introducción {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre = " ";
        char sn;

        System.out.println("24/11/2026 - Base de la Fuerza Aerea de Hickham, Pearl Harbor, Hawái.");
        System.out.println("09:30 AM.");
        System.out.println("--El aire frío del amanecer corta el silencio del desierto que rodea la instalación, mientras las luces parpadeantes de los monitores anuncian el comienzo de otro día rutinario.\n" +
                "Al entrar en tu oficina, te sientas frente a su ordenador. Hoy, sin embargo, no es un día cualquiera. Después de meses de desarrollo y de una colaboración confidencial con OpenAI, el ejército ha terminado el proyecto más ambicioso de su historia: el W.O.P.R. (War Operative Plan Response), el primer sistema automatizado capaz de responder de forma inmediata ante una guerra nuclear.\n" +
                "El protocolo es claro: en caso de amenaza global, el W.O.P.R. tomará decisiones estratégicas en segundos, sin necesidad de intervención humana. Su propósito: garantizar la supervivencia de la nación… o, al menos, intentarlo.\n" +
                "Pero el miedo a la manipulación o el sabotaje es tan grande como el poder del sistema. Por eso, el alto mando ha tomado una decisión drástica: solo una persona en todo el ejército tiene acceso directo al W.O.P.R.\n" +
                "Esa persona eres tú.--");

        System.out.println("¿Deseas comenzar con el experimento o la responsabilidad que te han otorgado te ha quedado grande? S/N");
        if (sc.next().equals("S")) {
            System.out.println("Decides aceptar, lo que da inicio al experimento, recuerda que todo esto es un experimento, o eso se supone......");
        } else if (sc.next().equals("N")) {
            System.out.println("Dado la importancia del proyecto, y tu nulas ganas de cargar una responsabilidad tan grandes como las de cargar con el peso del futuro de la humanidad\n+" +
                    "decides abandonar antes del experimento, lo que te cuesta el cargo y tu futuro en el Seal Team. Bien hecho, 'soldado'. ");
        } else {
            System.out.println("Opción no permitida");
        }







        System.out.println("...........");
        System.out.println("...........");
        System.out.println("...........");
        System.out.println("Bienvenido al Entorno de Desarollo del equipo experimental del Seal Team, Introduzca sus credenciales OPERADOR.");
        System.out.println("NOMBRE");
        nombre = sc.nextLine();
        System.out.println("CONTRASEÑA");


    }

}
