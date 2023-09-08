public class Error2 {
    public void catchError() throws ArrayIndexOutOfBoundsException{
        int[] arr = {0, 1};

        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erreur capturée :: ArrayIndexOutOfBoundsException");
        }

    }
}
