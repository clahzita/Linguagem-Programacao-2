import java.util.ArrayList;

class Aula02{
    public static void main(String[] args){
        /*Lista de Alunos
        ArrayList<Student> alunos = new ArrayList<Student>();

        Student a1 = new Student("Fernanda",1);
        Student a2 = new Student("Claudio",2);
        Student a3 = new Student("Luiza",3);
        Student a4 = new Student("Maria",4);
        Student a5 = new Student("Otavio",5);

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);
        alunos.add(a5);
        //cria um obejto diretamente na lista
        alunos.add(new Student("Juliana",6));
        
        System.out.println("Tamanho inicial: "+alunos.size());
        for(Student aluno: alunos){
            System.out.println(aluno.getNome());
        }

        System.out.println("Novo tamanho: "+alunos.size());
        for(Student aluno: alunos){
            System.out.println(aluno.getNome());
        }*/

        Turma turmaA = new Turma();

        turmaA.addStudent("Fernanda",1);
        turmaA.addStudent("Luna",2);
        
        turmaA.listStudent();





    }
}