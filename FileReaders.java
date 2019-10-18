package amharicstopwordremoval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author Epha
 */
public class FileReaders
{
    public static String read(String fileLocation) throws FileNotFoundException, IOException 
    {
        File location = new File(fileLocation);
        File[] inputs;
        if (location.isDirectory())
        {
            inputs = location.listFiles();
        }
        else {
            inputs = new File[]{location};
        }
        String data = "";
        for (File input : inputs)
        {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(input)))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (StringUtils.isEmpty(line)) {
                        continue;
                    }
                    data += line;
                }
            } 
        }
        return data;
    }

}
