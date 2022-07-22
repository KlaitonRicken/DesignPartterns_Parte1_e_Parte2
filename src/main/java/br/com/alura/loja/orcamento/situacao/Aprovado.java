package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.exception.DomainExcepyion;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal(0.02));
    }

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizar());
    }

}
