import java.util.ArrayList;
import java.util.HashMap;

public class IDCardFactory extends Factory {

    ArrayList<Product> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap = new HashMap<>();

    @Override
    public Product CreateProduct(String owner, String serialNo) {
        Product product = new IDCard(owner, serialNo);
        return product;
    }

    @Override
    public void RegisterProduct(Product product) {
        arrayList.add(product);
        hashMap.put(product.GetOwner(), product.GetSerialNo());
    }
}
