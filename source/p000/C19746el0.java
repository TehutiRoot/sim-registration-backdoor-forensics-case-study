package p000;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.impl.conn.Wire;

/* renamed from: el0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C19746el0 extends OutputStream {

    /* renamed from: a */
    public final OutputStream f61583a;

    /* renamed from: b */
    public final Wire f61584b;

    public C19746el0(OutputStream outputStream, Wire wire) {
        this.f61583a = outputStream;
        this.f61584b = wire;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f61583a.close();
        } catch (IOException e) {
            Wire wire = this.f61584b;
            wire.output("[close] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            this.f61583a.flush();
        } catch (IOException e) {
            Wire wire = this.f61584b;
            wire.output("[flush] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        try {
            this.f61584b.output(i);
        } catch (IOException e) {
            Wire wire = this.f61584b;
            wire.output("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.f61584b.output(bArr);
            this.f61583a.write(bArr);
        } catch (IOException e) {
            Wire wire = this.f61584b;
            wire.output("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        try {
            this.f61584b.output(bArr, i, i2);
            this.f61583a.write(bArr, i, i2);
        } catch (IOException e) {
            Wire wire = this.f61584b;
            wire.output("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }
}
