package cn.entity;

import java.util.Date;

public class Category {
    private Integer id;

    private String name;

    private String content;

    private Date createdat;

    private Date updatedat;

    private Date deletedat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    public Date getDeletedat() {
        return deletedat;
    }

    public void setDeletedat(Date deletedat) {
        this.deletedat = deletedat;
    }
}