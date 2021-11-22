package com.philippsalata.drive;

import com.philippsalata.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();

    File findFile(String name);
}
