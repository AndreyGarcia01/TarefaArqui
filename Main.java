public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso("Ciência da Computação", 4);


        Disciplina prog1 = new Disciplina("Programação 1");
        Disciplina prog2 = new Disciplina("Programação 2");
        curso.adicionarDisciplina(prog1);
        curso.adicionarDisciplina(prog2);


        Aluno aluno1 = new Aluno("João", 1);
        Aluno aluno2 = new Aluno("Maria", 2);


        curso.matricularAlunoEmDisciplina(aluno1, prog1, 2023, 1);
        curso.matricularAlunoEmDisciplina(aluno2, prog2, 2023, 1);
        curso.matricularAlunoEmDisciplina(aluno1, prog2, 2023, 1);


        List<Aluno> alunosMatriculados = curso.obterAlunosDoCurso();


        System.out.println("Alunos matriculados no curso:");
        for (Aluno aluno : alunosMatriculados) {
            System.out.println(aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
        }


        List<Aluno> alunosMatriculadosProg2 = prog2.obterAlunosMatriculados();

        System.out.println("\nAlunos matriculados na disciplina de programação 2:");
        for (Aluno aluno : alunosMatriculadosProg2) {
            System.out.println(aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
        }
    }
}