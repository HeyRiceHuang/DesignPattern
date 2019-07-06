public class UnderlinePen extends Product {

    private char ulchar;

    private UnderlinePen(char r) {
        ulchar = r;
    }

    @Override
    public void Use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length; i++) {
            System.out.println(ulchar);
        }
    }
}
