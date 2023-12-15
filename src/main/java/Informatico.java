public class Informatico extends Pessoal{

    private double valorHora;
    public Informatico(String nome, String cc, int horasSemanais, double valorHora) {
        super(nome, cc, horasSemanais);
        this.valorHora=valorHora;
    }


    public double calcularSalario() {
        return getHorasSemanais() * 4 * valorHora;
    }
}
