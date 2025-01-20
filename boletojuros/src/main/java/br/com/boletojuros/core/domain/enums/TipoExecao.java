package br.com.boletojuros.core.domain.enums;

public enum TipoExecao {

    BOLETO_INVALIDO {
        @Override
        public String getMensagemErro() {
            return "O Boleto encontrado é inválido.";
        }
    },
    TIPO_BOLETO_INVALIDO {
        @Override
        public String getMensagemErro() {
            return "Desculpe, infelizmente só é possível calcular juros sobre Boleto XPTO.";
        }
    },
    BOLETO_NAO_VENCIDO {
        @Override
        public String getMensagemErro() {
            return "O Boleto informado não ultrapassou sua data de vencimento.";
        }
    };

    public abstract String getMensagemErro();
}
