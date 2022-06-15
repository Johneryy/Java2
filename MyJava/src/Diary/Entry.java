package Diary;

import java.util.Date;

public class Entry {
    private String id;
    private String title;
    private String body;

    private Date date;

    public void setId(String id) {
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String body) {
        this.body=body;
    }

    public String getBody() {
        return body;
    }

    public void setDate(Date date) {
        this.date=date;
    }

    public Date getDate() {
        return date;
    }
}
