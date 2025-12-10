package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.C2494k;
import androidx.camera.core.processing.Packet;

/* renamed from: androidx.camera.core.imagecapture.e */
/* loaded from: classes.dex */
public final class C2482e extends C2494k.AbstractC2495a {

    /* renamed from: a */
    public final Packet f11059a;

    /* renamed from: b */
    public final ImageCapture.OutputFileOptions f11060b;

    public C2482e(Packet packet, ImageCapture.OutputFileOptions outputFileOptions) {
        if (packet != null) {
            this.f11059a = packet;
            if (outputFileOptions != null) {
                this.f11060b = outputFileOptions;
                return;
            }
            throw new NullPointerException("Null outputFileOptions");
        }
        throw new NullPointerException("Null packet");
    }

    @Override // androidx.camera.core.imagecapture.C2494k.AbstractC2495a
    /* renamed from: a */
    public ImageCapture.OutputFileOptions mo63005a() {
        return this.f11060b;
    }

    @Override // androidx.camera.core.imagecapture.C2494k.AbstractC2495a
    /* renamed from: b */
    public Packet mo63004b() {
        return this.f11059a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2494k.AbstractC2495a)) {
            return false;
        }
        C2494k.AbstractC2495a abstractC2495a = (C2494k.AbstractC2495a) obj;
        if (this.f11059a.equals(abstractC2495a.mo63004b()) && this.f11060b.equals(abstractC2495a.mo63005a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11059a.hashCode() ^ 1000003) * 1000003) ^ this.f11060b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f11059a + ", outputFileOptions=" + this.f11060b + "}";
    }
}
