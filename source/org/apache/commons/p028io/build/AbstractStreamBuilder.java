package org.apache.commons.p028io.build;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.function.IntUnaryOperator;
import org.apache.commons.p028io.Charsets;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.file.PathUtils;

/* renamed from: org.apache.commons.io.build.AbstractStreamBuilder */
/* loaded from: classes6.dex */
public abstract class AbstractStreamBuilder<T, B extends AbstractStreamBuilder<T, B>> extends AbstractOriginSupplier<T, B> {

    /* renamed from: j */
    public static final OpenOption[] f73269j = PathUtils.EMPTY_OPEN_OPTION_ARRAY;

    /* renamed from: b */
    public int f73270b = 8192;

    /* renamed from: c */
    public int f73271c = 8192;

    /* renamed from: d */
    public int f73272d = Integer.MAX_VALUE;

    /* renamed from: e */
    public Charset f73273e = Charset.defaultCharset();

    /* renamed from: f */
    public Charset f73274f = Charset.defaultCharset();

    /* renamed from: g */
    public OpenOption[] f73275g = f73269j;

    /* renamed from: h */
    public final IntUnaryOperator f73276h;

    /* renamed from: i */
    public IntUnaryOperator f73277i;

    public AbstractStreamBuilder() {
        IntUnaryOperator intUnaryOperator = new IntUnaryOperator() { // from class: u0
            {
                AbstractStreamBuilder.this = this;
            }

            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return AbstractStreamBuilder.m25308a(AbstractStreamBuilder.this, i);
            }
        };
        this.f73276h = intUnaryOperator;
        this.f73277i = intUnaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ int m25308a(AbstractStreamBuilder abstractStreamBuilder, int i) {
        return abstractStreamBuilder.m25306c(i);
    }

    /* renamed from: b */
    public final int m25307b(int i) {
        int applyAsInt;
        applyAsInt = this.f73277i.applyAsInt(i);
        return applyAsInt;
    }

    /* renamed from: c */
    public final /* synthetic */ int m25306c(int i) {
        int i2 = this.f73272d;
        if (i > i2) {
            return m25305d(i, i2);
        }
        return i;
    }

    /* renamed from: d */
    public final int m25305d(int i, int i2) {
        throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public int getBufferSize() {
        return this.f73270b;
    }

    public int getBufferSizeDefault() {
        return this.f73271c;
    }

    public CharSequence getCharSequence() throws IOException {
        return checkOrigin().getCharSequence(getCharset());
    }

    public Charset getCharset() {
        return this.f73273e;
    }

    public Charset getCharsetDefault() {
        return this.f73274f;
    }

    public File getFile() {
        return checkOrigin().getFile();
    }

    public InputStream getInputStream() throws IOException {
        return checkOrigin().getInputStream(getOpenOptions());
    }

    public OpenOption[] getOpenOptions() {
        return this.f73275g;
    }

    public OutputStream getOutputStream() throws IOException {
        return checkOrigin().getOutputStream(getOpenOptions());
    }

    public Path getPath() {
        return checkOrigin().getPath();
    }

    public RandomAccessFile getRandomAccessFile() throws IOException {
        return checkOrigin().getRandomAccessFile(getOpenOptions());
    }

    public Reader getReader() throws IOException {
        return checkOrigin().getReader(getCharset());
    }

    public Writer getWriter() throws IOException {
        return checkOrigin().getWriter(getCharset(), getOpenOptions());
    }

    public B setBufferSize(int i) {
        if (i <= 0) {
            i = this.f73271c;
        }
        this.f73270b = m25307b(i);
        return (B) asThis();
    }

    public B setBufferSizeChecker(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            intUnaryOperator = this.f73276h;
        }
        this.f73277i = intUnaryOperator;
        return (B) asThis();
    }

    public B setBufferSizeDefault(int i) {
        this.f73271c = i;
        return (B) asThis();
    }

    public B setBufferSizeMax(int i) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.f73272d = i;
        return (B) asThis();
    }

    public B setCharset(Charset charset) {
        this.f73273e = Charsets.toCharset(charset, this.f73274f);
        return (B) asThis();
    }

    public B setCharsetDefault(Charset charset) {
        this.f73274f = charset;
        return (B) asThis();
    }

    public B setOpenOptions(OpenOption... openOptionArr) {
        if (openOptionArr == null) {
            openOptionArr = f73269j;
        }
        this.f73275g = openOptionArr;
        return (B) asThis();
    }

    public B setBufferSize(Integer num) {
        setBufferSize(num != null ? num.intValue() : this.f73271c);
        return (B) asThis();
    }

    public B setCharset(String str) {
        return setCharset(Charsets.toCharset(str, this.f73274f));
    }
}
