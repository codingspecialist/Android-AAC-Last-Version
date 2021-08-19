package com.com.aac;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import org.jetbrains.annotations.NotNull;

public class MainViewModel extends ViewModel {

    private MutableLiveData<Note> note = new MutableLiveData<>();

    // 옵저버로 지켜볼려면 return 해야함.
    public MutableLiveData<Note> getNote(){
        return note;
    }

    public void init(){
        note.setValue(new Note(1, "제목", "내용"));
    }

    public void updateNote(){
        note.setValue(new Note(2, "제목 변경", "내용 변경"));
    }
}
