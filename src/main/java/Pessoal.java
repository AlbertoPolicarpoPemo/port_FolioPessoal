    public abstract class Pessoal {

        private String nome;
        private String cc;
        private int horasSemanais;

        public Pessoal(String nome, String cc, int horasSemanais) {
            this.nome = nome;
            this.cc = cc;
            this.horasSemanais = horasSemanais;
        }

        public abstract double calcularSalario();

        public String getNome() {
            return nome;
        }

        public String getCc() {
            return cc;
        }

        public int getHorasSemanais() {
            return horasSemanais;
        }
}
