package SystemParts;

import Enums.NewsType;
import java.util.Vector;
import java.util.Date;
public class NewsSection {

    private Vector<News> newsFeed;

    public NewsSection() {

    }
    public NewsSection(Vector<News> newsFeed) {
        this.newsFeed = newsFeed;
    }

    public void addNews(News news) {
        this.newsFeed.add(news);
        if(news.getNewsType() == NewsType.RES) makeAnnounce(news);
    }

    public void viewNews() {
        for (News news : newsFeed) {
            System.out.println(news);
            for (int j = 0; j < news.comment.size(); ++j) {
                System.out.println(news.comment.get(j));
            }
        }
    }

    public void makeAnnounce(News news) {
        System.out.println("New news on topic : " + news.getTitle() + " was posted! Go check and comment!");
    }

    public void writeComment(News news, String content, String from, Date date) {
        Comment comment = new Comment(content, from, date);
        news.addComment(comment);
        System.out.println("User : " + from + " written a comment below the news '" + news.getTitle() + "'");
    }
}
