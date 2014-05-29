package com.hightail.yahoo.weather.entities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * Created by mshahid on 5/29/14.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TitleCHannelRSS = new QName("http://xml.weather.yahoo.com/ns/rss/1.0", "title");

    @XmlElementDecl(namespace = "http://xml.weather.yahoo.com/ns/rss/1.0", name = "title", scope = RSS.class)
    public JAXBElement<String> createTitleCHannelRSS(String value) {
        return new JAXBElement<String>(_TitleCHannelRSS, String.class, RSS.class, value);
    }

}
