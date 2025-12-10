package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.Consts;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.p030io.EofSensor;
import org.apache.http.p030io.HttpTransportMetrics;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes6.dex */
public class LoggingSessionInputBuffer implements SessionInputBuffer, EofSensor {

    /* renamed from: a */
    public final SessionInputBuffer f74260a;

    /* renamed from: b */
    public final EofSensor f74261b;

    /* renamed from: c */
    public final Wire f74262c;

    /* renamed from: d */
    public final String f74263d;

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire, String str) {
        this.f74260a = sessionInputBuffer;
        this.f74261b = sessionInputBuffer instanceof EofSensor ? (EofSensor) sessionInputBuffer : null;
        this.f74262c = wire;
        this.f74263d = str == null ? Consts.ASCII.name() : str;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.f74260a.getMetrics();
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public boolean isDataAvailable(int i) throws IOException {
        return this.f74260a.isDataAvailable(i);
    }

    @Override // org.apache.http.p030io.EofSensor
    public boolean isEof() {
        EofSensor eofSensor = this.f74261b;
        if (eofSensor != null) {
            return eofSensor.isEof();
        }
        return false;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f74260a.read(bArr, i, i2);
        if (this.f74262c.enabled() && read > 0) {
            this.f74262c.input(bArr, i, read);
        }
        return read;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public String readLine() throws IOException {
        String readLine = this.f74260a.readLine();
        if (this.f74262c.enabled() && readLine != null) {
            this.f74262c.input((readLine + "\r\n").getBytes(this.f74263d));
        }
        return readLine;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int read() throws IOException {
        int read = this.f74260a.read();
        if (this.f74262c.enabled() && read != -1) {
            this.f74262c.input(read);
        }
        return read;
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int readLine(CharArrayBuffer charArrayBuffer) throws IOException {
        int readLine = this.f74260a.readLine(charArrayBuffer);
        if (this.f74262c.enabled() && readLine >= 0) {
            String str = new String(charArrayBuffer.buffer(), charArrayBuffer.length() - readLine, readLine);
            this.f74262c.input((str + "\r\n").getBytes(this.f74263d));
        }
        return readLine;
    }

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire) {
        this(sessionInputBuffer, wire, null);
    }

    @Override // org.apache.http.p030io.SessionInputBuffer
    public int read(byte[] bArr) throws IOException {
        int read = this.f74260a.read(bArr);
        if (this.f74262c.enabled() && read > 0) {
            this.f74262c.input(bArr, 0, read);
        }
        return read;
    }
}
