package br.com.oluizleme;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

import java.io.IOException;

public class CEP {

    public static void main(String[] args) {
        ViaCEPClient cliente = new ViaCEPClient();
        try {
            ViaCEPEndereco endereco = cliente.getEndereco("06053014");
            System.out.println(endereco.getLogradouro());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
