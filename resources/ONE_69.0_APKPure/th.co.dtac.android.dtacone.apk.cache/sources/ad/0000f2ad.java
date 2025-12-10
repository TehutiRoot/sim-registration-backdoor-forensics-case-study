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
    public final HttpTransportMetricsImpl f74588a;

    /* renamed from: b */
    public final byte[] f74589b;

    /* renamed from: c */
    public final ByteArrayBuffer f74590c;

    /* renamed from: d */
    public final int f74591d;

    /* renamed from: e */
    public final MessageConstraints f74592e;

    /* renamed from: f */
    public final CharsetDecoder f74593f;

    /* renamed from: g */
    public InputStream f74594g;

    /* renamed from: h */
    public int f74595h;

    /* renamed from: i */
    public int f74596i;

    /* renamed from: j */
    public CharBuffer f74597j;

    public SessionInputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i, int i2, MessageConstraints messageConstraints, CharsetDecoder charsetDecoder) {
        Args.notNull(httpTransportMetricsImpl, "HTTP transport metrcis");
        Args.positive(i, "Buffer size");
        this.f74588a = httpTransportMetricsImpl;
        this.f74589b = new byte[i];
        this.f74595h = 0;
        this.f74596i = 0;
        this.f74591d = i2 < 0 ? 512 : i2;
        this.f74592e = messageConstraints == null ? MessageConstraints.DEFAULT : messageConstraints;
        this.f74590c = new ByteArrayBuffer(i);
        this.f74593f = charsetDecoder;
    }

    /* renamed from: a */
    private int m24768a(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        int i = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.f74597j == null) {
            this.f74597j = CharBuffer.allocate(1024);
        }
        this.f74593f.reset();
        while (byteBuffer.hasRemaining()) {
            i += m24767b(this.f74593f.decode(byteBuffer, this.f74597j, true), charArrayBuffer, byteBuffer);
        }
        int m24767b = i + m24767b(this.f74593f.flush(this.f74597j), charArrayBuffer, byteBuffer);
        this.f74597j.clear();
        return m24767b;
    }

    /* renamed from: b */
    private int m24767b(CoderResult coderResult, CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f74597j.flip();
        int remaining = this.f74597j.remaining();
        while (this.f74597j.hasRemaining()) {
            charArrayBuffer.append(this.f74597j.get());
        }
        this.f74597j.compact();
        return remaining;
    }

    /* renamed from: c */
    private int m24766c(CharArrayBuffer charArrayBuffer) {
        int length = this.f74590c.length();
        if (length > 0) {
            if (this.f74590c.byteAt(length - 1) == 10) {
                length--;
            }
            if (length > 0 && this.f74590c.byteAt(length - 1) == 13) {
                length--;
            }
        }
        if (this.f74593f == null) {
            charArrayBuffer.append(this.f74590c, 0, length);
        } else {
            length = m24768a(charArrayBuffer, ByteBuffer.wrap(this.f74590c.buffer(), 0, length));
        }
        this.f74590c.clear();
        return length;
    }

    /* renamed from: d */
    private int m24765d(CharArrayBuffer charArrayBuffer, int i) {
        int i2 = this.f74595h;
        this.f74595h = i + 1;
        if (i > i2 && this.f74589b[i - 1] == 13) {
            i--;
        }
        int i3 = i - i2;
        if (this.f74593f == null) {
            charArrayBuffer.append(this.f74589b, i2, i3);
            return i3;
        }
        return m24768a(charArrayBuffer, ByteBuffer.wrap(this.f74589b, i2, i3));
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    public void bind(InputStream inputStream) {
        this.f74594g = inputStream;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int capacity() {
        return this.f74589b.length;
    }

    public void clear() {
        this.f74595h = 0;
        this.f74596i = 0;
    }

    /* renamed from: e */
    public final int m24764e(byte[] bArr, int i, int i2) {
        Asserts.notNull(this.f74594g, "Input stream");
        return this.f74594g.read(bArr, i, i2);
    }

    public int fillBuffer() throws IOException {
        int i = this.f74595h;
        if (i > 0) {
            int i2 = this.f74596i - i;
            if (i2 > 0) {
                byte[] bArr = this.f74589b;
                System.arraycopy(bArr, i, bArr, 0, i2);
            }
            this.f74595h = 0;
            this.f74596i = i2;
        }
        int i3 = this.f74596i;
        byte[] bArr2 = this.f74589b;
        int m24764e = m24764e(bArr2, i3, bArr2.length - i3);
        if (m24764e == -1) {
            return -1;
        }
        this.f74596i = i3 + m24764e;
        this.f74588a.incrementBytesTransferred(m24764e);
        return m24764e;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.f74588a;
    }

    public boolean hasBufferedData() {
        if (this.f74595h < this.f74596i) {
            return true;
        }
        return false;
    }

    public boolean isBound() {
        if (this.f74594g != null) {
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
        return this.f74596i - this.f74595h;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int read() throws IOException {
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f74589b;
        int i = this.f74595h;
        this.f74595h = i + 1;
        return bArr[i] & 255;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int readLine(CharArrayBuffer charArrayBuffer) throws IOException {
        Args.notNull(charArrayBuffer, "Char array buffer");
        int maxLineLength = this.f74592e.getMaxLineLength();
        boolean z = true;
        int i = 0;
        while (z) {
            int i2 = this.f74595h;
            while (true) {
                if (i2 >= this.f74596i) {
                    i2 = -1;
                    break;
                } else if (this.f74589b[i2] == 10) {
                    break;
                } else {
                    i2++;
                }
            }
            if (maxLineLength > 0) {
                if ((this.f74590c.length() + (i2 >= 0 ? i2 : this.f74596i)) - this.f74595h >= maxLineLength) {
                    throw new MessageConstraintException("Maximum line length limit exceeded");
                }
            }
            if (i2 != -1) {
                if (this.f74590c.isEmpty()) {
                    return m24765d(charArrayBuffer, i2);
                }
                int i3 = i2 + 1;
                int i4 = this.f74595h;
                this.f74590c.append(this.f74589b, i4, i3 - i4);
                this.f74595h = i3;
            } else {
                if (hasBufferedData()) {
                    int i5 = this.f74596i;
                    int i6 = this.f74595h;
                    this.f74590c.append(this.f74589b, i6, i5 - i6);
                    this.f74595h = this.f74596i;
                }
                i = fillBuffer();
                if (i == -1) {
                }
            }
            z = false;
        }
        if (i == -1 && this.f74590c.isEmpty()) {
            return -1;
        }
        return m24766c(charArrayBuffer);
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return 0;
        }
        if (hasBufferedData()) {
            int min = Math.min(i2, this.f74596i - this.f74595h);
            System.arraycopy(this.f74589b, this.f74595h, bArr, i, min);
            this.f74595h += min;
            return min;
        } else if (i2 > this.f74591d) {
            int m24764e = m24764e(bArr, i, i2);
            if (m24764e > 0) {
                this.f74588a.incrementBytesTransferred(m24764e);
            }
            return m24764e;
        } else {
            while (!hasBufferedData()) {
                if (fillBuffer() == -1) {
                    return -1;
                }
            }
            int min2 = Math.min(i2, this.f74596i - this.f74595h);
            System.arraycopy(this.f74589b, this.f74595h, bArr, i, min2);
            this.f74595h += min2;
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