package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.ProcessingNode;

/* renamed from: androidx.camera.core.imagecapture.g */
/* loaded from: classes.dex */
public final class C2484g extends ProcessingNode.AbstractC2473b {

    /* renamed from: a */
    public final C21132mo1 f11064a;

    /* renamed from: b */
    public final ImageProxy f11065b;

    public C2484g(C21132mo1 c21132mo1, ImageProxy imageProxy) {
        if (c21132mo1 != null) {
            this.f11064a = c21132mo1;
            if (imageProxy != null) {
                this.f11065b = imageProxy;
                return;
            }
            throw new NullPointerException("Null imageProxy");
        }
        throw new NullPointerException("Null processingRequest");
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC2473b
    /* renamed from: a */
    public ImageProxy mo63065a() {
        return this.f11065b;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC2473b
    /* renamed from: b */
    public C21132mo1 mo63064b() {
        return this.f11064a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProcessingNode.AbstractC2473b)) {
            return false;
        }
        ProcessingNode.AbstractC2473b abstractC2473b = (ProcessingNode.AbstractC2473b) obj;
        if (this.f11064a.equals(abstractC2473b.mo63064b()) && this.f11065b.equals(abstractC2473b.mo63065a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11064a.hashCode() ^ 1000003) * 1000003) ^ this.f11065b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f11064a + ", imageProxy=" + this.f11065b + "}";
    }
}
