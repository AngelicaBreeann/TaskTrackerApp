package com.example.tasktracker

import androidx.lifecycle.LiveData

class NoteRepo (private val dao: Dao){
    val allNotes: LiveData<List<Note>> = dao.getAllNotes()

    suspend fun insert(note: Note){
        dao.insert(note)
    }
    suspend fun delete(note: Note){
        dao.delete(note)
    }
    suspend fun update(note: Note){
        dao.update(note)
    }


}