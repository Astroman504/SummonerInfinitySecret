
package summonerinfinitysecret;

/**
 *
 * @author Christhian
 */
public class Global {
    public static String Winner = "";
    
    public static String P1="";
    public static int P1Vida;
    public static int P1Ataque;
    public static String NombreAttacP1="";
    public static int P1Ataque2;
    public static String NombreAttacP12="";
    
    public static String P2="";
    public static int P2Vida;
    public static int P2Ataque;
    public static String NombreAttacP2="";
    public static int P2Ataque2;
    public static String NombreAttacP21="";
    
    public static boolean P1Turn = true;
    public static boolean P2Turn = true;
    
    public static boolean Turno = true;
    
    public static int VidaGolem = 950;
    public static int AtaqueGolem = 150;
    public static String NombreAttacGolem = "Impactar";
    public static int AtaqueGolem2 = 250;
    public static String NombreAttacGolem2 = "Explosion Focko";
    
    public static int VidaMago = 1000;
    public static int AtaqueMago = 100;
    public static String NombreAttacMago = "Invocacion de cuervo";
    public static int AtaqueMago2 = 260;
    public static String NombreAttacMago2 = "Onda oscura";
    
    public static int VidaValkyrie = 1200;
    public static int AtaqueValkyrie = 80;
    public static String NombreAttacValkyrie = "Espada de Promesa";
    public static int AtaqueValkyrie2 = 300;
    public static String NombreAttacValkyrie2 = "Segador de Almas";
    
    public static int VidaArcher = 900;
    public static int AtaqueArcher = 80;
    public static String NombreArcher = "Destructor afilado";
    public static int AtaqueArcher2 = 210;
    public static String NombreAttacArcher = "Ira del espiritu";
    
    public static int getP1Vida() {
        return P1Vida;
    }

    public static int getP2Vida() {
        return P2Vida;
    }

    public static int getP1Ataque() {
        return P1Ataque;
    }

    public static int getP2Ataque() {
        return P2Ataque;
    }

    public static boolean isTurno() {
        return Turno;
    }

    public static int getVidaGolem() {
        return VidaGolem;
    }

    public static int getAtaqueGolem() {
        return AtaqueGolem;
    }

    public static int getVidaMago() {
        return VidaMago;
    }

    public static int getAtaqueMago() {
        return AtaqueMago;
    }

    public static void setP1Vida(int P1Vida) {
        Global.P1Vida = P1Vida;
    }

    public static void setP2Vida(int P2Vida) {
        Global.P2Vida = P2Vida;
    }

    public static void setP1Ataque(int P1Ataque) {
        Global.P1Ataque = P1Ataque;
    }

    public static void setP2Ataque(int P2Ataque) {
        Global.P2Ataque = P2Ataque;
    }

    public static void setTurno(boolean Turno) {
        Global.Turno = Turno;
    }

    public static void setVidaGolem(int VidaGolem) {
        Global.VidaGolem = VidaGolem;
    }

    public static void setAtaqueGolem(int AtaqueGolem) {
        Global.AtaqueGolem = AtaqueGolem;
    }

    public static void setVidaMago(int VidaMago) {
        Global.VidaMago = VidaMago;
    }

    public static void setAtaqueMago(int AtaqueMago) {
        Global.AtaqueMago = AtaqueMago;
    }

    void getClass(int P1Vida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}




