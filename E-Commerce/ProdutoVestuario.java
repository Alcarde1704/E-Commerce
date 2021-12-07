public class ProdutoVestuario implements Produto {
    public String nome;
    public double valor;
    public String detalhes;
    public String tamanho;

    public ProdutoVestuario(String nome, double valor, String detalhes, String tamanho) {
        this.nome = nome;
        this.valor = valor;
        this.detalhes = detalhes;
        this.tamanho = tamanho;
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
        return "\n{Nome: " + this.nome + ", Valor: R$" + this.valor + ", Detalhes: " + this.detalhes + ", Tamanho: "
                + this.tamanho + " }";
    }

}
