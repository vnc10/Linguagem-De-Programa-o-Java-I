package com.mycompany.teste;
import java.util.ArrayList;
import java.util.List;

public class BDVeiculos {

    private final List<Passeio> passeios = new ArrayList<>();
    private final List<Carga> cargas = new ArrayList<>();

    public BDVeiculos() {
    }

    public List<Passeio> getPasseios() {
        return passeios;
    }

    public List<Carga> getCargas() {
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