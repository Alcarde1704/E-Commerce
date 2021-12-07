import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> listaProdutos = new ArrayList<Produto>();
    private double saldo;

    public void addProduto(Produto p) {
        listaProdutos.add(p);
        saldo += p.mostraValor();
    }

    public void removeProduto(Produto p) {
        listaProdutos.remove(p);
        saldo -= p.mostraValor();
    }

    public List<Produto> mostraRelatorio() {
        return listaProdutos;
    }

    public double saldoTotalaPagar() {
        return saldo;
    }

}
