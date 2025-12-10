package p000;

import androidx.camera.video.Quality;
import p000.C22683vp1;

/* renamed from: P8 */
/* loaded from: classes.dex */
public final class C1077P8 extends C22683vp1.AbstractC16922a {

    /* renamed from: a */
    public final Quality f4653a;

    /* renamed from: b */
    public final int f4654b;

    public C1077P8(Quality quality, int i) {
        if (quality != null) {
            this.f4653a = quality;
            this.f4654b = i;
            return;
        }
        throw new NullPointerException("Null quality");
    }

    @Override // p000.C22683vp1.AbstractC16922a
    /* renamed from: a */
    public int mo988a() {
        return this.f4654b;
    }

    @Override // p000.C22683vp1.AbstractC16922a
    /* renamed from: b */
    public Quality mo987b() {
        return this.f4653a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C22683vp1.AbstractC16922a)) {
            return false;
        }
        C22683vp1.AbstractC16922a abstractC16922a = (C22683vp1.AbstractC16922a) obj;
        if (this.f4653a.equals(abstractC16922a.mo987b()) && this.f4654b == abstractC16922a.mo988a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4653a.hashCode() ^ 1000003) * 1000003) ^ this.f4654b;
    }

    public String toString() {
        return "QualityRatio{quality=" + this.f4653a + ", aspectRatio=" + this.f4654b + "}";
    }
}
