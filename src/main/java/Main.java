public class Main {

    public static void main(String[] args) {
        Pessoal[] listaPessoal = new Pessoal[4];
        listaPessoal[0] = new Administrativo("João", "123456789", 37, 7.5);
        listaPessoal[1] = new Informatico("Maria", "987654321", 40, 6);
        listaPessoal[2] = new Professor("Carlos", "456789123", 37, 8, 2);
        listaPessoal[3] = new Investigador("Ana", "789123456", 35, 7);

        Universidade.imprimirNominas(listaPessoal);

        int orcamentoTotal = Universidade.obterOrcamentoTotal(listaPessoal);
        System.out.println("Orçamento total da universidade: €" + orcamentoTotal / 100.0);
    }
}
