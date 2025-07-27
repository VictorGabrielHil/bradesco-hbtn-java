public class Numero {
    static int c;
    public static void dividir(int a, int b){

        try{
             c = a / b;
        }catch (ArithmeticException e){
            System.out.println("Nao eh possivel dividir por zero");
        } finally {
            System.out.printf("%d / %d = %d", a, b, c);
        }
    }

}