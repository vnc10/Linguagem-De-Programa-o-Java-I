package Atividade_1;

import javax.sound.midi.Soundbank;

public class Teste {
    public static void main(String arg[]) {
    Veiculo veiculo1 = new Veiculo();
    System.out.printf("Veiculo 1 com valores default: ");
    System.out.printf("\n Placa do veiculo 1: " + veiculo1.getPlaca());
    System.out.printf("\n Marca do veiculo 1: " + veiculo1.getMarca());
    System.out.printf("\n Modelo do veiculo 1: " + veiculo1.getModelo());
    System.out.printf("\n Cor do veiculo 1: " + veiculo1.getCor());
    System.out.printf("\n Velocidade Maxima do veiculo 1: " + veiculo1.getVelocMax());
    System.out.printf("\n Quantidade de rodas do veiculo 1: " + veiculo1.getQtdRodas());
    System.out.printf("\n Motor do veiculo 1: ");
    System.out.printf("\n Quantidade de pista do motor do veiculo 1: " + veiculo1.getMotor().getQtdPist());
    System.out.printf("\n Quantidade de pontecia do motor do veiculo 1: " + veiculo1.getMotor().getPotencia());

    Veiculo veiculo2 = new Veiculo();
    veiculo2.setPlaca("ABC-1234");
    veiculo2.setMarca("GM");
    veiculo2.setModelo("Onix");
    veiculo2.setCor("Preto");
    veiculo2.setVelocMax(210);
    veiculo2.setQtdRodas(4);
    System.out.printf("\n Veiculo 2 com valores alterados: ");
    System.out.printf("\n Placa do veiculo 2: " + veiculo2.getPlaca());
    System.out.printf("\n Marca do veiculo 2: " + veiculo2.getMarca());
    System.out.printf("\n Modelo do veiculo 2: " + veiculo2.getModelo());
    System.out.printf("\n Cor do veiculo 2: " + veiculo2.getCor());
    System.out.printf("\n Velocidade Maxima do veiculo 2: " + veiculo2.getVelocMax());
    System.out.printf("\n Quantidade de rodas do veiculo 2: " + veiculo2.getQtdRodas());
    System.out.printf("\n Motor do veiculo 2: ");
    System.out.printf("\n Quantidade de pista do motor do veiculo 2: " + veiculo2.getMotor().getQtdPist());
    System.out.printf("\n Quantidade de pontecia do motor do veiculo 2: " + veiculo2.getMotor().getPotencia());

    Veiculo veiculo3 = new Veiculo();
    veiculo3.setMotor(300, 1000);
    System.out.printf("\n Motor do veiculo 3: ");
    System.out.printf("\n Quantidade de pista do motor do veiculo 3: " + veiculo3.getMotor().getQtdPist());
    System.out.printf("\n Quantidade de pontecia do motor do veiculo 3: " + veiculo3.getMotor().getPotencia());

    Veiculo veiculo4 = new Veiculo("AED-123", "VW", "Gol", "Azul", 200, 4, 300, 1500);
    System.out.printf("\n Veiculo 4 com construtor não padrão: ");
    System.out.printf("\n Placa do veiculo 4: " + veiculo4.getPlaca());
    System.out.printf("\n Marca do veiculo 4: " + veiculo4.getMarca());
    System.out.printf("\n Modelo do veiculo 4: " + veiculo4.getModelo());
    System.out.printf("\n Cor do veiculo 4: " + veiculo4.getCor());
    System.out.printf("\n Velocidade Maxima do veiculo 4: " + veiculo4.getVelocMax());
    System.out.printf("\n Quantidade de rodas do veiculo 4: " + veiculo4.getQtdRodas());
    System.out.printf("\n Motor do veiculo 4: ");
    System.out.printf("\n Quantidade de pista do motor do veiculo 4: " + veiculo4.getMotor().getQtdPist());
    System.out.printf("\n Quantidade de pontecia do motor do veiculo 4: " + veiculo4.getMotor().getPotencia());

    Veiculo veiculo5 = new Veiculo("EAD-1111", "Fiat", "Palio", "Branco", 250, 4);
    System.out.printf("\n Veiculo 5 com construtor não padrão porém com motor padrão: ");
    System.out.printf("\n Placa do veiculo 5: " + veiculo5.getPlaca());
    System.out.printf("\n Marca do veiculo 5: " + veiculo5.getMarca());
    System.out.printf("\n Modelo do veiculo 5: " + veiculo5.getModelo());
    System.out.printf("\n Cor do veiculo 5: " + veiculo5.getCor());
    System.out.printf("\n Velocidade Maxima do veiculo 5: " + veiculo5.getVelocMax());
    System.out.printf("\n Quantidade de rodas do veiculo 5: " + veiculo5.getQtdRodas());
    System.out.printf("\n Motor do veiculo 5: ");
    System.out.printf("\n Quantidade de pista do motor do veiculo 5: " + veiculo5.getMotor().getQtdPist());
    System.out.printf("\n Quantidade de pontecia do motor do veiculo 5: " + veiculo5.getMotor().getPotencia());
    }
}