package models;

import java.util.Date;
import java.util.List;

public class Post {

    private int id = -1;
    private String title = "";
    private String content = "";
    private Date creationDate = null;
    private Date LastEditDate = null;
    private List<Comment> comments = null;

    private int userId = -1;

    public Post(int id, String title, String content, Date creationDate, Date lastEditDate, List<Comment> comments, int userId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
        LastEditDate = lastEditDate;
        this.comments = comments;
        this.userId = userId;
    }

    public Post(String title, String content, Date creationDate, Date lastEditDate, List<Comment> comments, int userId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
        LastEditDate = lastEditDate;
        this.comments = comments;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", creationDate=" + creationDate +
                ", LastEditDate=" + LastEditDate +
                ", comments=" + comments +
                ", userId=" + userId +
                '}';
    }

    public void setId(int id) {
        this.id = id;
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
        LastEditDate = lastEditDate;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getLastEditDate() {
        return LastEditDate;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public int getUserId() {
        return userId;
    }
}
