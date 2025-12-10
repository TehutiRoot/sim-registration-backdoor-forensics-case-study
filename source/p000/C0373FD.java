package p000;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* renamed from: FD */
/* loaded from: classes3.dex */
public final class C0373FD implements Key {

    /* renamed from: a */
    public final Key f1538a;

    /* renamed from: b */
    public final Key f1539b;

    public C0373FD(Key key, Key key2) {
        this.f1538a = key;
        this.f1539b = key2;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof C0373FD)) {
            return false;
        }
        C0373FD c0373fd = (C0373FD) obj;
        if (!this.f1538a.equals(c0373fd.f1538a) || !this.f1539b.equals(c0373fd.f1539b)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return (this.f1538a.hashCode() * 31) + this.f1539b.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f1538a + ", signature=" + this.f1539b + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f1538a.updateDiskCacheKey(messageDigest);
        this.f1539b.updateDiskCacheKey(messageDigest);
    }
}
