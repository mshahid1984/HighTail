package com.hightail.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;
import java.io.StringReader;

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

    public static <T> Object stringToJAXBElement (String responseString, Class<T> clas){
        try {
            JAXBContext context = JAXBContext.newInstance(clas);
            Unmarshaller unmarshal = context.createUnmarshaller();
            T newObj = (T)unmarshal.unmarshal(new StreamSource(new StringReader(responseString)), clas);
            return 	((JAXBElement)newObj).getValue();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
