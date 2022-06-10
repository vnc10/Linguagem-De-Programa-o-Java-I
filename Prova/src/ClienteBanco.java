abstract class ClienteBanco implements Verifica {

    private int numeroConta;

    private String nome;

    private Endereco ender;

    public int getNumeroConta() {
        return numeroConta;
    }

    public ClienteBanco() {
        this.numeroConta = 0;
        this.nome = "";
        this.ender = new Endereco();
    }

    public void setNumeroConta(int numeroConta) throws NumException {
        if(numeroConta > 0){
            this.numeroConta = numeroConta;
        } else {
            throw new NumException();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnder() {
        return ender;
    }

    public void setEnder(Endereco ender) {
        this.ender = ender;
    }

    abstract void verifDoc();

    @Override
    public void validar() {
        if(this.numeroConta % 2 == 0){
            System.out.println("Numero da conta é par");
        } else {
            System.out.println("Numero da conta é impar");
        }
    }
}
