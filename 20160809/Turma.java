import java.util.ArrayList;

class Turma{
    private ArrayList<Student> alunos;

    public Turma(){
        alunos = new ArrayList<Student>();
    }
    
    public ArrayList<Student> getTurma(){
        return alunos;
    }

    public void addStudent(String nome, int matricula){
        alunos.add(new Student(nome,matricula));
    }

    public void listStudent(){
        for(Student aluno: alunos){
            System.out.println(aluno.getMatricula()+ "\t"+aluno.getNome());
        }
    }

    public void removeStudent(Student alunoR){
        for(int i = 0; i <alunos.size();i++){
            if(alunos.get(i) == alunoR){
                alunos.remove(i);
            }
        }
    }

    public void searchStudentByMatricula(int matricula){
        for(int i = 0; i <alunos.size();i++){
            if(alunos.get(i).getMatricula() == matricula){
                System.out.println(alunos.get(i).getNome()+"\t"+alunos.get(i).getMatricula());
            }
        }
    }
}