package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Aw2 */
/* loaded from: classes3.dex */
public final class Aw2 extends FilterInputStream {

    /* renamed from: a */
    public long f262a;

    /* renamed from: b */
    public final /* synthetic */ C20524iw2 f263b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Aw2(C20524iw2 c20524iw2, InputStream inputStream) {
        super(inputStream);
        this.f263b = c20524iw2;
        this.f262a = 0L;
    }

    /* renamed from: b */
    public final void m69178b() {
        long m29642a = this.f263b.m29642a();
        if (m29642a == -1) {
            return;
        }
        long j = this.f262a;
        if (j != 0 && j < m29642a) {
            long j2 = this.f262a;
            StringBuilder sb = new StringBuilder(102);
            sb.append("Connection closed prematurely: bytesRead = ");
            sb.append(j2);
            sb.append(", Content-Length = ");
            sb.append(m29642a);
            throw new IOException(sb.toString());
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read == -1) {
            m69178b();
        } else {
            this.f262a += read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(j);
        this.f262a += skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read == -1) {
            m69178b();
        } else {
            this.f262a++;
        }
        return read;
    }
}