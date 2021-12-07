public class ProdutoAlimenticio implements Produto {
    public String nome;
    public double valor;
    public String detalhes;
    public String dtval;

    public ProdutoAlimenticio(String nome, double valor, String detalhes, String dtval) {
        this.nome = nome;
        this.valor = valor;
        this.detalhes = detalhes;
        this.dtval = dtval;
    }

    @Override
    public double mostraValor() {
        return valor;
    }

    @Override
    public String mostraDetalhes() {
        return detalhes;
    }

    public String toString() {
        return "\n{Nome: " + this.nome + ", Valor: R$" + this.valor + ", Detalhes: " + this.detalhes
                + ", Data De Validade: " + this.dtval + " }";
    }
}
