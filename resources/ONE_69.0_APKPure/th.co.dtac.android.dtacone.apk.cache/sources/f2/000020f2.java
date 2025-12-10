package androidx.camera.video;

import androidx.camera.video.Quality;

/* renamed from: androidx.camera.video.g */
/* loaded from: classes.dex */
public final class C2625g extends Quality.AbstractC2587b {

    /* renamed from: d */
    public final int f11935d;

    /* renamed from: e */
    public final String f11936e;

    public C2625g(int i, String str) {
        this.f11935d = i;
        if (str != null) {
            this.f11936e = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override // androidx.camera.video.Quality.AbstractC2587b
    /* renamed from: c */
    public String mo62184c() {
        return this.f11936e;
    }

    @Override // androidx.camera.video.Quality.AbstractC2587b
    /* renamed from: d */
    public int mo62183d() {
        return this.f11935d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Quality.AbstractC2587b)) {
            return false;
        }
        Quality.AbstractC2587b abstractC2587b = (Quality.AbstractC2587b) obj;
        if (this.f11935d == abstractC2587b.mo62183d() && this.f11936e.equals(abstractC2587b.mo62184c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11935d ^ 1000003) * 1000003) ^ this.f11936e.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f11935d + ", name=" + this.f11936e + "}";
    }
}