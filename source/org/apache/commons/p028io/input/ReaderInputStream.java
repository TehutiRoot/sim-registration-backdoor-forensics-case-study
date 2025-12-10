package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.commons.p028io.Charsets;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.charset.CharsetEncoders;
import org.apache.commons.p028io.input.ReaderInputStream;

/* renamed from: org.apache.commons.io.input.ReaderInputStream */
/* loaded from: classes6.dex */
public class ReaderInputStream extends AbstractInputStream {

    /* renamed from: b */
    public final Reader f73427b;

    /* renamed from: c */
    public final CharsetEncoder f73428c;

    /* renamed from: d */
    public final CharBuffer f73429d;

    /* renamed from: e */
    public final ByteBuffer f73430e;

    /* renamed from: f */
    public CoderResult f73431f;

    /* renamed from: g */
    public boolean f73432g;

    /* renamed from: org.apache.commons.io.input.ReaderInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<ReaderInputStream, Builder> {

        /* renamed from: k */
        public CharsetEncoder f73433k = ReaderInputStream.m25071k(getCharset());

        /* renamed from: e */
        public static /* synthetic */ CharsetEncoder m25070e(Builder builder) {
            return builder.m25069f();
        }

        /* renamed from: f */
        public final /* synthetic */ CharsetEncoder m25069f() {
            return ReaderInputStream.m25071k(getCharsetDefault());
        }

        public Builder setCharsetEncoder(CharsetEncoder charsetEncoder) {
            CharsetEncoder charsetEncoder2 = CharsetEncoders.toCharsetEncoder(charsetEncoder, new Supplier() { // from class: hs1
                {
                    ReaderInputStream.Builder.this = this;
                }

                @Override // java.util.function.Supplier
                public final Object get() {
                    return ReaderInputStream.Builder.m25070e(ReaderInputStream.Builder.this);
                }
            });
            this.f73433k = charsetEncoder2;
            super.setCharset(charsetEncoder2.charset());
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public ReaderInputStream get() throws IOException {
            return new ReaderInputStream(getReader(), this.f73433k, getBufferSize());
        }

        @Override // org.apache.commons.p028io.build.AbstractStreamBuilder
        public Builder setCharset(Charset charset) {
            super.setCharset(charset);
            this.f73433k = ReaderInputStream.m25071k(getCharset());
            return this;
        }
    }

    @Deprecated
    public ReaderInputStream(Reader reader) {
        this(reader, Charset.defaultCharset());
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: g */
    public static int m25074g(CharsetEncoder charsetEncoder, int i) {
        float m25072j = m25072j(charsetEncoder);
        if (i >= m25072j) {
            return i;
        }
        throw new IllegalArgumentException(String.format("Buffer size %,d must be at least %s for a CharsetEncoder %s.", Integer.valueOf(i), Float.valueOf(m25072j), charsetEncoder.charset().displayName()));
    }

    /* renamed from: j */
    public static float m25072j(CharsetEncoder charsetEncoder) {
        return charsetEncoder.maxBytesPerChar() * 2.0f;
    }

    /* renamed from: k */
    public static CharsetEncoder m25071k(Charset charset) {
        CharsetEncoder newEncoder = Charsets.toCharset(charset).newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f73430e.hasRemaining()) {
            return this.f73430e.remaining();
        }
        return 0;
    }

    @Override // org.apache.commons.p028io.input.AbstractInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73427b.close();
        super.close();
    }

    /* renamed from: i */
    public final void m25073i() {
        CoderResult coderResult;
        boolean z = this.f73432g;
        if (z) {
            return;
        }
        if (!z && ((coderResult = this.f73431f) == null || coderResult.isUnderflow())) {
            this.f73429d.compact();
            int position = this.f73429d.position();
            int read = this.f73427b.read(this.f73429d.array(), position, this.f73429d.remaining());
            if (read == -1) {
                this.f73432g = true;
            } else {
                this.f73429d.position(position + read);
            }
            this.f73429d.flip();
        }
        this.f73430e.compact();
        this.f73431f = this.f73428c.encode(this.f73429d, this.f73430e, this.f73432g);
        if (this.f73432g) {
            this.f73431f = this.f73428c.flush(this.f73430e);
        }
        if (this.f73431f.isError()) {
            this.f73431f.throwException();
        }
        this.f73430e.flip();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        m25160b();
        while (!this.f73430e.hasRemaining()) {
            m25073i();
            if (this.f73432g && !this.f73430e.hasRemaining()) {
                return -1;
            }
        }
        return this.f73430e.get() & 255;
    }

    @Deprecated
    public ReaderInputStream(Reader reader, Charset charset) {
        this(reader, charset, 8192);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ReaderInputStream(java.io.Reader r2, java.nio.charset.Charset r3, int r4) {
        /*
            r1 = this;
            java.nio.charset.Charset r3 = org.apache.commons.p028io.Charsets.toCharset(r3)
            java.nio.charset.CharsetEncoder r3 = r3.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r3 = r3.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r3 = r3.onUnmappableCharacter(r0)
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.ReaderInputStream.<init>(java.io.Reader, java.nio.charset.Charset, int):void");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Deprecated
    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder) {
        this(reader, charsetEncoder, 8192);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "array");
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException("Array size=" + bArr.length + ", offset=" + i + ", length=" + i2);
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i2 > 0) {
            if (this.f73430e.hasRemaining()) {
                int min = Math.min(this.f73430e.remaining(), i2);
                this.f73430e.get(bArr, i, min);
                i += min;
                i2 -= min;
                i3 += min;
            } else if (this.f73432g) {
                break;
            } else {
                m25073i();
            }
        }
        if (i3 == 0 && this.f73432g) {
            return -1;
        }
        return i3;
    }

    @Deprecated
    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder, int i) {
        this.f73427b = reader;
        CharsetEncoder charsetEncoder2 = CharsetEncoders.toCharsetEncoder(charsetEncoder);
        this.f73428c = charsetEncoder2;
        CharBuffer allocate = CharBuffer.allocate(m25074g(charsetEncoder2, i));
        this.f73429d = allocate;
        allocate.flip();
        ByteBuffer allocate2 = ByteBuffer.allocate(128);
        this.f73430e = allocate2;
        allocate2.flip();
    }

    @Deprecated
    public ReaderInputStream(Reader reader, String str) {
        this(reader, str, 8192);
    }

    @Deprecated
    public ReaderInputStream(Reader reader, String str, int i) {
        this(reader, Charsets.toCharset(str), i);
    }
}
