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
    public static final OpenOption[] f73353j = PathUtils.EMPTY_OPEN_OPTION_ARRAY;

    /* renamed from: b */
    public int f73354b = 8192;

    /* renamed from: c */
    public int f73355c = 8192;

    /* renamed from: d */
    public int f73356d = Integer.MAX_VALUE;

    /* renamed from: e */
    public Charset f73357e = Charset.defaultCharset();

    /* renamed from: f */
    public Charset f73358f = Charset.defaultCharset();

    /* renamed from: g */
    public OpenOption[] f73359g = f73353j;

    /* renamed from: h */
    public final IntUnaryOperator f73360h;

    /* renamed from: i */
    public IntUnaryOperator f73361i;

    public AbstractStreamBuilder() {
        IntUnaryOperator intUnaryOperator = new IntUnaryOperator() { // from class: u0
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return AbstractStreamBuilder.m25498a(AbstractStreamBuilder.this, i);
            }
        };
        this.f73360h = intUnaryOperator;
        this.f73361i = intUnaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ int m25498a(AbstractStreamBuilder abstractStreamBuilder, int i) {
        return abstractStreamBuilder.m25496c(i);
    }

    /* renamed from: b */
    public final int m25497b(int i) {
        int applyAsInt;
        applyAsInt = this.f73361i.applyAsInt(i);
        return applyAsInt;
    }

    /* renamed from: c */
    public final /* synthetic */ int m25496c(int i) {
        int i2 = this.f73356d;
        if (i > i2) {
            return m25495d(i, i2);
        }
        return i;
    }

    /* renamed from: d */
    public final int m25495d(int i, int i2) {
        throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public int getBufferSize() {
        return this.f73354b;
    }

    public int getBufferSizeDefault() {
        return this.f73355c;
    }

    public CharSequence getCharSequence() throws IOException {
        return checkOrigin().getCharSequence(getCharset());
    }

    public Charset getCharset() {
        return this.f73357e;
    }

    public Charset getCharsetDefault() {
        return this.f73358f;
    }

    public File getFile() {
        return checkOrigin().getFile();
    }

    public InputStream getInputStream() throws IOException {
        return checkOrigin().getInputStream(getOpenOptions());
    }

    public OpenOption[] getOpenOptions() {
        return this.f73359g;
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
            i = this.f73355c;
        }
        this.f73354b = m25497b(i);
        return (B) asThis();
    }

    public B setBufferSizeChecker(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            intUnaryOperator = this.f73360h;
        }
        this.f73361i = intUnaryOperator;
        return (B) asThis();
    }

    public B setBufferSizeDefault(int i) {
        this.f73355c = i;
        return (B) asThis();
    }

    public B setBufferSizeMax(int i) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.f73356d = i;
        return (B) asThis();
    }

    public B setCharset(Charset charset) {
        this.f73357e = Charsets.toCharset(charset, this.f73358f);
        return (B) asThis();
    }

    public B setCharsetDefault(Charset charset) {
        this.f73358f = charset;
        return (B) asThis();
    }

    public B setOpenOptions(OpenOption... openOptionArr) {
        if (openOptionArr == null) {
            openOptionArr = f73353j;
        }
        this.f73359g = openOptionArr;
        return (B) asThis();
    }

    public B setBufferSize(Integer num) {
        setBufferSize(num != null ? num.intValue() : this.f73355c);
        return (B) asThis();
    }

    public B setCharset(String str) {
        return setCharset(Charsets.toCharset(str, this.f73358f));
    }
}