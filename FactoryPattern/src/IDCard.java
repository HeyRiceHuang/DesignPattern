public class IDCard extends Product {
    private String owner;
    private int serialNo;

    IDCard(String owner, int serialNo) {
        this.owner = owner;
        this.serialNo = serialNo;
    }

    @Override
    public void Use() {
        System.out.printf("ID Card with Serial No %s Owned by %s is Used", owner, serialNo);
    }

    public String GetOwner() {
        return this.owner;
    }

    public int GetSerialNo() {
        return this.serialNo;
    }
}
