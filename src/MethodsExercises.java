public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println("(3 == sum(1,2)) = " + (3 == sum(1,2)));
        System.out.println("(3 == sum(1,4)) = " + (3 == sum(1,4)));

        System.out.println("(3 == subtract(4, 1)) = " + (3 == subtract(4, 1)));

        System.out.println("(9 == multiplication(3, 3)) = " + (9 == multiplication(3, 3)));

        System.out.println("(2 == division(10, 5)) = " + (2 == division(10, 5)));

        System.out.println("(1 == modulus(5, 2)) = " + (1 == modulus(5, 2)));

    }

    public static double sum(double arg1, double arg2){
        return arg1+arg2;
    }

    public static double subtract(double arg1, double arg2){
        return arg1-arg2;
    }

    public static double multiplication(double arg1, double arg2){
        return arg1*arg2;
    }

    public static double division(double arg1, double arg2){
        return arg1/arg2;
    }

    public static double modulus(double arg1, double arg2){
        return arg1 % arg2;
    }



}
