package orientacaoObjetoProdutoNovo.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product() { // implementação do construtor padrão

    }

    public Product (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
//      this.quantity = 0; não é obrigatório, pois o Java inicializa por padrão com zero a variável int
    }

    public double totalValueInStock() {
        return quantity*price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
            + ", $"
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $"
            + String.format("%.2f", totalValueInStock());

    }

}
