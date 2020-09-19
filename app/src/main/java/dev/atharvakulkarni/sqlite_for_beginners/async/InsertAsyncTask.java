package dev.atharvakulkarni.sqlite_for_beginners.async;

import android.os.AsyncTask;

import dev.atharvakulkarni.sqlite_for_beginners.models.Note;
import dev.atharvakulkarni.sqlite_for_beginners.persistence.NoteDao;

public class InsertAsyncTask extends AsyncTask<Note, Void, Void>
{
    private NoteDao mNoteDao;

    public InsertAsyncTask(NoteDao dao)
    {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes)
    {
        mNoteDao.insertNotes(notes);
        return null;
    }
}