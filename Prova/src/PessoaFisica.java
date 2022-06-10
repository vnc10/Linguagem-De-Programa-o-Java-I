final public class PessoaFisica extends ClienteBanco {

    private int cpf;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica() {
        this.cpf = 0;
    }

    void verifDoc() {
        if(this.cpf >= 10 && this.cpf <= 20){
            System.out.println("CPF válido");
        }
        else {
            System.out.println("CPF inválido");
        }
    }
}
