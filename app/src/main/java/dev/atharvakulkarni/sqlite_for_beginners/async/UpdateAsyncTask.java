package dev.atharvakulkarni.sqlite_for_beginners.async;

import android.os.AsyncTask;

import dev.atharvakulkarni.sqlite_for_beginners.models.Note;
import dev.atharvakulkarni.sqlite_for_beginners.persistence.NoteDao;

public class UpdateAsyncTask extends AsyncTask<Note, Void, Void>
{
    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao dao)
    {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes)
    {
        mNoteDao.updateNotes(notes);
        return null;
    }
}