package Atividade_6;

import java.util.ArrayList;

public class BDVeiculos {

    private final ArrayList<Passeio> passeios = new ArrayList<>(5);
    private final ArrayList<Carga> cargas = new ArrayList<>(5);

    public BDVeiculos() {
    }

    public ArrayList<Passeio> getPasseios() {
        return passeios;
    }

    public ArrayList<Carga> getCargas() {
        return cargas;
    }

    public String verificaPlaca(String placa) throws VeicExistException {

        for (int i = 0; i < this.getPasseios().size(); i++) {
            if (placa.equals(this.getPasseios().get(i).getPlaca())) {
                throw new VeicExistException();
            }
        }
        for (int i = 0; i < this.getCargas().size(); i++) {
            if (placa.equals(this.getCargas().get(i).getPlaca())) {
                throw new VeicExistException();
            }
        }
        return placa;
    }

}