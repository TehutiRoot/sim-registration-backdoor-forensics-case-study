package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.commons.p028io.Charsets;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.charset.CharsetEncoders;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.Uncheck;
import org.apache.commons.p028io.input.CharSequenceInputStream;

/* renamed from: org.apache.commons.io.input.CharSequenceInputStream */
/* loaded from: classes6.dex */
public class CharSequenceInputStream extends InputStream {

    /* renamed from: a */
    public final ByteBuffer f73356a;

    /* renamed from: b */
    public int f73357b;

    /* renamed from: c */
    public final CharBuffer f73358c;

    /* renamed from: d */
    public int f73359d;

    /* renamed from: e */
    public final CharsetEncoder f73360e;

    /* renamed from: org.apache.commons.io.input.CharSequenceInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<CharSequenceInputStream, Builder> {

        /* renamed from: k */
        public CharsetEncoder f73361k = CharSequenceInputStream.m25125g(getCharset());

        /* renamed from: e */
        public static /* synthetic */ CharSequenceInputStream m25124e(Builder builder) {
            return builder.m25122g();
        }

        /* renamed from: f */
        public static /* synthetic */ CharsetEncoder m25123f(Builder builder) {
            return builder.m25121h();
        }

        /* renamed from: g */
        public final /* synthetic */ CharSequenceInputStream m25122g() {
            return new CharSequenceInputStream(getCharSequence(), getBufferSize(), this.f73361k);
        }

        /* renamed from: h */
        public final /* synthetic */ CharsetEncoder m25121h() {
            return CharSequenceInputStream.m25125g(getCharsetDefault());
        }

        public Builder setCharsetEncoder(CharsetEncoder charsetEncoder) {
            CharsetEncoder charsetEncoder2 = CharsetEncoders.toCharsetEncoder(charsetEncoder, new Supplier() { // from class: Uo
                {
                    CharSequenceInputStream.Builder.this = this;
                }

                @Override // java.util.function.Supplier
                public final Object get() {
                    return CharSequenceInputStream.Builder.m25123f(CharSequenceInputStream.Builder.this);
                }
            });
            this.f73361k = charsetEncoder2;
            super.setCharset(charsetEncoder2.charset());
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public CharSequenceInputStream get() {
            return (CharSequenceInputStream) Uncheck.get(new IOSupplier() { // from class: Vo
                {
                    CharSequenceInputStream.Builder.this = this;
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Supplier asSupplier() {
                    return AbstractC17712Hb0.m68064a(this);
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public final Object get() {
                    return CharSequenceInputStream.Builder.m25124e(CharSequenceInputStream.Builder.this);
                }

                @Override // org.apache.commons.p028io.function.IOSupplier
                public /* synthetic */ Object getUnchecked() {
                    return AbstractC17712Hb0.m68063b(this);
                }
            });
        }

        @Override // org.apache.commons.p028io.build.AbstractStreamBuilder
        public Builder setCharset(Charset charset) {
            super.setCharset(charset);
            this.f73361k = CharSequenceInputStream.m25125g(getCharset());
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: g */
    public static CharsetEncoder m25125g(Charset charset) {
        CharsetEncoder newEncoder = Charsets.toCharset(charset).newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f73356a.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ByteBuffer byteBuffer = this.f73356a;
        byteBuffer.position(byteBuffer.limit());
    }

    /* renamed from: d */
    public final void m25126d() {
        this.f73356a.compact();
        CoderResult encode = this.f73360e.encode(this.f73358c, this.f73356a, true);
        if (encode.isError()) {
            encode.throwException();
        }
        this.f73356a.flip();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        this.f73359d = this.f73358c.position();
        this.f73357b = this.f73356a.position();
        this.f73358c.mark();
        this.f73356a.mark();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (!this.f73356a.hasRemaining()) {
            m25126d();
            if (!this.f73356a.hasRemaining() && !this.f73358c.hasRemaining()) {
                return -1;
            }
        }
        return this.f73356a.get() & 255;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            if (this.f73359d != -1) {
                if (this.f73358c.position() != 0) {
                    this.f73360e.reset();
                    this.f73358c.rewind();
                    this.f73356a.rewind();
                    this.f73356a.limit(0);
                    while (this.f73358c.position() < this.f73359d) {
                        this.f73356a.rewind();
                        this.f73356a.limit(0);
                        m25126d();
                    }
                }
                if (this.f73358c.position() == this.f73359d) {
                    this.f73356a.position(this.f73357b);
                    this.f73359d = -1;
                    this.f73357b = -1;
                } else {
                    throw new IllegalStateException("Unexpected CharBuffer position: actual=" + this.f73358c.position() + " expected=" + this.f73359d);
                }
            }
            mark(0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j > 0 && available() > 0) {
            read();
            j--;
            j2++;
        }
        return j2;
    }

    @Deprecated
    public CharSequenceInputStream(CharSequence charSequence, Charset charset) {
        this(charSequence, charset, 8192);
    }

    @Deprecated
    public CharSequenceInputStream(CharSequence charSequence, Charset charset, int i) {
        this(charSequence, i, m25125g(charset));
    }

    public CharSequenceInputStream(CharSequence charSequence, int i, CharsetEncoder charsetEncoder) {
        this.f73360e = charsetEncoder;
        ByteBuffer allocate = ByteBuffer.allocate(ReaderInputStream.m25074g(charsetEncoder, i));
        this.f73356a = allocate;
        allocate.flip();
        this.f73358c = CharBuffer.wrap(charSequence);
        this.f73359d = -1;
        this.f73357b = -1;
        try {
            m25126d();
        } catch (CharacterCodingException unused) {
            this.f73356a.clear();
            this.f73356a.flip();
            this.f73358c.rewind();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "array");
        if (i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + bArr.length + ", offset=" + i + ", length=" + i2);
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f73356a.hasRemaining() || this.f73358c.hasRemaining()) {
            while (i2 > 0) {
                if (this.f73356a.hasRemaining()) {
                    int min = Math.min(this.f73356a.remaining(), i2);
                    this.f73356a.get(bArr, i, min);
                    i += min;
                    i2 -= min;
                    i3 += min;
                } else {
                    m25126d();
                    if (!this.f73356a.hasRemaining() && !this.f73358c.hasRemaining()) {
                        break;
                    }
                }
            }
            if (i3 != 0 || this.f73358c.hasRemaining()) {
                return i3;
            }
            return -1;
        }
        return -1;
    }

    @Deprecated
    public CharSequenceInputStream(CharSequence charSequence, String str) {
        this(charSequence, str, 8192);
    }

    @Deprecated
    public CharSequenceInputStream(CharSequence charSequence, String str, int i) {
        this(charSequence, Charsets.toCharset(str), i);
    }
}
