package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.C2492j;
import androidx.camera.core.processing.Packet;

/* renamed from: androidx.camera.core.imagecapture.d */
/* loaded from: classes.dex */
public final class C2481d extends C2492j.AbstractC2493a {

    /* renamed from: a */
    public final Packet f11057a;

    /* renamed from: b */
    public final int f11058b;

    public C2481d(Packet packet, int i) {
        if (packet != null) {
            this.f11057a = packet;
            this.f11058b = i;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    @Override // androidx.camera.core.imagecapture.C2492j.AbstractC2493a
    /* renamed from: a */
    public int mo63023a() {
        return this.f11058b;
    }

    @Override // androidx.camera.core.imagecapture.C2492j.AbstractC2493a
    /* renamed from: b */
    public Packet mo63022b() {
        return this.f11057a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2492j.AbstractC2493a)) {
            return false;
        }
        C2492j.AbstractC2493a abstractC2493a = (C2492j.AbstractC2493a) obj;
        if (this.f11057a.equals(abstractC2493a.mo63022b()) && this.f11058b == abstractC2493a.mo63023a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11057a.hashCode() ^ 1000003) * 1000003) ^ this.f11058b;
    }

    public String toString() {
        return "In{packet=" + this.f11057a + ", jpegQuality=" + this.f11058b + "}";
    }
}
