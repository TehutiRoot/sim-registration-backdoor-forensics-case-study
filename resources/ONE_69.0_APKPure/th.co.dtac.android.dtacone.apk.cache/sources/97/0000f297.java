package org.apache.http.impl.p029io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.Consts;
import org.apache.http.p030io.BufferInfo;
import org.apache.http.p030io.HttpTransportMetrics;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* renamed from: org.apache.http.impl.io.AbstractSessionInputBuffer */
/* loaded from: classes6.dex */
public abstract class AbstractSessionInputBuffer implements SessionInputBuffer, BufferInfo {

    /* renamed from: a */
    public InputStream f74522a;

    /* renamed from: b */
    public byte[] f74523b;

    /* renamed from: c */
    public ByteArrayBuffer f74524c;

    /* renamed from: d */
    public Charset f74525d;

    /* renamed from: e */
    public boolean f74526e;

    /* renamed from: f */
    public int f74527f;

    /* renamed from: g */
    public int f74528g;

    /* renamed from: h */
    public HttpTransportMetricsImpl f74529h;

    /* renamed from: i */
    public CodingErrorAction f74530i;

    /* renamed from: j */
    public CodingErrorAction f74531j;

    /* renamed from: k */
    public int f74532k;

    /* renamed from: l */
    public int f74533l;

    /* renamed from: m */
    public CharsetDecoder f74534m;

    /* renamed from: n */
    public CharBuffer f74535n;

    /* renamed from: a */
    public final int m24778a(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        int i = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.f74534m == null) {
            CharsetDecoder newDecoder = this.f74525d.newDecoder();
            this.f74534m = newDecoder;
            newDecoder.onMalformedInput(this.f74530i);
            this.f74534m.onUnmappableCharacter(this.f74531j);
        }
        if (this.f74535n == null) {
            this.f74535n = CharBuffer.allocate(1024);
        }
        this.f74534m.reset();
        while (byteBuffer.hasRemaining()) {
            i += m24777b(this.f74534m.decode(byteBuffer, this.f74535n, true), charArrayBuffer, byteBuffer);
        }
        int m24777b = i + m24777b(this.f74534m.flush(this.f74535n), charArrayBuffer, byteBuffer);
        this.f74535n.clear();
        return m24777b;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    /* renamed from: b */
    public final int m24777b(CoderResult coderResult, CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f74535n.flip();
        int remaining = this.f74535n.remaining();
        while (this.f74535n.hasRemaining()) {
            charArrayBuffer.append(this.f74535n.get());
        }
        this.f74535n.compact();
        return remaining;
    }

