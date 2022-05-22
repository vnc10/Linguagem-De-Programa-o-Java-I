package com.mycompany.teste;

public class Teste {
    public static void main(String arg[]) {
        BDVeiculos bdVeiculos = new BDVeiculos();
        Menu menu = new Menu();
        menu.setBdVeiculos(bdVeiculos);
        menu.setVisible(true);

    }
}