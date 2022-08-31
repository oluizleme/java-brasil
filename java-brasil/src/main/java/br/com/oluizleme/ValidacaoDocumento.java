package br.com.oluizleme;

import br.com.caelum.stella.validation.*;

public class ValidacaoDocumento {

    public static void main(String[] args) {
        String cpf = "75826591552";
        try{
            validarDocumento(new CPFValidator(), cpf);
            System.out.println("CPF VÁLIDO");
        } catch (InvalidStateException e) {
            System.out.println("CPF INVÁLIDO : " + e);
        }

        String cnpj = "59863685000142";
        try{
            validarDocumento(new CNPJValidator(), cnpj);
            System.out.println("CNPJ VÁLIDO");
        } catch (InvalidStateException e) {
            System.out.println("CNPJ INVÁLIDO : " + e);
        }

        String tituloDeEleitor = "235881840183";
        try {
           validarDocumento(new TituloEleitoralValidator(), tituloDeEleitor);
            System.out.println("TÍTULO VÁLIDO");
        } catch (InvalidStateException e) {
            System.out.println("TÍTULO INVÁLIDO :" + e);
        }
    }

    private static void validarDocumento(Validator<String> validador, String documento) {
        validador.assertValid(documento);
    }
}
