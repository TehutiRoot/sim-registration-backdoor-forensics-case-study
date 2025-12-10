package p000;

import com.google.common.base.Preconditions;
import com.google.common.p014io.ByteSource;
import java.io.InputStream;
import java.util.Iterator;

/* renamed from: gG0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C20011gG0 extends InputStream {

    /* renamed from: a */
    public Iterator f62105a;

    /* renamed from: b */
    public InputStream f62106b;

    public C20011gG0(Iterator it) {
        this.f62105a = (Iterator) Preconditions.checkNotNull(it);
        m31212b();
    }

    @Override // java.io.InputStream
    public int available() {
        InputStream inputStream = this.f62106b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    /* renamed from: b */
    public final void m31212b() {
        close();
        if (this.f62105a.hasNext()) {
            this.f62106b = ((ByteSource) this.f62105a.next()).openStream();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.f62106b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f62106b = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        while (true) {
            InputStream inputStream = this.f62106b;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            m31212b();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        InputStream inputStream = this.f62106b;
        if (inputStream == null || j <= 0) {
            return 0L;
        }
        long skip = inputStream.skip(j);
        if (skip != 0) {
            return skip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f62106b.skip(j - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        Preconditions.checkNotNull(bArr);
        while (true) {
            InputStream inputStream = this.f62106b;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                return read;
            }
            m31212b();
        }
    }
}
