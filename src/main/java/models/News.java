package models;

import java.util.Objects;

public class News {
    private String newsTitle;
    private String newsContent;
    private int departmentId;
    private int id;


    public News(String newsTitle, String newsContent){
        this.newsTitle = newsTitle;
        this.newsContent = newsContent;
        this.departmentId = 0;
    }



    public News(String newsTitle, String newsContent, int departmentId){
        this.newsContent = newsContent;
        this.newsTitle = newsTitle;
        this.departmentId = departmentId;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return departmentId == news.departmentId &&
                newsTitle.equals(news.newsTitle) &&
                newsContent.equals(news.newsContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsTitle, newsContent, departmentId);
    }


    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
