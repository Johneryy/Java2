package Diary;

import java.util.ArrayList;

public class User {
    private ArrayList<Diary>diaries=new ArrayList<>();

    public void createDiary(Diary diary){
        diaries.add(diary);
    }
    public Diary viewDiary(int index){
       return diaries.get(index);
    }

    public ArrayList<Diary> getDiaries() {
        return diaries;
    }

    public void setDiaries(ArrayList<Diary> diaries) {
        this.diaries = diaries;
    }
    public void editDiary(String name,ArrayList<Entry>entries,int index){
        Diary diary=diaries.get(index);
        if(!name.isEmpty()||!name.isBlank()){
            diary.setName(name);
        }
        if(entries.size()>0){
            diary.setEntries(entries);
        }
        diaries.add(diary);
    }
    public void deleteDiary(int index){
        diaries.remove(index);
    }
}
