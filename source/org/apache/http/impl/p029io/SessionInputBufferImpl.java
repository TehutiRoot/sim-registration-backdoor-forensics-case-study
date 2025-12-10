package org.apache.http.impl.p029io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.apache.http.MessageConstraintException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.p030io.BufferInfo;
import org.apache.http.p030io.HttpTransportMetrics;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* renamed from: org.apache.http.impl.io.SessionInputBufferImpl */
/* loaded from: classes6.dex */
public class SessionInputBufferImpl implements SessionInputBuffer, BufferInfo {

    /* renamed from: a */
    public final HttpTransportMetricsImpl f74504a;

    /* renamed from: b */
    public final byte[] f74505b;

    /* renamed from: c */
    public final ByteArrayBuffer f74506c;

    /* renamed from: d */
    public final int f74507d;

    /* renamed from: e */
    public final MessageConstraints f74508e;

    /* renamed from: f */
    public final CharsetDecoder f74509f;

    /* renamed from: g */
    public InputStream f74510g;

    /* renamed from: h */
    public int f74511h;

    /* renamed from: i */
    public int f74512i;

    /* renamed from: j */
    public CharBuffer f74513j;

    public SessionInputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i, int i2, MessageConstraints messageConstraints, CharsetDecoder charsetDecoder) {
        Args.notNull(httpTransportMetricsImpl, "HTTP transport metrcis");
        Args.positive(i, "Buffer size");
        this.f74504a = httpTransportMetricsImpl;
        this.f74505b = new byte[i];
        this.f74511h = 0;
        this.f74512i = 0;
        this.f74507d = i2 < 0 ? 512 : i2;
        this.f74508e = messageConstraints == null ? MessageConstraints.DEFAULT : messageConstraints;
        this.f74506c = new ByteArrayBuffer(i);
        this.f74509f = charsetDecoder;
    }

    /* renamed from: a */
    private int m24578a(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        int i = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.f74513j == null) {
            this.f74513j = CharBuffer.allocate(1024);
        }
        this.f74509f.reset();
        while (byteBuffer.hasRemaining()) {
            i += m24577b(this.f74509f.decode(byteBuffer, this.f74513j, true), charArrayBuffer, byteBuffer);
        }
        int m24577b = i + m24577b(this.f74509f.flush(this.f74513j), charArrayBuffer, byteBuffer);
        this.f74513j.clear();
        return m24577b;
    }

    /* renamed from: b */
    private int m24577b(CoderResult coderResult, CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f74513j.flip();
        int remaining = this.f74513j.remaining();
        while (this.f74513j.hasRemaining()) {
            charArrayBuffer.append(this.f74513j.get());
        }
        this.f74513j.compact();
        return remaining;
    }

    /* renamed from: c */
    private int m24576c(CharArrayBuffer charArrayBuffer) {
        int length = this.f74506c.length();
        if (length > 0) {
            if (this.f74506c.byteAt(length - 1) == 10) {
                length--;
            }
            if (length > 0 && this.f74506c.byteAt(length - 1) == 13) {
                length--;
            }
        }
        if (this.f74509f == null) {
            charArrayBuffer.append(this.f74506c, 0, length);
        } else {
            length = m24578a(charArrayBuffer, ByteBuffer.wrap(this.f74506c.buffer(), 0, length));
        }
        this.f74506c.clear();
        return length;
    }

    /* renamed from: d */
    private int m24575d(CharArrayBuffer charArrayBuffer, int i) {
        int i2 = this.f74511h;
        this.f74511h = i + 1;
        if (i > i2 && this.f74505b[i - 1] == 13) {
            i--;
        }
        int i3 = i - i2;
        if (this.f74509f == null) {
            charArrayBuffer.append(this.f74505b, i2, i3);
            return i3;
        }
        return m24578a(charArrayBuffer, ByteBuffer.wrap(this.f74505b, i2, i3));
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    public void bind(InputStream inputStream) {
        this.f74510g = inputStream;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int capacity() {
        return this.f74505b.length;
    }

    public void clear() {
        this.f74511h = 0;
        this.f74512i = 0;
    }

    /* renamed from: e */
    public final int m24574e(byte[] bArr, int i, int i2) {
        Asserts.notNull(this.f74510g, "Input stream");
        return this.f74510g.read(bArr, i, i2);
    }

    public int fillBuffer() throws IOException {
        int i = this.f74511h;
        if (i > 0) {
            int i2 = this.f74512i - i;
            if (i2 > 0) {
                byte[] bArr = this.f74505b;
                System.arraycopy(bArr, i, bArr, 0, i2);
            }
            this.f74511h = 0;
            this.f74512i = i2;
        }
        int i3 = this.f74512i;
        byte[] bArr2 = this.f74505b;
        int m24574e = m24574e(bArr2, i3, bArr2.length - i3);
        if (m24574e == -1) {
            return -1;
        }
        this.f74512i = i3 + m24574e;
        this.f74504a.incrementBytesTransferred(m24574e);
        return m24574e;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.f74504a;
    }

    public boolean hasBufferedData() {
        if (this.f74511h < this.f74512i) {
            return true;
        }
        return false;
    }

    public boolean isBound() {
        if (this.f74510g != null) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public boolean isDataAvailable(int i) throws IOException {
        return hasBufferedData();
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int length() {
        return this.f74512i - this.f74511h;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int read() throws IOException {
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f74505b;
        int i = this.f74511h;
        this.f74511h = i + 1;
        return bArr[i] & 255;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int readLine(CharArrayBuffer charArrayBuffer) throws IOException {
        Args.notNull(charArrayBuffer, "Char array buffer");
        int maxLineLength = this.f74508e.getMaxLineLength();
        boolean z = true;
        int i = 0;
        while (z) {
            int i2 = this.f74511h;
            while (true) {
                if (i2 >= this.f74512i) {
                    i2 = -1;
                    break;
                } else if (this.f74505b[i2] == 10) {
                    break;
                } else {
                    i2++;
                }
            }
            if (maxLineLength > 0) {
                if ((this.f74506c.length() + (i2 >= 0 ? i2 : this.f74512i)) - this.f74511h >= maxLineLength) {
                    throw new MessageConstraintException("Maximum line length limit exceeded");
                }
            }
            if (i2 != -1) {
                if (this.f74506c.isEmpty()) {
                    return m24575d(charArrayBuffer, i2);
                }
                int i3 = i2 + 1;
                int i4 = this.f74511h;
                this.f74506c.append(this.f74505b, i4, i3 - i4);
                this.f74511h = i3;
            } else {
                if (hasBufferedData()) {
                    int i5 = this.f74512i;
                    int i6 = this.f74511h;
                    this.f74506c.append(this.f74505b, i6, i5 - i6);
                    this.f74511h = this.f74512i;
                }
                i = fillBuffer();
                if (i == -1) {
                }
            }
            z = false;
        }
        if (i == -1 && this.f74506c.isEmpty()) {
            return -1;
        }
        return m24576c(charArrayBuffer);
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return 0;
        }
        if (hasBufferedData()) {
            int min = Math.min(i2, this.f74512i - this.f74511h);
            System.arraycopy(this.f74505b, this.f74511h, bArr, i, min);
            this.f74511h += min;
            return min;
        } else if (i2 > this.f74507d) {
            int m24574e = m24574e(bArr, i, i2);
            if (m24574e > 0) {
                this.f74504a.incrementBytesTransferred(m24574e);
            }
            return m24574e;
        } else {
            while (!hasBufferedData()) {
                if (fillBuffer() == -1) {
                    return -1;
                }
            }
            int min2 = Math.min(i2, this.f74512i - this.f74511h);
            System.arraycopy(this.f74505b, this.f74511h, bArr, i, min2);
            this.f74511h += min2;
            return min2;
        }
    }

    public SessionInputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i) {
        this(httpTransportMetricsImpl, i, i, null, null);
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int read(byte[] bArr) throws IOException {
        if (bArr == null) {
            return 0;
        }
        return read(bArr, 0, bArr.length);
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public String readLine() throws IOException {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        if (readLine(charArrayBuffer) != -1) {
            return charArrayBuffer.toString();
        }
        return null;
    }
}
