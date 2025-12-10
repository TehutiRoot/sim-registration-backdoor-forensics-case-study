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
public abstract class AbstractC0067B extends AbstractC0710K {

    /* renamed from: a */
    public final HashFunction[] f268a;

    /* renamed from: B$a */
    /* loaded from: classes4.dex */
    public class C0068a implements Hasher {

        /* renamed from: a */
        public final /* synthetic */ Hasher[] f269a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC0067B f270b;

        public C0068a(AbstractC0067B abstractC0067B, Hasher[] hasherArr) {
            this.f269a = hasherArr;
            this.f270b = abstractC0067B;
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            return this.f270b.mo40051b(this.f269a);
        }

        @Override // com.google.common.hash.Hasher
        public Hasher putObject(Object obj, Funnel funnel) {
            for (Hasher hasher : this.f269a) {
                hasher.putObject(obj, funnel);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBoolean(boolean z) {
            for (Hasher hasher : this.f269a) {
                hasher.putBoolean(z);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putByte(byte b) {
            for (Hasher hasher : this.f269a) {
                hasher.putByte(b);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putChar(char c) {
            for (Hasher hasher : this.f269a) {
                hasher.putChar(c);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putDouble(double d) {
            for (Hasher hasher : this.f269a) {
                hasher.putDouble(d);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putFloat(float f) {
            for (Hasher hasher : this.f269a) {
                hasher.putFloat(f);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putInt(int i) {
            for (Hasher hasher : this.f269a) {
                hasher.putInt(i);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putLong(long j) {
            for (Hasher hasher : this.f269a) {
                hasher.putLong(j);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putShort(short s) {
            for (Hasher hasher : this.f269a) {
                hasher.putShort(s);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putString(CharSequence charSequence, Charset charset) {
            for (Hasher hasher : this.f269a) {
                hasher.putString(charSequence, charset);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putUnencodedChars(CharSequence charSequence) {
            for (Hasher hasher : this.f269a) {
                hasher.putUnencodedChars(charSequence);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(byte[] bArr) {
            for (Hasher hasher : this.f269a) {
                hasher.putBytes(bArr);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(byte[] bArr, int i, int i2) {
            for (Hasher hasher : this.f269a) {
                hasher.putBytes(bArr, i, i2);
            }
            return this;
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public Hasher putBytes(ByteBuffer byteBuffer) {
            Hasher[] hasherArr;
            int position = byteBuffer.position();
            for (Hasher hasher : this.f269a) {
                AbstractC17663Gg0.m68222c(byteBuffer, position);
                hasher.putBytes(byteBuffer);
            }
            return this;
        }
    }

    public AbstractC0067B(HashFunction... hashFunctionArr) {
        for (HashFunction hashFunction : hashFunctionArr) {
            Preconditions.checkNotNull(hashFunction);
        }
        this.f268a = hashFunctionArr;
    }

    /* renamed from: a */
    public final Hasher m69036a(Hasher[] hasherArr) {
        return new C0068a(this, hasherArr);
    }

    /* renamed from: b */
    public abstract HashCode mo40051b(Hasher[] hasherArr);

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        int length = this.f268a.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i = 0; i < length; i++) {
            hasherArr[i] = this.f268a[i].newHasher();
        }
        return m69036a(hasherArr);
    }

    @Override // p000.AbstractC0710K, com.google.common.hash.HashFunction
    public Hasher newHasher(int i) {
        Preconditions.checkArgument(i >= 0);
        int length = this.f268a.length;
        Hasher[] hasherArr = new Hasher[length];
        for (int i2 = 0; i2 < length; i2++) {
            hasherArr[i2] = this.f268a[i2].newHasher(i);
        }
        return m69036a(hasherArr);
    }
}
