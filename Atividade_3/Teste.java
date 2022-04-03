package Atividade_3;

public class Teste {
    public static void main(String arg[]) {
        Passeio p1 = new Passeio();
        System.out.print("Veiculo de passeio 1 com valores default: ");
        System.out.printf("\n Placa do veiculo de passeio 1: " + p1.getPlaca());
        System.out.printf("\n Marca do veiculo de passeio 1: " + p1.getMarca());
        System.out.printf("\n Modelo do veiculo de passeio 1: " + p1.getModelo());
        System.out.printf("\n Cor do veiculo de passeio 1: " + p1.getCor());
        System.out.printf("\n Velocidade Maxima do veiculo de passeio 1: " + p1.getVelocMax());
        System.out.printf("\n Quantidade de rodas do veiculo de passeio 1: " + p1.getQtdRodas());
        System.out.print("\n Motor do veiculo de passeio 1: ");
        System.out.printf("\n Quantidade de pista do motor do veiculo de passeio 1: " + p1.getMotor().getQtdPist());
        System.out.printf("\n Quantidade de pontecia do motor do veiculo de passeio 1: " + p1.getMotor().getPotencia());
        System.out.printf("\n Quantidade de pssoas do veiculo de passeio 1:" + p1.getQtdPassageiros());
        System.out.println("\n -------------------------------------------------------------\n");

        Passeio p2 = new Passeio();
        p2.setPlaca("ABC-1234");
        p2.setMarca("GM");
        p2.setModelo("Onix");
        p2.setCor("Preto");
        p2.setVelocMax(210);
        p2.setQtdRodas(4);

        System.out.print("\n Veiculo de passeio 2 com valores da classe abstrata alterados: ");
        System.out.printf("\n Placa do veiculo de passeio 2: " + p2.getPlaca());
        System.out.printf("\n Marca do veiculo de passeio 2: " + p2.getMarca());
        System.out.printf("\n Modelo do veiculo de passeio 2: " + p2.getModelo());
        System.out.printf("\n Cor do veiculo de passeio 2: " + p2.getCor());
        System.out.printf("\n Velocidade Maxima do veiculo de passeio 2: " + p2.getVelocMax());
        System.out.printf("\n Quantidade de rodas do veiculo de passeio 2: " + p2.getQtdRodas());
        System.out.print("\n Motor do veiculo de passeio 2: ");
        System.out.printf("\n Quantidade de pista do motor do veiculo de passeio 2: " + p2.getMotor().getQtdPist());
        System.out.printf("\n Quantidade de pontecia do motor do veiculo de passeio 2: " + p2.getMotor().getPotencia());
        System.out.printf("\n Quantidade de pssoas do veiculo de passeio 2: " + p2.getQtdPassageiros());
        System.out.println("\n -------------------------------------------------------------\n");

        Passeio p3 = new Passeio();
        p3.setMotor(100, 200);
        System.out.print("\n Veiculo de passeio 3 com valores de motor alterados: ");
        System.out.printf("\n Placa do veiculo de passeio 3: " + p3.getPlaca());
        System.out.printf("\n Marca do veiculo de passeio 3: " + p3.getMarca());
        System.out.printf("\n Modelo do veiculo de passeio 3: " + p3.getModelo());
        System.out.printf("\n Cor do veiculo de passeio 3: " + p3.getCor());
        System.out.printf("\n Velocidade Maxima do veiculo de passeio 3: " + p3.getVelocMax());
        System.out.printf("\n Quantidade de rodas do veiculo de passeio 3: " + p3.getQtdRodas());
        System.out.print("\n Motor do veiculo de passeio 3: ");
        System.out.printf("\n Quantidade de pista do motor do veiculo de passeio 3: " + p3.getMotor().getQtdPist());
        System.out.printf("\n Quantidade de pontecia do motor do veiculo de passeio 3: " + p3.getMotor().getPotencia());
        System.out.printf("\n Quantidade de pssoas do veiculo de passeio 3: " + p3.getQtdPassageiros());
        System.out.println("\n -------------------------------------------------------------\n");

        Passeio p4 = new Passeio(4);
        p4.setQtdPassageiros(10);
        p4.setPlaca("KXA-9462");
        p4.setMarca("VW");
        p4.setModelo("Gol");
        p4.setCor("Preto");
        p4.setVelocMax(210);
        p4.setQtdRodas(4);

        System.out.print("\n Veiculo de passeio 4 com valores alterados: ");
        System.out.printf("\n Placa do veiculo de passeio 4: " + p4.getPlaca());
        System.out.printf("\n Marca do veiculo de passeio 4: " + p4.getMarca());
        System.out.printf("\n Modelo do veiculo de passeio 4: " + p4.getModelo());
        System.out.printf("\n Cor do veiculo de passeio 4: " + p4.getCor());
        System.out.printf("\n Velocidade Maxima do veiculo de passeio 4: " + p4.getVelocMax());
        System.out.printf("\n Quantidade de rodas do veiculo de passeio 4: " + p4.getQtdRodas());
        System.out.print("\n Motor do veiculo de passeio 4: ");
        System.out.printf("\n Quantidade de pista do motor do veiculo de passeio 4: " + p4.getMotor().getQtdPist());
        System.out.printf("\n Quantidade de pontecia do motor do veiculo de passeio 4: " + p4.getMotor().getPotencia());
        System.out.printf("\n Quantidade de pssoas do veiculo de passeio 4: " + p4.getQtdPassageiros());
        System.out.println("\n -------------------------------------------------------------\n");


        Passeio p5 = new Passeio();
        p5.setQtdPassageiros(10);
        p5.setPlaca("KXA-9462");
        p5.setMarca("VW");
        p5.setModelo("Gol");
        p5.setCor("Preto");
        p5.setVelocMax(210);
        p5.setQtdRodas(4);
        p5.setMotor(300, 10);

        System.out.print("\n Veiculo de passeio 5 com todos valores settados: ");
        System.out.printf("\n Placa do veiculo de passeio 5: " + p5.getPlaca());
        System.out.printf("\n Marca do veiculo de passeio 5: " + p5.getMarca());
        System.out.printf("\n Modelo do veiculo de passeio 5: " + p5.getModelo());
        System.out.printf("\n Cor do veiculo de passeio 5: " + p5.getCor());
        System.out.printf("\n Velocidade Maxima do veiculo de passeio 5: " + p5.getVelocMax());
        System.out.printf("\n Quantidade de rodas do veiculo de passeio 5: " + p5.getQtdRodas());
        System.out.print("\n Motor do veiculo de passeio 5: ");
        System.out.printf("\n Quantidade de pista do motor do veiculo de passeio 5: " + p5.getMotor().getQtdPist());
        System.out.printf("\n Quantidade de pontecia do motor do veiculo de passeio 5: " + p5.getMotor().getPotencia());
        System.out.printf("\n Quantidade de pssoas do veiculo de passeio 5: " + p5.getQtdPassageiros());
        System.out.printf("\n Velocidade máximo do veiculo de passeio 5: " + p5.calcVel(p5.getVelocMax()) + " m/h");
        System.out.println("\n -------------------------------------------------------------\n");

        Carga c1 = new Carga();
        System.out.print("\n Veiculo de carga 1 com valores default: ");
        System.out.printf("\n Placa do veiculo de carga 1: " + c1.getPlaca());
        System.out.printf("\n Marca do veiculo de carga 1: " + c1.getMarca());
        System.out.printf("\n Modelo do veiculo de carga 1: " + c1.getModelo());
        System.out.printf("\n Cor do veiculo de carga 1: " + c1.getCor());
        System.out.printf("\n Velocidade Maxima do veiculo de carga 1: " + c1.getVelocMax());
        System.out.printf("\n Quantidade de rodas do veiculo de carga 1: " + c1.getQtdRodas());
        System.out.print("\n Motor do veiculo de carga 1: ");
        System.out.printf("\n Quantidade de pista do motor do veiculo de carga 1: " + c1.getMotor().getQtdPist());
        System.out.printf("\n Quantidade de pontecia do motor do veiculo de carga 1: " + c1.getMotor().getPotencia());
        System.out.printf("\n Quantidade de pssoas do veiculo de carga 1: " + c1.getCargaMax());
        System.out.printf("\n Quantidade de pssoas do veiculo de carga 1: " + c1.getTara());
        System.out.println("\n -------------------------------------------------------------\n");

        Carga c2 = new Carga();
        c2.setPlaca("EFA-3314");
        c2.setMarca("Fiat");
        c2.setModelo("Argo");
        c2.setCor("Branco");
        c2.setVelocMax(240);
        c2.setQtdRodas(4);
        System.out.print("\n Veiculo de carga 2 com valores do veiculo alterado: ");
        System.out.printf("\n Placa do veiculo de carga 2: " + c2.getPlaca());
        System.out.printf("\n Marca do veiculo de carga 2: " + c2.getMarca());
        System.out.printf("\n Modelo do veiculo de carga 2: " + c2.getModelo());
        System.out.printf("\n Cor do veiculo de carga 2: " + c2.getCor());
        System.out.printf("\n Velocidade Maxima do veiculo de carga 2: " + c2.getVelocMax());
        System.out.printf("\n Quantidade de rodas do veiculo de carga 2: " + c2.getQtdRodas());
        System.out.print("\n Motor do veiculo de carga 2: ");
        System.out.printf("\n Quantidade de pista do motor do veiculo de carga 2: " + c2.getMotor().getQtdPist());
        System.out.printf("\n Quantidade de pontecia do motor do veiculo de carga 2: " + c2.getMotor().getPotencia());
        System.out.printf("\n Quantidade de pssoas do veiculo de carga 2: " + c2.getCargaMax());
        System.out.printf("\n Quantidade de pssoas do veiculo de carga 2: " + c2.getTara());
        System.out.println("\n -------------------------------------------------------------\n");

        Carga c3 = new Carga();
        c3.setMotor(300, 10);

        System.out.print("\n Veiculo de carga 3 com valores do motor alterado: ");
        System.out.printf("\n Placa do veiculo de carga 3: " + c3.getPlaca());
        System.out.printf("\n Marca do veiculo de carga 3: " + c3.getMarca());
        System.out.printf("\n Modelo do veiculo de carga 3: " + c3.getModelo());
        System.out.printf("\n Cor do veiculo de carga 3: " + c3.getCor());
        System.out.printf("\n Velocidade Maxima do veiculo de carga 3: " + c3.getVelocMax());
        System.out.printf("\n Quantidade de rodas do veiculo de carga 3: " + c3.getQtdRodas());
        System.out.print("\n Motor do veiculo de carga 3: ");
        System.out.printf("\n Quantidade de pista do motor do veiculo de carga 3: " + c3.getMotor().getQtdPist());
        System.out.printf("\n Quantidade de pontecia do motor do veiculo de carga 3: " + c3.getMotor().getPotencia());
        System.out.printf("\n Quantidade de pssoas do veiculo de carga 3: " + c3.getCargaMax());
        System.out.printf("\n Quantidade de pssoas do veiculo de carga 3: " + c3.getTara());
        System.out.println("\n -------------------------------------------------------------\n");

        Carga c4 = new Carga(500, 100);
        c4.setPlaca("NXD-9312");
        c4.setMarca("GM");
        c4.setModelo("Celta");
        c4.setCor("Branco");
        c4.setVelocMax(150);
        c4.setQtdRodas(4);

        System.out.print("\n Veiculo de carga 4 com valores default: ");
        System.out.printf("\n Placa do veiculo de carga 4: " + c4.getPlaca());
        System.out.printf("\n Marca do veiculo de carga 4: " + c4.getMarca());
        System.out.printf("\n Modelo do veiculo de carga 4: " + c4.getModelo());
        System.out.printf("\n Cor do veiculo de carga 4: " + c4.getCor());
        System.out.printf("\n Velocidade Maxima do veiculo de carga 4: " + c4.getVelocMax());
        System.out.printf("\n Quantidade de rodas do veiculo de carga 4: " + c4.getQtdRodas());
        System.out.print("\n Motor do veiculo de carga 4: ");
        System.out.printf("\n Quantidade de pista do motor do veiculo de carga 4: " + c4.getMotor().getQtdPist());
        System.out.printf("\n Quantidade de pontecia do motor do veiculo de carga 4: " + c4.getMotor().getPotencia());
        System.out.printf("\n Quantidade de pssoas do veiculo de carga 4: " + c4.getCargaMax());
        System.out.printf("\n Quantidade de pssoas do veiculo de carga 4: " + c4.getTara());
        System.out.println("\n -------------------------------------------------------------\n");

        Carga c5 = new Carga();
        c5.setPlaca("HAX-5636");
        c5.setMarca("VW");
        c5.setModelo("Golf");
        c5.setCor("Branco");
        c5.setVelocMax(210);
        c5.setQtdRodas(4);
        c5.setMotor(400, 3);
        c5.setCargaMax(300);
        c5.setTara(500);

        System.out.print("\n Veiculo de carga 5 com todos valores alterados e retornando a velocidade maxima: ");
        System.out.printf("\n Placa do veiculo de carga 5: " + c5.getPlaca());
        System.out.printf("\n Marca do veiculo de carga 5: " + c5.getMarca());
        System.out.printf("\n Modelo do veiculo de carga 5: " + c5.getModelo());
        System.out.printf("\n Cor do veiculo de carga 5: " + c5.getCor());
        System.out.printf("\n Velocidade Maxima do veiculo de carga 5: " + c5.getVelocMax());
        System.out.printf("\n Quantidade de rodas do veiculo de carga 5: " + c5.getQtdRodas());
        System.out.print("\n Motor do veiculo de carga 5: ");
        System.out.printf("\n Quantidade de pista do motor do veiculo de carga 5: " + c5.getMotor().getQtdPist());
        System.out.printf("\n Quantidade de pontecia do motor do veiculo de carga 5: " + c5.getMotor().getPotencia());
        System.out.printf("\n Quantidade de pssoas do veiculo de carga 5: " + c5.getCargaMax());
        System.out.printf("\n Quantidade de pssoas do veiculo de carga 5: " + c5.getTara());
        System.out.printf("\n Velocidade máximo do veiculo de carga 5: " + c5.calcVel(c5.getVelocMax()) + " cm/h");
        System.out.println("\n -------------------------------------------------------------\n");
    }
}