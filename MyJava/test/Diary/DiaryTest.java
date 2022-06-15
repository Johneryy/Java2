package Diary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary diary;
    @BeforeEach
    void setUp() {
        diary=new Diary();
    }

    @AfterEach
    void tearDown() {
        diary=null;
    }

    @Test
    void testThatDiaryHasName() {
        diary.setName("diary1");
        assertEquals("diary1",diary.getName());

    }


    @Test
    void testThatDiaryHasDateCreated() {
        diary.setDateCreated(new Date());
        assertEquals(new Date(),diary.getDateCreated());
    }

    @Test
    void getSingleEntryTest() {
        Entry entry=new Entry();
        entry.setTitle("Test1");
        entry.setBody("Body1");
        entry.setDate(new Date());
        entry.setId("1");
        diary.addEntry(entry);
        assertEquals(entry.getTitle(),diary.getEntry(0).getTitle());
        assertEquals(entry.getBody(),diary.getEntry(0).getBody());
        assertEquals(entry.getDate(),diary.getEntry(0).getDate());
        assertEquals(entry.getId(),diary.getEntry(0).getId());
    }

    @Test
    void getAllEntries() {
        //before adding entries
        assertEquals(0,diary.getEntries().size());
        Entry entry=new Entry();
        entry.setTitle("Test1");
        entry.setBody("Body1");
        entry.setDate(new Date());
        entry.setId("1");
        diary.addEntry(entry);
        //after adding an entry
        assertEquals(1,diary.getEntries().size());

    }
    @Test
    void deleteAnEntry() {
        //before adding entries
        assertEquals(0,diary.getEntries().size());
        Entry entry=new Entry();
        entry.setTitle("Test1");
        entry.setBody("Body1");
        entry.setDate(new Date());
        entry.setId("1");
        diary.addEntry(entry);
        //after adding an entry
        assertEquals(1,diary.getEntries().size());
        diary.deleteEntry(0);
        //after deleting the entry
        assertEquals(0,diary.getEntries().size());

    }
    @Test
    void editEntry() {

        Entry entry=new Entry();
        entry.setTitle("Test1");
        entry.setBody("Body1");
        entry.setDate(new Date());
        entry.setId("1");
        //initial entry
        diary.addEntry(entry);
        assertEquals(entry.getTitle(),diary.getEntry(0).getTitle());
        assertEquals(entry.getBody(),diary.getEntry(0).getBody());
        assertEquals(entry.getDate(),diary.getEntry(0).getDate());
        assertEquals(entry.getId(),diary.getEntry(0).getId());
        //updated entry
        diary.editEntry("New Title","New Body",0);
        assertEquals("New Title",diary.getEntry(0).getTitle());
        assertEquals("New Body",diary.getEntry(0).getBody());

    }




}