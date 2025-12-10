package p000;

import com.google.common.base.Preconditions;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: v0 */
/* loaded from: classes4.dex */
public abstract class AbstractC16864v0 extends AbstractC0776L {

    /* renamed from: a */
    public final ByteBuffer f107544a;

    /* renamed from: b */
    public final int f107545b;

    /* renamed from: c */
    public final int f107546c;

    public AbstractC16864v0(int i) {
        this(i, i);
    }

    /* renamed from: a */
    public abstract HashCode mo1155a();

    /* renamed from: b */
    public final void m1154b() {
        AbstractC17663Gg0.m68223b(this.f107544a);
        while (this.f107544a.remaining() >= this.f107546c) {
            mo1152d(this.f107544a);
        }
        this.f107544a.compact();
    }

    /* renamed from: c */
    public final void m1153c() {
        if (this.f107544a.remaining() < 8) {
            m1154b();
        }
    }

    /* renamed from: d */
    public abstract void mo1152d(ByteBuffer byteBuffer);

    /* renamed from: e */
    public abstract void mo1151e(ByteBuffer byteBuffer);

    /* renamed from: f */
    public final Hasher m1150f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.f107544a.remaining()) {
            this.f107544a.put(byteBuffer);
            m1153c();
            return this;
        }
        int position = this.f107545b - this.f107544a.position();
        for (int i = 0; i < position; i++) {
            this.f107544a.put(byteBuffer.get());
        }
        m1154b();
        while (byteBuffer.remaining() >= this.f107546c) {
            mo1152d(byteBuffer);
        }
        this.f107544a.put(byteBuffer);
        return this;
    }

    @Override // com.google.common.hash.Hasher
    public final HashCode hash() {
        m1154b();
        AbstractC17663Gg0.m68223b(this.f107544a);
        if (this.f107544a.remaining() > 0) {
            mo1151e(this.f107544a);
            ByteBuffer byteBuffer = this.f107544a;
            AbstractC17663Gg0.m68222c(byteBuffer, byteBuffer.limit());
        }
        return mo1155a();
    }

    public AbstractC16864v0(int i, int i2) {
        Preconditions.checkArgument(i2 % i == 0);
        this.f107544a = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f107545b = i2;
        this.f107546c = i;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putByte(byte b) {
        this.f107544a.put(b);
        m1153c();
        return this;
    }

    @Override // p000.AbstractC0776L, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putChar(char c) {
        this.f107544a.putChar(c);
        m1153c();
        return this;
    }

    @Override // p000.AbstractC0776L, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putInt(int i) {
        this.f107544a.putInt(i);
        m1153c();
        return this;
    }

    @Override // p000.AbstractC0776L, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putLong(long j) {
        this.f107544a.putLong(j);
        m1153c();
        return this;
    }

    @Override // p000.AbstractC0776L, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putShort(short s) {
        this.f107544a.putShort(s);
        m1153c();
        return this;
    }

    @Override // p000.AbstractC0776L, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putBytes(byte[] bArr, int i, int i2) {
        return m1150f(ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final Hasher putBytes(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return m1150f(byteBuffer);
        } finally {
            byteBuffer.order(order);
        }
    }
}
