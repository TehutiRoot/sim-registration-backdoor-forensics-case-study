package p000;

import java.io.InputStream;
import org.apache.http.client.entity.InputStreamFactory;

/* renamed from: si0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C22210si0 extends InputStream {

    /* renamed from: a */
    public final InputStream f79962a;

    /* renamed from: b */
    public final InputStreamFactory f79963b;

    /* renamed from: c */
    public InputStream f79964c;

    public C22210si0(InputStream inputStream, InputStreamFactory inputStreamFactory) {
        this.f79962a = inputStream;
        this.f79963b = inputStreamFactory;
    }

    @Override // java.io.InputStream
    public int available() {
        m22791b();
        return this.f79964c.available();
    }

    /* renamed from: b */
    public final void m22791b() {
        if (this.f79964c == null) {
            this.f79964c = this.f79963b.create(this.f79962a);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            InputStream inputStream = this.f79964c;
            if (inputStream != null) {
                inputStream.close();
            }
        } finally {
            this.f79962a.close();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        m22791b();
        return this.f79964c.read();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        m22791b();
        return this.f79964c.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        m22791b();
        return this.f79964c.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        m22791b();
        return this.f79964c.read(bArr, i, i2);
    }
}