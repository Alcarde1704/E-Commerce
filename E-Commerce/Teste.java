
public class Teste {
        public static void main(String[] args) {
                ProdutoTecnologico produtoTecnologico = new ProdutoTecnologico("TV", 1500.00,
                                "Preta, LCD, 32 polegadas", 220);
                ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio("Macarrao", 4.00, "Massa Fina, Integral",
                                "02/22");
                ProdutoVestuario produtoVestuario = new ProdutoVestuario("Camiseta Polo", 40.00,
                                "Preta, Gola em V, Tecido malha fina", "G");
                ProdutoTecnologico produtoTecnologico2 = new ProdutoTecnologico("Notebook", 3500.00,
                                "1TB, 8GB RAM, Tela 17' ", 220);

                Carrinho carrinho = new Carrinho();
                carrinho.addProduto(produtoTecnologico);
                carrinho.addProduto(produtoAlimenticio);
                carrinho.addProduto(produtoVestuario);
                carrinho.addProduto(produtoTecnologico2);

                System.out.println(carrinho.mostraRelatorio());
                System.out.println(carrinho.saldoTotalaPagar());

                carrinho.removeProduto(produtoTecnologico);
                carrinho.removeProduto(produtoAlimenticio);

                System.out.println(carrinho.mostraRelatorio());
                System.out.println(carrinho.saldoTotalaPagar());
        }
}
