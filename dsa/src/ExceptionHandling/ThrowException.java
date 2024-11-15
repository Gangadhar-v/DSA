package ExceptionHandling;


/*
Exception classes
ArithmeticException
IllegalArgumentException
NullPointerException
IndexOutOfBoundsException

 */

/*
throw -> is key word used throw exception explicitly
 */

public class ThrowException {

    public static void main(String agrs[]){

        //handling exception
        try{
            validAge(-30);
        }catch(IllegalArgumentException e){  //catch the same exception
            System.out.println(e.getMessage());
        }

        try{
            divide(10,0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    //throwing exception
    public static void validAge(int age){

        //declaring exception
        if(age<0) throw new IllegalArgumentException("age cannot be negative");
        else{
            System.out.println(age+" your age is valid");
        }

    }

    public static int divide(int a, int b){

        if(b == 0){
            throw new ArithmeticException("cannot divide by zero");
        }else{
            return a/b;
        }
    }
}
