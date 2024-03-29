package com.example.awesomefilepicker;

import android.net.Uri;

import androidx.annotation.NonNull;

public interface FileCallback {
    void onFileSelected(
            @NonNull Uri fileUri,
            @NonNull FilePicker.PickObject pickObject
    );

    void onOperationCancelled(String e);
}
