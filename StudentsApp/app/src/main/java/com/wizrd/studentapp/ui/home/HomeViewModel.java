package com.wizrd.studentapp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import android.content.Intent;
import android.widget.*;

public class HomeViewModel extends ViewModel {
    Button floatingActionButton;

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hello student");
    }

    public LiveData<String> getText() {
        return mText;
    }
}