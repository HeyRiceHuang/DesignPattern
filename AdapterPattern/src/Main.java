import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        FileIO f = new FileProperties();
        FileIO f = new FilePropertiesDelegator();
        try {
            f.ReadFromFile("src/file");
            f.SetValue("year", "2004");
            f.SetValue("month","4");
            f.SetValue("day","21");
            f.WriteToFile("src/newfile");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
