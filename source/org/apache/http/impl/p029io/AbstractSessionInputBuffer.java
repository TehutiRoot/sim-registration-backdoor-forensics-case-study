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
    public InputStream f74438a;

    /* renamed from: b */
    public byte[] f74439b;

    /* renamed from: c */
    public ByteArrayBuffer f74440c;

    /* renamed from: d */
    public Charset f74441d;

    /* renamed from: e */
    public boolean f74442e;

    /* renamed from: f */
    public int f74443f;

    /* renamed from: g */
    public int f74444g;

    /* renamed from: h */
    public HttpTransportMetricsImpl f74445h;

    /* renamed from: i */
    public CodingErrorAction f74446i;

    /* renamed from: j */
    public CodingErrorAction f74447j;

    /* renamed from: k */
    public int f74448k;

    /* renamed from: l */
    public int f74449l;

    /* renamed from: m */
    public CharsetDecoder f74450m;

    /* renamed from: n */
    public CharBuffer f74451n;

    /* renamed from: a */
    public final int m24588a(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        int i = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.f74450m == null) {
            CharsetDecoder newDecoder = this.f74441d.newDecoder();
            this.f74450m = newDecoder;
            newDecoder.onMalformedInput(this.f74446i);
            this.f74450m.onUnmappableCharacter(this.f74447j);
        }
        if (this.f74451n == null) {
            this.f74451n = CharBuffer.allocate(1024);
        }
        this.f74450m.reset();
        while (byteBuffer.hasRemaining()) {
            i += m24587b(this.f74450m.decode(byteBuffer, this.f74451n, true), charArrayBuffer, byteBuffer);
        }
        int m24587b = i + m24587b(this.f74450m.flush(this.f74451n), charArrayBuffer, byteBuffer);
        this.f74451n.clear();
        return m24587b;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    /* renamed from: b */
    public final int m24587b(CoderResult coderResult, CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f74451n.flip();
        int remaining = this.f74451n.remaining();
        while (this.f74451n.hasRemaining()) {
            charArrayBuffer.append(this.f74451n.get());
        }
        this.f74451n.compact();
        return remaining;
    }

    /* renamed from: c */
    public final int m24586c(CharArrayBuffer charArrayBuffer) {
        int length = this.f74440c.length();
        if (length > 0) {
            if (this.f74440c.byteAt(length - 1) == 10) {
                length--;
            }
            if (length > 0 && this.f74440c.byteAt(length - 1) == 13) {
                length--;
            }
        }
        if (this.f74442e) {
            charArrayBuffer.append(this.f74440c, 0, length);
        } else {
            length = m24588a(charArrayBuffer, ByteBuffer.wrap(this.f74440c.buffer(), 0, length));
        }
        this.f74440c.clear();
        return length;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int capacity() {
        return this.f74439b.length;
    }

    public HttpTransportMetricsImpl createTransportMetrics() {
        return new HttpTransportMetricsImpl();
    }

    /* renamed from: d */
    public final int m24585d(CharArrayBuffer charArrayBuffer, int i) {
        int i2 = this.f74448k;
        this.f74448k = i + 1;
        if (i > i2 && this.f74439b[i - 1] == 13) {
            i--;
        }
        int i3 = i - i2;
        if (this.f74442e) {
            charArrayBuffer.append(this.f74439b, i2, i3);
            return i3;
        }
        return m24588a(charArrayBuffer, ByteBuffer.wrap(this.f74439b, i2, i3));
    }

    /* renamed from: e */
    public final int m24584e() {
        for (int i = this.f74448k; i < this.f74449l; i++) {
            if (this.f74439b[i] == 10) {
                return i;
            }
        }
        return -1;
    }

    public int fillBuffer() throws IOException {
        int i = this.f74448k;
        if (i > 0) {
            int i2 = this.f74449l - i;
            if (i2 > 0) {
                byte[] bArr = this.f74439b;
                System.arraycopy(bArr, i, bArr, 0, i2);
            }
            this.f74448k = 0;
            this.f74449l = i2;
        }
        int i3 = this.f74449l;
        byte[] bArr2 = this.f74439b;
        int read = this.f74438a.read(bArr2, i3, bArr2.length - i3);
        if (read == -1) {
            return -1;
        }
        this.f74449l = i3 + read;
        this.f74445h.incrementBytesTransferred(read);
        return read;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.f74445h;
    }

    public boolean hasBufferedData() {
        if (this.f74448k < this.f74449l) {
            return true;
        }
        return false;
    }

    public void init(InputStream inputStream, int i, HttpParams httpParams) {
        Charset charset;
        Args.notNull(inputStream, "Input stream");
        Args.notNegative(i, "Buffer size");
        Args.notNull(httpParams, "HTTP parameters");
        this.f74438a = inputStream;
        this.f74439b = new byte[i];
        this.f74448k = 0;
        this.f74449l = 0;
        this.f74440c = new ByteArrayBuffer(i);
        String str = (String) httpParams.getParameter(CoreProtocolPNames.HTTP_ELEMENT_CHARSET);
        if (str != null) {
            charset = Charset.forName(str);
        } else {
            charset = Consts.ASCII;
        }
        this.f74441d = charset;
        this.f74442e = charset.equals(Consts.ASCII);
        this.f74450m = null;
        this.f74443f = httpParams.getIntParameter(CoreConnectionPNames.MAX_LINE_LENGTH, -1);
        this.f74444g = httpParams.getIntParameter(CoreConnectionPNames.MIN_CHUNK_LIMIT, 512);
        this.f74445h = createTransportMetrics();
        CodingErrorAction codingErrorAction = (CodingErrorAction) httpParams.getParameter(CoreProtocolPNames.HTTP_MALFORMED_INPUT_ACTION);
        if (codingErrorAction == null) {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        this.f74446i = codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) httpParams.getParameter(CoreProtocolPNames.HTTP_UNMAPPABLE_INPUT_ACTION);
        if (codingErrorAction2 == null) {
            codingErrorAction2 = CodingErrorAction.REPORT;
        }
        this.f74447j = codingErrorAction2;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int length() {
        return this.f74449l - this.f74448k;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int read() throws IOException {
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f74439b;
        int i = this.f74448k;
        this.f74448k = i + 1;
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
            int r4 = r7.m24584e()
            if (r4 == r3) goto L2f
            org.apache.http.util.ByteArrayBuffer r1 = r7.f74440c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1e
            int r8 = r7.m24585d(r8, r4)
            return r8
        L1e:
            int r4 = r4 + 1
            int r1 = r7.f74448k
            int r3 = r4 - r1
            org.apache.http.util.ByteArrayBuffer r5 = r7.f74440c
            byte[] r6 = r7.f74439b
            r5.append(r6, r1, r3)
            r7.f74448k = r4
        L2d:
            r1 = 0
            goto L4c
        L2f:
            boolean r2 = r7.hasBufferedData()
            if (r2 == 0) goto L45
            int r2 = r7.f74449l
            int r4 = r7.f74448k
            int r2 = r2 - r4
            org.apache.http.util.ByteArrayBuffer r5 = r7.f74440c
            byte[] r6 = r7.f74439b
            r5.append(r6, r4, r2)
            int r2 = r7.f74449l
            r7.f74448k = r2
        L45:
            int r2 = r7.fillBuffer()
            if (r2 != r3) goto L4c
            goto L2d
        L4c:
            int r3 = r7.f74443f
            if (r3 <= 0) goto L8
            org.apache.http.util.ByteArrayBuffer r3 = r7.f74440c
            int r3 = r3.length()
            int r4 = r7.f74443f
            if (r3 >= r4) goto L5b
            goto L8
        L5b:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Maximum line length limit exceeded"
            r8.<init>(r0)
            throw r8
        L63:
            if (r2 != r3) goto L6e
            org.apache.http.util.ByteArrayBuffer r0 = r7.f74440c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6e
            return r3
        L6e:
            int r8 = r7.m24586c(r8)
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
            int min = Math.min(i2, this.f74449l - this.f74448k);
            System.arraycopy(this.f74439b, this.f74448k, bArr, i, min);
            this.f74448k += min;
            return min;
        } else if (i2 > this.f74444g) {
            int read = this.f74438a.read(bArr, i, i2);
            if (read > 0) {
                this.f74445h.incrementBytesTransferred(read);
            }
            return read;
        } else {
            while (!hasBufferedData()) {
                if (fillBuffer() == -1) {
                    return -1;
                }
            }
            int min2 = Math.min(i2, this.f74449l - this.f74448k);
            System.arraycopy(this.f74439b, this.f74448k, bArr, i, min2);
            this.f74448k += min2;
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
