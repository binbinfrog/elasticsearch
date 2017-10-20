package cn.ap2ad.es.entity;

import java.io.Serializable;

public class Author implements Serializable {
    private String id;
    private String name;

    public Author() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
