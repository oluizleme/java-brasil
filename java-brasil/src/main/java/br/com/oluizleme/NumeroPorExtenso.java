package br.com.oluizleme;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

import java.math.BigDecimal;

public class NumeroPorExtenso {

    public static void main(String[] args) {
        NumericToWordsConverter converter = new NumericToWordsConverter(new FormatoDeReal());
        BigDecimal valor = new BigDecimal("900.00");
        String valorPorExtenso = converter.toWords(valor.doubleValue());
        System.out.println(valorPorExtenso);
    }
}

