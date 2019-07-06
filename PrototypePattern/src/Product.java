
// Cloneable在JAVA就是标记的存在，让用户去选择该类是否Clonable，具体实现是在JVM里面
public abstract class Product implements Cloneable {
    public abstract void Use(String s);
    public Product CreateClone() {
        Product product = null;
        try {
            product = (Product)clone();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return product;
    }
}
