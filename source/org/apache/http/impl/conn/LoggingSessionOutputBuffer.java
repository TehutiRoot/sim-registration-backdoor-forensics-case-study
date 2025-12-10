package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.Consts;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.p030io.HttpTransportMetrics;
import org.apache.http.p030io.SessionOutputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes6.dex */
public class LoggingSessionOutputBuffer implements SessionOutputBuffer {

    /* renamed from: a */
    public final SessionOutputBuffer f74264a;

    /* renamed from: b */
    public final Wire f74265b;

    /* renamed from: c */
    public final String f74266c;

    public LoggingSessionOutputBuffer(SessionOutputBuffer sessionOutputBuffer, Wire wire, String str) {
        this.f74264a = sessionOutputBuffer;
        this.f74265b = wire;
        this.f74266c = str == null ? Consts.ASCII.name() : str;
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void flush() throws IOException {
        this.f74264a.flush();
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.f74264a.getMetrics();
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f74264a.write(bArr, i, i2);
        if (this.f74265b.enabled()) {
            this.f74265b.output(bArr, i, i2);
        }
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void writeLine(CharArrayBuffer charArrayBuffer) throws IOException {
        this.f74264a.writeLine(charArrayBuffer);
        if (this.f74265b.enabled()) {
            String str = new String(charArrayBuffer.buffer(), 0, charArrayBuffer.length());
            this.f74265b.output((str + "\r\n").getBytes(this.f74266c));
        }
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void write(int i) throws IOException {
        this.f74264a.write(i);
        if (this.f74265b.enabled()) {
            this.f74265b.output(i);
        }
    }

    public LoggingSessionOutputBuffer(SessionOutputBuffer sessionOutputBuffer, Wire wire) {
        this(sessionOutputBuffer, wire, null);
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void writeLine(String str) throws IOException {
        this.f74264a.writeLine(str);
        if (this.f74265b.enabled()) {
            this.f74265b.output((str + "\r\n").getBytes(this.f74266c));
        }
    }

    @Override // org.apache.http.p030io.SessionOutputBuffer
    public void write(byte[] bArr) throws IOException {
        this.f74264a.write(bArr);
        if (this.f74265b.enabled()) {
            this.f74265b.output(bArr);
        }
    }
}
