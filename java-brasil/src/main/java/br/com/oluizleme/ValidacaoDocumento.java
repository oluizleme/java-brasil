package br.com.oluizleme;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoDocumento {

    public static void main(String[] args) {
        String cpf = "75826591552";
        CPFValidator validator = new CPFValidator();
        try{
            validator.assertValid(cpf);
            System.out.println("CPF VÁLIDO");
        } catch (InvalidStateException e) {
            System.out.println("CPF INVÁLIDO : " + e);
        }
    }
}
