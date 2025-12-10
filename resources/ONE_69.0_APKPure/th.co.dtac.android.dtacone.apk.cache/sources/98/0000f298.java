package org.apache.http.impl.p029io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.http.Consts;
import org.apache.http.p030io.BufferInfo;
import org.apache.http.p030io.HttpTransportMetrics;
import org.apache.http.p030io.SessionOutputBuffer;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* renamed from: org.apache.http.impl.io.AbstractSessionOutputBuffer */
/* loaded from: classes6.dex */
public abstract class AbstractSessionOutputBuffer implements SessionOutputBuffer, BufferInfo {

    /* renamed from: k */
    public static final byte[] f74536k = {13, 10};

    /* renamed from: a */
    public OutputStream f74537a;

    /* renamed from: b */
    public ByteArrayBuffer f74538b;

    /* renamed from: c */
    public Charset f74539c;

    /* renamed from: d */
    public boolean f74540d;

    /* renamed from: e */
    public int f74541e;

    /* renamed from: f */
    public HttpTransportMetricsImpl f74542f;

    /* renamed from: g */
    public CodingErrorAction f74543g;

    /* renamed from: h */
    public CodingErrorAction f74544h;

    /* renamed from: i */
    public CharsetEncoder f74545i;

    /* renamed from: j */
    public ByteBuffer f74546j;

    public AbstractSessionOutputBuffer(OutputStream outputStream, int i, Charset charset, int i2, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2) {
        Args.notNull(outputStream, "Input stream");
        Args.notNegative(i, "Buffer size");
        this.f74537a = outputStream;
        this.f74538b = new ByteArrayBuffer(i);
        charset = charset == null ? Consts.ASCII : charset;
        this.f74539c = charset;
        this.f74540d = charset.equals(Consts.ASCII);
        this.f74545i = null;
        this.f74541e = i2 < 0 ? 512 : i2;
        this.f74542f = createTransportMetrics();
        this.f74543g = codingErrorAction == null ? CodingErrorAction.REPORT : codingErrorAction;
        this.f74544h = codingErrorAction2 == null ? CodingErrorAction.REPORT : codingErrorAction2;
    }

    /* renamed from: a */
    public final void m24773a(CoderResult coderResult) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f74546j.flip();
        while (this.f74546j.hasRemaining()) {
            write(this.f74546j.get());
        }
        this.f74546j.compact();
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    /* renamed from: b */
    public final void m24772b(CharBuffer charBuffer) {
        if (!charBuffer.hasRemaining()) {
            return;
        }
        if (this.f74545i == null) {
            CharsetEncoder newEncoder = this.f74539c.newEncoder();
            this.f74545i = newEncoder;
            newEncoder.onMalformedInput(this.f74543g);
            this.f74545i.onUnmappableCharacter(this.f74544h);
        }
        if (this.f74546j == null) {
            this.f74546j = ByteBuffer.allocate(1024);
        }
        this.f74545i.reset();
        while (charBuffer.hasRemaining()) {
            m24773a(this.f74545i.encode(charBuffer, this.f74546j, true));
        }
        m24773a(this.f74545i.flush(this.f74546j));
        this.f74546j.clear();
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int capacity() {
        return this.f74538b.capacity();
    }

    public HttpTransportMetricsImpl createTransportMetrics() {
        return new HttpTransportMetricsImpl();
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void flush() throws IOException {
        flushBuffer();
        this.f74537a.flush();
    }

    public void flushBuffer() throws IOException {
        int length = this.f74538b.length();
        if (length > 0) {
            this.f74537a.write(this.f74538b.buffer(), 0, length);
            this.f74538b.clear();
            this.f74542f.incrementBytesTransferred(length);
        }
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.f74542f;
    }

    public void init(OutputStream outputStream, int i, HttpParams httpParams) {
        Charset charset;
        Args.notNull(outputStream, "Input stream");
        Args.notNegative(i, "Buffer size");
        Args.notNull(httpParams, "HTTP parameters");
        this.f74537a = outputStream;
        this.f74538b = new ByteArrayBuffer(i);
        String str = (String) httpParams.getParameter(CoreProtocolPNames.HTTP_ELEMENT_CHARSET);
        if (str != null) {
            charset = Charset.forName(str);
        } else {
            charset = Consts.ASCII;
        }
        this.f74539c = charset;
        this.f74540d = charset.equals(Consts.ASCII);
        this.f74545i = null;
        this.f74541e = httpParams.getIntParameter(CoreConnectionPNames.MIN_CHUNK_LIMIT, 512);
        this.f74542f = createTransportMetrics();
        CodingErrorAction codingErrorAction = (CodingErrorAction) httpParams.getParameter(CoreProtocolPNames.HTTP_MALFORMED_INPUT_ACTION);
        if (codingErrorAction == null) {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        this.f74543g = codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) httpParams.getParameter(CoreProtocolPNames.HTTP_UNMAPPABLE_INPUT_ACTION);
        if (codingErrorAction2 == null) {
            codingErrorAction2 = CodingErrorAction.REPORT;
        }
        this.f74544h = codingErrorAction2;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int length() {
        return this.f74538b.length();
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return;
        }
        if (i2 <= this.f74541e && i2 <= this.f74538b.capacity()) {
            if (i2 > this.f74538b.capacity() - this.f74538b.length()) {
                flushBuffer();
            }
            this.f74538b.append(bArr, i, i2);
            return;
        }
        flushBuffer();
        this.f74537a.write(bArr, i, i2);
        this.f74542f.incrementBytesTransferred(i2);
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void writeLine(String str) throws IOException {
        if (str == null) {
            return;
        }
        if (str.length() > 0) {
            if (this.f74540d) {
                for (int i = 0; i < str.length(); i++) {
                    write(str.charAt(i));
                }
            } else {
                m24772b(CharBuffer.wrap(str));
            }
        }
        write(f74536k);
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
        if (this.f74540d) {
            int length = charArrayBuffer.length();
            while (length > 0) {
                int min = Math.min(this.f74538b.capacity() - this.f74538b.length(), length);
                if (min > 0) {
                    this.f74538b.append(charArrayBuffer, i, min);
                }
                if (this.f74538b.isFull()) {
                    flushBuffer();
                }
                i += min;
                length -= min;
            }
        } else {
            m24772b(CharBuffer.wrap(charArrayBuffer.buffer(), 0, charArrayBuffer.length()));
        }
        write(f74536k);
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void write(int i) throws IOException {
        if (this.f74538b.isFull()) {
            flushBuffer();
        }
        this.f74538b.append(i);
    }

    public AbstractSessionOutputBuffer() {
    }
}