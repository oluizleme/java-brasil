package br.com.oluizleme;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {

    public static void main(String[] args) {
        String cpf = "758.265.915-52";
        String cnpj = "59.863.685/0001-42";
        String tituloDeEleitor = "235881840183";

        System.out.println("Desformatar o CPF");
        System.out.println("CPF Formatado: " + cpf);
        System.out.println("CPF Desformatado: "
                + formatacaoDeDocumento(new CPFFormatter(), cpf, false));
        System.out.println("Desformatar o CNPJ");
        System.out.println("CPF Formatado: " + cnpj);
        System.out.println("CNPJ Desformatado: "
                + formatacaoDeDocumento(new CNPJFormatter(), cnpj, false));
        System.out.println("Formatar Titulo");
        System.out.println("Titulo Desformatado: " + tituloDeEleitor);
        System.out.println("Titulo Formatado: "
                + formatacaoDeDocumento(new TituloEleitoralFormatter(), tituloDeEleitor, true));
    }

    private static String formatacaoDeDocumento(Formatter formatador, String documento, boolean isFormatar) {
        if (isFormatar) {
            return formatador.format(documento);
        }
        return formatador.unformat(documento);
    }
}
