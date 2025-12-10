package org.apache.commons.p028io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* renamed from: org.apache.commons.io.IORandomAccessFile */
/* loaded from: classes6.dex */
public final class IORandomAccessFile extends RandomAccessFile {

    /* renamed from: a */
    public final File f73248a;

    /* renamed from: b */
    public final String f73249b;

    public IORandomAccessFile(File file, String str) throws FileNotFoundException {
        super(file, str);
        this.f73248a = file;
        this.f73249b = str;
    }

    public File getFile() {
        return this.f73248a;
    }

    public String getMode() {
        return this.f73249b;
    }

    public String toString() {
        return Objects.toString(this.f73248a);
    }

    public IORandomAccessFile(String str, String str2) throws FileNotFoundException {
        super(str, str2);
        this.f73248a = str != null ? new File(str) : null;
        this.f73249b = str2;
    }
}
