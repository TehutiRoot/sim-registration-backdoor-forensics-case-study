package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.C2476k;
import androidx.camera.core.processing.Packet;

/* renamed from: androidx.camera.core.imagecapture.e */
/* loaded from: classes.dex */
public final class C2464e extends C2476k.AbstractC2477a {

    /* renamed from: a */
    public final Packet f11147a;

    /* renamed from: b */
    public final ImageCapture.OutputFileOptions f11148b;

    public C2464e(Packet packet, ImageCapture.OutputFileOptions outputFileOptions) {
        if (packet != null) {
            this.f11147a = packet;
            if (outputFileOptions != null) {
                this.f11148b = outputFileOptions;
                return;
            }
            throw new NullPointerException("Null outputFileOptions");
        }
        throw new NullPointerException("Null packet");
    }

    @Override // androidx.camera.core.imagecapture.C2476k.AbstractC2477a
    /* renamed from: a */
    public ImageCapture.OutputFileOptions mo62953a() {
        return this.f11148b;
    }

    @Override // androidx.camera.core.imagecapture.C2476k.AbstractC2477a
    /* renamed from: b */
    public Packet mo62952b() {
        return this.f11147a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2476k.AbstractC2477a)) {
            return false;
        }
        C2476k.AbstractC2477a abstractC2477a = (C2476k.AbstractC2477a) obj;
        if (this.f11147a.equals(abstractC2477a.mo62952b()) && this.f11148b.equals(abstractC2477a.mo62953a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11147a.hashCode() ^ 1000003) * 1000003) ^ this.f11148b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f11147a + ", outputFileOptions=" + this.f11148b + "}";
    }
}