package p000;

import androidx.datastore.preferences.protobuf.Internal;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: xg0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C22999xg0 extends InputStream {

    /* renamed from: a */
    public Iterator f108452a;

    /* renamed from: b */
    public ByteBuffer f108453b;

    /* renamed from: c */
    public int f108454c = 0;

    /* renamed from: d */
    public int f108455d;

    /* renamed from: e */
    public int f108456e;

    /* renamed from: f */
    public boolean f108457f;

    /* renamed from: g */
    public byte[] f108458g;

    /* renamed from: h */
    public int f108459h;

    /* renamed from: i */
    public long f108460i;

    public C22999xg0(Iterable iterable) {
        this.f108452a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.f108454c++;
        }
        this.f108455d = -1;
        if (!m418b()) {
            this.f108453b = Internal.EMPTY_BYTE_BUFFER;
            this.f108455d = 0;
            this.f108456e = 0;
            this.f108460i = 0L;
        }
    }

    /* renamed from: b */
    public final boolean m418b() {
        this.f108455d++;
        if (!this.f108452a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f108452a.next();
        this.f108453b = byteBuffer;
        this.f108456e = byteBuffer.position();
        if (this.f108453b.hasArray()) {
            this.f108457f = true;
            this.f108458g = this.f108453b.array();
            this.f108459h = this.f108453b.arrayOffset();
        } else {
            this.f108457f = false;
            this.f108460i = AbstractC22978xY1.m466i(this.f108453b);
            this.f108458g = null;
        }
        return true;
    }

    /* renamed from: d */
    public final void m417d(int i) {
        int i2 = this.f108456e + i;
        this.f108456e = i2;
        if (i2 == this.f108453b.limit()) {
            m418b();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f108455d == this.f108454c) {
            return -1;
        }
        if (this.f108457f) {
            int i = this.f108458g[this.f108456e + this.f108459h] & 255;
            m417d(1);
            return i;
        }
        int m453v = AbstractC22978xY1.m453v(this.f108456e + this.f108460i) & 255;
        m417d(1);
        return m453v;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.f108455d == this.f108454c) {
            return -1;
        }
        int limit = this.f108453b.limit();
        int i3 = this.f108456e;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f108457f) {
            System.arraycopy(this.f108458g, i3 + this.f108459h, bArr, i, i2);
            m417d(i2);
        } else {
            int position = this.f108453b.position();
            this.f108453b.position(this.f108456e);
            this.f108453b.get(bArr, i, i2);
            this.f108453b.position(position);
            m417d(i2);
        }
        return i2;
    }
}
