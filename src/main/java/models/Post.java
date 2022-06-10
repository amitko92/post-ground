package models;

import java.util.Date;

public class Post extends Entity{

    private String title = "";
    private String content = "";
    private Date creationDate = null;
    private Date lastEditDate = null;
    private int userId = -1;

    public Post(int id, String title, String content, Date creationDate, Date lastEditDate, int userId) {
        super(id);

        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
        this.lastEditDate = lastEditDate;
        this.userId = userId;
    }

    public Post(String title, String content, Date creationDate, Date lastEditDate, int userId) {
        super(-1);

        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
        this.lastEditDate = lastEditDate;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Post{" +
                super.toString() +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", creationDate=" + creationDate +
                ", LastEditDate=" + lastEditDate +
                ", userId=" + userId +
                '}';
    }

    public void setId(int id) {
        this.setId(id);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setLastEditDate(Date lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() { return this.getId(); }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getLastEditDate() { return lastEditDate; }

    public int getUserId() {
        return userId;
    }
}
