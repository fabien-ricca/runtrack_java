public class Diviser {
    public static double calcul(int x, int y) throws ExceptionByZero {
        if(y == 0){
            throw new ExceptionByZero();
        }
        return (double)x / (double)y;
    }
}
