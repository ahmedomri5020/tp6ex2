import static java.lang.Math.sqrt;
public class mathematique {
double n;
double x;

static double f(double x,double n)throws ParametreNullException,NegatifException{
    if(n==0){
        throw new ParametreNullException("erreur");
    }
    if(x<0){
        throw new NegatifException("erreur");
    }
    return Math.sqrt(x)/n;
}
}
