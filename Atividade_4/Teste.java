package Atividade_4;

import java.util.ArrayList;

public class Teste {
    public static void main(String arg[]) {

        ArrayList<Passeio> passeios = new ArrayList<>(5);
        ArrayList<Carga> cargas = new ArrayList<>(5);
        Leitura leitura = new Leitura();
        boolean flag = true;
        int opt = 0;

        while (flag) {
            System.out.println("1. Cadastrar Veículo de Passeio");
            System.out.println("2. Cadastrar Veículo de Carga ");
            System.out.println("3. Imprimir Todos os Veículos de Passeio");
            System.out.println("4. Imprimir Todos os Veículos de Carga");
            System.out.println("5. Imprimir Veículo de Passeio pela Placa");
            System.out.println("6. Imprimir Veículo de Carga pela Placa");
            System.out.println("7. Sair do Sistema");

            opt = Integer.parseInt(leitura.entDados("\n Digite a opção do menu acima: "));

            if (opt == 1) {
                if (passeios.size() < 5) {
                    Passeio passeio = new Passeio();
                    passeio.setQtdPassageiros(Integer.parseInt(leitura.entDados("\n Digite a quantidade de passageiros: ")));
                    passeio.setPlaca(leitura.entDados("\n Digite o numero da placa: "));
                    passeio.setMarca(leitura.entDados("\n Digite a marca: "));
                    passeio.setModelo(leitura.entDados("\n Digite o modelo: "));
                    passeio.setCor(leitura.entDados("\n Digite a cor: "));
                    passeio.setVelocMax(Integer.parseInt(leitura.entDados("\n Digite a velocidade maxima: ")));
                    passeio.setQtdRodas(Integer.parseInt(leitura.entDados("\n Digite a quantidade de rodas: ")));
                    int qtdPist = Integer.parseInt(leitura.entDados("\n Digite a quantidade de pistão: "));
                    int potencia = Integer.parseInt(leitura.entDados("\n Digite a potencia do carro: "));
                    passeio.setMotor(qtdPist, potencia);
                    passeios.add(passeio);
                } else {
                    System.out.println("\n Carro de Passeio cheio!!");
                }
            } else if (opt == 2) {
                if (cargas.size() < 5) {
                    Carga carga = new Carga();
                    carga.setCargaMax(Integer.parseInt(leitura.entDados("\n Digite a quantidade de carga maxima: ")));
                    carga.setTara(Integer.parseInt(leitura.entDados("\n Digite a quantidade de tara: ")));
                    carga.setPlaca(leitura.entDados("\n Digite o numero da placa: "));
                    carga.setMarca(leitura.entDados("\n Digite a marca: "));
                    carga.setModelo(leitura.entDados("\n Digite o modelo: "));
                    carga.setCor(leitura.entDados("\n Digite a cor: "));
                    carga.setVelocMax(Integer.parseInt(leitura.entDados("\n Digite a velocidade maxima: ")));
                    carga.setQtdRodas(Integer.parseInt(leitura.entDados("\n Digite a quantidade de rodas: ")));
                    int qtdPist = Integer.parseInt(leitura.entDados("\n Digite a quantidade de pistão: "));
                    int potencia = Integer.parseInt(leitura.entDados("\n Digite a potencia do carro: "));
                    carga.setMotor(qtdPist, potencia);
                    cargas.add(carga);
                } else {
                    System.out.println("\n Carro de carga cheio!!");
                }
            } else if (opt == 3) {
                if (passeios.isEmpty()) {
                    System.out.println("Carros de passeio estão vazio!");
                } else {
                    for (int i = 0; i < passeios.size(); i++) {
                        System.out.print("Veiculo de passeio: " + i + 1);
                        System.out.printf("\n Placa do veiculo de passeio: " + passeios.get(i).getPlaca());
                        System.out.printf("\n Marca do veiculo de passeio: " + passeios.get(i).getMarca());
                        System.out.printf("\n Modelo do veiculo de passeio: " + passeios.get(i).getModelo());
                        System.out.printf("\n Cor do veiculo de passeio: " + passeios.get(i).getCor());
                        System.out.printf("\n Velocidade Maxima do veiculo de passeio: " + passeios.get(i).getVelocMax());
                        System.out.printf("\n Quantidade de rodas do veiculo de passeio: " + passeios.get(i).getQtdRodas());
                        System.out.printf("\n Quantidade de pista do motor do veiculo de passeio: " + passeios.get(i).getMotor().getQtdPist());
                        System.out.printf("\n Quantidade de pontecia do motor do veiculo de passeio: " + passeios.get(i).getMotor().getPotencia());
                        System.out.printf("\n Quantidade de pssoas do veiculo de passeio:" + passeios.get(i).getQtdPassageiros());
                        System.out.println("\n -------------------------------------------------------------\n");
                    }
                }
            } else if (opt == 4) {
                if (cargas.isEmpty()) {
                    System.out.println("Carros de cargas estão vazios");
                } else {
                    for (int i = 0; i < cargas.size(); i++) {
                        System.out.print("\n Veiculo de carga: " + i + 1);
                        System.out.printf("\n Placa do veiculo de carga: " + cargas.get(i).getPlaca());
                        System.out.printf("\n Marca do veiculo de carga: " + cargas.get(i).getMarca());
                        System.out.printf("\n Modelo do veiculo de carga: " + cargas.get(i).getModelo());
                        System.out.printf("\n Cor do veiculo de carga: " + cargas.get(i).getCor());
                        System.out.printf("\n Velocidade Maxima do veiculo de carga: " + cargas.get(i).getVelocMax());
                        System.out.printf("\n Quantidade de rodas do veiculo de carga: " + cargas.get(i).getQtdRodas());
                        System.out.printf("\n Quantidade de pista do motor do veiculo de carga: " + cargas.get(i).getMotor().getQtdPist());
                        System.out.printf("\n Quantidade de pontecia do motor do veiculo de carga: " + cargas.get(i).getMotor().getPotencia());
                        System.out.printf("\n Quantidade de pssoas do veiculo de carga: " + cargas.get(i).getCargaMax());
                        System.out.printf("\n Quantidade de pssoas do veiculo de carga: " + cargas.get(i).getTara());
                        System.out.println("\n -------------------------------------------------------------\n");
                    }
                }
            } else if (opt == 5) {
                String placa = leitura.entDados("\n Digite a placa do veiculo de passeio: ");
                if (passeios.isEmpty()) {
                    System.out.println("\n Carro de passeio vazio!");
                } else {
                    for (int i = 0; i < passeios.size(); i++) {
                        if (placa.equals(passeios.get(i).getPlaca())) {
                            System.out.print("Veiculo de passeio: " + i + 1);
                            System.out.printf("\n Placa do veiculo de passeio: " + passeios.get(i).getPlaca());
                            System.out.printf("\n Marca do veiculo de passeio: " + passeios.get(i).getMarca());
                            System.out.printf("\n Modelo do veiculo de passeio: " + passeios.get(i).getModelo());
                            System.out.printf("\n Cor do veiculo de passeio: " + passeios.get(i).getCor());
                            System.out.printf("\n Velocidade Maxima do veiculo de passeio: " + passeios.get(i).getVelocMax());
                            System.out.printf("\n Quantidade de rodas do veiculo de passeio: " + passeios.get(i).getQtdRodas());
                            System.out.printf("\n Quantidade de pista do motor do veiculo de passeio: " + passeios.get(i).getMotor().getQtdPist());
                            System.out.printf("\n Quantidade de pontecia do motor do veiculo de passeio: " + passeios.get(i).getMotor().getPotencia());
                            System.out.printf("\n Quantidade de pssoas do veiculo de passeio:" + passeios.get(i).getQtdPassageiros());
                            System.out.println("\n -------------------------------------------------------------\n");
                        } else {
                            System.out.print("\n Veiculo de passeio não encontrado");
                        }
                    }
                }
            } else if (opt == 6) {
                String placa = leitura.entDados("\n Digite a placa do veiculo de passeio: ");
                if (cargas.isEmpty()) {
                    System.out.println("\n Carro de passeio vazio!");
                } else {
                    for (int i = 0; i < cargas.size(); i++) {
                        if (placa.equals(cargas.get(i).getPlaca())) {
                            System.out.print("\n Veiculo de carga: " + i + 1);
                            System.out.printf("\n Placa do veiculo de carga: " + cargas.get(i).getPlaca());
                            System.out.printf("\n Marca do veiculo de carga: " + cargas.get(i).getMarca());
                            System.out.printf("\n Modelo do veiculo de carga: " + cargas.get(i).getModelo());
                            System.out.printf("\n Cor do veiculo de carga: " + cargas.get(i).getCor());
                            System.out.printf("\n Velocidade Maxima do veiculo de carga: " + cargas.get(i).getVelocMax());
                            System.out.printf("\n Quantidade de rodas do veiculo de carga: " + cargas.get(i).getQtdRodas());
                            System.out.printf("\n Quantidade de pista do motor do veiculo de carga: " + cargas.get(i).getMotor().getQtdPist());
                            System.out.printf("\n Quantidade de pontecia do motor do veiculo de carga: " + cargas.get(i).getMotor().getPotencia());
                            System.out.printf("\n Quantidade de pssoas do veiculo de carga: " + cargas.get(i).getCargaMax());
                            System.out.printf("\n Quantidade de pssoas do veiculo de carga: " + cargas.get(i).getTara());
                            System.out.println("\n -------------------------------------------------------------\n");
                        } else {
                            System.out.print("\n Veiculo de carga não encontrado");
                        }
                    }
                }
            } else if (opt == 7) {
                System.out.println("\n Saiu do programa");
                break;
            } else {
                System.out.println("\n Opção invalida!");
            }


        }
    }
}