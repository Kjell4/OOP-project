package SystemParts;

import java.util.Date;
import java.util.Vector;
public class Comment {
    private String content;
    private String from;
    private Date date;
    public Comment() {

    }
    public Comment(String content, String from, Date date) {
        this.content = content;
        this.from = from;
        this.date = date;
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

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "content='" + content + '\'' +
                ", from='" + from + '\'' +
                ", date=" + date +
                '}';
    }
}
