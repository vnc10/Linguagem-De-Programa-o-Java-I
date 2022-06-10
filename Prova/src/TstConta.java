public class TstConta {

    public static void main(String[] args) {

        //ENTRADA DE DADOS

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        try {
            pessoaJuridica.setNumeroConta(9);
        } catch (NumException ne) {
            ne.impMsg();
        }
        pessoaJuridica.setCnpj(123123);
        pessoaJuridica.getEnder().setRua("Rua de teste");

        pessoaJuridica.getResponsavel().setCpf(13);
        pessoaJuridica.getResponsavel().setNome("Vinicius");

        //SAIDA DE DADOS

        System.out.println(pessoaJuridica.getNumeroConta());
        pessoaJuridica.validar();
        System.out.println(pessoaJuridica.getCnpj());
        System.out.println(pessoaJuridica.getEnder().getRua());

        System.out.println(pessoaJuridica.getResponsavel().getCpf());
        pessoaJuridica.getResponsavel().verifDoc();
        System.out.println(pessoaJuridica.getResponsavel().getNome());
        pessoaJuridica.verifDoc();

    }
}
