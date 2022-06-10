final public class PessoaJuridica extends ClienteBanco {

    private int cnpj;
    private PessoaFisica responsavel;

    public PessoaJuridica() {
        this.cnpj = 0;
        this.responsavel = new PessoaFisica();
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaFisica getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }

    void verifDoc() {
        if(this.responsavel.getNome().length() > 30){
            System.out.println("Nome inválido para Responsável");
        }
        else {
            System.out.println("Nome válido para Responsável");
        }
    }
}
