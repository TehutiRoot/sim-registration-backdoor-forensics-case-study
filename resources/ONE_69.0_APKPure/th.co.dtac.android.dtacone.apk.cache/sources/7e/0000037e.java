package p000;

import androidx.datastore.preferences.protobuf.Internal;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: Dg0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C17497Dg0 extends InputStream {

    /* renamed from: a */
    public Iterator f1070a;

    /* renamed from: b */
    public ByteBuffer f1071b;

    /* renamed from: c */
    public int f1072c = 0;

    /* renamed from: d */
    public int f1073d;

    /* renamed from: e */
    public int f1074e;

    /* renamed from: f */
    public boolean f1075f;

    /* renamed from: g */
    public byte[] f1076g;

    /* renamed from: h */
    public int f1077h;

    /* renamed from: i */
    public long f1078i;

    public C17497Dg0(Iterable iterable) {
        this.f1070a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.f1072c++;
        }
        this.f1073d = -1;
        if (!m68808b()) {
            this.f1071b = Internal.EMPTY_BYTE_BUFFER;
            this.f1073d = 0;
            this.f1074e = 0;
            this.f1078i = 0L;
        }
    }

    /* renamed from: b */
    public final boolean m68808b() {
        this.f1073d++;
        if (!this.f1070a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f1070a.next();
        this.f1071b = byteBuffer;
        this.f1074e = byteBuffer.position();
        if (this.f1071b.hasArray()) {
            this.f1075f = true;
            this.f1076g = this.f1071b.array();
            this.f1077h = this.f1071b.arrayOffset();
        } else {
            this.f1075f = false;
            this.f1078i = AbstractC22531uZ1.m1127i(this.f1071b);
            this.f1076g = null;
        }
        return true;
    }

    /* renamed from: d */
    public final void m68807d(int i) {
        int i2 = this.f1074e + i;
        this.f1074e = i2;
        if (i2 == this.f1071b.limit()) {
            m68808b();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f1073d == this.f1072c) {
            return -1;
        }
        if (this.f1075f) {
            int i = this.f1076g[this.f1074e + this.f1077h] & 255;
            m68807d(1);
            return i;
        }
        int m1114v = AbstractC22531uZ1.m1114v(this.f1074e + this.f1078i) & 255;
        m68807d(1);
        return m1114v;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.f1073d == this.f1072c) {
            return -1;
        }
        int limit = this.f1071b.limit();
        int i3 = this.f1074e;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f1075f) {
            System.arraycopy(this.f1076g, i3 + this.f1077h, bArr, i, i2);
            m68807d(i2);
        } else {
            int position = this.f1071b.position();
            this.f1071b.position(this.f1074e);
            this.f1071b.get(bArr, i, i2);
            this.f1071b.position(position);
            m68807d(i2);
        }
        return i2;
    }
}