    /* renamed from: c */
    public final int m24776c(CharArrayBuffer charArrayBuffer) {
        int length = this.f74524c.length();
        if (length > 0) {
            if (this.f74524c.byteAt(length - 1) == 10) {
                length--;
            }
            if (length > 0 && this.f74524c.byteAt(length - 1) == 13) {
                length--;
            }
        }
        if (this.f74526e) {
            charArrayBuffer.append(this.f74524c, 0, length);
        } else {
            length = m24778a(charArrayBuffer, ByteBuffer.wrap(this.f74524c.buffer(), 0, length));
        }
        this.f74524c.clear();
        return length;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int capacity() {
        return this.f74523b.length;
    }

    public HttpTransportMetricsImpl createTransportMetrics() {
        return new HttpTransportMetricsImpl();
    }

    /* renamed from: d */
    public final int m24775d(CharArrayBuffer charArrayBuffer, int i) {
        int i2 = this.f74532k;
        this.f74532k = i + 1;
        if (i > i2 && this.f74523b[i - 1] == 13) {
            i--;
        }
        int i3 = i - i2;
        if (this.f74526e) {
            charArrayBuffer.append(this.f74523b, i2, i3);
            return i3;
        }
        return m24778a(charArrayBuffer, ByteBuffer.wrap(this.f74523b, i2, i3));
    }

    /* renamed from: e */
    public final int m24774e() {
        for (int i = this.f74532k; i < this.f74533l; i++) {
            if (this.f74523b[i] == 10) {
                return i;
            }
        }
        return -1;
    }

    public int fillBuffer() throws IOException {
        int i = this.f74532k;
        if (i > 0) {
            int i2 = this.f74533l - i;
            if (i2 > 0) {
                byte[] bArr = this.f74523b;
                System.arraycopy(bArr, i, bArr, 0, i2);
            }
            this.f74532k = 0;
            this.f74533l = i2;
        }
        int i3 = this.f74533l;
        byte[] bArr2 = this.f74523b;
        int read = this.f74522a.read(bArr2, i3, bArr2.length - i3);
        if (read == -1) {
            return -1;
        }
        this.f74533l = i3 + read;
        this.f74529h.incrementBytesTransferred(read);
        return read;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.f74529h;
    }

    public boolean hasBufferedData() {
        if (this.f74532k < this.f74533l) {
            return true;
        }
        return false;
    }

    public void init(InputStream inputStream, int i, HttpParams httpParams) {
        Charset charset;
        Args.notNull(inputStream, "Input stream");
        Args.notNegative(i, "Buffer size");
        Args.notNull(httpParams, "HTTP parameters");
        this.f74522a = inputStream;
        this.f74523b = new byte[i];
        this.f74532k = 0;
        this.f74533l = 0;
        this.f74524c = new ByteArrayBuffer(i);
        String str = (String) httpParams.getParameter(CoreProtocolPNames.HTTP_ELEMENT_CHARSET);
        if (str != null) {
            charset = Charset.forName(str);
        } else {
            charset = Consts.ASCII;
        }
        this.f74525d = charset;
        this.f74526e = charset.equals(Consts.ASCII);
        this.f74534m = null;
        this.f74527f = httpParams.getIntParameter(CoreConnectionPNames.MAX_LINE_LENGTH, -1);
        this.f74528g = httpParams.getIntParameter(CoreConnectionPNames.MIN_CHUNK_LIMIT, 512);
        this.f74529h = createTransportMetrics();
        CodingErrorAction codingErrorAction = (CodingErrorAction) httpParams.getParameter(CoreProtocolPNames.HTTP_MALFORMED_INPUT_ACTION);
        if (codingErrorAction == null) {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        this.f74530i = codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) httpParams.getParameter(CoreProtocolPNames.HTTP_UNMAPPABLE_INPUT_ACTION);
        if (codingErrorAction2 == null) {
            codingErrorAction2 = CodingErrorAction.REPORT;
        }
        this.f74531j = codingErrorAction2;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int length() {
        return this.f74533l - this.f74532k;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int read() throws IOException {
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f74523b;
        int i = this.f74532k;
        this.f74532k = i + 1;
        return bArr[i] & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r2 == (-1)) goto L9;
     */
    @Override // org.apache.http.p030io.SessionInputBuffer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int readLine(org.apache.http.util.CharArrayBuffer r8) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = "Char array buffer"
            org.apache.http.util.Args.notNull(r8, r0)
            r0 = 0
            r1 = 1
            r2 = 0
        L8:
            r3 = -1
            if (r1 == 0) goto L63
            int r4 = r7.m24774e()
            if (r4 == r3) goto L2f
            org.apache.http.util.ByteArrayBuffer r1 = r7.f74524c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1e
            int r8 = r7.m24775d(r8, r4)
            return r8
        L1e:
            int r4 = r4 + 1
            int r1 = r7.f74532k
            int r3 = r4 - r1
            org.apache.http.util.ByteArrayBuffer r5 = r7.f74524c
            byte[] r6 = r7.f74523b
            r5.append(r6, r1, r3)
            r7.f74532k = r4
        L2d:
            r1 = 0
            goto L4c
        L2f:
            boolean r2 = r7.hasBufferedData()
            if (r2 == 0) goto L45
            int r2 = r7.f74533l
            int r4 = r7.f74532k
            int r2 = r2 - r4
            org.apache.http.util.ByteArrayBuffer r5 = r7.f74524c
            byte[] r6 = r7.f74523b
            r5.append(r6, r4, r2)
            int r2 = r7.f74533l
            r7.f74532k = r2
        L45:
            int r2 = r7.fillBuffer()
            if (r2 != r3) goto L4c
            goto L2d
        L4c:
            int r3 = r7.f74527f
            if (r3 <= 0) goto L8
            org.apache.http.util.ByteArrayBuffer r3 = r7.f74524c
            int r3 = r3.length()
            int r4 = r7.f74527f
            if (r3 >= r4) goto L5b
            goto L8
        L5b:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Maximum line length limit exceeded"
            r8.<init>(r0)
            throw r8
        L63:
            if (r2 != r3) goto L6e
            org.apache.http.util.ByteArrayBuffer r0 = r7.f74524c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6e
            return r3
        L6e:
            int r8 = r7.m24776c(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.p029io.AbstractSessionInputBuffer.readLine(org.apache.http.util.CharArrayBuffer):int");
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return 0;
        }
        if (hasBufferedData()) {
            int min = Math.min(i2, this.f74533l - this.f74532k);
            System.arraycopy(this.f74523b, this.f74532k, bArr, i, min);
            this.f74532k += min;
            return min;
        } else if (i2 > this.f74528g) {
            int read = this.f74522a.read(bArr, i, i2);
            if (read > 0) {
                this.f74529h.incrementBytesTransferred(read);
            }
            return read;
        } else {
            while (!hasBufferedData()) {
                if (fillBuffer() == -1) {
                    return -1;
                }
            }
            int min2 = Math.min(i2, this.f74533l - this.f74532k);
            System.arraycopy(this.f74523b, this.f74532k, bArr, i, min2);
            this.f74532k += min2;
            return min2;
        }
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