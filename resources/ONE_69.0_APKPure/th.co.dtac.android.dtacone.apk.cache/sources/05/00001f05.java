package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.ProcessingNode;

/* renamed from: androidx.camera.core.imagecapture.g */
/* loaded from: classes.dex */
public final class C2466g extends ProcessingNode.AbstractC2455b {

    /* renamed from: a */
    public final C20675jp1 f11152a;

    /* renamed from: b */
    public final ImageProxy f11153b;

    public C2466g(C20675jp1 c20675jp1, ImageProxy imageProxy) {
        if (c20675jp1 != null) {
            this.f11152a = c20675jp1;
            if (imageProxy != null) {
                this.f11153b = imageProxy;
                return;
            }
            throw new NullPointerException("Null imageProxy");
        }
        throw new NullPointerException("Null processingRequest");
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC2455b
    /* renamed from: a */
    public ImageProxy mo63013a() {
        return this.f11153b;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC2455b
    /* renamed from: b */
    public C20675jp1 mo63012b() {
        return this.f11152a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProcessingNode.AbstractC2455b)) {
            return false;
        }
        ProcessingNode.AbstractC2455b abstractC2455b = (ProcessingNode.AbstractC2455b) obj;
        if (this.f11152a.equals(abstractC2455b.mo63012b()) && this.f11153b.equals(abstractC2455b.mo63013a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11152a.hashCode() ^ 1000003) * 1000003) ^ this.f11153b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f11152a + ", imageProxy=" + this.f11153b + "}";
    }
}