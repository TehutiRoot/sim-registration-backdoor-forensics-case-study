package p000;

import com.google.common.base.Preconditions;
import com.google.common.hash.Hasher;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: y */
/* loaded from: classes4.dex */
public abstract class AbstractC17090y extends AbstractC0776L {

    /* renamed from: a */
    public final ByteBuffer f108591a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    /* renamed from: a */
    public final Hasher m358a(int i) {
        try {
            mo354e(this.f108591a.array(), 0, i);
            return this;
        } finally {
            AbstractC17663Gg0.m68224a(this.f108591a);
        }
    }

    /* renamed from: b */
    public abstract void mo357b(byte b);

    /* renamed from: c */
    public void mo356c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            mo354e(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            AbstractC17663Gg0.m68222c(byteBuffer, byteBuffer.limit());
            return;
        }
        for (int remaining = byteBuffer.remaining(); remaining > 0; remaining--) {
            mo357b(byteBuffer.get());
        }
    }

    /* renamed from: d */
    public void mo355d(byte[] bArr) {
        mo354e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public abstract void mo354e(byte[] bArr, int i, int i2);

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putByte(byte b) {
        mo357b(b);
        return this;
    }

    @Override // p000.AbstractC0776L, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putChar(char c) {
        this.f108591a.putChar(c);
        return m358a(2);
    }

    @Override // p000.AbstractC0776L, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putInt(int i) {
        this.f108591a.putInt(i);
        return m358a(4);
    }

    @Override // p000.AbstractC0776L, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putLong(long j) {
        this.f108591a.putLong(j);
        return m358a(8);
    }

    @Override // p000.AbstractC0776L, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putShort(short s) {
        this.f108591a.putShort(s);
        return m358a(2);
    }

    @Override // p000.AbstractC0776L, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        mo355d(bArr);
        return this;
    }

    @Override // p000.AbstractC0776L, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        mo354e(bArr, i, i2);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(ByteBuffer byteBuffer) {
        mo356c(byteBuffer);
        return this;
    }
}
