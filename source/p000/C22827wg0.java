package p000;

import com.google.protobuf.Internal;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: wg0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C22827wg0 extends InputStream {

    /* renamed from: a */
    public Iterator f108082a;

    /* renamed from: b */
    public ByteBuffer f108083b;

    /* renamed from: c */
    public int f108084c = 0;

    /* renamed from: d */
    public int f108085d;

    /* renamed from: e */
    public int f108086e;

    /* renamed from: f */
    public boolean f108087f;

    /* renamed from: g */
    public byte[] f108088g;

    /* renamed from: h */
    public int f108089h;

    /* renamed from: i */
    public long f108090i;

    public C22827wg0(Iterable iterable) {
        this.f108082a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.f108084c++;
        }
        this.f108085d = -1;
        if (!m747b()) {
            this.f108083b = Internal.EMPTY_BYTE_BUFFER;
            this.f108085d = 0;
            this.f108086e = 0;
            this.f108090i = 0L;
        }
    }

    /* renamed from: b */
    public final boolean m747b() {
        this.f108085d++;
        if (!this.f108082a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f108082a.next();
        this.f108083b = byteBuffer;
        this.f108086e = byteBuffer.position();
        if (this.f108083b.hasArray()) {
            this.f108087f = true;
            this.f108088g = this.f108083b.array();
            this.f108089h = this.f108083b.arrayOffset();
        } else {
            this.f108087f = false;
            this.f108090i = AbstractC22806wY1.m790k(this.f108083b);
            this.f108088g = null;
        }
        return true;
    }

    /* renamed from: d */
    public final void m746d(int i) {
        int i2 = this.f108086e + i;
        this.f108086e = i2;
        if (i2 == this.f108083b.limit()) {
            m747b();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f108085d == this.f108084c) {
            return -1;
        }
        if (this.f108087f) {
            int i = this.f108088g[this.f108086e + this.f108089h] & 255;
            m746d(1);
            return i;
        }
        int m777x = AbstractC22806wY1.m777x(this.f108086e + this.f108090i) & 255;
        m746d(1);
        return m777x;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.f108085d == this.f108084c) {
            return -1;
        }
        int limit = this.f108083b.limit();
        int i3 = this.f108086e;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f108087f) {
            System.arraycopy(this.f108088g, i3 + this.f108089h, bArr, i, i2);
            m746d(i2);
        } else {
            int position = this.f108083b.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f108083b.position(this.f108086e);
            this.f108083b.get(bArr, i, i2);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f108083b.position(position);
            m746d(i2);
        }
        return i2;
    }
}
