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
    public ByteArrayOutputStream f73550g;

    /* renamed from: h */
    public OutputStream f73551h;

    /* renamed from: i */
    public Path f73552i;

    /* renamed from: j */
    public final String f73553j;

    /* renamed from: k */
    public final String f73554k;

    /* renamed from: l */
    public final Path f73555l;

    /* renamed from: m */
    public boolean f73556m;

    /* renamed from: org.apache.commons.io.output.DeferredFileOutputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<DeferredFileOutputStream, Builder> {

        /* renamed from: k */
        public int f73557k;

        /* renamed from: l */
        public Path f73558l;

        /* renamed from: m */
        public String f73559m;

        /* renamed from: n */
        public String f73560n;

        /* renamed from: o */
        public Path f73561o;

        public Builder() {
            setBufferSizeDefault(1024);
            setBufferSize(1024);
        }

        public Builder setDirectory(File file) {
            this.f73561o = DeferredFileOutputStream.m24939k(file, null);
            return this;
        }

        public Builder setOutputFile(File file) {
            this.f73558l = DeferredFileOutputStream.m24939k(file, null);
            return this;
        }

        public Builder setPrefix(String str) {
            this.f73559m = str;
            return this;
        }

        public Builder setSuffix(String str) {
            this.f73560n = str;
            return this;
        }

        public Builder setThreshold(int i) {
            this.f73557k = i;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public DeferredFileOutputStream get() {
            return new DeferredFileOutputStream(this.f73557k, this.f73558l, this.f73559m, this.f73560n, this.f73561o, getBufferSize());
        }

        public Builder setDirectory(Path path) {
            this.f73561o = DeferredFileOutputStream.m24938l(path, null);
            return this;
        }

        public Builder setOutputFile(Path path) {
            this.f73558l = DeferredFileOutputStream.m24938l(path, null);
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: j */
    public static int m24940j(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("Initial buffer size must be at least 0.");
    }

    /* renamed from: k */
    public static Path m24939k(File file, Supplier supplier) {
        Object obj;
        Path path;
        if (file != null) {
            path = file.toPath();
            return path;
        } else if (supplier != null) {
            obj = supplier.get();
            return AbstractC21393oI0.m25938a(obj);
        } else {
            return null;
        }
    }

    /* renamed from: l */
    public static Path m24938l(Path path, Supplier supplier) {
        Object obj;
        if (path == null) {
            if (supplier != null) {
                obj = supplier.get();
                return AbstractC21393oI0.m25938a(obj);
            }
            return null;
        }
        return path;
    }

    @Override // org.apache.commons.p028io.output.ThresholdingOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f73556m = true;
    }

    public byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.f73550g;
        if (byteArrayOutputStream != null) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public File getFile() {
        File file;
        Path path = this.f73552i;
        if (path != null) {
            file = path.toFile();
            return file;
        }
        return null;
    }

    public Path getPath() {
        return this.f73552i;
    }

    @Override // org.apache.commons.p028io.output.ThresholdingOutputStream
    public OutputStream getStream() throws IOException {
        return this.f73551h;
    }

    public boolean isInMemory() {
        return !isThresholdExceeded();
    }

    @Override // org.apache.commons.p028io.output.ThresholdingOutputStream
    public void thresholdReached() throws IOException {
        OutputStream newOutputStream;
        Path createTempFile;
        String str = this.f73553j;
        if (str != null) {
            createTempFile = Files.createTempFile(this.f73555l, str, this.f73554k, new FileAttribute[0]);
            this.f73552i = createTempFile;
        }
        PathUtils.createParentDirectories(this.f73552i, null, PathUtils.EMPTY_FILE_ATTRIBUTE_ARRAY);
        newOutputStream = Files.newOutputStream(this.f73552i, new OpenOption[0]);
        try {
            this.f73550g.writeTo(newOutputStream);
            this.f73551h = newOutputStream;
            this.f73550g = null;
        } catch (IOException e) {
            newOutputStream.close();
            throw e;
        }
    }

    public InputStream toInputStream() throws IOException {
        InputStream newInputStream;
        if (this.f73556m) {
            if (!isInMemory()) {
                newInputStream = Files.newInputStream(this.f73552i, new OpenOption[0]);
                return newInputStream;
            }
            return this.f73550g.toInputStream();
        }
        throw new IOException("Stream not closed");
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (this.f73556m) {
            if (!isInMemory()) {
                Files.copy(this.f73552i, outputStream);
                return;
            } else {
                this.f73550g.writeTo(outputStream);
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
        this.f73552i = m24939k(file, null);
        this.f73553j = str;
        this.f73554k = str2;
        this.f73555l = m24939k(file2, new Supplier() { // from class: AF
            @Override // java.util.function.Supplier
            public final Object get() {
                return PathUtils.getTempDirectory();
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(m24940j(i2));
        this.f73550g = byteArrayOutputStream;
        this.f73551h = byteArrayOutputStream;
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
        this.f73552i = m24938l(path, null);
        this.f73553j = str;
        this.f73554k = str2;
        this.f73555l = m24938l(path2, new Supplier() { // from class: AF
            @Override // java.util.function.Supplier
            public final Object get() {
                return PathUtils.getTempDirectory();
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(m24940j(i2));
        this.f73550g = byteArrayOutputStream;
        this.f73551h = byteArrayOutputStream;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public DeferredFileOutputStream(int i, String str, String str2, File file) {
        this(i, (File) null, str, str2, file, 1024);
        Objects.requireNonNull(str, "prefix");
    }
}
