package androidx.camera.video;

import androidx.camera.video.FallbackStrategy;

/* renamed from: androidx.camera.video.b */
/* loaded from: classes.dex */
public final class C2630b extends FallbackStrategy.AbstractC2594b {

    /* renamed from: b */
    public final Quality f11811b;

    /* renamed from: c */
    public final int f11812c;

    public C2630b(Quality quality, int i) {
        if (quality != null) {
            this.f11811b = quality;
            this.f11812c = i;
            return;
        }
        throw new NullPointerException("Null fallbackQuality");
    }

    @Override // androidx.camera.video.FallbackStrategy.AbstractC2594b
    /* renamed from: a */
    public Quality mo62268a() {
        return this.f11811b;
    }

    @Override // androidx.camera.video.FallbackStrategy.AbstractC2594b
    /* renamed from: b */
    public int mo62267b() {
        return this.f11812c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FallbackStrategy.AbstractC2594b)) {
            return false;
        }
        FallbackStrategy.AbstractC2594b abstractC2594b = (FallbackStrategy.AbstractC2594b) obj;
        if (this.f11811b.equals(abstractC2594b.mo62268a()) && this.f11812c == abstractC2594b.mo62267b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11811b.hashCode() ^ 1000003) * 1000003) ^ this.f11812c;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.f11811b + ", fallbackRule=" + this.f11812c + "}";
    }
}
