package p000;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* renamed from: GD */
/* loaded from: classes3.dex */
public final class C0436GD implements Key {

    /* renamed from: a */
    public final Key f1908a;

    /* renamed from: b */
    public final Key f1909b;

    public C0436GD(Key key, Key key2) {
        this.f1908a = key;
        this.f1909b = key2;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof C0436GD)) {
            return false;
        }
        C0436GD c0436gd = (C0436GD) obj;
        if (!this.f1908a.equals(c0436gd.f1908a) || !this.f1909b.equals(c0436gd.f1909b)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return (this.f1908a.hashCode() * 31) + this.f1909b.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f1908a + ", signature=" + this.f1909b + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f1908a.updateDiskCacheKey(messageDigest);
        this.f1909b.updateDiskCacheKey(messageDigest);
    }
}