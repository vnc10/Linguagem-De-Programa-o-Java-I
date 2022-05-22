public class Teste {
    public static void main(String arg[]) throws VeicExistException, VelocException {

        BDVeiculos bdVeiculos = new BDVeiculos();
        Leitura leitura = new Leitura();
        int opt = 0;

        while (true) {
            System.out.println("1. Cadastrar Veículo de Passeio");
            System.out.println("2. Cadastrar Veículo de Carga ");
            System.out.println("3. Imprimir Todos os Veículos de Passeio");
            System.out.println("4. Imprimir Todos os Veículos de Carga");
            System.out.println("5. Imprimir Veículo de Passeio pela Placa");
            System.out.println("6. Imprimir Veículo de Carga pela Placa");
            System.out.println("7. Excluir Veículo de Passeio pela Placa");
            System.out.println("8. Excluir Veículo de Carga pela Placa");
            System.out.println("9. Sair do Sistema");

            opt = Integer.parseInt(leitura.entDados("\n Digite a opção do menu acima: "));

            if (opt == 1) {
                while (true) {
                    Passeio passeio = new Passeio();
                    String novaPlaca;
                    passeio.setQtdPassageiros(Integer.parseInt(leitura.entDados("\n Digite a quantidade de passageiros: ")));
                    try {
                        novaPlaca = bdVeiculos.verificaPlaca(leitura.entDados("\n Digite o numero da placa: "));
                    } catch (VeicExistException vee) {
                        break;
                    }
                    passeio.setPlaca(novaPlaca);
                    passeio.setMarca(leitura.entDados("\n Digite a marca: "));
                    passeio.setModelo(leitura.entDados("\n Digite o modelo: "));
                    passeio.setCor(leitura.entDados("\n Digite a cor: "));
                    try {
                        passeio.setVelocMax(Integer.parseInt(leitura.entDados("\n Digite a velocidade maxima: ")));
                    } catch (VelocException ve) {
                        passeio.setVelocMax(100);
                    }
                    passeio.setQtdRodas(Integer.parseInt(leitura.entDados("\n Digite a quantidade de rodas: ")));
                    int qtdPist = Integer.parseInt(leitura.entDados("\n Digite a quantidade de pistão: "));
                    int potencia = Integer.parseInt(leitura.entDados("\n Digite a potencia do carro: "));
                    passeio.setMotor(qtdPist, potencia);
                    bdVeiculos.getPasseios().add(passeio);
                    String continuar = leitura.entDados("\n Quer adicionar um novo carro de passeio?");
                    if (continuar.equalsIgnoreCase("n") || continuar.equalsIgnoreCase("nao")) {
                        break;
                    }
                }
            } else if (opt == 2) {
                while (true) {
                    Carga carga = new Carga();
                    String novaPlaca;
                    carga.setCargaMax(Integer.parseInt(leitura.entDados("\n Digite a quantidade de carga maxima: ")));
                    carga.setTara(Integer.parseInt(leitura.entDados("\n Digite a quantidade de tara: ")));
                    try {
                        novaPlaca = bdVeiculos.verificaPlaca(leitura.entDados("\n Digite o numero da placa: "));
                    } catch (VeicExistException vee) {
                        break;
                    }
                    carga.setPlaca(novaPlaca);
                    carga.setMarca(leitura.entDados("\n Digite a marca: "));
                    carga.setModelo(leitura.entDados("\n Digite o modelo: "));
                    carga.setCor(leitura.entDados("\n Digite a cor: "));
                    try {
                        carga.setVelocMax(Integer.parseInt(leitura.entDados("\n Digite a velocidade maxima: ")));
                    } catch (VelocException ve) {
                        carga.setVelocMax(90);
                    }
                    carga.setQtdRodas(Integer.parseInt(leitura.entDados("\n Digite a quantidade de rodas: ")));
                    int qtdPist = Integer.parseInt(leitura.entDados("\n Digite a quantidade de pistão: "));
                    int potencia = Integer.parseInt(leitura.entDados("\n Digite a potencia do carro: "));
                    carga.setMotor(qtdPist, potencia);
                    bdVeiculos.getCargas().add(carga);
                    String continuar = leitura.entDados("\n Quer adicionar um novo carro de carga?");
                    if (continuar.equalsIgnoreCase("n") || continuar.equalsIgnoreCase("nao")) {
                        break;
                    }
                }
            } else if (opt == 3) {
                if (bdVeiculos.getPasseios().isEmpty()) {
                    System.out.println("Carros de passeio estão vazio!");
                } else {
                    for (int i = 0; i < bdVeiculos.getPasseios().size(); i++) {
                        System.out.print("Veiculo de passeio: " + i);
                        System.out.printf("\n Placa do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getPlaca());
                        System.out.printf("\n Marca do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getMarca());
                        System.out.printf("\n Modelo do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getModelo());
                        System.out.printf("\n Cor do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getCor());
                        System.out.printf("\n Velocidade Maxima do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getVelocMax());
                        System.out.printf("\n Quantidade de rodas do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getQtdRodas());
                        System.out.printf("\n Quantidade de pista do motor do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getMotor().getQtdPist());
                        System.out.printf("\n Quantidade de pontecia do motor do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getMotor().getPotencia());
                        System.out.printf("\n Quantidade de pessoas do veiculo de passeio:" + bdVeiculos.getPasseios().get(i).getQtdPassageiros());
                        System.out.println("\n -------------------------------------------------------------\n");
                    }
                }
            } else if (opt == 4) {
                if (bdVeiculos.getCargas().isEmpty()) {
                    System.out.println("Carros de cargas estão vazios");
                } else {
                    for (int i = 0; i < bdVeiculos.getCargas().size(); i++) {
                        System.out.print("\n Veiculo de carga: " + i);
                        System.out.printf("\n Placa do veiculo de carga: " + bdVeiculos.getCargas().get(i).getPlaca());
                        System.out.printf("\n Marca do veiculo de carga: " + bdVeiculos.getCargas().get(i).getMarca());
                        System.out.printf("\n Modelo do veiculo de carga: " + bdVeiculos.getCargas().get(i).getModelo());
                        System.out.printf("\n Cor do veiculo de carga: " + bdVeiculos.getCargas().get(i).getCor());
                        System.out.printf("\n Velocidade Maxima do veiculo de carga: " + bdVeiculos.getCargas().get(i).getVelocMax());
                        System.out.printf("\n Quantidade de rodas do veiculo de carga: " + bdVeiculos.getCargas().get(i).getQtdRodas());
                        System.out.printf("\n Quantidade de pista do motor do veiculo de carga: " + bdVeiculos.getCargas().get(i).getMotor().getQtdPist());
                        System.out.printf("\n Quantidade de pontecia do motor do veiculo de carga: " + bdVeiculos.getCargas().get(i).getMotor().getPotencia());
                        System.out.printf("\n Quantidade de carga maximo do veiculo de carga: " + bdVeiculos.getCargas().get(i).getCargaMax());
                        System.out.printf("\n Quantidade de tara do veiculo de carga: " + bdVeiculos.getCargas().get(i).getTara());
                        System.out.println("\n -------------------------------------------------------------\n");
                    }
                }
            } else if (opt == 5) {
                String placa = leitura.entDados("\n Digite a placa do veiculo de passeio: ");
                boolean placaExiste = false;
                if (bdVeiculos.getPasseios().isEmpty()) {
                    System.out.println("\n Carro de passeio vazio!");
                } else {
                    for (int i = 0; i < bdVeiculos.getPasseios().size(); i++) {
                        if (placa.equals(bdVeiculos.getPasseios().get(i).getPlaca())) {
                            placaExiste = true;
                            System.out.print("Veiculo de passeio: " + i);
                            System.out.printf("\n Placa do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getPlaca());
                            System.out.printf("\n Marca do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getMarca());
                            System.out.printf("\n Modelo do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getModelo());
                            System.out.printf("\n Cor do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getCor());
                            System.out.printf("\n Velocidade Maxima do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getVelocMax());
                            System.out.printf("\n Quantidade de rodas do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getQtdRodas());
                            System.out.printf("\n Quantidade de pista do motor do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getMotor().getQtdPist());
                            System.out.printf("\n Quantidade de pontecia do motor do veiculo de passeio: " + bdVeiculos.getPasseios().get(i).getMotor().getPotencia());
                            System.out.printf("\n Quantidade de pessoas do veiculo de passeio:" + bdVeiculos.getPasseios().get(i).getQtdPassageiros());
                            System.out.printf("\n Velocidade maxima: " + bdVeiculos.getPasseios().get(i).calcVel(bdVeiculos.getPasseios().get(i).getVelocMax()));
                            System.out.println("\n Quantidade de letras em todos os atributos: " + bdVeiculos.getPasseios().get(i).calcular());
                            System.out.println("\n -------------------------------------------------------------\n");
                        } else if (i + 1 == bdVeiculos.getPasseios().size() && !placaExiste) {
                            System.out.print("\n Veiculo de passeio com essa placa não existe \n");
                        }
                    }
                }
            } else if (opt == 6) {
                String placa = leitura.entDados("\n Digite a placa do veiculo de passeio: ");
                boolean placaExiste = false;
                if (bdVeiculos.getCargas().isEmpty()) {
                    System.out.println("\n Carro de carga vazio!");
                } else {
                    for (int i = 0; i < bdVeiculos.getCargas().size(); i++) {
                        if (placa.equals(bdVeiculos.getCargas().get(i).getPlaca())) {
                            placaExiste = true;
                            System.out.print("\n Veiculo de carga: " + i);
                            System.out.printf("\n Placa do veiculo de carga: " + bdVeiculos.getCargas().get(i).getPlaca());
                            System.out.printf("\n Marca do veiculo de carga: " + bdVeiculos.getCargas().get(i).getMarca());
                            System.out.printf("\n Modelo do veiculo de carga: " + bdVeiculos.getCargas().get(i).getModelo());
                            System.out.printf("\n Cor do veiculo de carga: " + bdVeiculos.getCargas().get(i).getCor());
                            System.out.printf("\n Velocidade Maxima do veiculo de carga: " + bdVeiculos.getCargas().get(i).getVelocMax());
                            System.out.printf("\n Quantidade de rodas do veiculo de carga: " + bdVeiculos.getCargas().get(i).getQtdRodas());
                            System.out.printf("\n Quantidade de pista do motor do veiculo de carga: " + bdVeiculos.getCargas().get(i).getMotor().getQtdPist());
                            System.out.printf("\n Quantidade de pontecia do motor do veiculo de carga: " + bdVeiculos.getCargas().get(i).getMotor().getPotencia());
                            System.out.printf("\n Quantidade de carga maxima do veiculo de carga: " + bdVeiculos.getCargas().get(i).getCargaMax());
                            System.out.printf("\n Quantidade de tara do veiculo de carga: " + bdVeiculos.getCargas().get(i).getTara());
                            System.out.printf("\n Velocidade maxima: " + bdVeiculos.getCargas().get(i).calcVel(bdVeiculos.getCargas().get(i).getVelocMax()));
                            System.out.println("\n Quantidade de letras em todos os atributos: " + bdVeiculos.getCargas().get(i).calcular());
                            System.out.println("\n -------------------------------------------------------------\n");
                        } else if (i + 1 == bdVeiculos.getCargas().size() && !placaExiste) {
                            System.out.print("\n Veiculo de carga com essa placa não existe \n");
                        }
                    }
                }

            } else if (opt == 7) {
                String placa = leitura.entDados("\n Digite a placa do veiculo de passeio: ");
                boolean placaExiste = false;
                if (bdVeiculos.getPasseios().isEmpty()) {
                    System.out.println("\n Carro de passeio vazio!");
                } else {
                    for (int i = 0; i < bdVeiculos.getPasseios().size(); i++) {
                        if (placa.equals(bdVeiculos.getPasseios().get(i).getPlaca())) {
                            placaExiste = true;
                            bdVeiculos.getPasseios().remove(i);
                            System.out.println("\n Veiculo de passeio excluido com sucesso \n");
                        } else if (i + 1 == bdVeiculos.getPasseios().size() && !placaExiste) {
                            System.out.print("\n Veiculo de passeio com essa placa não existe \n");
                        }
                    }
                }
            } else if (opt == 8) {
                String placa = leitura.entDados("\n Digite a placa do veiculo de passeio: ");
                boolean placaExiste = false;
                if (bdVeiculos.getCargas().isEmpty()) {
                    System.out.println("\n Carro de carga vazio!");
                } else {
                    for (int i = 0; i < bdVeiculos.getCargas().size(); i++) {
                        if (placa.equals(bdVeiculos.getCargas().get(i).getPlaca())) {
                            placaExiste = true;
                            bdVeiculos.getCargas().remove(i);
                            System.out.println("\n Veiculo de carga excluido com sucesso \n");
                        } else if (i + 1 == bdVeiculos.getCargas().size() && !placaExiste) {
                            System.out.print("\n Veiculo de carga com essa placa não existe \n");
                        }
                    }
                }

            } else if (opt == 9) {
                System.out.println("\n Saiu do programa");
                break;
            } else {
                System.out.println("\n Opção invalida!");
            }
        }
    }
}