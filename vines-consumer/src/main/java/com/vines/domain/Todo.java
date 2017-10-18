package com.vines.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlRootElement;

@JacksonXmlRootElement(localName  = "todo")
public class Todo {
    private String id;
    private boolean completed;
    private String desc;

    public Todo() {
    }

    public Todo(String id, boolean completed, String desc) {
        this.id = id;
        this.completed = completed;
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }



}
