package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.C2474j;
import androidx.camera.core.processing.Packet;

/* renamed from: androidx.camera.core.imagecapture.d */
/* loaded from: classes.dex */
public final class C2463d extends C2474j.AbstractC2475a {

    /* renamed from: a */
    public final Packet f11145a;

    /* renamed from: b */
    public final int f11146b;

    public C2463d(Packet packet, int i) {
        if (packet != null) {
            this.f11145a = packet;
            this.f11146b = i;
            return;
        }
        throw new NullPointerException("Null packet");
    }

    @Override // androidx.camera.core.imagecapture.C2474j.AbstractC2475a
    /* renamed from: a */
    public int mo62971a() {
        return this.f11146b;
    }

    @Override // androidx.camera.core.imagecapture.C2474j.AbstractC2475a
    /* renamed from: b */
    public Packet mo62970b() {
        return this.f11145a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2474j.AbstractC2475a)) {
            return false;
        }
        C2474j.AbstractC2475a abstractC2475a = (C2474j.AbstractC2475a) obj;
        if (this.f11145a.equals(abstractC2475a.mo62970b()) && this.f11146b == abstractC2475a.mo62971a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11145a.hashCode() ^ 1000003) * 1000003) ^ this.f11146b;
    }

    public String toString() {
        return "In{packet=" + this.f11145a + ", jpegQuality=" + this.f11146b + "}";
    }
}