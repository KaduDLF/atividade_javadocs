package atividademedia;

import java.util.Scanner;

/**
 *
 * @author Carlos Eduardo
 * @since 14/12/2024 at 00:18
 */

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();
        System.out.println("Informe a nota do primeiro bi: ");
        Double nota1 = scan.nextDouble();
        System.out.println("Informe a nota do segundo bi: ");
        Double nota2 = scan.nextDouble();
        System.out.println("Informe a nota do terceiro bi: ");
        Double nota3 = scan.nextDouble();
        System.out.println("Informe a nota do quarto bi: ");
        Double nota4 = scan.nextDouble();
        scan.nextLine();
        
        Notas n = new Notas(nome, nota1,nota2,nota3,nota4);
        
        System.out.println("Sua media foi de: " + n.Media(nota1, nota2, nota3, nota4));
        System.out.println(n.Aprovacao());
    }
    
}