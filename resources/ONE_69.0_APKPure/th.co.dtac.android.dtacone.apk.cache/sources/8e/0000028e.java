package p000;

import com.google.protobuf.Internal;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: Cg0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17432Cg0 extends InputStream {

    /* renamed from: a */
    public Iterator f801a;

    /* renamed from: b */
    public ByteBuffer f802b;

    /* renamed from: c */
    public int f803c = 0;

    /* renamed from: d */
    public int f804d;

    /* renamed from: e */
    public int f805e;

    /* renamed from: f */
    public boolean f806f;

    /* renamed from: g */
    public byte[] f807g;

    /* renamed from: h */
    public int f808h;

    /* renamed from: i */
    public long f809i;

    public C17432Cg0(Iterable iterable) {
        this.f801a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.f803c++;
        }
        this.f804d = -1;
        if (!m68939b()) {
            this.f802b = Internal.EMPTY_BYTE_BUFFER;
            this.f804d = 0;
            this.f805e = 0;
            this.f809i = 0L;
        }
    }

    /* renamed from: b */
    public final boolean m68939b() {
        this.f804d++;
        if (!this.f801a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f801a.next();
        this.f802b = byteBuffer;
        this.f805e = byteBuffer.position();
        if (this.f802b.hasArray()) {
            this.f806f = true;
            this.f807g = this.f802b.array();
            this.f808h = this.f802b.arrayOffset();
        } else {
            this.f806f = false;
            this.f809i = AbstractC22358tZ1.m22630k(this.f802b);
            this.f807g = null;
        }
        return true;
    }

    /* renamed from: d */
    public final void m68938d(int i) {
        int i2 = this.f805e + i;
        this.f805e = i2;
        if (i2 == this.f802b.limit()) {
            m68939b();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f804d == this.f803c) {
            return -1;
        }
        if (this.f806f) {
            int i = this.f807g[this.f805e + this.f808h] & 255;
            m68938d(1);
            return i;
        }
        int m22617x = AbstractC22358tZ1.m22617x(this.f805e + this.f809i) & 255;
        m68938d(1);
        return m22617x;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.f804d == this.f803c) {
            return -1;
        }
        int limit = this.f802b.limit();
        int i3 = this.f805e;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f806f) {
            System.arraycopy(this.f807g, i3 + this.f808h, bArr, i, i2);
            m68938d(i2);
        } else {
            int position = this.f802b.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f802b.position(this.f805e);
            this.f802b.get(bArr, i, i2);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f802b.position(position);
            m68938d(i2);
        }
        return i2;
    }
}