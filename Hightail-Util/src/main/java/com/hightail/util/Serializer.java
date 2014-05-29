package com.hightail.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;

/**
 * Created by mshahid on 5/29/14.
 */
public class Serializer {

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
}
