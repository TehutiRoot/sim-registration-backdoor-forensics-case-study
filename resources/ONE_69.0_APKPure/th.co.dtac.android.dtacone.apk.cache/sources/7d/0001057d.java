package p000;

import androidx.camera.video.internal.encoder.VideoEncoderDataSpace;

/* renamed from: p9 */
/* loaded from: classes.dex */
public final class C13066p9 extends VideoEncoderDataSpace {

    /* renamed from: a */
    public final int f76595a;

    /* renamed from: b */
    public final int f76596b;

    /* renamed from: c */
    public final int f76597c;

    public C13066p9(int i, int i2, int i3) {
        this.f76595a = i;
        this.f76596b = i2;
        this.f76597c = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoEncoderDataSpace)) {
            return false;
        }
        VideoEncoderDataSpace videoEncoderDataSpace = (VideoEncoderDataSpace) obj;
        if (this.f76595a == videoEncoderDataSpace.getStandard() && this.f76596b == videoEncoderDataSpace.getTransfer() && this.f76597c == videoEncoderDataSpace.getRange()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getRange() {
        return this.f76597c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getStandard() {
        return this.f76595a;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getTransfer() {
        return this.f76596b;
    }

    public int hashCode() {
        return ((((this.f76595a ^ 1000003) * 1000003) ^ this.f76596b) * 1000003) ^ this.f76597c;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f76595a + ", transfer=" + this.f76596b + ", range=" + this.f76597c + "}";
    }
}