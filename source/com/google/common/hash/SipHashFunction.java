package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import javax.annotation.CheckForNull;

@Immutable
/* loaded from: classes4.dex */
final class SipHashFunction extends AbstractC0710K implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    private final int f53862c;

    /* renamed from: d */
    private final int f53863d;

    /* renamed from: k0 */
    private final long f53864k0;

    /* renamed from: k1 */
    private final long f53865k1;

    /* renamed from: com.google.common.hash.SipHashFunction$a */
    /* loaded from: classes4.dex */
    public static final class C8067a extends AbstractC16864v0 {

        /* renamed from: d */
        public final int f53866d;

        /* renamed from: e */
        public final int f53867e;

        /* renamed from: f */
        public long f53868f;

        /* renamed from: g */
        public long f53869g;

        /* renamed from: h */
        public long f53870h;

        /* renamed from: i */
        public long f53871i;

        /* renamed from: j */
        public long f53872j;

        /* renamed from: k */
        public long f53873k;

        public C8067a(int i, int i2, long j, long j2) {
            super(8);
            this.f53872j = 0L;
            this.f53873k = 0L;
            this.f53866d = i;
            this.f53867e = i2;
            this.f53868f = 8317987319222330741L ^ j;
            this.f53869g = 7237128888997146477L ^ j2;
            this.f53870h = 7816392313619706465L ^ j;
            this.f53871i = 8387220255154660723L ^ j2;
        }

        @Override // p000.AbstractC16864v0
        /* renamed from: a */
        public HashCode mo1155a() {
            long j = this.f53873k ^ (this.f53872j << 56);
            this.f53873k = j;
            m40036g(j);
            this.f53870h ^= 255;
            m40035h(this.f53867e);
            return HashCode.fromLong(((this.f53868f ^ this.f53869g) ^ this.f53870h) ^ this.f53871i);
        }

        @Override // p000.AbstractC16864v0
        /* renamed from: d */
        public void mo1152d(ByteBuffer byteBuffer) {
            this.f53872j += 8;
            m40036g(byteBuffer.getLong());
        }

        @Override // p000.AbstractC16864v0
        /* renamed from: e */
        public void mo1151e(ByteBuffer byteBuffer) {
            this.f53872j += byteBuffer.remaining();
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                this.f53873k ^= (byteBuffer.get() & 255) << i;
                i += 8;
            }
        }

        /* renamed from: g */
        public final void m40036g(long j) {
            this.f53871i ^= j;
            m40035h(this.f53866d);
            this.f53868f = j ^ this.f53868f;
        }

        /* renamed from: h */
        public final void m40035h(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                long j = this.f53868f;
                long j2 = this.f53869g;
                this.f53868f = j + j2;
                this.f53870h += this.f53871i;
                this.f53869g = Long.rotateLeft(j2, 13);
                long rotateLeft = Long.rotateLeft(this.f53871i, 16);
                long j3 = this.f53869g;
                long j4 = this.f53868f;
                this.f53869g = j3 ^ j4;
                this.f53871i = rotateLeft ^ this.f53870h;
                long rotateLeft2 = Long.rotateLeft(j4, 32);
                long j5 = this.f53870h;
                long j6 = this.f53869g;
                this.f53870h = j5 + j6;
                this.f53868f = rotateLeft2 + this.f53871i;
                this.f53869g = Long.rotateLeft(j6, 17);
                long rotateLeft3 = Long.rotateLeft(this.f53871i, 21);
                long j7 = this.f53869g;
                long j8 = this.f53870h;
                this.f53869g = j7 ^ j8;
                this.f53871i = rotateLeft3 ^ this.f53868f;
                this.f53870h = Long.rotateLeft(j8, 32);
            }
        }
    }

    public SipHashFunction(int i, int i2, long j, long j2) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "The number of SipRound iterations (c=%s) during Compression must be positive.", i);
        Preconditions.checkArgument(i2 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i2);
        this.f53862c = i;
        this.f53863d = i2;
        this.f53864k0 = j;
        this.f53865k1 = j2;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) obj;
        if (this.f53862c != sipHashFunction.f53862c || this.f53863d != sipHashFunction.f53863d || this.f53864k0 != sipHashFunction.f53864k0 || this.f53865k1 != sipHashFunction.f53865k1) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (int) ((((SipHashFunction.class.hashCode() ^ this.f53862c) ^ this.f53863d) ^ this.f53864k0) ^ this.f53865k1);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new C8067a(this.f53862c, this.f53863d, this.f53864k0, this.f53865k1);
    }

    public String toString() {
        return "Hashing.sipHash" + this.f53862c + "" + this.f53863d + "(" + this.f53864k0 + ", " + this.f53865k1 + ")";
    }
}
