package Diary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    @BeforeEach
    void setUp() {
        user=new User();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createDiary() {
        Diary diary=new Diary();
        diary.setName("Diary1");
        user.createDiary(diary);
        assertEquals("Diary1",user.getDiaries().get(0).getName());

    }

    @Test
    void viewDiary() {
        Diary diary=new Diary();
        diary.setName("Diary1");
        user.createDiary(diary);
        assertEquals("Diary1",user.viewDiary(0).getName());
    }

    @Test
    void getDiaries() {
        assertEquals(0,user.getDiaries().size());
        Diary diary=new Diary();
        diary.setName("Diary1");
        user.createDiary(diary);
        assertEquals(1,user.getDiaries().size());
    }

    @Test
    void editDiary() {
        Diary diary=new Diary();
        diary.setName("Diary1");
        user.createDiary(diary);
        assertEquals("Diary1",user.getDiaries().get(0).getName());
        assertEquals(0,user.getDiaries().get(0).getEntries().size());
        ArrayList<Entry>arrayList=new ArrayList<>();
        user.editDiary("Diary2",arrayList,0);
        assertEquals("Diary2",user.getDiaries().get(0).getName());
        assertNotNull(user.getDiaries().get(0).getEntries());
    }

    @Test
    void deleteEntry() {
        Diary diary=new Diary();
        diary.setName("Diary1");
        user.createDiary(diary);
        assertEquals(1,user.getDiaries().size());
        user.deleteDiary(0);
        assertEquals(0,user.getDiaries().size());
    }
}