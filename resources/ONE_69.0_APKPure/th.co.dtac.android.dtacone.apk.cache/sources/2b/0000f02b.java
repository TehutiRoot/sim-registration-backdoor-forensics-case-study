package org.apache.commons.p028io.monitor;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.Objects;
import org.apache.commons.p028io.FileUtils;
import org.apache.commons.p028io.file.attribute.FileTimes;

/* renamed from: org.apache.commons.io.monitor.FileEntry */
/* loaded from: classes6.dex */
public class FileEntry implements Serializable {
    static final FileEntry[] EMPTY_FILE_ENTRY_ARRAY = new FileEntry[0];
    private static final long serialVersionUID = -2505664948818681153L;
    private FileEntry[] children;
    private boolean directory;
    private boolean exists;
    private final File file;
    private SerializableFileTime lastModified;
    private long length;
    private String name;
    private final FileEntry parent;

    public FileEntry(File file) {
        this(null, file);
    }

    public FileEntry[] getChildren() {
        FileEntry[] fileEntryArr = this.children;
        if (fileEntryArr == null) {
            return EMPTY_FILE_ENTRY_ARRAY;
        }
        return fileEntryArr;
    }

    public File getFile() {
        return this.file;
    }

    public long getLastModified() {
        return this.lastModified.toMillis();
    }

    public FileTime getLastModifiedFileTime() {
        return this.lastModified.unwrap();
    }

    public long getLength() {
        return this.length;
    }

    public int getLevel() {
        FileEntry fileEntry = this.parent;
        if (fileEntry == null) {
            return 0;
        }
        return fileEntry.getLevel() + 1;
    }

    public String getName() {
        return this.name;
    }

    public FileEntry getParent() {
        return this.parent;
    }

    public boolean isDirectory() {
        return this.directory;
    }

    public boolean isExists() {
        return this.exists;
    }

    public FileEntry newChildInstance(File file) {
        return new FileEntry(this, file);
    }

    public boolean refresh(File file) {
        Path path;
        boolean exists;
        boolean z;
        long j;
        FileTime fileTime;
        boolean z2 = this.exists;
        SerializableFileTime serializableFileTime = this.lastModified;
        boolean z3 = this.directory;
        long j2 = this.length;
        this.name = file.getName();
        path = file.toPath();
        exists = Files.exists(path, new LinkOption[0]);
        this.exists = exists;
        if (exists && file.isDirectory()) {
            z = true;
        } else {
            z = false;
        }
        this.directory = z;
        try {
            if (this.exists) {
                fileTime = FileUtils.lastModifiedFileTime(file);
            } else {
                fileTime = FileTimes.EPOCH;
            }
            setLastModified(fileTime);
        } catch (IOException unused) {
            setLastModified(SerializableFileTime.EPOCH);
        }
        if (this.exists && !this.directory) {
            j = file.length();
        } else {
            j = 0;
        }
        this.length = j;
        if (this.exists == z2 && this.lastModified.equals(serializableFileTime) && this.directory == z3 && this.length == j2) {
            return false;
        }
        return true;
    }

    public void setChildren(FileEntry... fileEntryArr) {
        this.children = fileEntryArr;
    }

    public void setDirectory(boolean z) {
        this.directory = z;
    }

    public void setExists(boolean z) {
        this.exists = z;
    }

    public void setLastModified(FileTime fileTime) {
        setLastModified(new SerializableFileTime(fileTime));
    }

    public void setLength(long j) {
        this.length = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    public FileEntry(FileEntry fileEntry, File file) {
        this.lastModified = SerializableFileTime.EPOCH;
        Objects.requireNonNull(file, "file");
        this.file = file;
        this.parent = fileEntry;
        this.name = file.getName();
    }

    public void setLastModified(long j) {
        FileTime fromMillis;
        fromMillis = FileTime.fromMillis(j);
        setLastModified(fromMillis);
    }

    public void setLastModified(SerializableFileTime serializableFileTime) {
        this.lastModified = serializableFileTime;
    }
}