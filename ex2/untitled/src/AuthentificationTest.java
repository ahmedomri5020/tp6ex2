import java.io.IOException;

public class AuthentificationTest {
    public static void main(String[] args) {
        boolean authentificationReussie = false;
        while (!authentificationReussie) {
            try {
                Authentification auth=new Authentification();
                authentificationReussie = true;
            } catch (WrongInputLength | WrongLoginException | WrongPwdException e) {
                System.out.println("Erreur d'authentification : " + e.getMessage());
            }
        }
    }
}