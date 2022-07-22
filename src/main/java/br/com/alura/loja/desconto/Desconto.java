package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    protected abstract BigDecimal efetuarCalcular(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return efetuarCalcular(orcamento);
        }

        return proximo.calcular(orcamento);
    }

    public abstract boolean deveAplicar(Orcamento orcamento);

}
