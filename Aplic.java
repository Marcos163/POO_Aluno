
package fatec.poo.aula1;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Aplic {

   
    public static void main(String[] args) {
    Scanner Entrada = new Scanner(System.in);
    Aluno objAluno = new Aluno();
    
    int ra;
    double ntPrv1, ntPrv2, ntTrab1, ntTrab2;
    
    System.out.println("Insira o RA: ");
    ra = Entrada.nextInt();
    System.out.println("Insira a nota da primeira prova: ");
    ntPrv1 = Entrada.nextDouble();
    System.out.println("Insira a nota da segunda prova: ");
    ntPrv2 = Entrada.nextDouble();
    System.out.println("Insira a nota do primeiro trabalho: ");
    ntTrab1 = Entrada.nextDouble();
    System.out.println("Insira a nota do segundo trabalho: ");
    ntTrab2 = Entrada.nextDouble();
    
    objAluno.setRA(ra);
    objAluno.setNtPrv1(ntPrv1);
    objAluno.setNtPrv2(ntPrv2);
    objAluno.setNtTrab1(ntTrab1);
    objAluno.setNtTrab2(ntTrab2);
    
    System.out.println("RA: " + ra);
    System.out.println("Nota prova 1: " + ntPrv1);
    System.out.println("Nota prova 2: " + ntPrv2);
    System.out.println("Nota Trabalho 1: " + ntTrab1);
    System.out.println("Nota Trabalho 2: " + ntTrab2);
    System.out.println("Media Provas: " + objAluno.calcMediaProva());
    System.out.println("Media Trabalhos: " + objAluno.calcMediaTrab());
    System.out.println("Media Final: " + objAluno.calcMediaFinal());
    
    
    }
    
}
