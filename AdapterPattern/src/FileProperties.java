import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
    @Override
    public void ReadFromFile(String filename) throws IOException {
        InputStream inputStream = new FileInputStream(filename);
        super.load(inputStream);
        inputStream.close();
    }

    @Override
    public void WriteToFile(String filename) throws IOException {
        OutputStream outputStream = new FileOutputStream(filename);
        super.store(outputStream, "store");
    }

    @Override
    public void SetValue(String key, String value) {
        super.setProperty(key, value);
    }

    @Override
    public String GetValue(String key) {
        return super.getProperty(key);
    }
}
