package p000;

import androidx.camera.video.Quality;
import p000.C22235sq1;

/* renamed from: P8 */
/* loaded from: classes.dex */
public final class C1067P8 extends C22235sq1.AbstractC13941a {

    /* renamed from: a */
    public final Quality f4681a;

    /* renamed from: b */
    public final int f4682b;

    public C1067P8(Quality quality, int i) {
        if (quality != null) {
            this.f4681a = quality;
            this.f4682b = i;
            return;
        }
        throw new NullPointerException("Null quality");
    }

    @Override // p000.C22235sq1.AbstractC13941a
    /* renamed from: a */
    public int mo22774a() {
        return this.f4682b;
    }

    @Override // p000.C22235sq1.AbstractC13941a
    /* renamed from: b */
    public Quality mo22773b() {
        return this.f4681a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C22235sq1.AbstractC13941a)) {
            return false;
        }
        C22235sq1.AbstractC13941a abstractC13941a = (C22235sq1.AbstractC13941a) obj;
        if (this.f4681a.equals(abstractC13941a.mo22773b()) && this.f4682b == abstractC13941a.mo22774a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4681a.hashCode() ^ 1000003) * 1000003) ^ this.f4682b;
    }

    public String toString() {
        return "QualityRatio{quality=" + this.f4681a + ", aspectRatio=" + this.f4682b + "}";
    }
}