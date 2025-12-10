package org.apache.commons.p028io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Objects;
import org.apache.commons.p028io.Charsets;
import org.apache.commons.p028io.FileUtils;
import org.apache.commons.p028io.build.AbstractOrigin;
import org.apache.commons.p028io.build.AbstractOriginSupplier;
import org.apache.commons.p028io.build.AbstractStreamBuilder;

/* renamed from: org.apache.commons.io.output.LockableFileWriter */
/* loaded from: classes6.dex */
public class LockableFileWriter extends Writer {

    /* renamed from: a */
    public final Writer f73649a;

    /* renamed from: b */
    public final File f73650b;

    /* renamed from: org.apache.commons.io.output.LockableFileWriter$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<LockableFileWriter, Builder> {

        /* renamed from: k */
        public boolean f73651k;

        /* renamed from: l */
        public AbstractOrigin f73652l = AbstractOriginSupplier.newFileOrigin(FileUtils.getTempDirectoryPath());

        public Builder() {
            setBufferSizeDefault(1024);
            setBufferSize(1024);
        }

        public Builder setAppend(boolean z) {
            this.f73651k = z;
            return this;
        }

        public Builder setLockDirectory(File file) {
            if (file == null) {
                file = FileUtils.getTempDirectory();
            }
            this.f73652l = AbstractOriginSupplier.newFileOrigin(file);
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public LockableFileWriter get() throws IOException {
            return new LockableFileWriter(checkOrigin().getFile(), getCharset(), this.f73651k, this.f73652l.getFile().toString());
        }

        public Builder setLockDirectory(String str) {
            if (str == null) {
                str = FileUtils.getTempDirectoryPath();
            }
            this.f73652l = AbstractOriginSupplier.newFileOrigin(str);
            return this;
        }
    }

    @Deprecated
    public LockableFileWriter(File file) throws IOException {
        this(file, false, (String) null);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: b */
    public final void m25107b() {
        synchronized (LockableFileWriter.class) {
            try {
                if (this.f73650b.createNewFile()) {
                    this.f73650b.deleteOnExit();
                } else {
                    throw new IOException("Can't write file, lock " + this.f73650b.getAbsolutePath() + " exists");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f73649a.close();
        } finally {
            FileUtils.delete(this.f73650b);
        }
    }

    /* renamed from: d */
    public final Writer m25106d(File file, Charset charset, boolean z) {
        boolean exists = file.exists();
        try {
            return new OutputStreamWriter(new FileOutputStream(file.getAbsolutePath(), z), Charsets.toCharset(charset));
        } catch (IOException | RuntimeException e) {
            FileUtils.deleteQuietly(this.f73650b);
            if (!exists) {
                FileUtils.deleteQuietly(file);
            }
            throw e;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f73649a.flush();
    }

    /* renamed from: g */
    public final void m25105g(File file) {
        if (file.exists()) {
            if (file.canWrite()) {
                return;
            }
            throw new IOException("Could not write to lockDir: " + file.getAbsolutePath());
        }
        throw new IOException("Could not find lockDir: " + file.getAbsolutePath());
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        this.f73649a.write(cArr);
    }

    @Deprecated
    public LockableFileWriter(File file, boolean z) throws IOException {
        this(file, z, (String) null);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        this.f73649a.write(cArr, i, i2);
    }

    @Deprecated
    public LockableFileWriter(File file, boolean z, String str) throws IOException {
        this(file, Charset.defaultCharset(), z, str);
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        this.f73649a.write(i);
    }

    @Deprecated
    public LockableFileWriter(File file, Charset charset) throws IOException {
        this(file, charset, false, (String) null);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        this.f73649a.write(str);
    }

    @Deprecated
    public LockableFileWriter(File file, Charset charset, boolean z, String str) throws IOException {
        Objects.requireNonNull(file, "file");
        File absoluteFile = file.getAbsoluteFile();
        if (absoluteFile.getParentFile() != null) {
            FileUtils.forceMkdir(absoluteFile.getParentFile());
        }
        if (!absoluteFile.isDirectory()) {
            File file2 = new File(str == null ? FileUtils.getTempDirectoryPath() : str);
            FileUtils.forceMkdir(file2);
            m25105g(file2);
            this.f73650b = new File(file2, absoluteFile.getName() + ".lck");
            m25107b();
            this.f73649a = m25106d(absoluteFile, charset, z);
            return;
        }
        throw new IOException("File specified is a directory");
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        this.f73649a.write(str, i, i2);
    }

    @Deprecated
    public LockableFileWriter(File file, String str) throws IOException {
        this(file, str, false, (String) null);
    }

    @Deprecated
    public LockableFileWriter(File file, String str, boolean z, String str2) throws IOException {
        this(file, Charsets.toCharset(str), z, str2);
    }

    @Deprecated
    public LockableFileWriter(String str) throws IOException {
        this(str, false, (String) null);
    }

    @Deprecated
    public LockableFileWriter(String str, boolean z) throws IOException {
        this(str, z, (String) null);
    }

    @Deprecated
    public LockableFileWriter(String str, boolean z, String str2) throws IOException {
        this(new File(str), z, str2);
    }
}