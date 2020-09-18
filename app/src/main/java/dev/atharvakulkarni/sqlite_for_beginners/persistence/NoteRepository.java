package dev.atharvakulkarni.sqlite_for_beginners.persistence;

import android.content.Context;

import androidx.lifecycle.LiveData;

import java.util.List;

import dev.atharvakulkarni.sqlite_for_beginners.async.DeleteAsyncTask;
import dev.atharvakulkarni.sqlite_for_beginners.async.InsertAsyncTask;
import dev.atharvakulkarni.sqlite_for_beginners.async.UpdateAsyncTask;
import dev.atharvakulkarni.sqlite_for_beginners.models.Note;

public class NoteRepository {

    private NoteDatabase mNoteDatabase;

    public NoteRepository(Context context) {
        mNoteDatabase = NoteDatabase.getInstance(context);
    }

    public void insertNoteTask(Note note){
        new InsertAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public void updateNoteTask(Note note){
        new UpdateAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public LiveData<List<Note>> retrieveNotesTask() {
        return mNoteDatabase.getNoteDao().getNotes();
    }

    public void deleteNoteTask(Note note){
        new DeleteAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }
}
