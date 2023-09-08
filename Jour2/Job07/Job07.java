public class Job07 {
    public static void main(String[] args){
        Error1 error1 = new Error1();
        Error2 error2 = new Error2();
        Error3 error3 = new Error3();

        error1.catchError();
        error2.catchError();
        error3.catchError();


        System.out.println("Test de non crash réussi");
    }
}
