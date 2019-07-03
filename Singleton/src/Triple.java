import org.w3c.dom.ranges.RangeException;

public class Triple {

    private Triple(){}

    static Triple[] triples = new Triple[3];

    public static Triple GetInstant(int id) {
        if (id < 0 || id > 3) {
            throw new RangeException(RangeException.BAD_BOUNDARYPOINTS_ERR, "Out Of Range");
        }
        if (triples[id] == null) {
            synchronized (Triple.class) {
                if (triples[id] == null) {
                    triples[id] = new Triple();
                    return triples[id];
                }
            }
        }
    }
}
