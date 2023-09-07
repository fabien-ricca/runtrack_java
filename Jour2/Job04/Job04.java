public class Job04 {
    public static void main(String[] args){
        try{
            System.out.println(Diviser.calcul(10, 0));
        }
        catch(ExceptionByZero errorMess){
            System.out.println(errorMess.getMessage());
        }
        System.out.println(10/2);
    }
}
