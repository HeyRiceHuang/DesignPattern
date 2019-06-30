import java.io.IOException;

public interface FileIO {
    public void ReadFromFile(String filename) throws IOException;
    public void WriteToFile(String filename) throws IOException;
    public void SetValue(String key, String value);
    public String GetValue(String key);
}
