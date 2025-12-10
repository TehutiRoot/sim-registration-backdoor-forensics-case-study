package p000;

import com.google.common.base.Preconditions;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: vn0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22676vn0 extends AbstractC0710K {

    /* renamed from: a */
    public final Mac f107791a;

    /* renamed from: b */
    public final Key f107792b;

    /* renamed from: e */
    public final String f107793e;

    /* renamed from: f */
    public final int f107794f;

    /* renamed from: g */
    public final boolean f107795g;

    /* renamed from: vn0$b */
    /* loaded from: classes4.dex */
    public static final class C16919b extends AbstractC17090y {

        /* renamed from: b */
        public final Mac f107796b;

        /* renamed from: c */
        public boolean f107797c;

        @Override // p000.AbstractC17090y
        /* renamed from: b */
        public void mo357b(byte b) {
            m999f();
            this.f107796b.update(b);
        }

        @Override // p000.AbstractC17090y
        /* renamed from: c */
        public void mo356c(ByteBuffer byteBuffer) {
            m999f();
            Preconditions.checkNotNull(byteBuffer);
            this.f107796b.update(byteBuffer);
        }

        @Override // p000.AbstractC17090y
        /* renamed from: d */
        public void mo355d(byte[] bArr) {
            m999f();
            this.f107796b.update(bArr);
        }

        @Override // p000.AbstractC17090y
        /* renamed from: e */
        public void mo354e(byte[] bArr, int i, int i2) {
            m999f();
            this.f107796b.update(bArr, i, i2);
        }

        /* renamed from: f */
        public final void m999f() {
            Preconditions.checkState(!this.f107797c, "Cannot re-use a Hasher after calling hash() on it");
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            m999f();
            this.f107797c = true;
            return HashCode.fromBytesNoCopy(this.f107796b.doFinal());
        }

        public C16919b(Mac mac) {
            this.f107796b = mac;
        }
    }

    public C22676vn0(String str, Key key, String str2) {
        Mac m1001a = m1001a(str, key);
        this.f107791a = m1001a;
        this.f107792b = (Key) Preconditions.checkNotNull(key);
        this.f107793e = (String) Preconditions.checkNotNull(str2);
        this.f107794f = m1001a.getMacLength() * 8;
        this.f107795g = m1000b(m1001a);
    }

    /* renamed from: a */
    public static Mac m1001a(String str, Key key) {
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
    public static boolean m1000b(Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.f107794f;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        if (this.f107795g) {
            try {
                return new C16919b((Mac) this.f107791a.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new C16919b(m1001a(this.f107791a.getAlgorithm(), this.f107792b));
    }

    public String toString() {
        return this.f107793e;
    }
}
