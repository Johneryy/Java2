package Diary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    Entry entry;

    @BeforeEach
    void setUp() {
        entry=new Entry();
    }

    @AfterEach
    void tearDown() {
        entry=null;
    }
    @Test
    void testThatEntryCanHaveId(){
        entry.setId("1");
        assertEquals("1",entry.getId());


    }
    @Test
    void testThatEntryCanHaveTitle(){
        entry.setTitle("Entry1");
        assertEquals("Entry1",entry.getTitle());

    }
    @Test
    void testThatEntryCanHaveBody(){
        entry.setBody("Body1");
        assertEquals("Body1",entry.getBody());


    }
    @Test
    void testThatEntryCanHaveDate(){
        entry.setDate(new Date());
        assertEquals(new Date(),entry.getDate());

    }
}