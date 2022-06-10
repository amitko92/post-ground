package models;

import java.util.Date;

public class Comment {

    private int id = -1;
    private String content = "";
    private Date creationDate = null;
    private Date LastEditDate = null;
    private int postId = -1;
    private int userId = -1;

    public Comment(int id, String content, Date creationDate, Date lastEditDate, int postId, int userId) {

        this.id = id;
        this.content = content;
        this.creationDate = creationDate;
        LastEditDate = lastEditDate;
        this.postId = postId;
        this.userId = userId;
    }

    public Comment(String content, Date creationDate, Date lastEditDate, int postId, int userId) {

        this.content = content;
        this.creationDate = creationDate;
        LastEditDate = lastEditDate;
        this.postId = postId;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", creationDate=" + creationDate +
                ", LastEditDate=" + LastEditDate +
                ", postId=" + postId +
                ", userId=" + userId +
                '}';
    }

    public void setId(int id) {
        this.id = id;
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

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
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

    public int getPostId() {
        return postId;
    }

    public int getUserId() {
        return userId;
    }
}
