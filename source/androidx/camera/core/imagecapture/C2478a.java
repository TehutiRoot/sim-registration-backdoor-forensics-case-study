package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.C2485h;
import androidx.camera.core.processing.Packet;

/* renamed from: androidx.camera.core.imagecapture.a */
/* loaded from: classes.dex */
public final class C2478a extends C2485h.AbstractC2486a {

    /* renamed from: a */
    public final Packet f11044a;

    /* renamed from: b */
    public final int f11045b;

    public C2478a(Packet packet, int i) {
        if (packet != null) {
            this.f11044a = packet;
            this.f11045b = i;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    @Override // androidx.camera.core.imagecapture.C2485h.AbstractC2486a
    /* renamed from: a */
    public int mo63062a() {
        return this.f11045b;
    }

    @Override // androidx.camera.core.imagecapture.C2485h.AbstractC2486a
    /* renamed from: b */
    public Packet mo63061b() {
        return this.f11044a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2485h.AbstractC2486a)) {
            return false;
        }
        C2485h.AbstractC2486a abstractC2486a = (C2485h.AbstractC2486a) obj;
        if (this.f11044a.equals(abstractC2486a.mo63061b()) && this.f11045b == abstractC2486a.mo63062a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11044a.hashCode() ^ 1000003) * 1000003) ^ this.f11045b;
    }

    public String toString() {
        return "In{packet=" + this.f11044a + ", jpegQuality=" + this.f11045b + "}";
    }
}
