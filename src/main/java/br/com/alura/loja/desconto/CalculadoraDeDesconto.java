package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {

        Desconto desconto = new DescontoComCincoItens(
                new DescontoComPrecoMaiorQueQuinhentos(
                        new SemDesconto()));

        return desconto.efetuarCalcular(orcamento);
    }
}
