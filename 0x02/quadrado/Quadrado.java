public class Quadrado {
    public static double area(double lado){

        if (lado > 0) {
            return lado * 1;
        }
        else {
            throw new IllegalArgumentException("Lado deve possuir valor positiv");
        }
    }

}