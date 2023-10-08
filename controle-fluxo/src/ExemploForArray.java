public class ExemploForArray {
    public static void main(String[] args) {

        //controle de fluxo for , para interagir sobre arrays e coleções:
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        //Aqui ele vai percorrer todo o vetor alunos[]

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

    }
}
