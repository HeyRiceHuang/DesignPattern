import java.util.ArrayList;
import java.util.HashMap;

public class IDCardFactory extends Factory {

    ArrayList<Product> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap = new HashMap<>();
    int serialNo = 100;

    @Override
    public synchronized Product CreateProduct(String owner) {
        Product product = new IDCard(owner, serialNo++);
        return product;
    }

    @Override
    public void RegisterProduct(Product product) {
        arrayList.add(product);
        hashMap.put(((IDCard)product).GetOwner(), ((IDCard)product).GetSerialNo());
    }
}
