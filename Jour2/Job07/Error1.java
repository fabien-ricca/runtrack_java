public class Error1 {
    public void catchError() throws NullPointerException{
        String str = null;

        try{
            System.out.println(str.charAt(2));
        }
        catch (NullPointerException e){
            System.out.println("Erreur capturée :: NullPointerException");
        }
    }
}
