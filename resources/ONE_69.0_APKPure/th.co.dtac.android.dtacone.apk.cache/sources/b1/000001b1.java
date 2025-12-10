package p000;

import com.google.common.base.Preconditions;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: Bn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17388Bn0 extends AbstractC0698K {

    /* renamed from: a */
    public final Mac f503a;

    /* renamed from: b */
    public final Key f504b;

    /* renamed from: e */
    public final String f505e;

    /* renamed from: f */
    public final int f506f;

    /* renamed from: g */
    public final boolean f507g;

    /* renamed from: Bn0$b */
    /* loaded from: classes4.dex */
    public static final class C0127b extends AbstractC17092y {

        /* renamed from: b */
        public final Mac f508b;

        /* renamed from: c */
        public boolean f509c;

        @Override // p000.AbstractC17092y
        /* renamed from: b */
        public void mo451b(byte b) {
            m69076f();
            this.f508b.update(b);
        }

        @Override // p000.AbstractC17092y
        /* renamed from: c */
        public void mo450c(ByteBuffer byteBuffer) {
            m69076f();
            Preconditions.checkNotNull(byteBuffer);
            this.f508b.update(byteBuffer);
        }

        @Override // p000.AbstractC17092y
        /* renamed from: d */
        public void mo449d(byte[] bArr) {
            m69076f();
            this.f508b.update(bArr);
        }

        @Override // p000.AbstractC17092y
        /* renamed from: e */
        public void mo448e(byte[] bArr, int i, int i2) {
            m69076f();
            this.f508b.update(bArr, i, i2);
        }

        /* renamed from: f */
        public final void m69076f() {
            Preconditions.checkState(!this.f509c, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            m69076f();
            this.f509c = true;
            return HashCode.fromBytesNoCopy(this.f508b.doFinal());
        }

        public C0127b(Mac mac) {
            this.f508b = mac;
        }
    }

    public C17388Bn0(String str, Key key, String str2) {
        Mac m69078a = m69078a(str, key);
        this.f503a = m69078a;
        this.f504b = (Key) Preconditions.checkNotNull(key);
        this.f505e = (String) Preconditions.checkNotNull(str2);
        this.f506f = m69078a.getMacLength() * 8;
        this.f507g = m69077b(m69078a);
    }

    /* renamed from: a */
    public static Mac m69078a(String str, Key key) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(key);
            return mac;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: b */
    public static boolean m69077b(Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.f506f;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        if (this.f507g) {
            try {
                return new C0127b((Mac) this.f503a.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new C0127b(m69078a(this.f503a.getAlgorithm(), this.f504b));
    }

    public String toString() {
        return this.f505e;
    }
}