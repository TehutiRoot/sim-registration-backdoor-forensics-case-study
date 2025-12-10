package p000;

import android.graphics.Matrix;
import androidx.camera.core.ImmutableImageInfo;
import androidx.camera.core.impl.TagBundle;

/* renamed from: x8 */
/* loaded from: classes.dex */
public final class C17025x8 extends ImmutableImageInfo {

    /* renamed from: a */
    public final TagBundle f108241a;

    /* renamed from: b */
    public final long f108242b;

    /* renamed from: c */
    public final int f108243c;

    /* renamed from: d */
    public final Matrix f108244d;

    public C17025x8(TagBundle tagBundle, long j, int i, Matrix matrix) {
        if (tagBundle != null) {
            this.f108241a = tagBundle;
            this.f108242b = j;
            this.f108243c = i;
            if (matrix != null) {
                this.f108244d = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableImageInfo)) {
            return false;
        }
        ImmutableImageInfo immutableImageInfo = (ImmutableImageInfo) obj;
        if (this.f108241a.equals(immutableImageInfo.getTagBundle()) && this.f108242b == immutableImageInfo.getTimestamp() && this.f108243c == immutableImageInfo.getRotationDegrees() && this.f108244d.equals(immutableImageInfo.getSensorToBufferTransformMatrix())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public int getRotationDegrees() {
        return this.f108243c;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public Matrix getSensorToBufferTransformMatrix() {
        return this.f108244d;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public TagBundle getTagBundle() {
        return this.f108241a;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public long getTimestamp() {
        return this.f108242b;
    }

    public int hashCode() {
        long j = this.f108242b;
        return ((((((this.f108241a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f108243c) * 1000003) ^ this.f108244d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f108241a + ", timestamp=" + this.f108242b + ", rotationDegrees=" + this.f108243c + ", sensorToBufferTransformMatrix=" + this.f108244d + "}";
    }
}
