import java.text.DecimalFormat;

public class Universidade {

    public static void imprimirNominas(Pessoal[] listaPessoal) {
        DecimalFormat df = new DecimalFormat("#.##");

        for (Pessoal pessoal : listaPessoal) {
            String categoria = "";

            if (pessoal instanceof Administrativo) {
                categoria = "Administrativo";
            } else if (pessoal instanceof Informatico) {
                categoria = "Informático";
            } else if (pessoal instanceof Professor) {
                categoria = "Professor";
            } else if (pessoal instanceof Investigador) {
                categoria = "Investigador";
            }

            double saldo = pessoal.calcularSalario() / 100.0; // Convertendo para euros

            System.out.println("Nome: " + pessoal.getNome());
            System.out.println("Categoria: " + categoria);
            System.out.println("Saldo: €" + df.format(saldo));
            System.out.println();
        }
    }

    public static int obterOrcamentoTotal(Pessoal[] listaPessoal) {
        int orcamentoTotal = 0;

        for (Pessoal pessoal : listaPessoal) {
            orcamentoTotal += pessoal.calcularSalario();
        }

        return orcamentoTotal;
    }
}
