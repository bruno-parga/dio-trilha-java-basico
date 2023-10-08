public class ExemploBreakContinue {
    public static void main(String[] args) {

        /*
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3) {
                break;
            }
            System.out.println(numero);
        } //saída vai ser 1 2

         */

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3) {
                continue;
            }
            System.out.println(numero);
        } //saída vai ser 1 2 4 5 (ignorando o 3 no caso)

    }
}
