package p000;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.impl.conn.Wire;

/* renamed from: il0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C20489il0 extends InputStream {

    /* renamed from: a */
    public final InputStream f62947a;

    /* renamed from: b */
    public final Wire f62948b;

    public C20489il0(InputStream inputStream, Wire wire) {
        this.f62947a = inputStream;
        this.f62948b = wire;
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            return this.f62947a.available();
        } catch (IOException e) {
            Wire wire = this.f62948b;
            wire.input("[available] I/O error : " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f62947a.close();
        } catch (IOException e) {
            Wire wire = this.f62948b;
            wire.input("[close] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        super.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            int read = this.f62947a.read();
            if (read == -1) {
                this.f62948b.input("end of stream");
            } else {
                this.f62948b.input(read);
            }
            return read;
        } catch (IOException e) {
            Wire wire = this.f62948b;
            wire.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        super.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return super.skip(j);
        } catch (IOException e) {
            Wire wire = this.f62948b;
            wire.input("[skip] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            int read = this.f62947a.read(bArr);
            if (read == -1) {
                this.f62948b.input("end of stream");
            } else if (read > 0) {
                this.f62948b.input(bArr, 0, read);
            }
            return read;
        } catch (IOException e) {
            Wire wire = this.f62948b;
            wire.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.f62947a.read(bArr, i, i2);
            if (read == -1) {
                this.f62948b.input("end of stream");
            } else if (read > 0) {
                this.f62948b.input(bArr, i, read);
            }
            return read;
        } catch (IOException e) {
            Wire wire = this.f62948b;
            wire.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }
}