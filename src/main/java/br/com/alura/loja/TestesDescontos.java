package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {
        Orcamento primeiroOrcamento = new Orcamento();
        primeiroOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        Orcamento segundoOrcamento = new Orcamento();
        segundoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        System.out.println(calculadora.calcular(primeiroOrcamento));
        System.out.println(calculadora.calcular(segundoOrcamento));

    }

}
