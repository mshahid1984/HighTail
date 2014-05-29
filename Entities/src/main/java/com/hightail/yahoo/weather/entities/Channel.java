package com.hightail.yahoo.weather.entities;

/**
 * Created by mshahid on 5/29/14.
 */
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
@javax.xml.bind.annotation.XmlType(name = "channel", propOrder = {"title"})
public class Channel {
    @javax.xml.bind.annotation.XmlElementRef(name = "title", type = javax.xml.bind.JAXBElement.class)
    protected javax.xml.bind.JAXBElement<java.lang.String> title;
}
