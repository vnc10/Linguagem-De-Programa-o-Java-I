package Atividade_4;

final public class Carga extends Veiculo implements Calcular {

    private int cargaMax;
    private int tara;

    public Carga() {
        this.cargaMax = 0;
        this.tara = 0;
    }

    public Carga(int cargaMax, int tara) {
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public float calcVel(float velocMax){
        return velocMax * 100000;
    }

    @Override
    public int calcular() {
        return getMotor().getQtdPist() + getMotor().getPotencia() + getQtdRodas() + ((int) getVelocMax()) + getTara() + getCargaMax();
    }
}
