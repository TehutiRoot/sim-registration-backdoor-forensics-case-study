package p000;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.impl.conn.Wire;

/* renamed from: cl0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C19402cl0 extends InputStream {

    /* renamed from: a */
    public final InputStream f40208a;

    /* renamed from: b */
    public final Wire f40209b;

    public C19402cl0(InputStream inputStream, Wire wire) {
        this.f40208a = inputStream;
        this.f40209b = wire;
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            return this.f40208a.available();
        } catch (IOException e) {
            Wire wire = this.f40209b;
            wire.input("[available] I/O error : " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f40208a.close();
        } catch (IOException e) {
            Wire wire = this.f40209b;
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
            int read = this.f40208a.read();
            if (read == -1) {
                this.f40209b.input("end of stream");
            } else {
                this.f40209b.input(read);
            }
            return read;
        } catch (IOException e) {
            Wire wire = this.f40209b;
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
            Wire wire = this.f40209b;
            wire.input("[skip] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            int read = this.f40208a.read(bArr);
            if (read == -1) {
                this.f40209b.input("end of stream");
            } else if (read > 0) {
                this.f40209b.input(bArr, 0, read);
            }
            return read;
        } catch (IOException e) {
            Wire wire = this.f40209b;
            wire.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.f40208a.read(bArr, i, i2);
            if (read == -1) {
                this.f40209b.input("end of stream");
            } else if (read > 0) {
                this.f40209b.input(bArr, i, read);
            }
            return read;
        } catch (IOException e) {
            Wire wire = this.f40209b;
            wire.input("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }
}
