package com.example.notekeep

import org.junit.Assert.*

class DataManagerTest {

    @org.junit.Test
    fun addNote() {
        val course = DataManager.courses.get("android_async")!!
        val noteTitle = "Ths is a test note"
        val noteText = "This is the body of my test note"

        val index = DataManager.addNote(course, noteTitle, noteText)
        val note = DataManager.notes[index]
        assertEquals(course, note.course)
        assertEquals(noteTitle, note.title)
        assertEquals(noteText, note.text)
    }
}