public class ExemploForArray {
    public static void main(String[] args) {

        //controle de fluxo for , para interagir sobre arrays e coleções:
        //Em arrays o indice incia sempre em ZERO
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        //Aqui ele vai percorrer todo o vetor alunos[]

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        //Forma abreviada do for each
        for(String aluno : alunos) {
            System.out.println("Forma abreviada: " + aluno);
        }

    }
}
