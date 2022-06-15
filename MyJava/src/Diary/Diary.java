package Diary;

import java.util.ArrayList;
import java.util.Date;

public class Diary {
    private String name;
    private Date dateCreated;
//    private ArrayList<Entry> entries=new ArrayList<>();
    private ArrayList<Entry> entries = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Entry getEntry(int index){
        return entries.get(index);
    }
    public void addEntry(Entry entry){
        entries.add(entry);
    }
    public void deleteEntry(int index){
        entries.remove(index);
    }
    public void editEntry(String title,String body,int index){
       Entry entry= entries.get(index);
       if(!title.isBlank()&&!title.isEmpty()){
           entry.setTitle(title);
       }
       if(!body.isBlank()&&!body.isEmpty()){
            entry.setBody(body);
        }
       entries.add(entry);
    }
    public ArrayList<Entry> getEntries() {
        return entries;
    }

    public void setEntries(ArrayList<Entry> entries) {
        this.entries = entries;
    }
}
