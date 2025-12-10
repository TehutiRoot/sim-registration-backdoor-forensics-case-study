package p000;

import java.io.InputStream;
import org.apache.http.client.entity.InputStreamFactory;

/* renamed from: mi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C21113mi0 extends InputStream {

    /* renamed from: a */
    public final InputStream f72012a;

    /* renamed from: b */
    public final InputStreamFactory f72013b;

    /* renamed from: c */
    public InputStream f72014c;

    public C21113mi0(InputStream inputStream, InputStreamFactory inputStreamFactory) {
        this.f72012a = inputStream;
        this.f72013b = inputStreamFactory;
    }

    @Override // java.io.InputStream
    public int available() {
        m26209b();
        return this.f72014c.available();
    }

    /* renamed from: b */
    public final void m26209b() {
        if (this.f72014c == null) {
            this.f72014c = this.f72013b.create(this.f72012a);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            InputStream inputStream = this.f72014c;
            if (inputStream != null) {
                inputStream.close();
            }
        } finally {
            this.f72012a.close();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        m26209b();
        return this.f72014c.read();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        m26209b();
        return this.f72014c.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        m26209b();
        return this.f72014c.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        m26209b();
        return this.f72014c.read(bArr, i, i2);
    }
}
