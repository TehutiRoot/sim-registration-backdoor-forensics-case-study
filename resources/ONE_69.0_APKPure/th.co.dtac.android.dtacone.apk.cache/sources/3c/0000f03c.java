package org.apache.commons.p028io.output;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.file.PathUtils;

/* renamed from: org.apache.commons.io.output.DeferredFileOutputStream */
/* loaded from: classes6.dex */
public class DeferredFileOutputStream extends ThresholdingOutputStream {

    /* renamed from: g */
    public ByteArrayOutputStream f73634g;

    /* renamed from: h */
    public OutputStream f73635h;

    /* renamed from: i */
    public Path f73636i;

    /* renamed from: j */
    public final String f73637j;

    /* renamed from: k */
    public final String f73638k;

    /* renamed from: l */
    public final Path f73639l;

    /* renamed from: m */
    public boolean f73640m;

    /* renamed from: org.apache.commons.io.output.DeferredFileOutputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<DeferredFileOutputStream, Builder> {

        /* renamed from: k */
        public int f73641k;

        /* renamed from: l */
        public Path f73642l;

        /* renamed from: m */
        public String f73643m;

        /* renamed from: n */
        public String f73644n;

        /* renamed from: o */
        public Path f73645o;

        public Builder() {
            setBufferSizeDefault(1024);
            setBufferSize(1024);
        }

        public Builder setDirectory(File file) {
            this.f73645o = DeferredFileOutputStream.m25129k(file, null);
            return this;
        }

        public Builder setOutputFile(File file) {
            this.f73642l = DeferredFileOutputStream.m25129k(file, null);
            return this;
        }

        public Builder setPrefix(String str) {
            this.f73643m = str;
            return this;
        }

        public Builder setSuffix(String str) {
            this.f73644n = str;
            return this;
        }

        public Builder setThreshold(int i) {
            this.f73641k = i;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public DeferredFileOutputStream get() {
            return new DeferredFileOutputStream(this.f73641k, this.f73642l, this.f73643m, this.f73644n, this.f73645o, getBufferSize());
        }

        public Builder setDirectory(Path path) {
            this.f73645o = DeferredFileOutputStream.m25128l(path, null);
            return this;
        }

        public Builder setOutputFile(Path path) {
            this.f73642l = DeferredFileOutputStream.m25128l(path, null);
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: j */
    public static int m25130j(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("Initial buffer size must be at least 0.");
    }

    /* renamed from: k */
    public static Path m25129k(File file, Supplier supplier) {
        Object obj;
        Path path;
        if (file != null) {
            path = file.toPath();
            return path;
        } else if (supplier != null) {
            obj = supplier.get();
            return AbstractC22491uI0.m1223a(obj);
        } else {
            return null;
        }
    }

    /* renamed from: l */
    public static Path m25128l(Path path, Supplier supplier) {
        Object obj;
        if (path == null) {
            if (supplier != null) {
                obj = supplier.get();
                return AbstractC22491uI0.m1223a(obj);
            }
            return null;
        }
        return path;
    }

    @Override // org.apache.commons.p028io.output.ThresholdingOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f73640m = true;
    }

    public byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.f73634g;
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public File getFile() {
        File file;
        Path path = this.f73636i;
        if (path != null) {
            file = path.toFile();
            return file;
        }
        return null;
    }

    public Path getPath() {
        return this.f73636i;
    }

    @Override // org.apache.commons.p028io.output.ThresholdingOutputStream
    public OutputStream getStream() throws IOException {
        return this.f73635h;
    }

    public boolean isInMemory() {
        return !isThresholdExceeded();
    }

    @Override // org.apache.commons.p028io.output.ThresholdingOutputStream
    public void thresholdReached() throws IOException {
        OutputStream newOutputStream;
        Path createTempFile;
        String str = this.f73637j;
        if (str != null) {
            createTempFile = Files.createTempFile(this.f73639l, str, this.f73638k, new FileAttribute[0]);
            this.f73636i = createTempFile;
        }
        PathUtils.createParentDirectories(this.f73636i, null, PathUtils.EMPTY_FILE_ATTRIBUTE_ARRAY);
        newOutputStream = Files.newOutputStream(this.f73636i, new OpenOption[0]);
        try {
            this.f73634g.writeTo(newOutputStream);
            this.f73635h = newOutputStream;
            this.f73634g = null;
        } catch (IOException e) {
            newOutputStream.close();
            throw e;
        }
    }

    public InputStream toInputStream() throws IOException {
        InputStream newInputStream;
        if (this.f73640m) {
            if (!isInMemory()) {
                newInputStream = Files.newInputStream(this.f73636i, new OpenOption[0]);
                return newInputStream;
            }
            return this.f73634g.toInputStream();
        }
        throw new IOException("Stream not closed");
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (this.f73640m) {
            if (!isInMemory()) {
                Files.copy(this.f73636i, outputStream);
                return;
            } else {
                this.f73634g.writeTo(outputStream);
                return;
            }
        }
        throw new IOException("Stream not closed");
    }

    @Deprecated
    public DeferredFileOutputStream(int i, File file) {
        this(i, file, (String) null, (String) null, (File) null, 1024);
    }

    public DeferredFileOutputStream(int i, File file, String str, String str2, File file2, int i2) {
        super(i);
        this.f73636i = m25129k(file, null);
        this.f73637j = str;
        this.f73638k = str2;
        this.f73639l = m25129k(file2, new Supplier() { // from class: BF
            @Override // java.util.function.Supplier
            public final Object get() {
                return PathUtils.getTempDirectory();
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(m25130j(i2));
        this.f73634g = byteArrayOutputStream;
        this.f73635h = byteArrayOutputStream;
    }

    @Deprecated
    public DeferredFileOutputStream(int i, int i2, File file) {
        this(i, file, (String) null, (String) null, (File) null, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public DeferredFileOutputStream(int i, int i2, String str, String str2, File file) {
        this(i, (File) null, str, str2, file, i2);
        Objects.requireNonNull(str, "prefix");
    }

    public DeferredFileOutputStream(int i, Path path, String str, String str2, Path path2, int i2) {
        super(i);
        this.f73636i = m25128l(path, null);
        this.f73637j = str;
        this.f73638k = str2;
        this.f73639l = m25128l(path2, new Supplier() { // from class: BF
            @Override // java.util.function.Supplier
            public final Object get() {
                return PathUtils.getTempDirectory();
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(m25130j(i2));
        this.f73634g = byteArrayOutputStream;
        this.f73635h = byteArrayOutputStream;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public DeferredFileOutputStream(int i, String str, String str2, File file) {
        this(i, (File) null, str, str2, file, 1024);
        Objects.requireNonNull(str, "prefix");
    }
}