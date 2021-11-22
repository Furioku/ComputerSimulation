package com.philippsalata.file.imagefile;

import com.philippsalata.file.AbstractFile;
import com.philippsalata.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super (name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
