package com.hightail.yahoo.weather.entities;

/**
 * Created by mshahid on 5/29/14.
 */
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
@javax.xml.bind.annotation.XmlType(name = "rss", propOrder = {"channel"})
public class RSS {
    @javax.xml.bind.annotation.XmlElement(name = "channel", required = true)
    protected Channel channel;

    public Channel getChannel(){
        return channel;
    }
    public void setChannel(Channel channel){
        this.channel = channel;
    }
}
