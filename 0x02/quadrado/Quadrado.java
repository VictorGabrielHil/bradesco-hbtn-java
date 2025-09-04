public class Quadrado {
    public static double area(double lado){

        if (lado > 0) {
            return Math.pow(lado,2);
        }
        else {
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }
    }

}