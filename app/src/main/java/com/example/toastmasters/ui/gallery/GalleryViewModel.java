package com.example.toastmasters.ui.gallery;

import android.widget.GridView;

import androidx.constraintlayout.helper.widget.Grid;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    ArrayList<ToastmastersGalaryModel> toastmastersGalaryModelArrayList;

    MyGalleryAdapter adapter;
    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");


    }

    public LiveData<String> getText() {
        return mText;
    }
}