public class Aplicacao{
    public static void main(String[] args){
        

        Aluno aluno1 = new Aluno(new Prova(4.0,2.5),new Prova(1.0,7.0));
        Aluno aluno2 = new Aluno(new Prova(6.5,3.5),new Prova(0.0,3.0));
        Aluno aluno3 = new Aluno(new Prova(5.0,4.0),new Prova(6.0,1.5));

        Turma turmaA = new Turma(aluno1,aluno2,aluno3);

        System.out.println(aluno1.calcularMedia()+" "+aluno2.calcularMedia()+" "+aluno3.calcularMedia());

        System.out.println(turmaA.calcularMedia());
    }
}