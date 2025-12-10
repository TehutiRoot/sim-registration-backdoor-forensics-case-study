package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Dv2 */
/* loaded from: classes3.dex */
public final class Dv2 extends FilterInputStream {

    /* renamed from: a */
    public long f1144a;

    /* renamed from: b */
    public final /* synthetic */ C20982lv2 f1145b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dv2(C20982lv2 c20982lv2, InputStream inputStream) {
        super(inputStream);
        this.f1145b = c20982lv2;
        this.f1144a = 0L;
    }

    /* renamed from: b */
    public final void m68580b() {
        long m26409a = this.f1145b.m26409a();
        if (m26409a == -1) {
            return;
        }
        long j = this.f1144a;
        if (j != 0 && j < m26409a) {
            long j2 = this.f1144a;
            StringBuilder sb = new StringBuilder(102);
            sb.append("Connection closed prematurely: bytesRead = ");
            sb.append(j2);
            sb.append(", Content-Length = ");
            sb.append(m26409a);
            throw new IOException(sb.toString());
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read == -1) {
            m68580b();
        } else {
            this.f1144a += read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(j);
        this.f1144a += skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read == -1) {
            m68580b();
        } else {
            this.f1144a++;
        }
        return read;
    }
}
