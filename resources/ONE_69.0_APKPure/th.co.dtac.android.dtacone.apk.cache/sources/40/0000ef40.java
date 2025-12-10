package org.apache.commons.p028io.build;

import com.zxy.tiny.common.UriUtil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.p028io.IORandomAccessFile;
import org.apache.commons.p028io.IOUtils;
import org.apache.commons.p028io.RandomAccessFileMode;
import org.apache.commons.p028io.RandomAccessFiles;
import org.apache.commons.p028io.build.AbstractOrigin;
import org.apache.commons.p028io.file.spi.FileSystemProviders;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.input.BufferedFileChannelInputStream;
import org.apache.commons.p028io.input.CharSequenceInputStream;
import org.apache.commons.p028io.input.CharSequenceReader;
import org.apache.commons.p028io.input.ReaderInputStream;
import org.apache.commons.p028io.output.RandomAccessFileOutputStream;
import org.apache.commons.p028io.output.WriterOutputStream;

/* renamed from: org.apache.commons.io.build.AbstractOrigin */
/* loaded from: classes6.dex */
public abstract class AbstractOrigin<T, B extends AbstractOrigin<T, B>> extends AbstractSupplier<T, B> {

    /* renamed from: a */
    public final Object f73351a;

    /* renamed from: org.apache.commons.io.build.AbstractOrigin$ByteArrayOrigin */
    /* loaded from: classes6.dex */
    public static class ByteArrayOrigin extends AbstractOrigin<byte[], ByteArrayOrigin> {
        public ByteArrayOrigin(byte[] bArr) {
            super(bArr);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public byte[] getByteArray() {
            return get();
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public InputStream getInputStream(OpenOption... openOptionArr) throws IOException {
            return new ByteArrayInputStream((byte[]) this.f73351a);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public Reader getReader(Charset charset) throws IOException {
            return new InputStreamReader(getInputStream(new OpenOption[0]), charset);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public long size() throws IOException {
            return ((byte[]) this.f73351a).length;
        }
    }

    /* renamed from: org.apache.commons.io.build.AbstractOrigin$CharSequenceOrigin */
    /* loaded from: classes6.dex */
    public static class CharSequenceOrigin extends AbstractOrigin<CharSequence, CharSequenceOrigin> {
        public CharSequenceOrigin(CharSequence charSequence) {
            super(charSequence);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public byte[] getByteArray() {
            return ((CharSequence) this.f73351a).toString().getBytes(Charset.defaultCharset());
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public CharSequence getCharSequence(Charset charset) {
            return get();
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public InputStream getInputStream(OpenOption... openOptionArr) throws IOException {
            return ((CharSequenceInputStream.Builder) CharSequenceInputStream.builder().setCharSequence(getCharSequence(Charset.defaultCharset()))).get();
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public Reader getReader(Charset charset) throws IOException {
            return new CharSequenceReader(get());
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public long size() throws IOException {
            return ((CharSequence) this.f73351a).length();
        }
    }

    /* renamed from: org.apache.commons.io.build.AbstractOrigin$FileOrigin */
    /* loaded from: classes6.dex */
    public static class FileOrigin extends AbstractOrigin<File, FileOrigin> {
        public FileOrigin(File file) {
            super(file);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public byte[] getByteArray(long j, int i) throws IOException {
            RandomAccessFile create = RandomAccessFileMode.READ_ONLY.create((File) this.f73351a);
            try {
                byte[] read = RandomAccessFiles.read(create, j, i);
                if (create != null) {
                    create.close();
                }
                return read;
            } catch (Throwable th2) {
                if (create != null) {
                    try {
                        create.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public File getFile() {
            return get();
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public Path getPath() {
            Path path;
            path = get().toPath();
            return path;
        }
    }

    /* renamed from: org.apache.commons.io.build.AbstractOrigin$IORandomAccessFileOrigin */
    /* loaded from: classes6.dex */
    public static class IORandomAccessFileOrigin extends AbstractRandomAccessFileOrigin<IORandomAccessFile, IORandomAccessFileOrigin> {
        public IORandomAccessFileOrigin(IORandomAccessFile iORandomAccessFile) {
            super(iORandomAccessFile);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public File getFile() {
            return ((IORandomAccessFile) get()).getFile();
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public Path getPath() {
            Path path;
            path = getFile().toPath();
            return path;
        }
    }

    /* renamed from: org.apache.commons.io.build.AbstractOrigin$InputStreamOrigin */
    /* loaded from: classes6.dex */
    public static class InputStreamOrigin extends AbstractOrigin<InputStream, InputStreamOrigin> {
        public InputStreamOrigin(InputStream inputStream) {
            super(inputStream);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public byte[] getByteArray() throws IOException {
            return IOUtils.toByteArray((InputStream) this.f73351a);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public InputStream getInputStream(OpenOption... openOptionArr) {
            return get();
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public Reader getReader(Charset charset) throws IOException {
            return new InputStreamReader(getInputStream(new OpenOption[0]), charset);
        }
    }

    /* renamed from: org.apache.commons.io.build.AbstractOrigin$OutputStreamOrigin */
    /* loaded from: classes6.dex */
    public static class OutputStreamOrigin extends AbstractOrigin<OutputStream, OutputStreamOrigin> {
        public OutputStreamOrigin(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public OutputStream getOutputStream(OpenOption... openOptionArr) {
            return get();
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public Writer getWriter(Charset charset, OpenOption... openOptionArr) throws IOException {
            return new OutputStreamWriter((OutputStream) this.f73351a, charset);
        }
    }

    /* renamed from: org.apache.commons.io.build.AbstractOrigin$PathOrigin */
    /* loaded from: classes6.dex */
    public static class PathOrigin extends AbstractOrigin<Path, PathOrigin> {
        public PathOrigin(Path path) {
            super(path);
        }

        /* renamed from: b */
        public static /* synthetic */ byte[] m25500b(long j, int i, RandomAccessFile randomAccessFile) {
            return RandomAccessFiles.read(randomAccessFile, j, i);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public byte[] getByteArray(final long j, final int i) throws IOException {
            return (byte[]) RandomAccessFileMode.READ_ONLY.apply(AbstractC22491uI0.m1223a(this.f73351a), new IOFunction() { // from class: m0
                @Override // org.apache.commons.p028io.function.IOFunction
                public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                    return AbstractC20283ha0.m31217a(this, consumer);
                }

                @Override // org.apache.commons.p028io.function.IOFunction
                public final Object apply(Object obj) {
                    return AbstractOrigin.PathOrigin.m25500b(j, i, (RandomAccessFile) obj);
                }

                @Override // org.apache.commons.p028io.function.IOFunction
                public /* synthetic */ Function asFunction() {
                    return AbstractC20283ha0.m31213e(this);
                }

                @Override // org.apache.commons.p028io.function.IOFunction
                public /* synthetic */ IOFunction compose(Function function) {
                    return AbstractC20283ha0.m31212f(this, function);
                }

                @Override // org.apache.commons.p028io.function.IOFunction
                public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                    return AbstractC20283ha0.m31216b(this, iOConsumer);
                }

                @Override // org.apache.commons.p028io.function.IOFunction
                public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
                    return AbstractC20283ha0.m31211g(this, iOFunction);
                }

                @Override // org.apache.commons.p028io.function.IOFunction
                public /* synthetic */ IOFunction andThen(Function function) {
                    return AbstractC20283ha0.m31215c(this, function);
                }

                @Override // org.apache.commons.p028io.function.IOFunction
                public /* synthetic */ IOSupplier compose(Supplier supplier) {
                    return AbstractC20283ha0.m31210h(this, supplier);
                }

                @Override // org.apache.commons.p028io.function.IOFunction
                public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
                    return AbstractC20283ha0.m31214d(this, iOFunction);
                }

                @Override // org.apache.commons.p028io.function.IOFunction
                public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                    return AbstractC20283ha0.m31209i(this, iOSupplier);
                }
            });
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public File getFile() {
            File file;
            file = AbstractC22491uI0.m1223a(get()).toFile();
            return file;
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public Path getPath() {
            return AbstractC22491uI0.m1223a(get());
        }
    }

    /* renamed from: org.apache.commons.io.build.AbstractOrigin$RandomAccessFileOrigin */
    /* loaded from: classes6.dex */
    public static class RandomAccessFileOrigin extends AbstractRandomAccessFileOrigin<RandomAccessFile, RandomAccessFileOrigin> {
        public RandomAccessFileOrigin(RandomAccessFile randomAccessFile) {
            super(randomAccessFile);
        }
    }

    /* renamed from: org.apache.commons.io.build.AbstractOrigin$ReaderOrigin */
    /* loaded from: classes6.dex */
    public static class ReaderOrigin extends AbstractOrigin<Reader, ReaderOrigin> {
        public ReaderOrigin(Reader reader) {
            super(reader);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public byte[] getByteArray() throws IOException {
            return IOUtils.toByteArray((Reader) this.f73351a, Charset.defaultCharset());
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public CharSequence getCharSequence(Charset charset) throws IOException {
            return IOUtils.toString((Reader) this.f73351a);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public InputStream getInputStream(OpenOption... openOptionArr) throws IOException {
            return ((ReaderInputStream.Builder) ReaderInputStream.builder().setReader((Reader) this.f73351a)).setCharset(Charset.defaultCharset()).get();
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public Reader getReader(Charset charset) throws IOException {
            return get();
        }
    }

    /* renamed from: org.apache.commons.io.build.AbstractOrigin$URIOrigin */
    /* loaded from: classes6.dex */
    public static class URIOrigin extends AbstractOrigin<URI, URIOrigin> {
        public URIOrigin(URI uri) {
            super(uri);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public File getFile() {
            File file;
            file = getPath().toFile();
            return file;
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public InputStream getInputStream(OpenOption... openOptionArr) throws IOException {
            InputStream newInputStream;
            Path path;
            InputStream newInputStream2;
            URI uri = get();
            String scheme = uri.getScheme();
            FileSystemProvider fileSystemProvider = FileSystemProviders.installed().getFileSystemProvider(scheme);
            if (fileSystemProvider != null) {
                path = fileSystemProvider.getPath(uri);
                newInputStream2 = Files.newInputStream(path, openOptionArr);
                return newInputStream2;
            } else if (!"http".equalsIgnoreCase(scheme) && !UriUtil.HTTPS_SCHEME.equalsIgnoreCase(scheme)) {
                newInputStream = Files.newInputStream(getPath(), openOptionArr);
                return newInputStream;
            } else {
                return uri.toURL().openStream();
            }
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public Path getPath() {
            Path path;
            path = Paths.get(get());
            return path;
        }
    }

    /* renamed from: org.apache.commons.io.build.AbstractOrigin$WriterOrigin */
    /* loaded from: classes6.dex */
    public static class WriterOrigin extends AbstractOrigin<Writer, WriterOrigin> {
        public WriterOrigin(Writer writer) {
            super(writer);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public OutputStream getOutputStream(OpenOption... openOptionArr) throws IOException {
            return ((WriterOutputStream.Builder) WriterOutputStream.builder().setWriter((Writer) this.f73351a)).setCharset(Charset.defaultCharset()).get();
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public Writer getWriter(Charset charset, OpenOption... openOptionArr) throws IOException {
            return get();
        }
    }

    public AbstractOrigin(T t) {
        Objects.requireNonNull(t, "origin");
        this.f73351a = t;
    }

    /* renamed from: a */
    public final String m25501a() {
        return getClass().getSimpleName();
    }

    @Override // org.apache.commons.p028io.function.IOSupplier
    public T get() {
        return (T) this.f73351a;
    }

    public byte[] getByteArray() throws IOException {
        byte[] readAllBytes;
        readAllBytes = Files.readAllBytes(getPath());
        return readAllBytes;
    }

    public CharSequence getCharSequence(Charset charset) throws IOException {
        return new String(getByteArray(), charset);
    }

    public File getFile() {
        throw new UnsupportedOperationException(String.format("%s#getFile() for %s origin %s", m25501a(), this.f73351a.getClass().getSimpleName(), this.f73351a));
    }

    public InputStream getInputStream(OpenOption... openOptionArr) throws IOException {
        InputStream newInputStream;
        newInputStream = Files.newInputStream(getPath(), openOptionArr);
        return newInputStream;
    }

    public OutputStream getOutputStream(OpenOption... openOptionArr) throws IOException {
        OutputStream newOutputStream;
        newOutputStream = Files.newOutputStream(getPath(), openOptionArr);
        return newOutputStream;
    }

    public Path getPath() {
        throw new UnsupportedOperationException(String.format("%s#getPath() for %s origin %s", m25501a(), this.f73351a.getClass().getSimpleName(), this.f73351a));
    }

    public RandomAccessFile getRandomAccessFile(OpenOption... openOptionArr) throws FileNotFoundException {
        return RandomAccessFileMode.valueOf(openOptionArr).create(getFile());
    }

    public Reader getReader(Charset charset) throws IOException {
        BufferedReader newBufferedReader;
        newBufferedReader = Files.newBufferedReader(getPath(), charset);
        return newBufferedReader;
    }

    public Writer getWriter(Charset charset, OpenOption... openOptionArr) throws IOException {
        BufferedWriter newBufferedWriter;
        newBufferedWriter = Files.newBufferedWriter(getPath(), charset, openOptionArr);
        return newBufferedWriter;
    }

    public long size() throws IOException {
        long size;
        size = Files.size(getPath());
        return size;
    }

    public String toString() {
        return m25501a() + "[" + this.f73351a.toString() + "]";
    }

    public byte[] getByteArray(long j, int i) throws IOException {
        int i2;
        byte[] byteArray = getByteArray();
        int m26876a = AbstractC12165l0.m26876a(j);
        if (m26876a >= 0 && i >= 0 && (i2 = m26876a + i) >= 0 && i2 <= byteArray.length) {
            return Arrays.copyOfRange(byteArray, m26876a, i2);
        }
        throw new IllegalArgumentException("Couldn't read array (start: " + m26876a + ", length: " + i + ", data length: " + byteArray.length + ").");
    }

    /* renamed from: org.apache.commons.io.build.AbstractOrigin$AbstractRandomAccessFileOrigin */
    /* loaded from: classes6.dex */
    public static abstract class AbstractRandomAccessFileOrigin<T extends RandomAccessFile, B extends AbstractRandomAccessFileOrigin<T, B>> extends AbstractOrigin<T, B> {
        public AbstractRandomAccessFileOrigin(T t) {
            super(t);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public byte[] getByteArray() throws IOException {
            long length = ((RandomAccessFile) this.f73351a).length();
            if (length <= 2147483647L) {
                return RandomAccessFiles.read((RandomAccessFile) this.f73351a, 0L, (int) length);
            }
            throw new IllegalStateException("Origin too large.");
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public CharSequence getCharSequence(Charset charset) throws IOException {
            return new String(getByteArray(), charset);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public InputStream getInputStream(OpenOption... openOptionArr) throws IOException {
            return BufferedFileChannelInputStream.builder().setFileChannel(((RandomAccessFile) this.f73351a).getChannel()).get();
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public OutputStream getOutputStream(OpenOption... openOptionArr) throws IOException {
            return ((RandomAccessFileOutputStream.Builder) RandomAccessFileOutputStream.builder().setRandomAccessFile((RandomAccessFile) this.f73351a)).get();
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public T getRandomAccessFile(OpenOption... openOptionArr) {
            return (T) get();
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public Reader getReader(Charset charset) throws IOException {
            return new InputStreamReader(getInputStream(new OpenOption[0]), charset);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public Writer getWriter(Charset charset, OpenOption... openOptionArr) throws IOException {
            return new OutputStreamWriter(getOutputStream(openOptionArr), charset);
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public long size() throws IOException {
            return ((RandomAccessFile) this.f73351a).length();
        }

        @Override // org.apache.commons.p028io.build.AbstractOrigin
        public byte[] getByteArray(long j, int i) throws IOException {
            return RandomAccessFiles.read((RandomAccessFile) this.f73351a, j, i);
        }
    }
}