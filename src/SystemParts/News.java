package SystemParts;

import Enums.NewsType;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;
public class News implements Serializable{
    private String title;
    private String content;
    private Date date;
    private NewsType newsType;
    public Vector<Comment> comment;
    public News() {

    }

    public News(String title, String content, Date date, NewsType newsType) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.newsType = newsType;
        this.comment = new Vector<>();
    }
    public void addComment(Comment commentary) {
        comment.add(commentary);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public NewsType getNewsType() {
        return newsType;
    }

    public void setNewsType(NewsType newsType) {
        this.newsType = newsType;
    }

    public Vector<Comment> getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", newsType=" + newsType +
                "}";
    }
}
