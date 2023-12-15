public class Professor extends Pessoal{
    private double valorHora;
    private int sexenios;
    public Professor(String nome, String cc, int horasSemanais, double valorHora, int sexenios) {
        super(nome, cc, horasSemanais);
        this.valorHora=valorHora;
        this. sexenios=sexenios;
    }

    @Override
    public double calcularSalario() {
        return  getHorasSemanais() * 4 * valorHora + sexenios * 100;
    }
}
