package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class AtomicFile {

    /* renamed from: a */
    public final File f34175a;

    /* renamed from: b */
    public final File f34176b;

    /* renamed from: c */
    public final File f34177c;

    public AtomicFile(@NonNull File file) {
        this.f34175a = file;
        this.f34176b = new File(file.getPath() + ".new");
        this.f34177c = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public static void m57013a(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete file which is a directory ");
            sb.append(file2);
        }
        if (!file.renameTo(file2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to rename ");
            sb2.append(file);
            sb2.append(" to ");
            sb2.append(file2);
        }
    }

    /* renamed from: b */
    public static boolean m57012b(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void delete() {
        this.f34175a.delete();
        this.f34176b.delete();
        this.f34177c.delete();
    }

    public void failWrite(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        m57012b(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        if (!this.f34176b.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete new file ");
            sb.append(this.f34176b);
        }
    }

    public void finishWrite(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        m57012b(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        m57013a(this.f34176b, this.f34175a);
    }

    @NonNull
    public File getBaseFile() {
        return this.f34175a;
    }

    @NonNull
    public FileInputStream openRead() throws FileNotFoundException {
        if (this.f34177c.exists()) {
            m57013a(this.f34177c, this.f34175a);
        }
        if (this.f34176b.exists() && this.f34175a.exists() && !this.f34176b.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete outdated new file ");
            sb.append(this.f34176b);
        }
        return new FileInputStream(this.f34175a);
    }

    @NonNull
    public byte[] readFully() throws IOException {
        FileInputStream openRead = openRead();
        try {
            byte[] bArr = new byte[openRead.available()];
            int i = 0;
            while (true) {
                int read = openRead.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = openRead.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[available + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            openRead.close();
        }
    }

    @NonNull
    public FileOutputStream startWrite() throws IOException {
        if (this.f34177c.exists()) {
            m57013a(this.f34177c, this.f34175a);
        }
        try {
            return new FileOutputStream(this.f34176b);
        } catch (FileNotFoundException unused) {
            if (this.f34176b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f34176b);
                } catch (FileNotFoundException e) {
                    throw new IOException("Failed to create new file " + this.f34176b, e);
                }
            }
            throw new IOException("Failed to create directory for " + this.f34176b);
        }
    }
}