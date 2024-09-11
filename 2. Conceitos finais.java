import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    private String matricula;
    private double nota;

    public Aluno(String matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public String getConceito() {
        if (nota >= 9.0) {
            return "A";
        } else if (nota >= 7 && nota < 9) {
            return "B";
        } else if (nota >= 5 && nota < 7) {
            return "C";
        } else if (nota >= 0 && nota < 5) {
            return "D";
        } else {
            return "Nota inválida";
        }
    }
}

class Turma {
    private ArrayList<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirDadosAlunos() {
        System.out.println("\nDados dos Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("Matrícula: " + aluno.getMatricula() +
                    " | Nota: " + aluno.getNota() +
                    " | Conceito: " + aluno.getConceito());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma();

        while (true) {
            System.out.print("Digite a matrícula do aluno (alfanumérico): ");
            String matricula = scanner.nextLine();

            System.out.print("Digite a nota do aluno (numérica): ");
            double nota = scanner.nextDouble();
            scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nota);
            turma.adicionarAluno(aluno);

            System.out.print("Deseja adicionar outro aluno? (S/N): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }

        turma.exibirDadosAlunos();

        scanner.close();
    }
}
