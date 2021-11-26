package composicao.exerciciotres.model.entities;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(Integer quantyti, Double price, Product product) {
        this.quantity = quantyti;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantyti() {
        return quantity;
    }

    public void setQuantyti(Integer quantyti) {
        this.quantity = quantyti;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return product.getName()
            + ", $"
            + String.format("%.2f", price)
            + ", Quantity: "
            + quantity
            + ", Subtotal: $"
            + String.format("%.2f", subTotal());

    }
}
