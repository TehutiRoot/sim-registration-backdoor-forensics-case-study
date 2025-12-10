package p000;

import com.google.common.base.Preconditions;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: h0 */
/* loaded from: classes4.dex */
public abstract class AbstractC10348h0 extends AbstractC0710K {

    /* renamed from: h0$a */
    /* loaded from: classes4.dex */
    public final class C10349a extends AbstractC0776L {

        /* renamed from: a */
        public final C10350b f62370a;

        public C10349a(int i) {
            this.f62370a = new C10350b(i);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            return AbstractC10348h0.this.hashBytes(this.f62370a.m30937b(), 0, this.f62370a.m30936d());
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putByte(byte b) {
            this.f62370a.write(b);
            return this;
        }

        @Override // p000.AbstractC0776L, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(byte[] bArr, int i, int i2) {
            this.f62370a.write(bArr, i, i2);
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(ByteBuffer byteBuffer) {
            this.f62370a.m30935g(byteBuffer);
            return this;
        }
    }

    /* renamed from: h0$b */
    /* loaded from: classes4.dex */
    public static final class C10350b extends ByteArrayOutputStream {
        public C10350b(int i) {
            super(i);
        }

        /* renamed from: b */
        public byte[] m30937b() {
            return ((ByteArrayOutputStream) this).buf;
        }

        /* renamed from: d */
        public int m30936d() {
            return ((ByteArrayOutputStream) this).count;
        }

        /* renamed from: g */
        public void m30935g(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i = ((ByteArrayOutputStream) this).count;
            int i2 = i + remaining;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (i2 > bArr.length) {
                ((ByteArrayOutputStream) this).buf = Arrays.copyOf(bArr, i + remaining);
            }
            byteBuffer.get(((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, remaining);
            ((ByteArrayOutputStream) this).count += remaining;
        }
    }

    @Override // p000.AbstractC0710K, com.google.common.hash.HashFunction
    public HashCode hashBytes(ByteBuffer byteBuffer) {
        return newHasher(byteBuffer.remaining()).putBytes(byteBuffer).hash();
    }

    @Override // p000.AbstractC0710K, com.google.common.hash.HashFunction
    public abstract HashCode hashBytes(byte[] bArr, int i, int i2);

    @Override // p000.AbstractC0710K, com.google.common.hash.HashFunction
    public HashCode hashInt(int i) {
        return hashBytes(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
    }

    @Override // p000.AbstractC0710K, com.google.common.hash.HashFunction
    public HashCode hashLong(long j) {
        return hashBytes(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
    }

    @Override // p000.AbstractC0710K, com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        return hashBytes(charSequence.toString().getBytes(charset));
    }

    @Override // p000.AbstractC0710K, com.google.common.hash.HashFunction
    public HashCode hashUnencodedChars(CharSequence charSequence) {
        int length = charSequence.length();
        ByteBuffer order = ByteBuffer.allocate(length * 2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < length; i++) {
            order.putChar(charSequence.charAt(i));
        }
        return hashBytes(order.array());
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return newHasher(32);
    }

    @Override // p000.AbstractC0710K, com.google.common.hash.HashFunction
    public Hasher newHasher(int i) {
        Preconditions.checkArgument(i >= 0);
        return new C10349a(i);
    }
}
