package szakdolgozat;

/**
 *
 * @author Juhász Levente
 */
public class Szakdolgozat {

    public static void main(String[] args) {

        Kezdooldal k = new Kezdooldal();

       
        k.setVisible(true);
        k.setResizable(false);
        k.setLocationRelativeTo(null);

        k.ShowLoginPanel();
        k.dontShowRegistrationPanel();
        k.dontShowAdminPanel();
        k.dontShowUserPanel();
        

    }

}
