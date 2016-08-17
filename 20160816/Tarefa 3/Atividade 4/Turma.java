public class Turma{
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;

    public Turma(){
        aluno1 = new Aluno();
        aluno2 = new Aluno();
        aluno3 = new Aluno();
    }

    public Turma(Aluno aluno1, Aluno aluno2, Aluno aluno3){
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
        this.aluno3 = aluno3;
    }
  

    public double calcularMedia(){
        return (aluno1.calcularMedia()+aluno2.calcularMedia()+aluno3.calcularMedia())/3;
    }
}