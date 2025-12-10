package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.C2467h;
import androidx.camera.core.processing.Packet;

/* renamed from: androidx.camera.core.imagecapture.a */
/* loaded from: classes.dex */
public final class C2460a extends C2467h.AbstractC2468a {

    /* renamed from: a */
    public final Packet f11132a;

    /* renamed from: b */
    public final int f11133b;

    public C2460a(Packet packet, int i) {
        if (packet != null) {
            this.f11132a = packet;
            this.f11133b = i;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    @Override // androidx.camera.core.imagecapture.C2467h.AbstractC2468a
    /* renamed from: a */
    public int mo63010a() {
        return this.f11133b;
    }

    @Override // androidx.camera.core.imagecapture.C2467h.AbstractC2468a
    /* renamed from: b */
    public Packet mo63009b() {
        return this.f11132a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2467h.AbstractC2468a)) {
            return false;
        }
        C2467h.AbstractC2468a abstractC2468a = (C2467h.AbstractC2468a) obj;
        if (this.f11132a.equals(abstractC2468a.mo63009b()) && this.f11133b == abstractC2468a.mo63010a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11132a.hashCode() ^ 1000003) * 1000003) ^ this.f11133b;
    }

    public String toString() {
        return "In{packet=" + this.f11132a + ", jpegQuality=" + this.f11133b + "}";
    }
}