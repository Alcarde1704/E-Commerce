
public class ProdutoTecnologico implements Produto {
    public String nome;
    public double valor;
    public String detalhes;
    public int voltagem;

    public ProdutoTecnologico(String nome, double valor, String detalhes, int voltagem) {
        this.nome = nome;
        this.valor = valor;
        this.detalhes = detalhes;
        this.voltagem = voltagem;
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
        return "\n{Nome do Produto: " + this.nome + ", Valor: R$" + this.valor + ", Detalhes: " + this.detalhes
                + ", Voltagem: "
                + this.voltagem + "V }";
    }
}
