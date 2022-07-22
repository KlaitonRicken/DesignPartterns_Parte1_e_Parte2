package br.com.alura.loja.orcamento;

import br.com.alura.loja.http.HttpAdapter;
import br.com.alura.loja.orcamento.exception.DomainExcepyion;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){

        if(!orcamento.isFinalizado()){
        throw new DomainExcepyion("Orcamento não finalizado!");
        }

        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidade", orcamento.getQuantidadeDeItens()
        );

        http.post(url, dados);
    }

}
