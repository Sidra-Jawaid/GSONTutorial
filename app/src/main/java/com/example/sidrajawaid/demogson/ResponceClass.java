package com.example.sidrajawaid.demogson;

class ResponceClass {
    private String kind;
    private String id;
    private String name;
    private String description;
    private String published;
    private String updated;
    private String url;
    private String selflink;

    public ResponceClass(String kind, String id, String name,String desc,String pub,String up,String url,String selflink) {
        this.kind = kind;
        this.id = id;
        this.name = name;
        this.description=desc;
        this.published=pub;
        this.updated=up;
        this.url=url;
        this.selflink=selflink;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

    public String getDescription() {
        return description;
    }

    public String getPublished() {
        return published;
    }

    public String getUpdated() {
        return updated;
    }

    public String getUrl() {
        return url;
    }

    public String getSelflink() {
        return selflink;
    }
}
