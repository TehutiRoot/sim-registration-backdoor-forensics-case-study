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
    public final File f34087a;

    /* renamed from: b */
    public final File f34088b;

    /* renamed from: c */
    public final File f34089c;

    public AtomicFile(@NonNull File file) {
        this.f34087a = file;
        this.f34088b = new File(file.getPath() + ".new");
        this.f34089c = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public static void m57063a(File file, File file2) {
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
    public static boolean m57062b(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void delete() {
        this.f34087a.delete();
        this.f34088b.delete();
        this.f34089c.delete();
    }

    public void failWrite(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        m57062b(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        if (!this.f34088b.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete new file ");
            sb.append(this.f34088b);
        }
    }

    public void finishWrite(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        m57062b(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        m57063a(this.f34088b, this.f34087a);
    }

    @NonNull
    public File getBaseFile() {
        return this.f34087a;
    }

    @NonNull
    public FileInputStream openRead() throws FileNotFoundException {
        if (this.f34089c.exists()) {
            m57063a(this.f34089c, this.f34087a);
        }
        if (this.f34088b.exists() && this.f34087a.exists() && !this.f34088b.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete outdated new file ");
            sb.append(this.f34088b);
        }
        return new FileInputStream(this.f34087a);
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
        if (this.f34089c.exists()) {
            m57063a(this.f34089c, this.f34087a);
        }
        try {
            return new FileOutputStream(this.f34088b);
        } catch (FileNotFoundException unused) {
            if (this.f34088b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f34088b);
                } catch (FileNotFoundException e) {
                    throw new IOException("Failed to create new file " + this.f34088b, e);
                }
            }
            throw new IOException("Failed to create directory for " + this.f34088b);
        }
    }
}
