package atividademedia;

/**
 * Classe criada para simular um boletim para aprovacao
 *
 * @author Carlos Eduardo 
 * @since 14/12/2024 at 00:28
 */
public class Notas {

    private String nome;
    private Double nota1, nota2, nota3, nota4, soma;

    Notas(String nome, Double nota1, Double nota2, Double nota3, Double nota4) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    /**
     * Metodo criado para simular a media para verificar aprovacao
     *
     * @param nota1 - NOTA primeiro bi
     * @param nota2 - NOTA segundo bi
     * @param nota3 - NOTA terceiro bi
     * @param nota4 - NOTA quarto bi
     * @return Calculo da media das 4 notas bimestrais
     * @throws ArithmeticException
     */
    public Double Media(Double nota1, Double nota2, Double nota3, Double nota4) throws ArithmeticException {

        try {
            return soma = (nota1 + nota2 + nota3 + nota4) / 4;
        } catch (ArithmeticException e) {
            return 0.00;
        }
    }

    /**
     * Metodo para validar a aprovacao do aluno no ano
     *
     * @return A condiçao para ver se o aluno foi aprovado ou reprovado
     * @throws ArithmeticException
     */
    public String Aprovacao() {

        try {
            if (soma >= 60.00) {
                return "Parabens " + this.nome + " voce foi aprovado";

            } else {
                return ("Voce" + this.nome + ", nao passou, estude mais da proxima vez!");
            }
        } catch (ArithmeticException e) {

        }
        return "Esse foi o resultado final! ";

    }

}
