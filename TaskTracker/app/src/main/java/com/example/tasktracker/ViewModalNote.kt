package com.example.tasktracker

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ViewModalNote (application: Application) : AndroidViewModel(application){
    val allNotes: LiveData<List<Note>>
    val repo: NoteRepo

    init {
        val dao_ = NoteDatabase.getDatabase(application).getNoteDao()
        repo = NoteRepo(dao_)
        allNotes = repo.allNotes
    }

    fun deleteNote(note: Note) = viewModelScope.launch(Dispatchers.IO){
        repo.delete(note)
    }
    fun updateNote(note: Note) = viewModelScope.launch(Dispatchers.IO){
        repo.update(note)
    }
    fun addNote(note: Note) = viewModelScope.launch(Dispatchers.IO){
        repo.insert(note)
    }
}