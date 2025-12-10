package p000;

import com.google.common.base.Preconditions;
import com.google.common.hash.Funnel;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: B */
/* loaded from: classes4.dex */
public abstract class AbstractC0069B extends AbstractC0698K {

    /* renamed from: a */
    public final HashFunction[] f289a;

    /* renamed from: B$a */
    /* loaded from: classes4.dex */
    public class C0070a implements Hasher {

        /* renamed from: a */
        public final /* synthetic */ Hasher[] f290a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC0069B f291b;

        public C0070a(AbstractC0069B abstractC0069B, Hasher[] hasherArr) {
            this.f290a = hasherArr;
            this.f291b = abstractC0069B;
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            return this.f291b.mo40042b(this.f290a);
        }

        @Override // com.google.common.hash.Hasher
        public Hasher putObject(Object obj, Funnel funnel) {
            for (Hasher hasher : this.f290a) {
                hasher.putObject(obj, funnel);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBoolean(boolean z) {
            for (Hasher hasher : this.f290a) {
                hasher.putBoolean(z);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putByte(byte b) {
            for (Hasher hasher : this.f290a) {
                hasher.putByte(b);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putChar(char c) {
            for (Hasher hasher : this.f290a) {
                hasher.putChar(c);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putDouble(double d) {
            for (Hasher hasher : this.f290a) {
                hasher.putDouble(d);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putFloat(float f) {
            for (Hasher hasher : this.f290a) {
                hasher.putFloat(f);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putInt(int i) {
            for (Hasher hasher : this.f290a) {
                hasher.putInt(i);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putLong(long j) {
            for (Hasher hasher : this.f290a) {
                hasher.putLong(j);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putShort(short s) {
            for (Hasher hasher : this.f290a) {
                hasher.putShort(s);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putString(CharSequence charSequence, Charset charset) {
            for (Hasher hasher : this.f290a) {
                hasher.putString(charSequence, charset);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putUnencodedChars(CharSequence charSequence) {
            for (Hasher hasher : this.f290a) {
                hasher.putUnencodedChars(charSequence);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(byte[] bArr) {
            for (Hasher hasher : this.f290a) {
                hasher.putBytes(bArr);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(byte[] bArr, int i, int i2) {
            for (Hasher hasher : this.f290a) {
                hasher.putBytes(bArr, i, i2);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(ByteBuffer byteBuffer) {
            Hasher[] hasherArr;
            int position = byteBuffer.position();
            for (Hasher hasher : this.f290a) {
                AbstractC18082Mg0.m67350c(byteBuffer, position);
                hasher.putBytes(byteBuffer);
            }
            return this;
        }
    }

    public AbstractC0069B(HashFunction... hashFunctionArr) {
        for (HashFunction hashFunction : hashFunctionArr) {
            Preconditions.checkNotNull(hashFunction);
        }
        this.f289a = hashFunctionArr;
    }

    /* renamed from: a */
    public final Hasher m69165a(Hasher[] hasherArr) {
        return new C0070a(this, hasherArr);
    }

    /* renamed from: b */
    public abstract HashCode mo40042b(Hasher[] hasherArr);

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        int length = this.f289a.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i = 0; i < length; i++) {
            hasherArr[i] = this.f289a[i].newHasher();
        }
        return m69165a(hasherArr);
    }

    @Override // p000.AbstractC0698K, com.google.common.hash.HashFunction
    public Hasher newHasher(int i) {
        Preconditions.checkArgument(i >= 0);
        int length = this.f289a.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i2 = 0; i2 < length; i2++) {
            hasherArr[i2] = this.f289a[i2].newHasher(i);
        }
        return m69165a(hasherArr);
    }
}