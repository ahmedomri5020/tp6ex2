import static java.lang.Math.sqrt;
public class Main {
    public static void main(String[] args) {
        double n;
        double x;
        try{
            x=Double.parseDouble(args[0]);
            n=Double.parseDouble(args[0]);
            System.out.println(mathematique.f(x,n));
        }catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage()+"entre deux parametres");
        }
        catch(NumberFormatException e){
            System.out.println("Entre deux parametre de type double ! ");
        }
        catch(ParametreNullException e){
            System.out.println(e.getMessage()+"Parametre null");
        }
        catch(NegatifException e){
            System.out.println(e.getMessage());
        }
    }}
