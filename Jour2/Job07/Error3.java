public class Error3 {
    public void catchError() throws ArithmeticException{
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("Erreur capturée :: ArithmeticException");
        }
    }
}
