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
    public static final byte[] f74452k = {13, 10};

    /* renamed from: a */
    public OutputStream f74453a;

    /* renamed from: b */
    public ByteArrayBuffer f74454b;

    /* renamed from: c */
    public Charset f74455c;

    /* renamed from: d */
    public boolean f74456d;

    /* renamed from: e */
    public int f74457e;

    /* renamed from: f */
    public HttpTransportMetricsImpl f74458f;

    /* renamed from: g */
    public CodingErrorAction f74459g;

    /* renamed from: h */
    public CodingErrorAction f74460h;

    /* renamed from: i */
    public CharsetEncoder f74461i;

    /* renamed from: j */
    public ByteBuffer f74462j;

    public AbstractSessionOutputBuffer(OutputStream outputStream, int i, Charset charset, int i2, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2) {
        Args.notNull(outputStream, "Input stream");
        Args.notNegative(i, "Buffer size");
        this.f74453a = outputStream;
        this.f74454b = new ByteArrayBuffer(i);
        charset = charset == null ? Consts.ASCII : charset;
        this.f74455c = charset;
        this.f74456d = charset.equals(Consts.ASCII);
        this.f74461i = null;
        this.f74457e = i2 < 0 ? 512 : i2;
        this.f74458f = createTransportMetrics();
        this.f74459g = codingErrorAction == null ? CodingErrorAction.REPORT : codingErrorAction;
        this.f74460h = codingErrorAction2 == null ? CodingErrorAction.REPORT : codingErrorAction2;
    }

    /* renamed from: a */
    public final void m24583a(CoderResult coderResult) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f74462j.flip();
        while (this.f74462j.hasRemaining()) {
            write(this.f74462j.get());
        }
        this.f74462j.compact();
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    /* renamed from: b */
    public final void m24582b(CharBuffer charBuffer) {
        if (!charBuffer.hasRemaining()) {
            return;
        }
        if (this.f74461i == null) {
            CharsetEncoder newEncoder = this.f74455c.newEncoder();
            this.f74461i = newEncoder;
            newEncoder.onMalformedInput(this.f74459g);
            this.f74461i.onUnmappableCharacter(this.f74460h);
        }
        if (this.f74462j == null) {
            this.f74462j = ByteBuffer.allocate(1024);
        }
        this.f74461i.reset();
        while (charBuffer.hasRemaining()) {
            m24583a(this.f74461i.encode(charBuffer, this.f74462j, true));
        }
        m24583a(this.f74461i.flush(this.f74462j));
        this.f74462j.clear();
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int capacity() {
        return this.f74454b.capacity();
    }

    public HttpTransportMetricsImpl createTransportMetrics() {
        return new HttpTransportMetricsImpl();
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void flush() throws IOException {
        flushBuffer();
        this.f74453a.flush();
    }

    public void flushBuffer() throws IOException {
        int length = this.f74454b.length();
        if (length > 0) {
            this.f74453a.write(this.f74454b.buffer(), 0, length);
            this.f74454b.clear();
            this.f74458f.incrementBytesTransferred(length);
        }
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.f74458f;
    }

    public void init(OutputStream outputStream, int i, HttpParams httpParams) {
        Charset charset;
        Args.notNull(outputStream, "Input stream");
        Args.notNegative(i, "Buffer size");
        Args.notNull(httpParams, "HTTP parameters");
        this.f74453a = outputStream;
        this.f74454b = new ByteArrayBuffer(i);
        String str = (String) httpParams.getParameter(CoreProtocolPNames.HTTP_ELEMENT_CHARSET);
        if (str != null) {
            charset = Charset.forName(str);
        } else {
            charset = Consts.ASCII;
        }
        this.f74455c = charset;
        this.f74456d = charset.equals(Consts.ASCII);
        this.f74461i = null;
        this.f74457e = httpParams.getIntParameter(CoreConnectionPNames.MIN_CHUNK_LIMIT, 512);
        this.f74458f = createTransportMetrics();
        CodingErrorAction codingErrorAction = (CodingErrorAction) httpParams.getParameter(CoreProtocolPNames.HTTP_MALFORMED_INPUT_ACTION);
        if (codingErrorAction == null) {
            codingErrorAction = CodingErrorAction.REPORT;
        }
        this.f74459g = codingErrorAction;
        CodingErrorAction codingErrorAction2 = (CodingErrorAction) httpParams.getParameter(CoreProtocolPNames.HTTP_UNMAPPABLE_INPUT_ACTION);
        if (codingErrorAction2 == null) {
            codingErrorAction2 = CodingErrorAction.REPORT;
        }
        this.f74460h = codingErrorAction2;
    }

    @Override // org.apache.http.p030io.BufferInfo
    public int length() {
        return this.f74454b.length();
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return;
        }
        if (i2 <= this.f74457e && i2 <= this.f74454b.capacity()) {
            if (i2 > this.f74454b.capacity() - this.f74454b.length()) {
                flushBuffer();
            }
            this.f74454b.append(bArr, i, i2);
            return;
        }
        flushBuffer();
        this.f74453a.write(bArr, i, i2);
        this.f74458f.incrementBytesTransferred(i2);
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void writeLine(String str) throws IOException {
        if (str == null) {
            return;
        }
        if (str.length() > 0) {
            if (this.f74456d) {
                for (int i = 0; i < str.length(); i++) {
                    write(str.charAt(i));
                }
            } else {
                m24582b(CharBuffer.wrap(str));
            }
        }
        write(f74452k);
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
        if (this.f74456d) {
            int length = charArrayBuffer.length();
            while (length > 0) {
                int min = Math.min(this.f74454b.capacity() - this.f74454b.length(), length);
                if (min > 0) {
                    this.f74454b.append(charArrayBuffer, i, min);
                }
                if (this.f74454b.isFull()) {
                    flushBuffer();
                }
                i += min;
                length -= min;
            }
        } else {
            m24582b(CharBuffer.wrap(charArrayBuffer.buffer(), 0, charArrayBuffer.length()));
        }
        write(f74452k);
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void write(int i) throws IOException {
        if (this.f74454b.isFull()) {
            flushBuffer();
        }
        this.f74454b.append(i);
    }

    public AbstractSessionOutputBuffer() {
    }
}
