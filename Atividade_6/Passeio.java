package Atividade_6;

final public class Passeio extends Veiculo implements Calcular {

    private int qtdPassageiros;

    public Passeio() {
        this.qtdPassageiros = 0;
    }

    public Passeio(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public float calcVel(float velocMax){
        return velocMax * 1000;
    }

    @Override
    public int calcular() {
        return getPlaca().length() + getMarca().length() + getModelo().length() + getCor().length();
    }
}
