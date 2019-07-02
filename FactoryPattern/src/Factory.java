public abstract class Factory {
    public final Product Create(String owner) {
        Product product = CreateProduct(owner);
        RegisterProduct(product);
        return product;
    }
    public abstract Product CreateProduct(String owner);
    public abstract void RegisterProduct(Product product);

}
