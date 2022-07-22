package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular (Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorOutroIMposto = BigDecimal.ZERO;
        if(outro != null) {
            valorOutroIMposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorOutroIMposto);
    }

}
