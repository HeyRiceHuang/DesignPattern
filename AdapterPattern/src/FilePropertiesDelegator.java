import java.io.*;
import java.util.Properties;

public class FilePropertiesDelegator implements FileIO{

    private Properties properties = new Properties();

    @Override
    public void ReadFromFile(String filename) throws IOException {
        InputStream inputStream = new FileInputStream(filename);
        properties.load(inputStream);
        inputStream.close();
    }

    @Override
    public void WriteToFile(String filename) throws IOException {
        OutputStream outputStream = new FileOutputStream(filename);
        properties.store(outputStream, "store");
        outputStream.close();
    }

    @Override
    public void SetValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String GetValue(String key) {
        return properties.getProperty(key);
    }
}
