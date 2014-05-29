package temporary.test;

import com.hightail.yahoo.weather.entities.Rss;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by mshahid on 5/29/14.
 */
public class TestClass {

    public static void main(String[] str){
        InputStream inputStream = openFile("./Entities/src/main/resources/Test.xml");
        JAXBElement<?> response = stringToJAXBElement(inputStream, Rss.class);
        System.out.println();
    }

    public static <T> JAXBElement<?> stringToJAXBElement (InputStream in, Class<T> clas){
        try {
            JAXBContext context = JAXBContext.newInstance(clas);
            Unmarshaller unmarshal = context.createUnmarshaller();
            Source source = new StreamSource(in);
            return unmarshal.unmarshal(source, clas);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static InputStream openFile(String filename)
    {
        InputStream in = null;
        try
        {
            in = new FileInputStream(filename);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return in;
    }
}
