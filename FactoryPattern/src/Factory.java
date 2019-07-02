public abstract class Factory {
    public final Product Create(String owner, String serialNo) {
        Product product = CreateProduct(owner, serialNo);
        RegisterProduct(product);
        return product;
    }
    public abstract Product CreateProduct(String owner, String serialNo);
    public abstract void RegisterProduct(Product product);

}
