package androidx.camera.video;

import androidx.camera.video.Quality;

/* renamed from: androidx.camera.video.g */
/* loaded from: classes.dex */
public final class C2643g extends Quality.AbstractC2605b {

    /* renamed from: d */
    public final int f11847d;

    /* renamed from: e */
    public final String f11848e;

    public C2643g(int i, String str) {
        this.f11847d = i;
        if (str != null) {
            this.f11848e = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override // androidx.camera.video.Quality.AbstractC2605b
    /* renamed from: c */
    public String mo62236c() {
        return this.f11848e;
    }

    @Override // androidx.camera.video.Quality.AbstractC2605b
    /* renamed from: d */
    public int mo62235d() {
        return this.f11847d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Quality.AbstractC2605b)) {
            return false;
        }
        Quality.AbstractC2605b abstractC2605b = (Quality.AbstractC2605b) obj;
        if (this.f11847d == abstractC2605b.mo62235d() && this.f11848e.equals(abstractC2605b.mo62236c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11847d ^ 1000003) * 1000003) ^ this.f11848e.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f11847d + ", name=" + this.f11848e + "}";
    }
}
