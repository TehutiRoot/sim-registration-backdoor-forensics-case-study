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
    public static final byte[] f74514g = {13, 10};

    /* renamed from: a */
    public final HttpTransportMetricsImpl f74515a;

    /* renamed from: b */
    public final ByteArrayBuffer f74516b;

    /* renamed from: c */
    public final int f74517c;

    /* renamed from: d */
    public final CharsetEncoder f74518d;

    /* renamed from: e */
    public OutputStream f74519e;

    /* renamed from: f */
    public ByteBuffer f74520f;

    public SessionOutputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i, int i2, CharsetEncoder charsetEncoder) {
        Args.positive(i, "Buffer size");
        Args.notNull(httpTransportMetricsImpl, "HTTP transport metrcis");
        this.f74515a = httpTransportMetricsImpl;
        this.f74516b = new ByteArrayBuffer(i);
        this.f74517c = i2 < 0 ? 0 : i2;
        this.f74518d = charsetEncoder;
    }

    /* renamed from: a */
    private void m24573a() {
        int length = this.f74516b.length();
        if (length > 0) {
            m24570d(this.f74516b.buffer(), 0, length);
            this.f74516b.clear();
            this.f74515a.incrementBytesTransferred(length);
        }
    }

    /* renamed from: c */
    private void m24571c(CoderResult coderResult) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f74520f.flip();
        while (this.f74520f.hasRemaining()) {
            write(this.f74520f.get());
        }
        this.f74520f.compact();
    }

    /* renamed from: e */
    private void m24569e(CharBuffer charBuffer) {
        if (!charBuffer.hasRemaining()) {
            return;
        }
        if (this.f74520f == null) {
            this.f74520f = ByteBuffer.allocate(1024);
        }
        this.f74518d.reset();
        while (charBuffer.hasRemaining()) {
            m24571c(this.f74518d.encode(charBuffer, this.f74520f, true));
        }
        m24571c(this.f74518d.flush(this.f74520f));
        this.f74520f.clear();
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    /* renamed from: b */
    public final void m24572b() {
        OutputStream outputStream = this.f74519e;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    public void bind(OutputStream outputStream) {
        this.f74519e = outputStream;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int capacity() {
        return this.f74516b.capacity();
    }

    /* renamed from: d */
    public final void m24570d(byte[] bArr, int i, int i2) {
        Asserts.notNull(this.f74519e, "Output stream");
        this.f74519e.write(bArr, i, i2);
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void flush() throws IOException {
        m24573a();
        m24572b();
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.f74515a;
    }

    public boolean isBound() {
        if (this.f74519e != null) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int length() {
        return this.f74516b.length();
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return;
        }
        if (i2 <= this.f74517c && i2 <= this.f74516b.capacity()) {
            if (i2 > this.f74516b.capacity() - this.f74516b.length()) {
                m24573a();
            }
            this.f74516b.append(bArr, i, i2);
            return;
        }
        m24573a();
        m24570d(bArr, i, i2);
        this.f74515a.incrementBytesTransferred(i2);
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void writeLine(String str) throws IOException {
        if (str == null) {
            return;
        }
        if (str.length() > 0) {
            if (this.f74518d == null) {
                for (int i = 0; i < str.length(); i++) {
                    write(str.charAt(i));
                }
            } else {
                m24569e(CharBuffer.wrap(str));
            }
        }
        write(f74514g);
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
        if (this.f74518d == null) {
            int length = charArrayBuffer.length();
            while (length > 0) {
                int min = Math.min(this.f74516b.capacity() - this.f74516b.length(), length);
                if (min > 0) {
                    this.f74516b.append(charArrayBuffer, i, min);
                }
                if (this.f74516b.isFull()) {
                    m24573a();
                }
                i += min;
                length -= min;
            }
        } else {
            m24569e(CharBuffer.wrap(charArrayBuffer.buffer(), 0, charArrayBuffer.length()));
        }
        write(f74514g);
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void write(int i) throws IOException {
        if (this.f74517c > 0) {
            if (this.f74516b.isFull()) {
                m24573a();
            }
            this.f74516b.append(i);
            return;
        }
        m24573a();
        this.f74519e.write(i);
    }
}
