package org.apache.commons.p028io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import org.apache.commons.p028io.Charsets;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.charset.CharsetDecoders;

/* renamed from: org.apache.commons.io.output.WriterOutputStream */
/* loaded from: classes6.dex */
public class WriterOutputStream extends OutputStream {

    /* renamed from: a */
    public final Writer f73579a;

    /* renamed from: b */
    public final CharsetDecoder f73580b;

    /* renamed from: c */
    public final boolean f73581c;

    /* renamed from: d */
    public final ByteBuffer f73582d;

    /* renamed from: e */
    public final CharBuffer f73583e;

    /* renamed from: org.apache.commons.io.output.WriterOutputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<WriterOutputStream, Builder> {

        /* renamed from: k */
        public CharsetDecoder f73584k = getCharset().newDecoder();

        /* renamed from: l */
        public boolean f73585l;

        public Builder setCharsetDecoder(CharsetDecoder charsetDecoder) {
            if (charsetDecoder == null) {
                charsetDecoder = getCharsetDefault().newDecoder();
            }
            this.f73584k = charsetDecoder;
            super.setCharset(charsetDecoder.charset());
            return this;
        }

        public Builder setWriteImmediately(boolean z) {
            this.f73585l = z;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public WriterOutputStream get() throws IOException {
            return new WriterOutputStream(getWriter(), this.f73584k, getBufferSize(), this.f73585l);
        }

        @Override // org.apache.commons.p028io.build.AbstractStreamBuilder
        public Builder setCharset(Charset charset) {
            super.setCharset(charset);
            this.f73584k = getCharset().newDecoder();
            return this;
        }

        @Override // org.apache.commons.p028io.build.AbstractStreamBuilder
        public Builder setCharset(String str) {
            super.setCharset(str);
            this.f73584k = getCharset().newDecoder();
            return this;
        }
    }

    @Deprecated
    public WriterOutputStream(Writer writer) {
        this(writer, Charset.defaultCharset(), 8192, false);
    }

    /* renamed from: b */
    public static void m24878b(Charset charset) {
        boolean z;
        if (!StandardCharsets.UTF_16.name().equals(charset.name())) {
            return;
        }
        byte[] bytes = "vés".getBytes(charset);
        CharsetDecoder newDecoder = charset.newDecoder();
        ByteBuffer allocate = ByteBuffer.allocate(16);
        CharBuffer allocate2 = CharBuffer.allocate(3);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            allocate.put(bytes[i]);
            allocate.flip();
            if (i == length - 1) {
                z = true;
            } else {
                z = false;
            }
            try {
                newDecoder.decode(allocate, allocate2, z);
                allocate.compact();
            } catch (IllegalArgumentException unused) {
                throw new UnsupportedOperationException("UTF-16 requested when running on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
            }
        }
        allocate2.rewind();
        if ("vés".equals(allocate2.toString())) {
            return;
        }
        throw new UnsupportedOperationException("UTF-16 requested when running on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m24876g(true);
        m24877d();
        this.f73579a.close();
    }

    /* renamed from: d */
    public final void m24877d() {
        if (this.f73583e.position() > 0) {
            this.f73579a.write(this.f73583e.array(), 0, this.f73583e.position());
            this.f73583e.rewind();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m24877d();
        this.f73579a.flush();
    }

    /* renamed from: g */
    public final void m24876g(boolean z) {
        CoderResult decode;
        this.f73582d.flip();
        while (true) {
            decode = this.f73580b.decode(this.f73582d, this.f73583e, z);
            if (!decode.isOverflow()) {
                break;
            }
            m24877d();
        }
        if (decode.isUnderflow()) {
            this.f73582d.compact();
            return;
        }
        throw new IOException("Unexpected coder result");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public WriterOutputStream(Writer writer, Charset charset) {
        this(writer, charset, 8192, false);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int min = Math.min(i2, this.f73582d.remaining());
            this.f73582d.put(bArr, i, min);
            m24876g(false);
            i2 -= min;
            i += min;
        }
        if (this.f73581c) {
            m24877d();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WriterOutputStream(java.io.Writer r2, java.nio.charset.Charset r3, int r4, boolean r5) {
        /*
            r1 = this;
            java.nio.charset.Charset r3 = org.apache.commons.p028io.Charsets.toCharset(r3)
            java.nio.charset.CharsetDecoder r3 = r3.newDecoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetDecoder r3 = r3.onMalformedInput(r0)
            java.nio.charset.CharsetDecoder r3 = r3.onUnmappableCharacter(r0)
            java.lang.String r0 = "?"
            java.nio.charset.CharsetDecoder r3 = r3.replaceWith(r0)
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.output.WriterOutputStream.<init>(java.io.Writer, java.nio.charset.Charset, int, boolean):void");
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Deprecated
    public WriterOutputStream(Writer writer, CharsetDecoder charsetDecoder) {
        this(writer, charsetDecoder, 8192, false);
    }

    @Deprecated
    public WriterOutputStream(Writer writer, CharsetDecoder charsetDecoder, int i, boolean z) {
        this.f73582d = ByteBuffer.allocate(128);
        m24878b(CharsetDecoders.toCharsetDecoder(charsetDecoder).charset());
        this.f73579a = writer;
        this.f73580b = CharsetDecoders.toCharsetDecoder(charsetDecoder);
        this.f73581c = z;
        this.f73583e = CharBuffer.allocate(i);
    }

    @Deprecated
    public WriterOutputStream(Writer writer, String str) {
        this(writer, str, 8192, false);
    }

    @Deprecated
    public WriterOutputStream(Writer writer, String str, int i, boolean z) {
        this(writer, Charsets.toCharset(str), i, z);
    }
}
