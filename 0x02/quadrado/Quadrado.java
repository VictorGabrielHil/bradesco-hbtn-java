public class Quadrado {
    public static double area(double lado){

        if (lado > 0) {
            return lado;
        }
        else {
            throw new ArithmeticException("Lado deve possuir valor positivo");
        }
    }

}