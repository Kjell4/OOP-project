package Comparators;

import Enums.NewsType;
import SystemParts.News;

import java.util.Comparator;

public class OrderComparator implements Comparator<News> {
    @Override
    public int compare(News n, News m) {
        if(n.getNewsType() == NewsType.RES && m.getNewsType() == NewsType.RES) return 1;
        return -1;
    }


}
