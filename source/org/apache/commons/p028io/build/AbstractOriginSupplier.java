package org.apache.commons.p028io.build;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.p028io.IORandomAccessFile;
import org.apache.commons.p028io.build.AbstractOrigin;
import org.apache.commons.p028io.build.AbstractOriginSupplier;

/* renamed from: org.apache.commons.io.build.AbstractOriginSupplier */
/* loaded from: classes6.dex */
public abstract class AbstractOriginSupplier<T, B extends AbstractOriginSupplier<T, B>> extends AbstractSupplier<T, B> {

    /* renamed from: a */
    public AbstractOrigin f73268a;

    public static AbstractOrigin.ByteArrayOrigin newByteArrayOrigin(byte[] bArr) {
        return new AbstractOrigin.ByteArrayOrigin(bArr);
    }

    public static AbstractOrigin.CharSequenceOrigin newCharSequenceOrigin(CharSequence charSequence) {
        return new AbstractOrigin.CharSequenceOrigin(charSequence);
    }

    public static AbstractOrigin.FileOrigin newFileOrigin(File file) {
        return new AbstractOrigin.FileOrigin(file);
    }

    public static AbstractOrigin.InputStreamOrigin newInputStreamOrigin(InputStream inputStream) {
        return new AbstractOrigin.InputStreamOrigin(inputStream);
    }

    public static AbstractOrigin.OutputStreamOrigin newOutputStreamOrigin(OutputStream outputStream) {
        return new AbstractOrigin.OutputStreamOrigin(outputStream);
    }

    public static AbstractOrigin.PathOrigin newPathOrigin(Path path) {
        return new AbstractOrigin.PathOrigin(path);
    }

    public static AbstractOrigin.IORandomAccessFileOrigin newRandomAccessFileOrigin(IORandomAccessFile iORandomAccessFile) {
        return new AbstractOrigin.IORandomAccessFileOrigin(iORandomAccessFile);
    }

    public static AbstractOrigin.ReaderOrigin newReaderOrigin(Reader reader) {
        return new AbstractOrigin.ReaderOrigin(reader);
    }

    public static AbstractOrigin.URIOrigin newURIOrigin(URI uri) {
        return new AbstractOrigin.URIOrigin(uri);
    }

    public static AbstractOrigin.WriterOrigin newWriterOrigin(Writer writer) {
        return new AbstractOrigin.WriterOrigin(writer);
    }

    public AbstractOrigin<?, ?> checkOrigin() {
        AbstractOrigin<?, ?> abstractOrigin = this.f73268a;
        if (abstractOrigin != null) {
            return abstractOrigin;
        }
        throw new IllegalStateException("origin == null");
    }

    public AbstractOrigin<?, ?> getOrigin() {
        return this.f73268a;
    }

    public boolean hasOrigin() {
        if (this.f73268a != null) {
            return true;
        }
        return false;
    }

    public B setByteArray(byte[] bArr) {
        return setOrigin(newByteArrayOrigin(bArr));
    }

    public B setCharSequence(CharSequence charSequence) {
        return setOrigin(newCharSequenceOrigin(charSequence));
    }

    public B setFile(File file) {
        return setOrigin(newFileOrigin(file));
    }

    public B setInputStream(InputStream inputStream) {
        return setOrigin(newInputStreamOrigin(inputStream));
    }

    public B setOrigin(AbstractOrigin<?, ?> abstractOrigin) {
        this.f73268a = abstractOrigin;
        return (B) asThis();
    }

    public B setOutputStream(OutputStream outputStream) {
        return setOrigin(newOutputStreamOrigin(outputStream));
    }

    public B setPath(Path path) {
        return setOrigin(newPathOrigin(path));
    }

    public B setRandomAccessFile(IORandomAccessFile iORandomAccessFile) {
        return setOrigin(newRandomAccessFileOrigin(iORandomAccessFile));
    }

    public B setReader(Reader reader) {
        return setOrigin(newReaderOrigin(reader));
    }

    public B setURI(URI uri) {
        return setOrigin(newURIOrigin(uri));
    }

    public B setWriter(Writer writer) {
        return setOrigin(newWriterOrigin(writer));
    }

    public static AbstractOrigin.FileOrigin newFileOrigin(String str) {
        return new AbstractOrigin.FileOrigin(new File(str));
    }

    public static AbstractOrigin.PathOrigin newPathOrigin(String str) {
        Path path;
        path = Paths.get(str, new String[0]);
        return new AbstractOrigin.PathOrigin(path);
    }

    public static AbstractOrigin.RandomAccessFileOrigin newRandomAccessFileOrigin(RandomAccessFile randomAccessFile) {
        return new AbstractOrigin.RandomAccessFileOrigin(randomAccessFile);
    }

    public B setFile(String str) {
        return setOrigin(newFileOrigin(str));
    }

    public B setPath(String str) {
        return setOrigin(newPathOrigin(str));
    }

    public B setRandomAccessFile(RandomAccessFile randomAccessFile) {
        return setOrigin(newRandomAccessFileOrigin(randomAccessFile));
    }
}
