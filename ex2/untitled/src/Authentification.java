import java.util.Scanner;
public class Authentification {
    final String loginCorrect="scott";
    final String PwdCorrect="tiger";
    String login;
    String Password;
    Scanner sc = new Scanner(System.in);

    public String getUserLogin() throws WrongInputLength, WrongLoginException {
        System.out.print("Enter username: ");
        login=sc.nextLine();
        if(login.length()>10){
            throw new WrongInputLength("Le login ne doit pas dépasser 10 caractères !");
        }
        if(!login.equals(loginCorrect)){
            throw new WrongLoginException("Le login est incorrecte !");
        }
        return login;
        }
    public String getPwd() throws  WrongInputLength, WrongPwdException{
        System.out.print("Enter Password: ");
        Password=sc.nextLine();
        if(!Password.equals(PwdCorrect)){
            throw new WrongPwdException("Le password est incorrecte");
        }
        if(Password.length()>10){
            throw new WrongInputLength("Le password est trop long");
        }
        return Password;
    }
    public Authentification() throws  WrongInputLength, WrongLoginException, WrongPwdException {
        String login = getUserLogin();
        String password = getPwd();

        System.out.println("Authentification réussie pour le login : " + login);
    }

}
