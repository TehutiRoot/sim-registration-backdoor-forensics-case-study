package p000;

import androidx.camera.video.internal.encoder.VideoEncoderDataSpace;

/* renamed from: p9 */
/* loaded from: classes.dex */
public final class C13065p9 extends VideoEncoderDataSpace {

    /* renamed from: a */
    public final int f76498a;

    /* renamed from: b */
    public final int f76499b;

    /* renamed from: c */
    public final int f76500c;

    public C13065p9(int i, int i2, int i3) {
        this.f76498a = i;
        this.f76499b = i2;
        this.f76500c = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoEncoderDataSpace)) {
            return false;
        }
        VideoEncoderDataSpace videoEncoderDataSpace = (VideoEncoderDataSpace) obj;
        if (this.f76498a == videoEncoderDataSpace.getStandard() && this.f76499b == videoEncoderDataSpace.getTransfer() && this.f76500c == videoEncoderDataSpace.getRange()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getRange() {
        return this.f76500c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getStandard() {
        return this.f76498a;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    public int getTransfer() {
        return this.f76499b;
    }

    public int hashCode() {
        return ((((this.f76498a ^ 1000003) * 1000003) ^ this.f76499b) * 1000003) ^ this.f76500c;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f76498a + ", transfer=" + this.f76499b + ", range=" + this.f76500c + "}";
    }
}
