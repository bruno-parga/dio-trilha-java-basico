public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 25.0;

        if(valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atual: R$" + saldo);
        }else{
            System.out.println("Saldo insuficiente para saldo: R$" + saldo);
        }
    }
}
