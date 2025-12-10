package p000;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.impl.conn.Wire;

/* renamed from: kl0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C20835kl0 extends OutputStream {

    /* renamed from: a */
    public final OutputStream f68053a;

    /* renamed from: b */
    public final Wire f68054b;

    public C20835kl0(OutputStream outputStream, Wire wire) {
        this.f68053a = outputStream;
        this.f68054b = wire;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f68053a.close();
        } catch (IOException e) {
            Wire wire = this.f68054b;
            wire.output("[close] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            this.f68053a.flush();
        } catch (IOException e) {
            Wire wire = this.f68054b;
            wire.output("[flush] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        try {
            this.f68054b.output(i);
        } catch (IOException e) {
            Wire wire = this.f68054b;
            wire.output("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.f68054b.output(bArr);
            this.f68053a.write(bArr);
        } catch (IOException e) {
            Wire wire = this.f68054b;
            wire.output("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        try {
            this.f68054b.output(bArr, i, i2);
            this.f68053a.write(bArr, i, i2);
        } catch (IOException e) {
            Wire wire = this.f68054b;
            wire.output("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }
}