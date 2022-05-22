import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Leitura {

    public String entDados(String dadosEntrada){

        System.out.println(dadosEntrada);

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String dadosSaida = "";

        try {
            dadosSaida = bufferedReader.readLine();
        }
        catch (IOException e) {
            System.out.print("\n Erro");;
        }
        return dadosSaida;
    }
}
