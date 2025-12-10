package org.apache.http.impl.p029io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import org.apache.http.p030io.BufferInfo;
import org.apache.http.p030io.HttpTransportMetrics;
import org.apache.http.p030io.SessionOutputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* renamed from: org.apache.http.impl.io.SessionOutputBufferImpl */
/* loaded from: classes6.dex */
public class SessionOutputBufferImpl implements SessionOutputBuffer, BufferInfo {

    /* renamed from: g */
    public static final byte[] f74598g = {13, 10};

    /* renamed from: a */
    public final HttpTransportMetricsImpl f74599a;

    /* renamed from: b */
    public final ByteArrayBuffer f74600b;

    /* renamed from: c */
    public final int f74601c;

    /* renamed from: d */
    public final CharsetEncoder f74602d;

    /* renamed from: e */
    public OutputStream f74603e;

    /* renamed from: f */
    public ByteBuffer f74604f;

    public SessionOutputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i, int i2, CharsetEncoder charsetEncoder) {
        Args.positive(i, "Buffer size");
        Args.notNull(httpTransportMetricsImpl, "HTTP transport metrcis");
        this.f74599a = httpTransportMetricsImpl;
        this.f74600b = new ByteArrayBuffer(i);
        this.f74601c = i2 < 0 ? 0 : i2;
        this.f74602d = charsetEncoder;
    }

    /* renamed from: a */
    private void m24763a() {
        int length = this.f74600b.length();
        if (length > 0) {
            m24760d(this.f74600b.buffer(), 0, length);
            this.f74600b.clear();
            this.f74599a.incrementBytesTransferred(length);
        }
    }

    /* renamed from: c */
    private void m24761c(CoderResult coderResult) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f74604f.flip();
        while (this.f74604f.hasRemaining()) {
            write(this.f74604f.get());
        }
        this.f74604f.compact();
    }

    /* renamed from: e */
    private void m24759e(CharBuffer charBuffer) {
        if (!charBuffer.hasRemaining()) {
            return;
        }
        if (this.f74604f == null) {
            this.f74604f = ByteBuffer.allocate(1024);
        }
        this.f74602d.reset();
        while (charBuffer.hasRemaining()) {
            m24761c(this.f74602d.encode(charBuffer, this.f74604f, true));
        }
        m24761c(this.f74602d.flush(this.f74604f));
        this.f74604f.clear();
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    /* renamed from: b */
    public final void m24762b() {
        OutputStream outputStream = this.f74603e;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    public void bind(OutputStream outputStream) {
        this.f74603e = outputStream;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int capacity() {
        return this.f74600b.capacity();
    }

    /* renamed from: d */
    public final void m24760d(byte[] bArr, int i, int i2) {
        Asserts.notNull(this.f74603e, "Output stream");
        this.f74603e.write(bArr, i, i2);
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void flush() throws IOException {
        m24763a();
        m24762b();
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.f74599a;
    }

    public boolean isBound() {
        if (this.f74603e != null) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int length() {
        return this.f74600b.length();
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return;
        }
        if (i2 <= this.f74601c && i2 <= this.f74600b.capacity()) {
            if (i2 > this.f74600b.capacity() - this.f74600b.length()) {
                m24763a();
            }
            this.f74600b.append(bArr, i, i2);
            return;
        }
        m24763a();
        m24760d(bArr, i, i2);
        this.f74599a.incrementBytesTransferred(i2);
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void writeLine(String str) throws IOException {
        if (str == null) {
            return;
        }
        if (str.length() > 0) {
            if (this.f74602d == null) {
                for (int i = 0; i < str.length(); i++) {
                    write(str.charAt(i));
                }
            } else {
                m24759e(CharBuffer.wrap(str));
            }
        }
        write(f74598g);
    }

    public SessionOutputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i) {
        this(httpTransportMetricsImpl, i, i, null);
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void write(byte[] bArr) throws IOException {
        if (bArr == null) {
            return;
        }
        write(bArr, 0, bArr.length);
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void writeLine(CharArrayBuffer charArrayBuffer) throws IOException {
        if (charArrayBuffer == null) {
            return;
        }
        int i = 0;
        if (this.f74602d == null) {
            int length = charArrayBuffer.length();
            while (length > 0) {
                int min = Math.min(this.f74600b.capacity() - this.f74600b.length(), length);
                if (min > 0) {
                    this.f74600b.append(charArrayBuffer, i, min);
                }
                if (this.f74600b.isFull()) {
                    m24763a();
                }
                i += min;
                length -= min;
            }
        } else {
            m24759e(CharBuffer.wrap(charArrayBuffer.buffer(), 0, charArrayBuffer.length()));
        }
        write(f74598g);
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void write(int i) throws IOException {
        if (this.f74601c > 0) {
            if (this.f74600b.isFull()) {
                m24763a();
            }
            this.f74600b.append(i);
            return;
        }
        m24763a();
        this.f74603e.write(i);
    }
}